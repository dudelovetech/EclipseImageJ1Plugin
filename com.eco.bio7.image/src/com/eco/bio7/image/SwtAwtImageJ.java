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

package com.eco.bio7.image;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import ij.ImageJ;
import ij.ImagePlus;
import ij.gui.ImageCanvas;
import ij.gui.ImageLayout;
import ij.gui.ImageWindow;
import ij.gui.PointRoi;
import ij.gui.Roi;
import ij.gui.ScrollbarWithLabel;
import ij.plugin.PointToolOptions;
import ij.plugin.frame.Channels;

public class SwtAwtImageJ {

	private JPanel a;

	private JApplet panel;

	public Composite top;

	private CTabItem ci;

	private java.awt.Container contentPane;

	public java.awt.Frame frame;

	private ImageCanvas im;

	private ImagePlus plus;

	private ImageWindow win;

	private Vector ve;

	private ScrollbarWithLabel sliceselect;
	/* For Hyperstacks! */
	private ScrollbarWithLabel channelselect;

	private ScrollbarWithLabel frameselect;

	// protected SwingFxSwtView view;

	public SwtAwtImageJ(ScrollbarWithLabel channelSelector, ScrollbarWithLabel sliceSelector, ScrollbarWithLabel frameSelector, ImageCanvas ic, ImagePlus plusin, ImageWindow window) {
		this.im = ic;
		this.plus = plusin;
		this.win = window;
		this.channelselect = channelSelector;
		this.frameselect = frameSelector;

		this.sliceselect = sliceSelector;

		ve = new Vector();
		ve.add(plus);
		ve.add(win);
		/* Create a new JavaFX Swing node! */

	}

	public java.awt.Frame getFrame() {
		return frame;
	}

	public void setFrame(java.awt.Frame frame) {
		this.frame = frame;
	}

	public void addTab(final String title) {
		/* Add JavaFX to embed the ImageJ canvas! */
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		if (javaFXEmbedded) {
			SwingFxSwtView view = new SwingFxSwtView();

			Display dis = Util.getDisplay();
			dis.syncExec(new Runnable() {

				public void run() {

					createJavaFXTabDisplay(title, view);

				}
			});

		} else {
			/* Add SWT_AWT to embed the ImageJ canvas! */

			Display dis = Util.getDisplay();
			// new AwtDialogListener(Util.getDisplay());
			if (Util.getOS().equals("Mac")) {
				/*
				 * On Mac we had to use async (no sync) else we got no keyboard focus! We also
				 * have to change the StackEditor for Mac to avoid a deadlock when converting a
				 * stack to images!
				 */
				dis.syncExec(new Runnable() {

					public void run() {

						createSwingTabDisplay(title);

					}
				});
			} else {
				dis.syncExec(new Runnable() {

					public void run() {

						createSwingTabDisplay(title);

					}
				});
			}
		}
	}

	public JPanel getPanel() {
		return a;
	}

	public JApplet getApplet() {
		return panel;
	}

	private void createSwingTabDisplay(final String title) {

		ci = new CTabItem(CanvasView.tabFolder, SWT.CLOSE, CanvasView.insertMark + 1);
		// ci.setData(plus);// add a reference to the image for use
		// as
		// selected tab
		ci.setData(ve);// add a vector with the data from the
		// ImageWindow and the Image!!
		ci.setText(title);
		ci.isShowing();
		top = new Composite(CanvasView.tabFolder, SWT.NO_BACKGROUND | SWT.EMBEDDED);
		try {
			System.setProperty("sun.awt.noerasebackground", "true");
		} catch (NoSuchMethodError error) {
		}
		ci.setControl(top);

		frame = SWT_AWT.new_Frame(top);
		// SwtAwt.setSwtAwtFocus(frame, CanvasView.getCanvas_view().parent2);
		panel = new JApplet() {
			public void update(java.awt.Graphics g) {
				// Do not erase the background
				paint(g);
			}
		};
		// panel.addLayout(new java.awt.BorderLayout());
		frame.add(panel);

		JRootPane root = new JRootPane();
		panel.add(root);
		contentPane = root.getContentPane();

		a = new JPanel();

		Color swtBackgroundToAWT = Util.getSWTBackgroundToAWT();
		panel.setBackground(swtBackgroundToAWT);
		frame.setBackground(swtBackgroundToAWT);
		a.setBackground(swtBackgroundToAWT);

		contentPane.add(a);
		a.add(im);// Add the Image canvas to the JPanel
		a.setLayout(new ImageLayout(im));
		// a.setLayout(new java.awt.BorderLayout());
		if (channelselect != null) {
			a.add(channelselect);
		}
		if (sliceselect != null) {
			a.add(sliceselect);
		}
		if (frameselect != null) {
			a.add(frameselect);
		}

		ve.add(a); // Add to the vector for access
		ve.add(frame);
		CanvasView.tabFolder.setLayout(null);
		CanvasView.tabFolder.showItem(ci);
		CanvasView.tabFolder.setSelection(ci);
		CanvasView.setCurrent(a);
		CanvasView.getCanvas_view().win = win;
		// CanvasView.getCurrent().doLayout();
		// a.doLayout();
		plus.setActivated(); // notify ImagePlus that image has been activated
	}

	private void createJavaFXTabDisplay(final String title, SwingFxSwtView view) {
		ci = new CTabItem(CanvasView.tabFolder, SWT.CLOSE, CanvasView.insertMark + 1);
		// ci.setData(plus);// add a reference to the image
		// for use as
		// selected tab
		ci.setData(ve);// add a vector with the data from
				// the
		// ImageWindow and the Image!!
		ci.setText(title);
		ci.isShowing();

		top = new Composite(CanvasView.tabFolder, SWT.NONE);
		top.setLayout(new FillLayout());

		ci.setControl(top);

		a = new JPanel();
		a.setBackground(ImageJ.getSystemColour());
		/*
		 * At this point we open and initialize the JavaFX toolkit by means of the
		 * JavaFX SWT panel!
		 */

		view.embedd(top, a);
		a.add(im);// Add the Image canvas to the JPanel
		a.setLayout(new ImageLayout(im));

		if (channelselect != null) {
			a.add(channelselect);
		}
		if (sliceselect != null) {
			a.add(sliceselect);
		}
		if (frameselect != null) {
			a.add(frameselect);
		}

		ve.add(a); // Add to the vector for access
		CanvasView.tabFolder.setLayout(null);
		CanvasView.tabFolder.showItem(ci);
		CanvasView.tabFolder.setSelection(ci);
		CanvasView.setCurrent(a);
		CanvasView.getCanvas_view().win = win;
		// CanvasView.getCurrent().doLayout();
		a.doLayout();
		plus.setActivated(); // notify ImagePlus that image has been activated
	}

}
