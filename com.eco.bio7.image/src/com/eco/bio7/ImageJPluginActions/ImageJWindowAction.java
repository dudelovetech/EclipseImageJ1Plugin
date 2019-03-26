/*******************************************************************************
 * Copyright (c) 2005-2017 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.ImageJPluginActions;

import java.util.UUID;
import java.util.Vector;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartSashContainerElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import com.eco.bio7.image.Activator;
import com.eco.bio7.image.CanvasView;
import com.eco.bio7.image.CustomDetachedImageJView;
import com.eco.bio7.image.IJTabs;
import com.eco.bio7.image.Util;

import ij.ImagePlus;
import ij.gui.ImageWindow;

public class ImageJWindowAction extends Action implements IMenuCreator {

	private Menu fMenu;

	protected Point p;

	private MenuItem menuItemFx;

	private boolean selected;

	public ImageJWindowAction() {
		setId("Window");
		setToolTipText("ImageJ");
		setText("Window");

		setMenuCreator(this);
	}

	public Menu getMenu(Control parent) {

		if (fMenu != null) {
			fMenu.dispose();
		}

		fMenu = new Menu(parent);

		fMenu.addMenuListener(new MenuListener() {
			public void menuHidden(MenuEvent e) {

			}

			@Override
			public void menuShown(MenuEvent e) {

				MenuItem menuItem = new MenuItem(fMenu, SWT.PUSH);

				menuItem.setText("ImageJ-Toolbar");

				menuItem.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent e) {

						showtoolbar();

					}

					public void widgetDefaultSelected(SelectionEvent e) {

					}
				});

				MenuItem menuItem1 = new MenuItem(fMenu, SWT.PUSH);

				menuItem1.setText("Bio7-Toolbar");
				menuItem1.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent e) {

						IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

						IViewReference ref = null;
						IWorkbenchPartSite part = null;

						IPreferenceStore store = Activator.getDefault().getPreferenceStore();
						int xSize = store.getInt("IMAGE_METHODS_SIZE_X");
						int ySize = store.getInt("IMAGE_METHODS_SIZE_Y");

						try {
							part = page.showView("com.eco.bio7.image_methods").getSite();
							ref = part.getPage().findViewReference("com.eco.bio7.image_methods");
						} catch (PartInitException e1) {

							e1.printStackTrace();
						}

						EModelService s = (EModelService) part.getService(EModelService.class);

						MPartSashContainerElement p = (MPart) part.getService(MPart.class);

						String os = Util.getOS();
						if (os != null) {
							Point pt = CanvasView.getCanvas_view().tabFolder.getShell().getLocation();
							Point pSize = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getSize();
							if (os.equals("Linux")) {
								if (p.getCurSharedRef() != null) {
									p = p.getCurSharedRef();

									s.detach(p, (pt.x + pSize.x / 2), pt.y + 30, xSize, ySize);
								}

							} else if (os.equals("Windows")) {
								if (p.getCurSharedRef() != null) {
									p = p.getCurSharedRef();

									s.detach(p, (pt.x + pSize.x / 2), pt.y + 30, xSize, ySize);
								}

							} else if (os.equals("Mac")) {
								if (p.getCurSharedRef() != null) {
									p = p.getCurSharedRef();

									s.detach(p, (pt.x + pSize.x / 2), pt.y + 30, xSize, ySize);
								}

							}

						} else {
							if (p.getCurSharedRef() != null) {
								p = p.getCurSharedRef();

								s.detach(p, 100, 100, xSize, ySize);
							}

						}

					}

					public void widgetDefaultSelected(SelectionEvent e) {

					}
				});
				new MenuItem(fMenu, SWT.SEPARATOR);

				MenuItem menuItemDetachTab = new MenuItem(fMenu, SWT.PUSH);

				menuItemDetachTab.setText("Detach Image");

				menuItemDetachTab.addSelectionListener(new SelectionListener() {

					public void widgetSelected(SelectionEvent e) {
						CTabFolder ctab = CanvasView.getCanvas_view().tabFolder;
						if (ctab.getItemCount() > 0) {
							Vector ve = (Vector) ctab.getSelection().getData();
							ImagePlus plu = (ImagePlus) ve.get(0);

							ImageWindow win = (ImageWindow) ve.get(1);
							// JPanel current = (JPanel) ve.get(2);

							CustomDetachedImageJView custom = new CustomDetachedImageJView();
							/* Create ImageJ view with unique ID! */
							String id = UUID.randomUUID().toString();
							// detachedSecViewIDs.add(id);
							custom.setPanel(CanvasView.getCurrent(), id, plu.getTitle());
							custom.setData(plu, win);
							/*
							 * Only hide the tab without to close the ImagePlus object!
							 */
							IJTabs.hideTab();
						}

					}

					public void widgetDefaultSelected(SelectionEvent e) {

					}
				});

				MenuItem[] menuItems = fMenu.getItems();
				// Only delete the plugins menu items and menus!
				for (int i = 2; i < menuItems.length; i++) {
					if (menuItems[i] != null) {
						menuItems[i].dispose();
					}
				}
				// new MenuItem(fMenu, SWT.SEPARATOR);
				new ImageJSubmenu().addSubMenus(fMenu, "Window");

			}
		});
		// new MenuItem(fMenu, SWT.SEPARATOR);
		/*
		 * Create the dynamic menu which is later disposed and recreated every time the
		 * menu is shown!
		 */
		// menuItemFx = new MenuItem(fMenu, SWT.CHECK);

		return fMenu;
	}

	private void createJavaFXOptionMenu() {

		menuItemFx = new MenuItem(fMenu, SWT.CHECK);

		menuItemFx.setText("Open in JavaFX Panel (exp.)");

		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean openInFXPanel = store.getBoolean("JAVAFX_EMBEDDED");

		if (openInFXPanel == false) {
			menuItemFx.setSelection(false);
		} else {
			menuItemFx.setSelection(true);
		}

		menuItemFx.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {

				IPreferenceStore store = Activator.getDefault().getPreferenceStore();
				boolean openInFXPanel = store.getBoolean("JAVAFX_EMBEDDED");
				if (openInFXPanel == false) {
					store.setValue("JAVAFX_EMBEDDED", true);
					selected = true;

				} else {
					store.setValue("JAVAFX_EMBEDDED", false);
					selected = false;
				}

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
	}

	public void dispose() {

	}

	public Menu getMenu(Menu parent) {

		return null;
	}

	public void showtoolbar() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IViewReference ref = null;
		IWorkbenchPartSite part = null;

		/* Preferences form the Bio7Plugin! */
		// IPreferencesService service = Platform.getPreferencesService();
		// int xSize = service.getInt("com.eco.bio7", "IMAGEJ_TOOLBAR_SIZE_X",
		// 600, null);
		// int ySize = service.getInt("com.eco.bio7", "IMAGEJ_TOOLBAR_SIZE_Y",
		// 135, null);

		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		int xSize = store.getInt("IMAGEJ_TOOLBAR_SIZE_X");
		int ySize = store.getInt("IMAGEJ_TOOLBAR_SIZE_Y");

		try {
			part = page.showView("com.eco.bio7.ijtoolbar").getSite();
			ref = part.getPage().findViewReference("com.eco.bio7.ijtoolbar");
		} catch (PartInitException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		EModelService s = (EModelService) part.getService(EModelService.class);

		MPartSashContainerElement p = (MPart) part.getService(MPart.class);

		Point pt = null;
		String os = Util.getOS();
		if (os != null) {
			pt = CanvasView.getCanvas_view().tabFolder.getShell().getLocation();
			if (os.equals("Linux")) {
				if (p.getCurSharedRef() != null) {
					p = p.getCurSharedRef();

					s.detach(p, pt.x + 20, pt.y + 100, xSize, ySize);
				}

			} else if (os.equals("Windows")) {
				if (p.getCurSharedRef() != null) {
					p = p.getCurSharedRef();

					s.detach(p, pt.x + 20, pt.y + 100, xSize, ySize);
				}

			} else if (os.equals("Mac")) {
				if (p.getCurSharedRef() != null) {
					p = p.getCurSharedRef();

					s.detach(p, pt.x + 20, pt.y + 100, xSize, ySize);
				}

			}

		} else {

			ref.getView(false).getViewSite().getShell().setSize(xSize, ySize);
		}

	}

}