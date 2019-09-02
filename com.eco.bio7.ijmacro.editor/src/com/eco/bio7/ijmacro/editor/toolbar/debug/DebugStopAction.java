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

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Table;
import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;
import ij.IJ;
import ij.macro.Interpreter;

public class DebugStopAction extends Action {

	public DebugStopAction() {
		super("Abort");

		setId("Abort");
		setText("Abort");
       setToolTipText("Exits the macro.");
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
		DebugMarkerAction.setMarkerCount(0);
		
	}

}