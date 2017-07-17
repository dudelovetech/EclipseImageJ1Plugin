package com.eco.bio7.ijmacro.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import com.eco.bio7.ijmacro.editor.beautifier.JSBeautifier;
import com.eco.bio7.ijmacro.editor.beautifier.JSBeautifierOptions;

public class ScriptFormatterSelectAction extends Action {

	public ScriptFormatterSelectAction() {
		super("format");
		setId("com.eco.bio7.Java_format_selected");

		setText("Format Selected Source");
	}

	public void run() {
		IEditorPart editor = (IEditorPart) PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		ITextEditor editor2 = (ITextEditor) editor;
		IDocumentProvider dp = editor2.getDocumentProvider();
		IDocument doc = dp.getDocument(editor.getEditorInput());

		ISelectionProvider sp = editor2.getSelectionProvider();
		ISelection selectionsel = sp.getSelection();
		ITextSelection selection = (ITextSelection) selectionsel;

		int offset = selection.getOffset();
		int length = selection.getLength();

		String code = selection.getText();
		
		JSBeautifierOptions opts = new JSBeautifierOptions();
		String formattedString = new JSBeautifier().js_beautify(code, opts);

		try {
			doc.replace(offset, length, formattedString);
		} catch (BadLocationException e) {

			e.printStackTrace();
		}
		/* Scroll to the selection! */
		editor2.selectAndReveal(offset, 0);

	}

	public void dispose() {

	}

}