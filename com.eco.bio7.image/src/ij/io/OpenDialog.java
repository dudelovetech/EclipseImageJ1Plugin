package ij.io;

import ij.*;
import ij.gui.*;
import ij.plugin.frame.Recorder;
import ij.util.Java2;
import ij.macro.Interpreter;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.eco.bio7.image.Util;

/**
 * This class displays a dialog window from which the user can select an input
 * file.
 */
public class OpenDialog {

	private String dir;
	private String name;
	private boolean recordPath;
	private static String defaultDirectory;
	private static Frame sharedFrame;
	private String title;
	protected FileDialog fd;
	private static String lastDir, lastName;

	/** Displays a file open dialog with 'title' as the title. */
	public OpenDialog(String title) {
		this(title, null);
	}

	/**
	 * Displays a file open dialog with 'title' as the title. If 'path' is
	 * non-blank, it is used and the dialog is not displayed. Uses and updates the
	 * ImageJ default directory.
	 */
	public OpenDialog(String title, String path) {
		String macroOptions = Macro.getOptions();
		if (macroOptions != null && (path == null || path.equals(""))) {
			path = Macro.getValue(macroOptions, title, path);
			if (path == null || path.equals(""))
				path = Macro.getValue(macroOptions, "path", path);
			if ((path == null || path.equals("")) && title != null && title.equals("Open As String"))
				path = Macro.getValue(macroOptions, "OpenAsString", path);
			path = lookupPathVariable(path);
		}
		if (path == null || path.equals("")) {
			if (Prefs.useJFileChooser)
				jOpen(title, getDefaultDirectory(), null);
			else
				open(title, getDefaultDirectory(), null);
			if (name != null)
				defaultDirectory = dir;
			this.title = title;
			recordPath = true;
		} else {
			decodePath(path);
			recordPath = IJ.macroRunning();
		}
		IJ.register(OpenDialog.class);
	}

	/**
	 * Displays a file open dialog, using the specified default directory and file
	 * name.
	 */
	public OpenDialog(String title, String defaultDir, String defaultName) {
		String path = null;
		String macroOptions = Macro.getOptions();
		if (macroOptions != null)
			path = Macro.getValue(macroOptions, title, path);
		if (path != null)
			decodePath(path);
		else {
			if (Prefs.useJFileChooser)
				jOpen(title, defaultDir, defaultName);
			else
				open(title, defaultDir, defaultName);
			this.title = title;
			recordPath = true;
		}
	}

	public static String lookupPathVariable(String path) {
		if (path != null && path.indexOf(".") == -1 && !((new File(path)).exists())) {
			if (path.startsWith("&"))
				path = path.substring(1);
			Interpreter interp = Interpreter.getInstance();
			String path2 = interp != null ? interp.getStringVariable(path) : null;
			if (path2 != null)
				path = path2;
		}
		return path;
	}

	// Uses JFileChooser to display file open dialog box.
	void jOpen(String title, String path, String fileName) {
		Java2.setSystemLookAndFeel();
		if (EventQueue.isDispatchThread())
			jOpenDispatchThread(title, path, fileName);
		else
			jOpenInvokeAndWait(title, path, fileName);
	}

	// Uses the JFileChooser class to display the dialog box.
	// Assumes we are running on the event dispatch thread
	void jOpenDispatchThread(String title, String path, final String fileName) {
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle(title);
		File fdir = null;
		if (path != null)
			fdir = new File(path);
		if (fdir != null)
			fc.setCurrentDirectory(fdir);
		if (fileName != null)
			fc.setSelectedFile(new File(fileName));
		int returnVal = fc.showOpenDialog(IJ.getInstance());
		if (returnVal != JFileChooser.APPROVE_OPTION) {
			Macro.abort();
			return;
		}
		File file = fc.getSelectedFile();
		if (file == null) {
			Macro.abort();
			return;
		}
		name = file.getName();
		dir = fc.getCurrentDirectory().getPath() + File.separator;
	}

