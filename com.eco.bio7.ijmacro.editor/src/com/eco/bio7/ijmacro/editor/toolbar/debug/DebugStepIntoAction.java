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

package com.eco.bio7.ijmacro.editor.toolbar.debug;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;
import com.eco.bio7.ijmacro.editors.IJMacroEditor;

public class DebugStepIntoAction extends Action {
	
	

	public DebugStepIntoAction() {
		super("RunToInsertion");

		setId("RunToInsertionPoint");
		setText("Run To Insertion Point");

		//ImageDescriptor desc = ImageDescriptor.createFromImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/pics/stepinto_co.gif")));
		ImageDescriptor desc = IJMacroEditorPlugin.getImageDescriptor("/icons/ijmacrodebug/stepinto_co.png");
		this.setImageDescriptor(desc);
	}

	public void run() {
		IEditorPart editore = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(editore!=null) {
		IJMacroEditor editor = (IJMacroEditor) editore;
		editor.runToInsertionPoint();
		}
		
		
	}
}