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

package com.eco.bio7.image;

import ij.IJ;

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
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.part.ViewPart;

public class IJtoolbar extends ViewPart {

	private JPanel jpp;

	public IJtoolbar() {

	}

	public void createPartControl(Composite parent) {

		getViewSite().getPage().addPartListener(new IPartListener2() {

			public void partActivated(IWorkbenchPartReference partRef) {
				if (partRef.getId().equals("com.eco.bio7.ijtoolbar")) {
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {
							jpp.repaint();
						}
					});

				}

			}

			public void partBroughtToTop(IWorkbenchPartReference partRef) {
				if (partRef.getId().equals("com.eco.bio7.ijtoolbar")) {
					SwingUtilities.invokeLater(new Runnable() {
						// !!
						public void run() {
							jpp.repaint();
						}
					});

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
		if (Util.getOS().equals("Mac")) {
			//

			jpp = new JPanel();
			jpp.setLayout(new GridLayout(2, 1));
			jpp.add(IJ.getInstance().toolbar);
			jpp.add(IJ.getInstance().statusBar);

			SwingFxSwtView view = new SwingFxSwtView();
			view.embedd(parent, jpp);
		}
		/*
		 * On Windows and Linux we use the SWT_AWT bridge!
		 */
		else {
			Composite top = new Composite(parent, SWT.NO_BACKGROUND | SWT.EMBEDDED);
			Frame frame = SWT_AWT.new_Frame(top);
			/*
			 * final sun.awt.EmbeddedFrame ef = (sun.awt.EmbeddedFrame) frame;
			 * ef.addWindowListener(new WindowAdapter() { public void
			 * windowActivated(WindowEvent e) {
			 * ef.synthesizeWindowActivation(true); } });
			 */
			SwtAwt.setSwtAwtFocus(frame, top);
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
			jpp.add(IJ.getInstance().toolbar);
			jpp.add(IJ.getInstance().statusBar);

			contentPane.add(jpp);
		}
	}

	public void setFocus() {

	}

}
