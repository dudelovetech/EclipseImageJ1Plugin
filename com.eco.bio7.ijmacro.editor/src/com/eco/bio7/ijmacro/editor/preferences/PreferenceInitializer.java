package com.eco.bio7.ijmacro.editor.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;

import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;


public class PreferenceInitializer extends AbstractPreferenceInitializer {

	public PreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore storeBsh = IJMacroEditorPlugin.getDefault().getPreferenceStore();		
		FontData []f=JFaceResources.getFontRegistry().get("com.eco.bio7.ijmacro.editor.textfont").getFontData();
		
		PreferenceConverter.setDefault(storeBsh, "colourkey", new RGB(127, 0, 85));
		PreferenceConverter.setDefault(storeBsh, "colourkey1", new RGB(127, 0, 85));
		PreferenceConverter.setDefault(storeBsh, "colourkey2", new RGB(42, 0, 255));
		PreferenceConverter.setDefault(storeBsh, "colourkey3", new RGB(128, 128, 128));
		PreferenceConverter.setDefault(storeBsh, "colourkey4", new RGB(0, 0, 0));
		PreferenceConverter.setDefault(storeBsh, "colourkey5", new RGB(0, 0, 0));
		PreferenceConverter.setDefault(storeBsh, "colourkey6", new RGB(0, 0, 0));
		PreferenceConverter.setDefault(storeBsh, "colourkey7", new RGB(0, 0, 0));
		// PreferenceConverter.setDefault(storeBsh, "colourkey8", new RGB(50,
		// 150, 150));

		PreferenceConverter.setDefault(storeBsh, "colourkeyfont", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont1", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont2", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont3", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont4", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont5", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont6", f);
		PreferenceConverter.setDefault(storeBsh, "colourkeyfont7", f);

	}

}
