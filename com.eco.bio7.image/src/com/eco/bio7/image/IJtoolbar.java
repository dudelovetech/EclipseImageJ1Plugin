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

import ij.IJ;
import javafx.application.Platform;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

public class IJtoolbar extends ViewPart {

	private JPanel jpp;
	private Frame frame;
	private Composite top;
	public static IJtoolbar instance;

	public IJtoolbar() {
		instance = this;
	}

	public void createPartControl(Composite parent) {

		getViewSite().getPage().addPartListener(new IPartListener2() {

			public void partActivated(IWorkbenchPartReference partRef) {
				if (partRef.getId().equals("com.eco.bio7.ijtoolbar")) {
					if (Util.getOS().equals("Mac")) {
						top.setVisible(false);
						top.setVisible(true);
					}

					/*
					 * SwingUtilities.invokeLater(new Runnable() { // !! public void run() { if (jpp
					 * != null) { jpp.doLayout(); jpp.repaint(); } } });
					 */

				}

			}

			public void partBroughtToTop(IWorkbenchPartReference partRef) {
				if (partRef.getId().equals("com.eco.bio7.ijtoolbar")) {

					/*
					 * SwingUtilities.invokeLater(new Runnable() { // !! public void run() { if (jpp
					 * != null) { jpp.doLayout(); jpp.repaint(); } } });
					 */
				}

			}

			public void partClosed(IWorkbenchPartReference partRef) {

			}

			public void partDeactivated(IWorkbenchPartReference partRef) {

			}

			public void partHidden(IWorkbenchPartReference partRef) {

			}

			public void partInputChanged(IWorkbenchPartReference partRef) {

			}

			public void partOpened(IWorkbenchPartReference partRef) {

			}

			public void partVisible(IWorkbenchPartReference partRef) {

			}
		});
		/*
		 * On MacOSX the javaFX integration works fine and avoids some errors!
		 */
		boolean enable = false;
		if (enable) { //
			SwingUtilities.invokeLater(new Runnable() {
				// !!
				public void run() {
					// jpp.repaint();

					jpp = new JPanel();
					jpp.setLayout(new GridLayout(2, 1));
					jpp.add(IJ.getInstance().toolbar);
					jpp.add(IJ.getInstance().statusBar);
					Display display = Util.getDisplay();
					display.asyncExec(new Runnable() {
						public void run() {
							SwingFxSwtView view = new SwingFxSwtView();
							view.embedd(parent, jpp);
						}
					});
				}
			});
		}

		/*
		 * On Windows and Linux we use the SWT_AWT bridge!
		 */
		else {
			createSwtAwtComp(parent);
			// }
		}

	}

	private void createSwtAwtComp(Composite parent) {
		top = new Composite(parent, SWT.NO_BACKGROUND | SWT.EMBEDDED);

		frame = SWT_AWT.new_Frame(top);

		/*
		 * final sun.awt.EmbeddedFrame ef = (sun.awt.EmbeddedFrame) frame;
		 * ef.addWindowListener(new WindowAdapter() { public void
		 * windowActivated(WindowEvent e) { ef.synthesizeWindowActivation(true); } });
		 */
		// SwtAwt.setSwtAwtFocus(frame, parent,Util.getDisplay());
		Panel panel = new JApplet() {
			public void update(java.awt.Graphics g) {

				paint(g);
			}
		};

		frame.add(panel);
		JRootPane roote = new JRootPane();
		panel.add(roote);
		java.awt.Container contentPane = roote.getContentPane();
		jpp = new JPanel();
		jpp.setLayout(new GridLayout(2, 1));
		if (IJ.getInstance() != null) {
			jpp.add(IJ.getInstance().toolbar);
			jpp.add(IJ.getInstance().statusBar);

			contentPane.add(jpp);

		} else {
			Display display = Util.getDisplay();
			display.syncExec(new Runnable() {
				public void run() {
					MessageBox messageBox = new MessageBox(Util.getShell(),

							SWT.ICON_WARNING);
					messageBox.setText("Info!");
					messageBox.setMessage("The ImageJ-Canvas view has to be alive!");
					messageBox.open();
				}
			});
		}
	}

	public void setFocus() {

	}

}
