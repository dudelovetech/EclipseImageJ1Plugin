/*******************************************************************************
 * Copyright (c) 2007-2015 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.image;

import java.awt.Panel;
import java.util.Vector;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class FXSwtAwtCustom {

	private JApplet panel;

	private Composite top;

	private java.awt.Container contentPane;

	private java.awt.Frame frame;

	private JPanel jpanel;

	private Panel awtPanel;

	private Vector ve;

	private CustomDetachedImageJView view;

	protected Scene scene;

	protected Stage stage2;

	SwingFxSwtView fxView;

	public FXSwtAwtCustom(JPanel Jpanel, CustomDetachedImageJView view) {
		this.view = view;
		this.jpanel = Jpanel;
		ve = new Vector();
		ve.add(Jpanel);

	}

	public void addTab(final String title) {
		/* Add JavaFX to embed the ImageJ canvas! */
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		if (javaFXEmbedded) {
			SwingFxSwtView fxView = new SwingFxSwtView();
			Composite comp = view.getCustomViewParent();
			Display dis = comp.getDisplay();
			dis.syncExec(new Runnable() {
				public void run() {

					top = new Composite(view.getCustomViewParent(), SWT.NONE);
					top.setLayout(new FillLayout());
					comp.setData(ve);
					fxView.embedd(top, jpanel);

				}
			});
		}

		else {
			/* Add SWT_AWT to embed the ImageJ canvas! */
			Display dis = view.getCustomViewParent().getDisplay();
			dis.syncExec(new Runnable() {
				public void run() {

					top = new Composite(view.getCustomViewParent(), SWT.NO_BACKGROUND | SWT.EMBEDDED);
					try {
						System.setProperty("sun.awt.noerasebackground", "true");
					} catch (NoSuchMethodError error) {
					}

					view.getCustomViewParent().setData(ve);
					frame = SWT_AWT.new_Frame(top);

					SwtAwt.setSwtAwtFocus(frame, top,Util.getDisplay());

					panel = new JApplet() {
						public void update(java.awt.Graphics g) {
							// Do not erase the background
							paint(g);
						}
					};

					frame.add(panel);

					JRootPane root = new JRootPane();
					panel.add(root);
					contentPane = root.getContentPane();

					contentPane.add(jpanel);

					view.getCustomViewParent().layout();

				}
			});
		}
	}

}
