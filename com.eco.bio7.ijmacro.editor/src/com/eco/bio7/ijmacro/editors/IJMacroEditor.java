/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     
 *      M.Austenfeld - Minor changes for the Bio7 application
 *******************************************************************************/
package com.eco.bio7.ijmacro.editors;

import java.awt.Window;

import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;
import org.eclipse.jface.text.source.ICharacterPairMatcher;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;
import org.eclipse.ui.texteditor.SourceViewerDecorationSupport;
import org.eclipse.ui.texteditor.TextOperationAction;

import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;
import com.eco.bio7.ijmacro.editor.actions.InterpretImageJMacroAction;
import com.eco.bio7.ijmacro.editor.actions.OpenPreferences;
import com.eco.bio7.ijmacro.editor.actions.RSourceConverter;
import com.eco.bio7.ijmacro.editor.actions.ScriptFormatterAction;
import com.eco.bio7.ijmacro.editor.actions.ScriptFormatterSelectAction;
import com.eco.bio7.ijmacro.editor.actions.SetComment;
import com.eco.bio7.ijmacro.editor.actions.UnsetComment;

import ij.IJ;
import ij.WindowManager;
import ij.macro.Debugger;
import ij.macro.Interpreter;
import ij.macro.MacroRunner;
import ij.plugin.Macro_Runner;
import ij.text.TextWindow;

/**
 * 
 */
public class IJMacroEditor extends TextEditor implements IPropertyChangeListener, Debugger {

	private static final String TEMPLATE_PROPOSALS = "template_proposals_action";

	private ColorManager colorManager;

	private IPartListener partListener;

	private SetComment setComment;

	private UnsetComment unsetComment;

	private ScriptFormatterAction javaFormat;

	private ScriptFormatterSelectAction javaSelectFormat;

	private RSourceConverter rsourceConverter;

	private OpenPreferences preferences;

	private int debugStart, debugEnd;

	private static TextWindow debugWindow;

	public final static String EDITOR_MATCHING_BRACKETS = "matchingBrackets";

	public final static String EDITOR_MATCHING_BRACKETS_COLOR = "matchingBracketsColor";

	final private ScopedPreferenceStore storeWorkbench = new ScopedPreferenceStore(new InstanceScope(),
			"org.eclipse.ui.workbench");

	private InterpretImageJMacroAction interpretImageJMacroAction;

	private boolean step;

	private int runToLine;

	private String path;

	private boolean checkForCurlyQuotes;

	private boolean changes;

