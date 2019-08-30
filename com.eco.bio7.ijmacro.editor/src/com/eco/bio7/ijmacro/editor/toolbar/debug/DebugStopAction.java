/*******************************************************************************
 * Copyright (c) 2007-2012 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.ijmacro.editor.toolbar.debug;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;

import ij.IJ;
import ij.macro.Interpreter;

public class DebugStopAction extends Action {

	public DebugStopAction() {
		super("Stop");

		setId("Stop");
		setText("Stop (Q) - Halt execution and jump to the top-level immediately.");

		//ImageDescriptor desc = ImageDescriptor.createFromImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/pics/terminatedlaunch_obj.gif")));
		ImageDescriptor desc = IJMacroEditorPlugin.getImageDescriptor("/icons/ijmacrodebug/terminatedlaunch_obj.png");
		this.setImageDescriptor(desc);
	}

	public void run() {
		
		Interpreter.abort();
		IJ.beep();
		Table table = DebugVariablesView.getDebugVariablesGrid();
		if (table != null) {
			table.removeAll();
		}
		DebugTraceAction.setFastTrace(false);

		/*IEditorPart edit = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		
		ITextEditor editor = (ITextEditor) edit;
		IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);
		try {
			resource.deleteMarkers("com.eco.bio7.reditor.debugrulermark", false, IResource.DEPTH_ZERO);
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/

		// inst.toolBarManager.update(true);

	}

}