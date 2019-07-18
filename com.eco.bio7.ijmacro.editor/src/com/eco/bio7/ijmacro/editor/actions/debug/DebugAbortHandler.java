package com.eco.bio7.ijmacro.editor.actions.debug;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import com.eco.bio7.ijmacro.editors.IJMacroEditor;
import com.eco.bio7.image.DebugVariablesView;

import ij.IJ;
import ij.macro.Interpreter;

/**
 * @noreference This class is not intended to be referenced by clients.
 */
final public class DebugAbortHandler extends AbstractHandler {

	public DebugAbortHandler() {

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		/*IEditorPart editore = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();*/
		//IJMacroEditor editor = (IJMacroEditor) editore;
		Interpreter.abort();
		IJ.beep();
		Table table = DebugVariablesView.getDebugVariablesGrid();
		if (table != null) {
			table.removeAll();
		}
		return null;
	}

}