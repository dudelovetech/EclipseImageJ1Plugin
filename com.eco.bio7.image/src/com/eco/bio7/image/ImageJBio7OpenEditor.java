package com.eco.bio7.image;

import java.io.File;
import javax.swing.SwingUtilities;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.part.EditorPart;
import ij.IJ;
import ij.io.OpenDialog;
import ij.io.Opener;

public class ImageJBio7OpenEditor extends EditorPart {

	private IEditorSite site;
	private IEditorInput input;
	private String fi;

	public void createPartControl(Composite parent) {

		IFile file = ResourceUtil.getFile(input);

		fi = file.getRawLocation().toString();
		/* If JavaFX embeds the ImageJ canvas! */
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		boolean javaFXEmbedded = store.getBoolean("JAVAFX_EMBEDDED");
		if (javaFXEmbedded) {
			openFile(new File(fi));
		} else {
			// String dirPath = new File(fi).getParentFile().getPath().replace("\\", "/");
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {

					openFile(new File(fi));
				}
			});
		}

		openView("com.eco.bio7.imagej");

		// RServe.openPDF(dirPath + "/", theName + ".pdf", useBrowser, openInJavaFXBrowser);
	}

	public void init(IEditorSite site, IEditorInput input) {
		setSite(site);
		this.site = site;
		this.input = input;
		setInput(input);
		// getSite().getWorkbenchWindow().getPartService().addPartListener(partListener);

	}

	private IPartListener2 partListener = new IPartListener2() {

		@Override
		public void partActivated(IWorkbenchPartReference partRef) { //

		}

		private void updateHierachyView(IWorkbenchPartReference partRef, final boolean closed) {

		}

		public void partBroughtToTop(IWorkbenchPartReference partRef) { // TODO

		}

		public void partClosed(IWorkbenchPartReference partRef) { // TODO

		}

		public void partDeactivated(IWorkbenchPartReference partRef) { // TODO
																		// //

		}

		@Override
		public void partOpened(IWorkbenchPartReference partRef) {

		}

		public void partHidden(IWorkbenchPartReference partRef) { // TODO

		}

		public void partVisible(IWorkbenchPartReference partRef) { // TODO

		}

		public void partInputChanged(IWorkbenchPartReference partRef) { // TODO

		}

	};

	public void setFocus() {
		site.getPage().closeEditor(ImageJBio7OpenEditor.this, false);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Opens the view with the specified id.
	 * 
	 * @param id
	 *            the id as a string value.
	 */
	public void openView(final String id) {

		Display display = PlatformUI.getWorkbench().getDisplay();
		display.syncExec(new Runnable() {
			public void run() {
				try {
					IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					page.showView(id);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}

	/**
	 * Open a file.
	 */
	private void openFile(File f) {
		try {
			if (null == f)
				return;
			String path = f.getCanonicalPath();
			if (f.exists()) {

				(new Opener()).openAndAddToRecent(path);
				OpenDialog.setLastDirectory(f.getParent() + File.separator);
				OpenDialog.setLastName(f.getName());

			} else {
				IJ.log("File not found: " + path);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}