/*******************************************************************************
 * Copyright (c) 2007-2014 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.ImageJPluginActions;

import ij.IJ;
import ij.ImagePlus;
import javax.swing.SwingUtilities;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

import com.eco.bio7.image.IJTabs;

public class ImageJFileAction extends Action implements IMenuCreator {

	private Menu fMenu;

	String[] newImage = { "Image...", "Text Window", "Internal Clipboard", "System Clipboard" };

	String[] imp = { "Image Sequence...", "Raw...", "LUT... ", "Text Image... ", "Text File... ", "Results... ", "URL...", "Stack From List...", "TIFF Virtual Stack...", "AVI...",
			"XY Coordinates... " };

	String[] saveas = { "Tiff...", "Gif...", "Jpeg...", "BMP...", "PNG...", "PGM...", "Text Image...", "ZIP...", "Raw Data...", "Image Sequence... ", "AVI... ", "FITS...", "LUT...", "Selection...",
			"XY Coordinates...", "Results...", "Text..." };

	String[] url = { "NileBend.jpg","sea-grass.jpg","particles.gif", "blobs.gif","embryos.jpg","Cell_Colony.jpg", "mri-stack.zip", "leaf.jpg", "Tree_Rings.jpg", "FluorescentCells.jpg","Diatoms.jpg" ,"baboon.jpg", "bat-cochlea-volume.zip",
			"flybrain.zip", "Rat_Hippocampal_Neuron.zip", "Spindly-GFP.zip","hela-cells.zip","3D_Chromosome.zip", "organ-of-corti.zip", "confocal-series.zip","egg.jpg","microm.jpg","fluoview-multi.tif","mri.gif","snowflake.gif" };

	MenuItem[] save_as = new MenuItem[saveas.length];

	MenuItem[] import_as = new MenuItem[imp.length];

	MenuItem[] samples = new MenuItem[url.length];


	public ImageJFileAction() {
		setId("File");
		setToolTipText("ImageJ");
		setText("File");
		setMenuCreator(this);
	}

	public Menu getMenu(Control parent) {
		if (fMenu != null) {
			fMenu.dispose();
		}
		fMenu = new Menu(parent);

		Menu fMenu1 = new Menu(fMenu);
		MenuItem menuItem = new MenuItem(fMenu, SWT.CASCADE);
		menuItem.setMenu(fMenu1);
		menuItem.setText("New");
		for (int i = 0; i < newImage.length; i++) {
			final int count = i;
			import_as[i] = new MenuItem(fMenu1, SWT.PUSH);
			import_as[i].setText(newImage[i]);
			import_as[i].addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {

					IJ.getInstance().doCommand(newImage[count]);

				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		MenuItem menuItem2 = new MenuItem(fMenu, SWT.PUSH);
		menuItem2.setText("Open");
		MenuItem menuItem3 = new MenuItem(fMenu, SWT.PUSH);
		menuItem3.setText("Open Next");

		/*
		 * MenuItem menuItem5 = new MenuItem(fMenu, SWT.PUSH);
		 * menuItem5.setText("Open Recent");
		 */
		Menu fMenu2 = new Menu(fMenu);

		MenuItem menuItem21 = new MenuItem(fMenu, SWT.CASCADE);
		menuItem21.setMenu(fMenu2);
		menuItem21.setText("Import");
		for (int i = 0; i < imp.length; i++) {
			final int count = i;
			import_as[i] = new MenuItem(fMenu2, SWT.PUSH);
			import_as[i].setText(imp[i]);
			import_as[i].addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {

					IJ.getInstance().doCommand(imp[count]);

				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		MenuItem menuItem7 = new MenuItem(fMenu, SWT.PUSH);
		menuItem7.setText("Save");

		Menu fMenu3 = new Menu(fMenu);
		MenuItem menuItem8 = new MenuItem(fMenu, SWT.CASCADE);
		menuItem8.setMenu(fMenu3);
		menuItem8.setText("Saveas");

		for (int i = 0; i < saveas.length; i++) {
			final int count = i;
			save_as[i] = new MenuItem(fMenu3, SWT.PUSH);
			save_as[i].setText(saveas[i]);
			save_as[i].addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {

					IJ.getInstance().doCommand(saveas[count]);

				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		Menu fMenu4 = new Menu(fMenu);
		MenuItem menuItem4 = new MenuItem(fMenu, SWT.CASCADE);
		menuItem4.setMenu(fMenu4);

		menuItem4.setText("Open Samples");
		for (int i = 0; i < url.length; i++) {
			final int count = i;
			samples[i] = new MenuItem(fMenu4, SWT.PUSH);
			samples[i].setText(url[i]);
			samples[i].addSelectionListener(new SelectionListener() {

				public void widgetSelected(SelectionEvent e) {
					Job job = new Job("Open...") {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							monitor.beginTask("Opening: " + url, IProgressMonitor.UNKNOWN);
							final ImagePlus imp;

							IJ.showStatus("Opening: " + url);

							imp = IJ.openImage("http://rsb.info.nih.gov/ij/images/" + url[count]);
							/*
							 * ImagePlus imp = new
							 * ImagePlus("http://rsb.info.nih.gov/ij/images/" +
							 * url[count]); WindowManager.checkForDuplicateName
							 * = true;
							 */
							if(imp!=null){
							SwingUtilities.invokeLater(new Runnable() {
								// !!
								public void run() {

									imp.show();
									IJ.showStatus("");
								}
							});
							}
							monitor.done();
							return Status.OK_STATUS;
						}

					};

					// job.setSystem(true);
					job.schedule();

				}

				public void widgetDefaultSelected(SelectionEvent e) {

				}
			});
		}

		MenuItem menuItem9 = new MenuItem(fMenu, SWT.PUSH);
		menuItem9.setText("Revert");
		MenuItem menuItem10 = new MenuItem(fMenu, SWT.PUSH);
		menuItem10.setText("Page Setup");
		MenuItem menuItem11 = new MenuItem(fMenu, SWT.PUSH);
		menuItem11.setText("Print");
		/*MenuItem menuItem13 = new MenuItem(fMenu, SWT.PUSH);
		menuItem13.setText("Select Device");
		MenuItem menuItem14 = new MenuItem(fMenu, SWT.PUSH);
		menuItem14.setText("Aquire");*/
		MenuItem menuItem6 = new MenuItem(fMenu, SWT.PUSH);
		menuItem6.setText("Close All Tabs");

		menuItem2.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {

						IJ.getInstance().doCommand("Open...");
					}
				});

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		menuItem3.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {

				IJ.getInstance().doCommand("Open...");

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		/*
		 * menuItem5.addSelectionListener(new SelectionListener() {
		 * 
		 * public void selectionChanged(SelectionChangedEvent event) { }
		 * 
		 * public void widgetSelected(SelectionEvent e) {
		 * 
		 * IJ.getInstance().doCommand("OpenRecent"); }
		 * 
		 * public void widgetDefaultSelected(SelectionEvent e) { } });
		 */
		menuItem6.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {
                /*Close detached views! Not reliable for many perspectives!*/
				/*IWorkbenchPage wbp = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				CanvasView canv = CanvasView.getCanvas_view();
				ArrayList<String> detArr = canv.getDetachedSecViewIDs();

				for (int i = 0; i < detArr.size(); i++) {
					wbp.hideView(wbp.findViewReference("com.eco.bio7.image.detachedImage", detArr.get(i)));
				}

				detArr.clear();*/
                /*Close the tabs!*/
				IJTabs.deleteAllTabs();
			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		menuItem7.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {

				IJ.getInstance().doCommand("Save");

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		menuItem9.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {

				IJ.getInstance().doCommand("Revert");

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		menuItem10.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {

				IJ.getInstance().doCommand("Page Setup...");

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});
		menuItem11.addSelectionListener(new SelectionListener() {

			public void selectionChanged(SelectionChangedEvent event) {

			}

			public void widgetSelected(SelectionEvent e) {

				IJ.getInstance().doCommand("Print...");

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}
		});

		
		return fMenu;
	}

	public void dispose() {

	}

	public Menu getMenu(Menu parent) {

		return null;
	}

}