	// Run JFileChooser on event dispatch thread to avoid deadlocks
	void jOpenInvokeAndWait(final String title, final String path, final String fileName) {
		try {
			EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					JFileChooser fc = new JFileChooser();
					fc.setDialogTitle(title);
					File fdir = null;
					if (path != null)
						fdir = new File(path);
					if (fdir != null)
						fc.setCurrentDirectory(fdir);
					if (fileName != null)
						fc.setSelectedFile(new File(fileName));
					int returnVal = fc.showOpenDialog(IJ.getInstance());
					if (returnVal != JFileChooser.APPROVE_OPTION) {
						Macro.abort();
						return;
					}
					File file = fc.getSelectedFile();
					if (file == null) {
						Macro.abort();
						return;
					}
					name = file.getName();
					dir = fc.getCurrentDirectory().getPath() + File.separator;
				}
			});
		} catch (Exception e) {
		}
	}

	/* Changed for Bio7 Linux to Swt! */
	void open(String title, final String path, final String fileName) {
		/*
		 * Frame parent = IJ.getInstance(); if (parent == null) { if (sharedFrame ==
		 * null) sharedFrame = new Frame(); parent = sharedFrame; }
		 * 
		 * if (IJ.isMacOSX() && IJ.isJava18()) { ImageJ ij = IJ.getInstance(); if (ij !=
		 * null && ij.isActive()) parent = ij; else parent = null; }
		 */

		Display display = Util.getDisplay();
		display.syncExec(new Runnable() {

			public void run() {
				Shell s = new Shell(SWT.EMBEDDED);
				fd = new org.eclipse.swt.widgets.FileDialog(s, SWT.OPEN);
				fd.setText("Load");
				if (path != null)
					fd.setFilterPath(path);
				if (fileName != null)
					fd.setFileName(fileName);

				name = fd.open();
				if (name != null) {
					File file = new File(name);

					name = file.getName();
					dir = fd.getFilterPath() + File.separator;
				} else {

					Macro.abort();
					return;

				}

			}
		});
		/*
		 * FileDialog fd = new FileDialog(parent, title); if (path!=null)
		 * fd.setDirectory(path); if (fileName!=null) fd.setFile(fileName);
		 * //GUI.center(fd); fd.show(); name = fd.getFile(); if (name==null) { if
		 * (IJ.isMacOSX()) System.setProperty("apple.awt.fileDialogForDirectories",
		 * "false"); Macro.abort(); } else dir = fd.getDirectory();
		 */
	}

	void decodePath(String path) {
		int i = path.lastIndexOf('/');
		if (i == -1)
			i = path.lastIndexOf('\\');
		if (i > 0) {
			dir = path.substring(0, i + 1);
			name = path.substring(i + 1);
		} else {
			dir = "";
			name = path;
		}
	}

	/** Returns the selected directory. */
	public String getDirectory() {
		lastDir = dir;
		return dir;
	}

	/** Returns the selected file name. */
	public String getFileName() {
		if (name != null) {
			if (Recorder.record && recordPath && dir != null)
				Recorder.recordPath(title, dir + name);
			lastName = name;
		}
		return name;
	}

	/** Returns the selected file path or null if the dialog was canceled. */
	public String getPath() {
		if (getFileName() == null)
			return null;
		else
			return getDirectory() + getFileName();
	}

	/**
	 * Returns the current working directory, which may be null. The returned string
	 * always ends with the separator character ("/" or "\").
	 */
	public static String getDefaultDirectory() {
		if (defaultDirectory == null)
			defaultDirectory = Prefs.getDefaultDirectory();
		return defaultDirectory;
	}

	/** Sets the current working directory. */
	public static void setDefaultDirectory(String defaultDir) {
		defaultDirectory = defaultDir;
		if (defaultDirectory != null && !defaultDirectory.endsWith(File.separator) && !defaultDirectory.endsWith("/"))
			defaultDirectory = defaultDirectory + File.separator;
	}

	/**
	 * Returns the path to the directory that contains the last file opened, or null
	 * if a file has not been opened.
	 */
	public static String getLastDirectory() {
		return lastDir;
	}

	/**
	 * Sets the path to the directory containing the last file opened by the user.
	 */
	public static void setLastDirectory(String dir) {
		lastDir = dir;
	}

	/**
	 * Returns the name of the last file opened by the user using a file open or
	 * file save dialog, or using drag and drop. Returns null if the users has not
	 * opened a file.
	 */
	public static String getLastName() {
		return lastName;
	}

	/** Sets the name of the last file opened by the user. */
	public static void setLastName(String name) {
		lastName = name;
	}

}
