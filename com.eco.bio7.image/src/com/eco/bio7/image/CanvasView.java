/*******************************************************************************
 * Copyright (c) 2007-2013 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.image;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.File;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabFolder2Listener;
import org.eclipse.swt.custom.CTabFolderEvent;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import com.eco.bio7.ImageJPluginActions.ImageJHelp;
import com.eco.bio7.ImageJPluginActions.ImageJAnalyzeAction;
import com.eco.bio7.ImageJPluginActions.ImageJEditAction;
import com.eco.bio7.ImageJPluginActions.ImageJFileAction;
import com.eco.bio7.ImageJPluginActions.ImageJImageAction;
import com.eco.bio7.ImageJPluginActions.ImageJPluginsAction;
import com.eco.bio7.ImageJPluginActions.ImageJProcessAction;
import com.eco.bio7.ImageJPluginActions.ImageJWindowAction;
import ij.IJ;
import ij.ImageJ;
import ij.ImagePlus;
import ij.WindowManager;
import ij.gui.GenericDialog;
import ij.gui.ImageWindow;
import ij.io.DirectoryChooser;
import ij.io.OpenDialog;
import ij.io.Opener;
import ij.plugin.DragAndDrop;
import ij.plugin.FolderOpener;

public class CanvasView extends ViewPart {
	public static int insertMark = -1;

	public static final String ID = "com.eco.bio7.imagej";

	public static Composite parent2;

	private static JPanel current;

	private ImageJFileAction file;

	private ImageJEditAction edit;

	private ImageJImageAction image;

	private ImageJProcessAction process;

	private ImageJAnalyzeAction analyze;

	private ImageJPluginsAction plugins;

	private ImageJWindowAction window;

	protected String[] fileList;

	protected ImagePlus plu;

	protected ImageWindow win;

	private ImageJHelp help;

	private String osname;

	private boolean isWin;

	private boolean isMac;

	private boolean isLinux;

	private static CanvasView canvas_view;

	public static CTabFolder tabFolder;

	// private ArrayList<String> detachedSecViewIDs = new ArrayList<String>();

	public CanvasView() {
		super();
		canvas_view = this;

		this.getViewSite();
		javafx.application.Platform.setImplicitExit(false);
		

	}

	public void createPartControl(Composite parent) {
		
		osname = System.getProperty("os.name");
		isWin = osname.startsWith("Windows");
		isMac = !isWin && osname.startsWith("Mac");
		isLinux = osname.startsWith("Linux");
       
		setComponentFont(parent.getDisplay());
		if (isWin) {

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
		} else if (isMac) {

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {

				e.printStackTrace();
			} catch (UnsupportedLookAndFeelException e) {
				e.printStackTrace();
			}
		}
		/* If Linux is the OS! */
		else if (isLinux) {
			MetalTheme theme = new Bio7LinuxTheme();

			MetalLookAndFeel.setCurrentTheme(theme);

			try {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel"); //$NON-NLS-1$
				// SwingUtilities.updateComponentTreeUI(this);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		parent.addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(DisposeEvent e) {

				/* Save the ImageJ preferences when the view is closed! */
				try {
					ij.Prefs.savePreferences();
				} catch (RuntimeException ex) {

					ex.printStackTrace();
				}

			}
		});

		// AwtEnvironment awt = new AwtEnvironment(parent.getDisplay());

		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "com.eco.bio7.imagej");

		parent.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				/*
				 * Here we write the values in the com.eco.bio7 plugin
				 * preferences with the help of scoped preferences!
				 */
				Rectangle rec = parent.getClientArea();

				IPreferenceStore store = new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.eco.bio7");
				if (store != null) {
					String selection = store.getString("PLOT_DEVICE_SELECTION");
					String pathTo = store.getString("pathTempR");
					int correction = 0;
					if (tabFolder.isDisposed() == false && tabFolder != null) {
						/* Height correction for the plot! */
						correction = CanvasView.tabFolder.getTabHeight();
					}

					if (selection.equals("PLOT_IMAGEJ_DISPLAYSIZE_CAIRO")) {

						store.setValue("DEVICE_DEFINITION", ".bio7Device <- function(filename = \"" + pathTo + "tempDevicePlot%05d.tiff" + "\") { tiff(filename,width = " + rec.width + ", height = "
								+ (rec.height - correction) + ", type=\"cairo\")}; options(device=\".bio7Device\")");
					} else if (selection.equals("PLOT_IMAGEJ_DISPLAYSIZE")) {
						store.setValue("DEVICE_DEFINITION", ".bio7Device <- function(filename = \"" + pathTo + "tempDevicePlot%05d.tiff" + "\") { tiff(filename,width =  " + rec.width + ", height = "
								+ (rec.height - correction) + ", units = \"px\")}; options(device=\".bio7Device\")");

					}
				}

			}
		});

		getViewSite().getPage().addPartListener(new IPartListener() {
			public void partActivated(IWorkbenchPart part) {
				if (part instanceof CanvasView) {

				}
			}

			public void partBroughtToTop(IWorkbenchPart part) {

			}

			public void partClosed(IWorkbenchPart part) {
				if (part instanceof CanvasView) {
					CTabItem[] items = tabFolder.getItems();

					for (int i = 0; i < items.length; i++) {
						Vector ve = (Vector) items[i].getData();
						if (ve.size() > 0) {
							final ImageWindow win = (ImageWindow) ve.get(1);
							/*
							 * Execute on the event dispatching thread!
							 * Important for WorldWind which uses ImageJ! (else
							 * deadlock situation occurs!!!)
							 */
							SwingUtilities.invokeLater(new Runnable() {
								public void run() {
									win.bio7TabClose();
								}
							});

						}

					}
					canvas_view = null;
				}
			}

			public void partDeactivated(IWorkbenchPart part) {
				if (part instanceof CanvasView) {

				}
			}

			public void partOpened(IWorkbenchPart part) {
				if (part instanceof CanvasView) {

				}
			}
		});
		Display display = Display.getDefault();
		this.parent2 = parent;

		new ImageJ();

		file = new ImageJFileAction();
		edit = new ImageJEditAction();
		image = new ImageJImageAction();
		process = new ImageJProcessAction();
		analyze = new ImageJAnalyzeAction();
		plugins = new ImageJPluginsAction();
		window = new ImageJWindowAction();
		help = new ImageJHelp();

		initializeToolBar();
		tabFolder = new CTabFolder(parent, SWT.TOP);
		DropTarget dt = new DropTarget(tabFolder, DND.DROP_DEFAULT | DND.DROP_MOVE);
		dt.setTransfer(new Transfer[] { FileTransfer.getInstance() });
		dt.addDropListener(new DropTargetAdapter() {
			public void drop(DropTargetEvent event) {

				FileTransfer ft = FileTransfer.getInstance();
				if (ft.isSupportedType(event.currentDataType)) {
					fileList = (String[]) event.data;
					for (int i = 0; i < fileList.length; i++) {

						final int x = i;
						IPreferenceStore store = Activator.getDefault().getPreferenceStore();
						boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
						if (javaFXEmbedded) {
							openFile(new File(fileList[x].toString()));
						} else {
							SwingUtilities.invokeLater(new Runnable() {
								public void run() {

									/*
									 * Opener o = new Opener();
									 * o.open(fileList[x].toString());
									 */
									openFile(new File(fileList[x].toString()));
								}
							});
						}
					}

				}
			}
		});
		tabFolder.setBorderVisible(true);
		tabFolder.setLayoutData(new GridData(GridData.FILL_BOTH));
		tabFolder.setSimple(false);

		tabFolder.setSelectionBackground(new Color[] { display.getSystemColor(SWT.COLOR_DARK_GREEN), display.getSystemColor(SWT.COLOR_DARK_GREEN) }, new int[] { 90 }, true);
		tabFolder.setSelectionForeground(display.getSystemColor(SWT.COLOR_WHITE));

		tabFolder.addCTabFolder2Listener(new CTabFolder2Listener() {

			public void close(final CTabFolderEvent event) {

				Vector ve = (Vector) event.item.getData();
				ImagePlus plu = (ImagePlus) ve.get(0);

				final ImageWindow win = (ImageWindow) ve.get(1);
				SwingUtilities.invokeLater(new Runnable() {
					// !!
					public void run() {
						win.bio7TabClose();
					}
				});

			}

			public void maximize(CTabFolderEvent event) {

			}

			public void minimize(CTabFolderEvent event) {

			}

			public void restore(CTabFolderEvent event) {

			}

			public void showList(CTabFolderEvent event) {

			}

		});
		tabFolder.addSelectionListener(new SelectionListener() {
			public void itemClosed(CTabFolderEvent event) {

			}

			public void widgetDefaultSelected(SelectionEvent e) {

			}

			public void widgetSelected(SelectionEvent e) {
				Vector ve = (Vector) e.item.getData();
				plu = (ImagePlus) ve.get(0);

				win = (ImageWindow) ve.get(1);

				WindowManager.setTempCurrentImage(plu);
				WindowManager.setCurrentWindow(win);

				/* import to set current Panel! */
				current = (JPanel) ve.get(2);
				// current.requestFocus();

			}

		});
		tabFolder.addMouseListener(new MouseAdapter() {

			public void mouseDown(MouseEvent mouseevent)

			{
				/*
				 * Important to select the correct image and window when
				 * creating the new ImageJ view!The listener for the right-click
				 * on the tabitem will care about that!
				 */
				if (mouseevent.count == 1) {

					CTabFolder ctab = (CTabFolder) mouseevent.widget;

					if (ctab.getItemCount() > 0) {
						Vector ve = (Vector) ctab.getSelection().getData();
						plu = (ImagePlus) ve.get(0);

						win = (ImageWindow) ve.get(1);
						WindowManager.setTempCurrentImage(plu);
						WindowManager.setCurrentWindow(win);

						// important to set current Panel!
						current = (JPanel) ve.get(2); // current.requestFocus();
					}

				} else if (mouseevent.count == 2 && mouseevent.button == 1) {

					IJ.getInstance().doCommand("Rename...");
				}
			}

		});
		tabFolder.addMouseListener(new MouseAdapter() {

			public void mouseDown(MouseEvent mouseevent)

			{
				if (mouseevent.button == 3 && mouseevent.count > 1) {
					CTabFolder ctab = (CTabFolder) mouseevent.widget;
					if (ctab.getItemCount() > 0) {
						Vector ve = (Vector) ctab.getSelection().getData();
						ImagePlus plu = (ImagePlus) ve.get(0);

						ImageWindow win = (ImageWindow) ve.get(1);
						// JPanel current = (JPanel) ve.get(2);

						CustomDetachedImageJView custom = new CustomDetachedImageJView();
						/* Create ImageJ view with unique ID! */
						String id = UUID.randomUUID().toString();
						// detachedSecViewIDs.add(id);
						custom.setPanel(current, id);
						custom.setData(plu, win);
						/*
						 * Only hide the tab without to close the ImagePlus
						 * object!
						 */
						IJTabs.hideTab();
					}

				}
			}

		});

	}

	public void setstatusline(String message) {
		IActionBars bars = getViewSite().getActionBars();
		bars.getStatusLineManager().setMessage(message);

	}

	private void initializeToolBar() {
		IToolBarManager tbm = getViewSite().getActionBars().getToolBarManager();

		tbm.add(file);
		tbm.add(edit);
		tbm.add(image);
		tbm.add(process);
		tbm.add(analyze);
		tbm.add(plugins);
		tbm.add(window);
		tbm.add(help);
		tbm.add(new PlaceholderLabel().getPlaceholderLabel());

	}

	public void setFocus() {

	}

	public void dispose() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		if (javaFXEmbedded) {
			IJTabs.deleteAllTabs();
		}
	}

	public static CanvasView getCanvas_view() {
		return canvas_view;
	}

	public static JPanel getCurrent() {
		return current;
	}

	public static void setCurrent(JPanel current) {
		CanvasView.current = current;
	}

	public static Composite getParent2() {
		return parent2;
	}

	/**
	 * Open a file. If it's a directory, ask to open all images as a sequence in
	 * a stack or individually.
	 */
	private void openFile(File f) {
		try {
			if (null == f)
				return;
			String path = f.getCanonicalPath();
			if (f.exists()) {
				if (f.isDirectory())
					openDirectory(f, path);
				else {
					(new Opener()).openAndAddToRecent(path);
					OpenDialog.setLastDirectory(f.getParent() + File.separator);
					OpenDialog.setLastName(f.getName());
				}
			} else {
				IJ.log("File not found: " + path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openDirectory(File f, String path) {
		if (path == null)
			return;
		if (!(path.endsWith(File.separator) || path.endsWith("/")))
			path += File.separator;
		String[] names = f.list();
		names = (new FolderOpener()).trimFileList(names);
		if (names == null)
			return;
		String msg = "Open all " + names.length + " images in \"" + f.getName() + "\" as a stack?";
		GenericDialog gd = new GenericDialog("Open Folder");
		gd.setInsets(10, 5, 0);
		gd.addMessage(msg);
		gd.setInsets(15, 35, 0);
		gd.addCheckbox("Convert to RGB", DragAndDrop.convertToRGB);
		gd.setInsets(0, 35, 0);
		gd.addCheckbox("Use Virtual Stack", DragAndDrop.virtualStack);
		gd.enableYesNoCancel();
		gd.showDialog();
		if (gd.wasCanceled())
			return;
		if (gd.wasOKed()) {
			DragAndDrop.convertToRGB = gd.getNextBoolean();
			DragAndDrop.virtualStack = gd.getNextBoolean();
			String options = " sort";
			if (DragAndDrop.convertToRGB)
				options += " convert_to_rgb";
			if (DragAndDrop.virtualStack)
				options += " use";
			IJ.run("Image Sequence...", "open=[" + path + "]" + options);
			DirectoryChooser.setDefaultDirectory(path);
		} else {
			for (int k = 0; k < names.length; k++) {
				if (!names[k].startsWith(".")) {
					IJ.redirectErrorMessages(true);
					ImagePlus imp = IJ.openImage(path + names[k]);
					if (imp != null) {
						imp.setIJMenuBar(k == names.length - 1);
						imp.show();
					}
					IJ.redirectErrorMessages(false);
				}
			}
		}
		IJ.register(DragAndDrop.class);
	}

	/*
	 * public ArrayList<String> getDetachedSecViewIDs() { return
	 * detachedSecViewIDs; }
	 */
	private void setComponentFont(Display dis) {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean antialiasedFonts = false;
		antialiasedFonts = store.getBoolean("FONT_ANTIALIASED");
		if (antialiasedFonts) {
			System.setProperty("awt.useSystemAAFontSettings", "on");
			System.setProperty("swing.aatext", "true");
		}

		

		assert EventQueue.isDispatchThread(); // On AWT event thread

		FontData fontData = dis.getSystemFont().getFontData()[0];

		int resolution = Toolkit.getDefaultToolkit().getScreenResolution();

		int awtFontSize = (int) Math.round((double) fontData.getHeight() * resolution / 72.0);
		java.awt.Font awtFont = null;

		int fontSizeCorrection = 0;
		fontSizeCorrection = store.getInt("FONT_SIZE_CORRECTION");
		/* Font size correction! */

		awtFont = new java.awt.Font(fontData.getName(), fontData.getStyle(), awtFontSize + fontSizeCorrection);

		// Update the look and feel defaults to use new font.
		updateLookAndFeel(awtFont);

	}

	private void updateLookAndFeel(java.awt.Font awtFont) {
		assert awtFont != null;
		assert EventQueue.isDispatchThread(); // On AWT event thread

		FontUIResource fontResource = new FontUIResource(awtFont);

		UIManager.put("Button.font", fontResource); //$NON-NLS-1$
		UIManager.put("CheckBox.font", fontResource); //$NON-NLS-1$
		UIManager.put("ComboBox.font", fontResource); //$NON-NLS-1$
		UIManager.put("EditorPane.font", fontResource); //$NON-NLS-1$
		UIManager.put("Label.font", fontResource); //$NON-NLS-1$
		UIManager.put("List.font", fontResource); //$NON-NLS-1$
		UIManager.put("Panel.font", fontResource); //$NON-NLS-1$
		UIManager.put("ProgressBar.font", fontResource); //$NON-NLS-1$
		UIManager.put("RadioButton.font", fontResource); //$NON-NLS-1$
		UIManager.put("ScrollPane.font", fontResource); //$NON-NLS-1$
		UIManager.put("TabbedPane.font", fontResource); //$NON-NLS-1$
		UIManager.put("Table.font", fontResource); //$NON-NLS-1$
		UIManager.put("TableHeader.font", fontResource); //$NON-NLS-1$
		UIManager.put("TextField.font", fontResource); //$NON-NLS-1$
		UIManager.put("TextPane.font", fontResource); //$NON-NLS-1$
		UIManager.put("TitledBorder.font", fontResource); //$NON-NLS-1$
		UIManager.put("ToggleButton.font", fontResource); //$NON-NLS-1$
		UIManager.put("TreeFont.font", fontResource); //$NON-NLS-1$
		UIManager.put("ViewportFont.font", fontResource); //$NON-NLS-1$
		UIManager.put("MenuItem.font", fontResource); //$NON-NLS-1$
		UIManager.put("CheckboxMenuItem.font", fontResource); //$NON-NLS-1$
		UIManager.put("PopupMenu.font", fontResource); // $NON-NLS-1

		java.util.Enumeration keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put(key, fontResource);
		}

	}

}