	private int previousLine;

	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		// PlatformUI.getWorkbench().getHelpSystem().setHelp(parent,
		// "com.eco.bio7.beanshell");
	}

	public IWorkbenchPage getPage() {
		IWorkbenchPage page = getSite().getPage();

		return page;
	}

	/**
	 * Creates a new BeanShell editor.
	 */
	public IJMacroEditor() {
		super();

		colorManager = new ColorManager();
		setSourceViewerConfiguration(new IJMacroConfiguration(colorManager, this));

	}

	@Override
	protected void handlePreferenceStoreChanged(PropertyChangeEvent event) {

		super.handlePreferenceStoreChanged(event);

	}

	public void invalidateText() {
		if (IJMacroEditor.this != null) {
			if (IJMacroEditor.this.getSourceViewer() != null) {
				IJMacroEditor.this.getSourceViewer().invalidateTextPresentation();
			}
		}
	}

	@Override
	public void propertyChange(PropertyChangeEvent event) {

		handlePreferenceStoreChanged(event);
	}

	// Method from:
	// https://github.com/gkorland/Eclipse-Fonts/blob/master/Fonts/src/main/java/fonts/FontsControler.java
	public synchronized void increase() {

		updateIncreasedFont(1);
	}

	public synchronized void decrease() {

		updateIncreasedFont(-1);
	}

	public void updateIncreasedFont(float fontSize) {

		IPreferenceStore store = IJMacroEditorPlugin.getDefault().getPreferenceStore();

		FontData f = PreferenceConverter.getFontData(store, "colourkeyfont");
		FontData f1 = PreferenceConverter.getFontData(store, "colourkeyfont1");
		FontData f2 = PreferenceConverter.getFontData(store, "colourkeyfont2");
		FontData f3 = PreferenceConverter.getFontData(store, "colourkeyfont3");
		FontData f4 = PreferenceConverter.getFontData(store, "colourkeyfont4");
		FontData f5 = PreferenceConverter.getFontData(store, "colourkeyfont5");
		FontData f6 = PreferenceConverter.getFontData(store, "colourkeyfont6");
		FontData f7 = PreferenceConverter.getFontData(store, "colourkeyfont7");
		// FontData f8 = PreferenceConverter.getFontData(store,
		// "colourkeyfont8");

		/* Restrict the size! */
		if (f.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f1.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f2.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f3.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f4.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f5.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f6.getHeight() + Math.round(fontSize) < 2) {
			return;
		} else if (f7.getHeight() + Math.round(fontSize) < 2) {
			return;
		} /*
			 * else if (f8.getHeight() + Math.round(fontSize) < 2) { return; }
			 */

		f.setHeight(f.getHeight() + Math.round(fontSize));
		f1.setHeight(f1.getHeight() + Math.round(fontSize));
		f2.setHeight(f2.getHeight() + Math.round(fontSize));
		f3.setHeight(f3.getHeight() + Math.round(fontSize));
		f4.setHeight(f4.getHeight() + Math.round(fontSize));
		f5.setHeight(f5.getHeight() + Math.round(fontSize));
		f6.setHeight(f6.getHeight() + Math.round(fontSize));
		f7.setHeight(f7.getHeight() + Math.round(fontSize));
		// f8.setHeight(f8.getHeight() + Math.round(fontSize));

		// Method from:
		// https://github.com/gkorland/Eclipse-Fonts/blob/master/Fonts/src/main/java/fonts/FontsControler.java
		String font = storeWorkbench.getString("com.eco.bio7.ijmacro.editor.textfont");
		String[] split = font.split("\\|");

		split[2] = Float.toString(f.getHeight());
		StringBuilder builder = new StringBuilder(split[0]);
		for (int i = 1; i < split.length; ++i) {
			builder.append('|').append(split[i]);
		}
		storeWorkbench.setValue("com.eco.bio7.ijmacro.editor.textfont", builder.toString());

		/* Invokes a property change! */
		PreferenceConverter.setValue(store, "colourkeyfont", f);
		PreferenceConverter.setValue(store, "colourkeyfont1", f1);
		PreferenceConverter.setValue(store, "colourkeyfont2", f2);
		PreferenceConverter.setValue(store, "colourkeyfont3", f3);
		PreferenceConverter.setValue(store, "colourkeyfont4", f4);
		PreferenceConverter.setValue(store, "colourkeyfont5", f5);
		PreferenceConverter.setValue(store, "colourkeyfont6", f6);
		PreferenceConverter.setValue(store, "colourkeyfont7", f7);

		invalidateText();

	}

	public void dispose() {
		colorManager.dispose();
		super.dispose();

	}

	protected void editorContextMenuAboutToShow(IMenuManager menu) {
		super.editorContextMenuAboutToShow(menu);
		addAction(menu, "ContentAssistProposal");
		menu.add(new Separator());
		addAction(menu, "Add Block Comment");
		addAction(menu, "Remove Block Comment");
		menu.add(new Separator());
		addAction(menu, "Format Source");
		addAction(menu, "Format Selected Source");
		menu.add(new Separator());
		addAction(menu, "Convert R Code");
		menu.add(new Separator());
		addAction(menu, "Editor Preferences");
	}

	protected void initializeKeyBindingScopes() {
		setKeyBindingScopes(new String[] { "com.eco.bio7.ijmacro.editor.scope" });
	}

	protected void createActions() {
		super.createActions();

		IAction action = new TextOperationAction(TemplateMessages.getResourceBundle(),
				"Editor." + TEMPLATE_PROPOSALS + ".", //$NON-NLS-1$ //$NON-NLS-2$
				this, ISourceViewer.CONTENTASSIST_PROPOSALS);
		action.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction(TEMPLATE_PROPOSALS, action);
		markAsStateDependentAction(TEMPLATE_PROPOSALS, true);

		// define the action
		IAction a = new TextOperationAction(ScriptEditorMessages.getResourceBundle(), "ContentAssistProposal.", this, //$NON-NLS-1$
				ISourceViewer.CONTENTASSIST_PROPOSALS);
		a.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction("ContentAssistProposal", a); //$NON-NLS-1$

		setComment = new com.eco.bio7.ijmacro.editor.actions.SetComment("Add Block Comment",
				PlatformUI.getWorkbench().getActiveWorkbenchWindow());
		setAction("Add Block Comment", setComment);

		unsetComment = new com.eco.bio7.ijmacro.editor.actions.UnsetComment("Remove Block Comment",
				PlatformUI.getWorkbench().getActiveWorkbenchWindow());
		setAction("Remove Block Comment", unsetComment);

		javaFormat = new com.eco.bio7.ijmacro.editor.actions.ScriptFormatterAction();
		setAction("Format Source", javaFormat);

		javaSelectFormat = new com.eco.bio7.ijmacro.editor.actions.ScriptFormatterSelectAction();
		setAction("Format Selected Source", javaSelectFormat);

		rsourceConverter = new com.eco.bio7.ijmacro.editor.actions.RSourceConverter();
		setAction("Convert R Code", rsourceConverter);

		preferences = new com.eco.bio7.ijmacro.editor.actions.OpenPreferences();
		setAction("Editor Preferences", preferences);

		interpretImageJMacroAction = new com.eco.bio7.ijmacro.editor.actions.InterpretImageJMacroAction("");
		setAction("Interpret Macro", interpretImageJMacroAction);

	}

	protected void configureSourceViewerDecorationSupport(SourceViewerDecorationSupport support) {
		super.configureSourceViewerDecorationSupport(support);

		char[] matchChars = { '{', '}', '(', ')', '[', ']' }; // which brackets
																// to match
		ICharacterPairMatcher matcher = new DefaultCharacterPairMatcher(matchChars,
				IDocumentExtension3.DEFAULT_PARTITIONING);
		support.setCharacterPairMatcher(matcher);
		support.setMatchingCharacterPainterPreferenceKeys(EDITOR_MATCHING_BRACKETS, EDITOR_MATCHING_BRACKETS_COLOR);

		// Enable bracket highlighting in the preference store
		IPreferenceStore store = getPreferenceStore();
		store.setDefault(EDITOR_MATCHING_BRACKETS, true);
		store.setDefault(EDITOR_MATCHING_BRACKETS_COLOR, "128,128,128");
	}

	public final void runMacro(boolean debug) {
		if (path != null)
			Macro_Runner.setFilePath(path);
		/*
		 * if (getTitle().endsWith(".js")) {evaluateJavaScript(); return;} else if
		 * (getTitle().endsWith(".bsh")) {evaluateScript(".bsh"); return;} else if
		 * (getTitle().endsWith(".py")) {evaluateScript(".py"); return;}
		 */
		int start = getSelectionStart();
		int end = getSelectionEnd();
		String text;
		if (start == end)
			text = getText();
		else
			text = getSelectedText(IJMacroEditor.this);
		Interpreter instance = Interpreter.getInstance();
		if (instance != null) { // abort any currently running macro
			instance.abortMacro();
			long t0 = System.currentTimeMillis();
			while (Interpreter.getInstance() != null && (System.currentTimeMillis() - t0) < 3000L)
				IJ.wait(10);
		}
		if (checkForCurlyQuotes && text.contains("\u201D")) {
			// replace curly quotes with standard quotes
			text = text.replaceAll("\u201C", "\"");
			text = text.replaceAll("\u201D", "\"");
			if (start == end)
				setText(text);
			else {
				String text2 = getText();
				text2 = text2.replaceAll("\u201C", "\"");
				text2 = text2.replaceAll("\u201D", "\"");
				setText(text2);
			}
			changes = true;
			checkForCurlyQuotes = false;
		}
		new com.eco.bio7.ijmacro.editors.MacroRunner(text, debug ? IJMacroEditor.this : null);
	}

	public int debug(Interpreter interp, int mode) {
		if (IJ.debugMode)
			IJ.log("debug: " + interp.getLineNumber() + "  " + mode + "  " + interp);
		if (mode == RUN_TO_COMPLETION)
			return 0;
		int n = interp.getLineNumber();
		if (mode == RUN_TO_CARET) {
			if (n == runToLine) {
				mode = STEP;
				interp.setDebugMode(mode);
			} else
				return 0;
		}
		/*
		 * if (!isVisible()) { // abort macro if user closes window interp.abortMacro();
		 * return 0; }
		 */
		if (n == previousLine) {
			previousLine = 0;
			return 0;
		}
		/*
		 * Window win = WindowManager.getActiveWindow(); if (win!=this) IJ.wait(50);
		 * toFront();
		 */
		previousLine = n;
		String text = getText();
		if (IJ.isWindows())
			text = text.replaceAll("\r\n", "\n");
		char[] chars = new char[text.length()];
		chars = text.toCharArray();
		int count = 1;
		debugStart = 0;
		int len = chars.length;
		debugEnd = len;
		for (int i = 0; i < len; i++) {
			if (chars[i] == '\n')
				count++;
			if (count == n && debugStart == 0)
				debugStart = i + 1;
			else if (count == n + 1) {
				debugEnd = i;
				break;
			}
		}
		// IJ.log("debug: "+debugStart+" "+debugEnd+" "+len+" "+count);
		if (debugStart == 1)
			debugStart = 0;
		if ((debugStart == 0 || debugStart == len) && debugEnd == len)
			return 0; // skip code added with Interpreter.setAdditionalFunctions()
		select(IJMacroEditor.this, debugStart, debugEnd);
		if (debugWindow != null && !debugWindow.isShowing()) {
			interp.setDebugger(null);
			debugWindow = null;
		} else
			debugWindow = interp.updateDebugWindow(interp.getVariables(), debugWindow);
		if (debugWindow != null) {
			interp.updateArrayInspector();
			// toFront();
		}
		if (mode == STEP) {
			step = false;
			// while (!step && !interp.done() && isVisible())
			while (!step && !interp.done())
				IJ.wait(5);
		} else {
			if (mode == FAST_TRACE)
				IJ.wait(5);
			else
				IJ.wait(150);
		}
		return 0;
	}

	public IDocument getDocument() {
		IDocument doc = IJMacroEditor.this.getSourceViewer().getDocument();
		return doc;
	}

	public String getText() {
		IDocument doc = IJMacroEditor.this.getSourceViewer().getDocument();
		return doc.get();
	}

	public void setText(String text) {
		IDocument doc = IJMacroEditor.this.getSourceViewer().getDocument();
		doc.set(text);
	}

	private int getCurrentLine(IEditorPart rEditor) {
		
		ITextEditor editor = (ITextEditor) rEditor;

		ISelectionProvider sp = editor.getSelectionProvider();

		ISelection selectionsel = sp.getSelection();

		ITextSelection selection = (ITextSelection) selectionsel;

		int b = selection.getStartLine();
		return b;
	}

	private String getSelectedText(IEditorPart rEditor) {
		ITextEditor editor = (ITextEditor) rEditor;

		ISelectionProvider sp = editor.getSelectionProvider();

		ISelection selectionsel = sp.getSelection();

		ITextSelection selection = (ITextSelection) selectionsel;

		return selection.getText();
	}

	private ITextSelection getTextSelection(IEditorPart rEditor) {
		ITextEditor editor = (ITextEditor) rEditor;

		ISelectionProvider sp = editor.getSelectionProvider();

		ISelection selectionsel = sp.getSelection();

		ITextSelection selection = (ITextSelection) selectionsel;

		return selection;
	}

	private int getSelectionStart() {
		int selectionOffset = getTextSelection(IJMacroEditor.this).getOffset();
		return selectionOffset;
	}

	private int getSelectionEnd() {
		int selectionOffset = getTextSelection(IJMacroEditor.this).getOffset();
		int length = getTextSelection(IJMacroEditor.this).getLength();
		return selectionOffset + length;
	}

	private void select(IEditorPart rEditor, int debugStart, int debugEnd) {
		ITextEditor editor = (ITextEditor) rEditor;

		getDisplay().syncExec(new Runnable() {

			public void run() {

				editor.selectAndReveal(debugStart, debugEnd - debugStart);

			}

		});

	}

	

	public final void setDebugMode(int mode) {
		step = true;
		Interpreter interp = Interpreter.getInstance();
		if (interp != null) {
			if (interp.getDebugger() == null)
				fixLineEndings();
			interp.setDebugger(this);
			interp.setDebugMode(mode);
		}
	}

	public final void enableDebugging() {
		step = true;
		ITextSelection textSelection = getTextSelection(IJMacroEditor.this);
		int length = textSelection.getLength();
		int start = textSelection.getOffset();// ta.getSelectionStart();
		int end = textSelection.getOffset() + length;
		if (start == debugStart && end == debugEnd)
			// ta.select(start, start);
			IJMacroEditor.this.selectAndReveal(start + 1 + length + 1, 0);
	}

	/**
	 * Changes Mac OS 9 (CR) and Windows (CRLF) line separators to line feeds (LF).
	 */
	public void fixLineEndings() {
		String text = getText();
		text = text.replaceAll("\r\n", "\n");
		text = text.replaceAll("\r", "\n");
		setText(text);
	}

	final void runToInsertionPoint() {
		Interpreter interp = Interpreter.getInstance();
		if (interp == null)
			IJ.beep();
		else {
			runToLine = getCurrentLine(IJMacroEditor.this);
			setDebugMode(RUN_TO_CARET);
		}
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

}
