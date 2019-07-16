package com.eco.bio7.image;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;

import org.eclipse.swt.widgets.Shell;

public class Bio7LinuxTheme extends OceanTheme {
	// public String getName() { return "Moody Blues"; }

	// blue shades
	private final ColorUIResource primary1 = new ColorUIResource(new Color(100, 100, 100));
	private final ColorUIResource primary2;
	private final ColorUIResource primary3;

	private final ColorUIResource secondary1 = new ColorUIResource(new Color(100, 100, 100));
	private final ColorUIResource secondary2;
	public final ColorUIResource secondary3;

	// the functions overridden from the base
	// class => DefaultMetalTheme

	protected ColorUIResource getPrimary1() {
		return primary1;
	}

	protected ColorUIResource getPrimary2() {
		return primary2;
	}

	protected ColorUIResource getPrimary3() {
		return primary3;
	}

	protected ColorUIResource getSecondary1() {
		return secondary1;
	}

	protected ColorUIResource getSecondary2() {
		return secondary2;
	}

	protected ColorUIResource getSecondary3() {
		return secondary3;
	}

	Color col = null;
	private Color colForegr;

	public Bio7LinuxTheme() {

		Shell s = new Shell();

		org.eclipse.swt.graphics.Color colswt = s.getBackground();
		int r = colswt.getRed();
		int g = colswt.getGreen();
		int b = colswt.getBlue();
		col = new Color(r, g, b);
		org.eclipse.swt.graphics.Color colSwtForegr = s.getForeground();
		int rf = colSwtForegr.getRed();
		int gf = colSwtForegr.getGreen();
		int bf = colSwtForegr.getBlue();
		colForegr = new Color(rf, gf, bf);
		primary3 = new ColorUIResource(col);
		primary2 = new ColorUIResource(col);
		secondary2 = new ColorUIResource(col);
		secondary3 = new ColorUIResource(col);

	}

	public void addCustomEntriesToTable(UIDefaults defaults) {
		defaults.put("Button.gradient", Arrays.asList(new Object[] { new Double(0.3), new Double(0.0), new ColorUIResource(col), new ColorUIResource(col), new ColorUIResource(col) }));

		List<String> colorKeys = new ArrayList<String>();
		Set<Entry<Object, Object>> entries = UIManager.getLookAndFeelDefaults().entrySet();
		for (Entry entry : entries) {
			if (entry.getValue() instanceof Color) {
				String key = ((String) entry.getKey());
				if (key.endsWith("background") || key.endsWith("Background")) {
					defaults.put(key, Arrays.asList(new Object[] { new Double(0.3), new Double(0.0), new ColorUIResource(col), new ColorUIResource(col), new ColorUIResource(col) }));
				}

				else if (key.endsWith("foreground") || key.endsWith("Foreground") || key.endsWith("gridColor")) {
					defaults.put(key, Arrays.asList(new Object[] { new Double(0.3), new Double(0.0), new ColorUIResource(colForegr), new ColorUIResource(colForegr), new ColorUIResource(colForegr) }));
				}
			}
		}

		/*defaults.put("CheckBox.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.0), new ColorUIResource(col),
				new ColorUIResource(Color.WHITE), new ColorUIResource(col) }));
		defaults.put("CheckBoxMenuItem.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.0),
				new ColorUIResource(221, 232, 243),
				new ColorUIResource(Color.WHITE),
				new ColorUIResource(184, 207, 229) }));
		defaults.put("MenuBar.gradient", Arrays.asList(new Object[] {
				new Double(1.0), new Double(0.0), new ColorUIResource(col),
				new ColorUIResource(218, 218, 218),
				new ColorUIResource(218, 218, 218) }));
		defaults.put("RadioButton.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.0), new ColorUIResource(col),
				new ColorUIResource(col), new ColorUIResource(col) }));
		defaults.put("RadioButtonMenuItem.gradient", Arrays
				.asList(new Object[] { new Double(0.3), new Double(0.0),
						new ColorUIResource(221, 232, 243),
						new ColorUIResource(col),
						new ColorUIResource(184, 207, 229) }));
		defaults.put("ScrollBar.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.0), new ColorUIResource(col),
				new ColorUIResource(Color.WHITE), new ColorUIResource(col) }));
		defaults.put("Slider.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.2), new ColorUIResource(col),
				new ColorUIResource(col), new ColorUIResource(col) }));
		defaults.put("ToggleButton.gradient", Arrays.asList(new Object[] {
				new Double(0.3), new Double(0.0),
				new ColorUIResource(221, 232, 243), new ColorUIResource(col),
				new ColorUIResource(184, 207, 229) }));
		defaults.put("InternalFrame.activeTitleGradient", Arrays
				.asList(new Object[] { new Double(0.3), new Double(0.0),
						new ColorUIResource(221, 232, 243),
						new ColorUIResource(col),
						new ColorUIResource(184, 207, 229) }));
		
		defaults.put("Button.rollover", Boolean.TRUE);
		
		defaults.put("TabbedPane.selected", new ColorUIResource(200, 221, 242));
		defaults.put("TabbedPane.unselectedBackground", secondary3);*/
	}
}