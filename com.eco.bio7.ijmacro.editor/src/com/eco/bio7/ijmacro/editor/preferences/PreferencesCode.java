package com.eco.bio7.ijmacro.editor.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;
import org.eclipse.jface.preference.BooleanFieldEditor;

public class PreferencesCode extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
		private IPreferenceStore store;

		public PreferencesCode() {
			super(GRID);
			store = IJMacroEditorPlugin.getDefault().getPreferenceStore();
			setPreferenceStore(IJMacroEditorPlugin.getDefault().getPreferenceStore());
			setDescription("ImageJ Macro Editor");
		}

		public void createFieldEditors() {
			
			addField(new BooleanFieldEditor("id", "New BooleanFieldEditor", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
			addField(new BooleanFieldEditor("id", "New BooleanFieldEditor", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
			addField(new BooleanFieldEditor("id", "New BooleanFieldEditor", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
			addField(new BooleanFieldEditor("id", "New BooleanFieldEditor", BooleanFieldEditor.DEFAULT, getFieldEditorParent()));
		 }


	/**
	 * Initialize the preference page.
	 */
	public void init(IWorkbench workbench) {
		// Initialize the preference page
	}

}
