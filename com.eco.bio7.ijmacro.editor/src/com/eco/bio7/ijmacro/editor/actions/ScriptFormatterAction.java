
package com.eco.bio7.ijmacro.editor.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import com.eco.bio7.ijmacro.editor.beautifier.JSBeautifier;
import com.eco.bio7.ijmacro.editor.beautifier.JSBeautifierOptions;

public class ScriptFormatterAction extends Action {

	public ScriptFormatterAction() {
		super("format");
		setId("com.eco.bio7.Java_format");

		setText("Format Source");
	}

	public void run() {
		IEditorPart editor = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		IDocument doc = ((ITextEditor) editor).getDocumentProvider().getDocument(editor.getEditorInput());

		String code = doc.get();

		/*
		 * String formattedString = null;
		 * 
		 * ICodeFormatter formatter = ToolFactory.createCodeFormatter();
		 * 
		 * 
		 * ScriptEngineManager manager = new ScriptEngineManager(); ScriptEngine engine
		 * = manager.getEngineByName("JavaScript"); // read script file try {
		 * engine.eval(Files.newBufferedReader(Paths.get(
		 * "C:\\Users\\elk\\git\\EclipseImageJ1Plugin\\com.eco.bio7.ijmacro.editor\\js\\beautify.js"
		 * ), StandardCharsets.UTF_8)); } catch (ScriptException | IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * String script = "function js_beautify_bridge(text) {var arg=" +
		 * "{\"indent_size\": 4}" + ";return js_beautify(text, arg);}"; try {
		 * engine.eval(script); } catch (ScriptException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } // Compilable compilable = (Compilable)
		 * scriptEngine; // CompiledScript compiledScript = compilable.compile(script);
		 * // compiledScript.eval(); Invocable inv = (Invocable) engine; Object result =
		 * null; try { result = inv.invokeFunction("js_beautify_bridge", code); } catch
		 * (NoSuchMethodException | ScriptException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); } if (result instanceof String) { String string2 =
		 * (String) result; doc.set(string2); }
		 */

		// formattedString = formatter.format(code, 0, null, null);

		/* Code from: https://github.com/sebz/eclipse-javascript-formatter */
		JSBeautifierOptions opts = new JSBeautifierOptions();
		String result = new JSBeautifier().js_beautify(code, opts);

		doc.set(result);
	}

	public void dispose() {

	}

}