package com.eco.bio7.image;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * A utility class for the ImageJ plugin.
 * 
 * @author M. Austenfeld
 *
 */
public class Util {

	private static Font awtFont;
	private static Color col = null;

	/**
	 * A method to get the ImageJ path.
	 * 
	 * @return the default path of the ImageJ plugin
	 */
	public static String getImageJPath() {

		Bundle bundle = Platform.getBundle("com.eco.bio7.image");

		URL locationUrl = FileLocator.find(bundle, new Path("/"), null);
		URL fileUrl = null;
		try {
			fileUrl = FileLocator.toFileURL(locationUrl);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String path = new File(fileUrl.getFile()).toString();
		return path;
	}

	/**
	 * A method to get the default OS font from SWT to AWT.
	 * 
	 * @return the OS font as an AWT font.
	 */
	public static java.awt.Font getOSFontToAwt() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		int fontSizeCorrection = store.getInt("FONT_SIZE_CORRECTION");

		Display dis = getDisplay();

		dis.syncExec(new Runnable() {

			public void run() {

				FontData fontData = dis.getSystemFont().getFontData()[0];

				int resolution = Toolkit.getDefaultToolkit().getScreenResolution();

				int awtFontSize = (int) Math.round((double) fontData.getHeight() * resolution / 72.0);

				/* Font size correction! */

				awtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), awtFontSize + fontSizeCorrection);
			}
		});

		return awtFont;
	}

	public static Color getSWTBackgroundToAWT() {

		Display display = PlatformUI.getWorkbench().getDisplay();
		display.syncExec(new Runnable() {

			public void run() {

				org.eclipse.swt.graphics.Color colswt = CanvasView.getCanvas_view().getParent2().getBackground();
				int r = colswt.getRed();
				int g = colswt.getGreen();
				int b = colswt.getBlue();
				col = new Color(r, g, b);

			}
		});
		return col;

	}

	public static Color getSWTBackgroundToAWT(Composite parent) {

		Display display = PlatformUI.getWorkbench().getDisplay();
		display.syncExec(new Runnable() {

			public void run() {

				org.eclipse.swt.graphics.Color colswt = parent.getBackground();
				int r = colswt.getRed();
				int g = colswt.getGreen();
				int b = colswt.getBlue();
				col = new Color(r, g, b);

			}
		});
		return col;

	}

	/**
	 * A method to detect the current OS.
	 * 
	 * @return the OS name as a string
	 */
	public static String getOS() {
		String OS = null;
		String osname = System.getProperty("os.name");
		if (osname.startsWith("Windows")) {
			OS = "Windows";
		} else if (osname.equals("Linux")) {
			OS = "Linux";
		} else if (osname.startsWith("Mac")) {
			OS = "Mac";
		}
		return OS;
	}

	public File[] ListFilesDirectory(File filedirectory, final String[] extensions) {
		File dir = filedirectory;

		String[] children = dir.list();
		if (children == null) {

		} else {
			for (int i = 0; i < children.length; i++) {
				// Get filename of the file or directory inside Bio7.
				// String filename = children[i];
			}
		}

		// Filter the extension of the file.
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return (name.endsWith(extensions[0]) || name.endsWith(extensions[1]) || name.endsWith(extensions[2]) || name.endsWith(extensions[3]) || name.endsWith(extensions[4])
						|| name.endsWith(extensions[5]));
			}
		};

		File[] files = dir.listFiles(filter);

		return files;
	}

	public File[] ListFileDirectory(File filedirectory, final String extension) {
		File dir = filedirectory;

		String[] children = dir.list();
		if (children == null) {

		} else {
			for (int i = 0; i < children.length; i++) {
				// Get filename of the file or directory inside Bio7.
				String filename = children[i];
			}
		}

		// Filter the extension of the file.
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return (name.endsWith(extension));
			}
		};

		File[] files = dir.listFiles(filter);

		return files;
	}

	/**
	 * Returns a string representation of the file.
	 * 
	 * @param path
	 * @return
	 */
	public String fileToString(String path) {// this function returns the
		// File as a String
		FileInputStream fileinput = null;
		try {
			fileinput = new FileInputStream(path);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		int filetmp = 0;
		try {
			filetmp = fileinput.available();
		} catch (IOException e) {

			e.printStackTrace();
		}
		byte bitstream[] = new byte[filetmp];
		try {
			fileinput.read(bitstream);
		} catch (IOException e) {

			e.printStackTrace();
		}
		String content = new String(bitstream);
		return content;
	}

	/**
	 * Returns a platform shell for dialogs, etc.
	 * 
	 * @return a shell
	 */
	public static Shell getShell() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				return windows[0].getShell();
			}
		} else {
			return window.getShell();
		}
		return null;
	}

	/**
	 * A method to get the dpi of the display.
	 * 
	 * @return the dpi as type Point.
	 */
	public static Point getDpi() {
		Display dis = getDisplay();
		return dis.getDPI();
	}

	/**
	 * A method to return the primary monitor zoom.
	 * 
	 * @return the zoom value as integer.
	 */
	public static int getZoom() {
		Display dis = getDisplay();
		Monitor primary = dis.getPrimaryMonitor();
		return primary.getZoom();
	}

	/**
	 * Returns a default display.
	 * 
	 * @return a display
	 */
	public static Display getDisplay() {
		Display display = Display.getCurrent();
		// may be null if outside the UI thread
		if (display == null)
			display = Display.getDefault();
		return display;
	}

	/**
	 * Source from: http://www.guigarage.com/2013/01/invokeandwait-for-javafx/
	 * Invokes a Runnable in JFX Thread and waits while it's finished. Like
	 * SwingUtilities.invokeAndWait does for EDT.
	 * 
	 * @param run
	 *            The Runnable that has to be called on JFX thread.
	 * @throws InterruptedException
	 *             f the execution is interrupted.
	 * @throws ExecutionException
	 *             If a exception is occurred in the run method of the Runnable
	 */
	/**
	 * Simple helper class.
	 * 
	 * @author hendrikebbers
	 * 
	 */
	private static class ThrowableWrapper {
		Throwable t;
	}

	public static void runAndWait(final Runnable run) throws InterruptedException, ExecutionException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			try {
				run.run();
			} catch (Exception e) {
				throw new ExecutionException(e);
			}
		} else {
			final Lock lock = new ReentrantLock();
			final Condition condition = lock.newCondition();
			final ThrowableWrapper throwableWrapper = new ThrowableWrapper();
			lock.lock();
			try {
				javafx.application.Platform.runLater(new Runnable() {

					@Override
					public void run() {
						lock.lock();
						try {
							run.run();
						} catch (Throwable e) {
							throwableWrapper.t = e;
						} finally {
							try {
								condition.signal();
							} finally {
								lock.unlock();
							}
						}
					}
				});
				condition.await();
				if (throwableWrapper.t != null) {
					throw new ExecutionException(throwableWrapper.t);
				}
			} finally {
				lock.unlock();
			}
		}
	}
	
	public static boolean isThemeBlack() {
		boolean themeBlack = false;
		if (ThemeHelper.getEngine().getActiveTheme() != null) {
			String activeTheme = ThemeHelper.getEngine().getActiveTheme().getId();
			/*
			 * We use a black style if the CSS is the dark theme or the darkest dark theme!
			 */
			if (activeTheme.equals("org.eclipse.e4.ui.css.theme.e4_dark") || activeTheme.equals("com.genuitec.eclipse.themes.dark")) {

				

				themeBlack = true;

			} 
		}
		return themeBlack;
	}

}
