/*******************************************************************************
 * Copyright (c) 2007-2012 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.image;

import java.awt.Container;
import java.awt.Window;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;

import ij.ImagePlus;
import ij.WindowManager;
import ij.gui.ImageCanvas;
import ij.gui.ImageWindow;

/**
 * A class for the control of the ImageJ tabs.
 * 
 * @author Bio7
 * 
 */
public class IJTabs {

	private static int id;

	/**
	 * Activates the tab with the specified number.
	 * 
	 * @param number the number of the tab.
	 */
	public static void setActive(final int number) {
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();

		if (items.length > 0 && number < items.length) {

			Display dis = CanvasView.getParent2().getDisplay();
			dis.syncExec(new Runnable() {

				public void run() {

					CanvasView.tabFolder.showItem(items[number]);
					CanvasView.tabFolder.setSelection(items[number]);
					Vector ve = (Vector) items[number].getData();
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {
							ImagePlus plu = (ImagePlus) ve.get(0);
							ImageWindow win = (ImageWindow) ve.get(1);
							WindowManager.setTempCurrentImage(plu);
							WindowManager.setCurrentWindow(win);
							CanvasView.setCurrent((JPanel) ve.get(2));
						}
					});

				}
			});

		}

	}

	/**
	 * Returns the amount of opened tabs in the ImageJ view.
	 * 
	 * @return the amount of tabs as an integer value.
	 */
	public static int getAmountTabs() {
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();

		return items.length;

	}

	/**
	 * Closes all tabs in the ImageJ view.
	 */
	public static void deleteAllTabs() {
		/* Close all detached views if available! */
		IViewReference[] viewRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getViewReferences();
		for (int i = 0; i < viewRefs.length; i++) {
			String id = viewRefs[i].getId();
			if (id.equals("com.eco.bio7.image.detachedImage")) {
				viewRefs[i].getPage().hideView(viewRefs[i]);
			}
		}
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WindowManager.closeAllWindows();
			}
		});
		for (int i = 0; i < items.length; i++) {
			final int tabcount = i;
			if (javaFXEmbedded) {
				if (items[tabcount].isDisposed() == false) {
					// if (items[tabcount].getControl().isDisposed() == false) {
					// items[tabcount].getControl().dispose();
					items[tabcount].dispose();
					// }
				}

			} else {

				Display dis = CanvasView.getParent2().getDisplay();
				dis.syncExec(new Runnable() {

					public void run() {

						items[tabcount].dispose();

					}
				});
			}

		}

	}

	/**
	 * Closes the tab with the specified number in the ImageJ view.
	 * 
	 * @param number the number of the tab as an integer value.
	 */
	public static void deleteTab(int number) {
		final int nrdel = number;
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			public void run() {
				Vector ve = (Vector) items[nrdel].getData();

				if (javaFXEmbedded) {
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {
							ImagePlus plu = (ImagePlus) ve.get(0);

							final ImageWindow win = (ImageWindow) ve.get(1);

							win.bio7TabClose();

						}
					});
					if (items[nrdel].getControl().isDisposed() == false) {
						items[nrdel].getControl().dispose();
						if (items[nrdel].isDisposed() == false) {
							items[nrdel].dispose();
						}
					}

				} else {

					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {
							ImagePlus plu = (ImagePlus) ve.get(0);

							final ImageWindow win = (ImageWindow) ve.get(1);

							win.bio7TabClose();
						}
					});
					items[nrdel].dispose();
				}

			}
		});

	}

	/**
	 * Hides the active tab in the ImageJ view.
	 */
	public static void hideTab() {

		final CTabItem item = CanvasView.tabFolder.getSelection();
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			public void run() {
				if (item != null) {
					item.dispose();
				}
			}
		});

	}

	/**
	 * Hides the tab with the specified number in the ImageJ view.
	 * 
	 * @param number the tab number.
	 */
	public static void hideTabNumber(int number) {

		final int nrdel = number;
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			public void run() {

				items[nrdel].dispose();
			}
		});

	}

	/**
	 * Deletes the active tab in the ImageJ view.
	 */
	public static void deleteActiveTab() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		final CTabItem item = CanvasView.tabFolder.getSelection();
		if (item != null) {
			Display dis = CanvasView.getParent2().getDisplay();
			dis.syncExec(new Runnable() {

				public void run() {
					Vector ve = (Vector) item.getData();
					if (javaFXEmbedded) {

						final ImageWindow win = (ImageWindow) ve.get(1);

						win.bio7TabClose();
						if (item.getControl().isDisposed() == false) {
							item.getControl().dispose();
							item.dispose();
						}

					} else {
						SwingUtilities.invokeLater(new Runnable() {
							// !!
							public void run() {

								final ImageWindow win = (ImageWindow) ve.get(1);

								win.bio7TabClose();
							}
						});
						item.dispose();
					}
				}
			});
		}

	}

	public static void setActiveTab(String title) {

		/* Changed for Bio7! */
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			private int count;

			public void run() {
				for (int i = 0; i < items.length; i++) {
					count = i;
					Vector ve = (Vector) items[i].getData();
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {

							final ImageWindow win2 = (ImageWindow) ve.get(1);

							/* Search for the tab which embeds this instance! */
							if (win2.getTitle().equals(title)) {
								// calls bio7Tabclose!
								CanvasView.getCanvas_view().tabFolder.setSelection(items[count]);
								// System.out.println("closed");
								return;

							}
						}
					});

				}

			}
		});
	}

	public static void setActiveTabID(int theId) {

		if (id > 0) {
			id = WindowManager.getNthImageID(id);
		}
		/* Changed for Bio7! */
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			private int count;

			public void run() {
				for (int i = 0; i < items.length; i++) {
					count = i;
					Vector ve = (Vector) items[i].getData();
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {

							final ImageWindow win2 = (ImageWindow) ve.get(1);

							ImagePlus plus = WindowManager.getImage(id);
							/* Search for the tab which embeds this instance! */
							if (win2.getImagePlus() == plus) {
								// calls the selection!
								CanvasView.getCanvas_view().tabFolder.setSelection(items[count]);
								// System.out.println("closed");
								return;

							}
						}
					});

				}

			}
		});
	}

	public static void setActiveTabWindow(Window win) {

		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			private int count;

			public void run() {
				CTabFolder tabFolder = CanvasView.getCanvas_view().tabFolder;
				CTabItem[] items = tabFolder.getItems();
				for (int i = 0; i < items.length; i++) {
					count = i;
					Vector<?> ve = (Vector<?>) items[i].getData();

					final ImageWindow win2 = (ImageWindow) ve.get(1);

					/* Search for the tab which embeds this instance! */
					if (win == win2) {
						// calls the selection!
						tabFolder.setSelection(items[count]);
						// System.out.println("closed");
						return;

					}

				}

			}
		});
	}

	public static void hideTab(ImagePlus imagePlus) {
		final CTabItem[] items = CanvasView.getCanvas_view().tabFolder.getItems();
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {

			private int count;

			public void run() {
				for (int i = 0; i < items.length; i++) {
					count = i;
					Vector ve = (Vector) items[i].getData();
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {

							final ImagePlus plus = (ImagePlus) ve.get(0);

							/*
							 * Search for the tab which embeds this ImagePlus instance!
							 */
							if (plus == imagePlus) {
								// calls bio7Tabclose!
								items[count].dispose();

							}
						}
					});

				}

			}
		});

	}

	/*
	 * A method to layout secondary ImageJ views (e.g. for orthogonal stack views)!
	 */
	public static void doSecondaryViewLayout() {
		Display dis = CanvasView.getParent2().getDisplay();
		dis.syncExec(new Runnable() {
			public void run() {
				IViewReference[] viewRefs = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
						.getViewReferences();
				for (int i = 0; i < viewRefs.length; i++) {
					String id = viewRefs[i].getId();
					if (id.equals("com.eco.bio7.image.detachedImage")) {
						IViewPart view = viewRefs[i].getView(false);
						String secId = viewRefs[i].getSecondaryId();
						CustomDetachedImageJView cdview = (CustomDetachedImageJView) view;
						cdview.customViewParent.layout();
						ImagePlus ip = WindowManager.getImage(Integer.valueOf(secId));
						ImageCanvas canvas = ip.getCanvas();
						if (canvas != null) {
							Container parentOfCanvas = canvas.getParent();
							if (parentOfCanvas != null) {
								Container parent = parentOfCanvas;
								parent.doLayout();
								parent.repaint();
							}
						}
					}
				}
			}
		});
	}

}
