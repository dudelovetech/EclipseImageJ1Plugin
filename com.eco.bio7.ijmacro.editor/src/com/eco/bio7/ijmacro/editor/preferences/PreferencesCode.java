package com.eco.bio7.ijmacro.editor.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;

public class PreferencesCode extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	private IPreferenceStore store;
	private StringFieldEditor mult_1;

	public PreferencesCode() {
		super(GRID);
		store = IJMacroEditorPlugin.getDefault().getPreferenceStore();
		setPreferenceStore(IJMacroEditorPlugin.getDefault().getPreferenceStore());
		setDescription("ImageJ Macro Editor");
	}

	public void createFieldEditors() {
		addField(new LabelFieldEditor("Code context:", getFieldEditorParent()));
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(
				new BooleanFieldEditor("SHOW_INFOPOPUP", "Show Info Popup (Restart to apply)", getFieldEditorParent()));

		addField(new LabelFieldEditor("Code completion/templates:", getFieldEditorParent()));
		addField(new BooleanFieldEditor("TYPED_CODE_COMPLETION", "Open code completion/templates when typing",
				getFieldEditorParent()));
		addField(new StringFieldEditor("ACTIVATION_CHARS", "Activation chars", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent()));
		addField(new BooleanFieldEditor("MARK_WORDS", "Mark selected words", getFieldEditorParent()));
		addField(new LabelFieldEditor("Automatic close:", getFieldEditorParent()));
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_BRACES", "{Braces}", getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_PARENTHESES", "(Parentheses)", getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_BRACKETS", "[Brackets]", getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_DOUBLE_QUOTE", "\"Strings\"", getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_SINGLEQUOTE", "'Strings'", getFieldEditorParent()));
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		addField(new LabelFieldEditor("Automatic indent:", getFieldEditorParent()));
		addField(new BooleanFieldEditor("IJMACRO_EDITOR_EDIT_INDENT", "Automatically indent", getFieldEditorParent()));
		addField(new BooleanFieldEditor("CLOSE_BRACES_LINEBREAK", "{Braces - with linebreak}", getFieldEditorParent()));
		addField(new SpacerFieldEditor(getFieldEditorParent()));
		mult_1 = new StringFieldEditor("IJMACRO_EDITOR_FORMAT_OPTIONS", "ImageJ Macro Editor Formatter Options", -1,
				StringFieldEditor.VALIDATE_ON_KEY_STROKE, getFieldEditorParent());
		mult_1.setLabelText("ImageJ Macro Editor Formatter Options");
		addField(mult_1);
	}

	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
