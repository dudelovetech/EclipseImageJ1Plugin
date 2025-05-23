package com.eco.bio7.image.preferences;

import java.io.File;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.eco.bio7.image.Activator;
import com.eco.bio7.image.Util;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		String path = Util.getImageJPath();// Get the installation directory of the ImageJ plugin!
		String pluginsPath = path + File.separator + "plugins";// Default plugins directory!
		String macrosPath = path + File.separator + "macros";// Default macros directory!
		store.setDefault("PLUGINS_PATH", pluginsPath);
		store.setDefault("MACROS_PATH", macrosPath);

		store.setDefault("JAVAFX_EMBEDDED", false);
		store.setDefault("ROI_MANAGER", false);
		store.setDefault("RESULTS_TABLE", false);
		store.setDefault("MACRO_RECORDER", false);
		/* Dialog Sizes for ImageJ dialogs! */
		store.setDefault("IMAGE_METHODS_SIZE_X", 360);// 260
		store.setDefault("IMAGE_METHODS_SIZE_Y", 1000);// 790
		store.setDefault("IMAGEJ_TOOLBAR_SIZE_X", 750);// 580
		store.setDefault("IMAGEJ_TOOLBAR_SIZE_Y", 150);// 130
		store.setDefault("MAC_MENU_ENABLED", false);

		if (Util.getOS().equals("Windows")) {
			store.setDefault("FONT_SIZE_CORRECTION", 0);
			store.setDefault("FONT_ANTIALIASED", false);
		} else if (Util.getOS().equals("Linux")) {
			store.setDefault("FONT_SIZE_CORRECTION", 2);
			store.setDefault("FONT_ANTIALIASED", true);
		} else if (Util.getOS().equals("Mac")) {
			/*Correct Swing fonts on Retina displays!*/
			if (Util.isMacRetinaDisplay()) {
				store.setDefault("FONT_SIZE_CORRECTION", -10);
			} else {
				store.setDefault("FONT_SIZE_CORRECTION", 0);
			}
			store.setDefault("FONT_ANTIALIASED", false);
		}

	}

}
