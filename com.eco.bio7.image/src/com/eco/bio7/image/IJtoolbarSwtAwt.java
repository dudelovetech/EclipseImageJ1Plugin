package com.eco.bio7.image;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JRootPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import ij.IJ;

public class IJtoolbarSwtAwt {

	public Composite top;
	public Frame frame;
	public Shell parent;

	public Composite getTop() {
		return top;
	}

	public Shell getParent() {
		return parent;
	}

	public IJtoolbarSwtAwt() {

		parent = new Shell(Util.getDisplay());
		top = new Composite(parent, SWT.NO_BACKGROUND | SWT.EMBEDDED);

		frame = SWT_AWT.new_Frame(top);
		try {
			System.setProperty("sun.awt.noerasebackground", "true");
		} catch (NoSuchMethodError error) {
		}

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
		JPanel jpp = new JPanel();

		Color swtBackgroundToAWT = Util.getSWTBackgroundToAWT();
		panel.setBackground(swtBackgroundToAWT);
		roote.setBackground(swtBackgroundToAWT);
		frame.setBackground(swtBackgroundToAWT);
		jpp.setBackground(swtBackgroundToAWT);

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
					messageBox.setMessage("Please reopen the ImageJ-Toolbar view!\n\n" + "Only a detached toolbar will be reopened automatically\n" + "in a saved and restored Eclipse session.");
					messageBox.open();
				}
			});
		}
	}

}
