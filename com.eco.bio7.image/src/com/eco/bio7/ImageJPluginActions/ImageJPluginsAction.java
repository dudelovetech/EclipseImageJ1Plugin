/*******************************************************************************
 * Copyright (c) 2005-2016 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.ImageJPluginActions;

import java.awt.MenuBar;
import java.util.Hashtable;
import java.util.Stack;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import ij.IJ;
import ij.Menus;

public class ImageJPluginsAction extends Action implements IMenuCreator {

	private static Menu pluginsMenu;

	/*
	 * Stores all created menus! If menu is not on the list it will be created!
	 */

	private static Hashtable<String, Menu> pluginsMenuTable = new Hashtable<String, Menu>();

	MenuItem[] plugins_;

	protected String currentMenu;

	protected String s;

	protected String na;

	protected String sTemp;

	public ImageJPluginsAction() {
		setId("Plugins");
		setToolTipText("ImageJ");
		setText("Plugins");

		setMenuCreator(this);

	}


	public Menu getMenu(Control parent) {
		if (pluginsMenu != null) {
			pluginsMenu.dispose();
		}
		pluginsMenu = new Menu(parent);
		// Add main Menu to stack!

		pluginsMenu.addMenuListener(new MenuListener() {
			public void menuHidden(MenuEvent e) {

			}

			@Override
			public void menuShown(MenuEvent e) {

				MenuItem[] menuItems = pluginsMenu.getItems();
				// Only delete the plugins menu items and menus!
				for (int i = 0; i < menuItems.length; i++) {
					if (menuItems[i] != null) {
						menuItems[i].dispose();
					}
				}
				new ImageJSubmenu().addSubMenus(pluginsMenu,"Plugins");
				/* Add plugins from *.class files! */
				// classPlugins();
				/* Add plugins from *.jar files! */
				// addJarPlugins();

			}
		});

		return pluginsMenu;
	}

	public void dispose() {

	}

	public Menu getMenu(Menu parent) {

		return null;
	}

	/*
	 * private void classPlugins() { Add the *.class files to the menu! for (int
	 * i = 0; i < plugins.length; i++) {
	 * 
	 * int slashIndex = plugins[i].indexOf('/'); String menuName = slashIndex <
	 * 0 ? "Plugins" : "Plugins>" + plugins[i].substring(0,
	 * slashIndex).replace('/', '>');
	 * 
	 * String command = plugins[i]; if (slashIndex > 0) { command =
	 * plugins[i].substring(slashIndex + 1); } command = command.replace('_', '
	 * '); command.trim();
	 * 
	 * final String co = command;
	 * 
	 * plugins_[i] = new MenuItem(pluginsMenu, SWT.PUSH);
	 * 
	 * plugins_[i].setText(co);
	 * 
	 * plugins_[i].addSelectionListener(new SelectionListener() {
	 * 
	 * public void widgetSelected(SelectionEvent e) {
	 * SwingUtilities.invokeLater(new Runnable() {
	 * 
	 * public void run() {
	 * 
	 * IJ.doCommand(co); } }); }
	 * 
	 * public void widgetDefaultSelected(SelectionEvent e) {
	 * 
	 * } });
	 * 
	 * } }
	 * 
	 * private void addJarPlugins() { Add the *.jars to the menu
	 * 
	 * for (int j = 0; j < Menus.bio7JarAllCommand.size(); j++) { final int
	 * count = j; s = Menus.bio7JarAllCommand.get(j); // System.out.println(s);
	 * currentMenu = null; if (s.startsWith("Plugins>")) { int firstComma =
	 * s.indexOf(','); if (firstComma == -1 || firstComma <= 8) {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(8, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } }
	 * 
	 * else if (s.startsWith("File>")) {
	 * 
	 * int firstComma = s.indexOf(','); if (firstComma == -1 || firstComma <= 5)
	 * {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(5, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } } else if
	 * (s.startsWith("Edit>")) {
	 * 
	 * int firstComma = s.indexOf(','); if (firstComma == -1 || firstComma <= 5)
	 * {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(5, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } } else if
	 * (s.startsWith("Image>")) {
	 * 
	 * int firstComma = s.indexOf(','); if (firstComma == -1 || firstComma <= 6)
	 * {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(6, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } } else if
	 * (s.startsWith("Process>")) {// if with submenu e.g.
	 * 
	 * int firstComma = s.indexOf(','); if (firstComma == -1 || firstComma <= 8)
	 * {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(8, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } }
	 * 
	 * else if (s.startsWith("Analyze>")) {
	 * 
	 * int firstComma = s.indexOf(','); if (firstComma == -1 || firstComma <= 8)
	 * {
	 * 
	 * }
	 * 
	 * else { String name = s.substring(8, firstComma);
	 * 
	 * createSubmenuEntry(name); currentMenu = name; } } else if
	 * (s.startsWith("\"") || s.startsWith("Plugins")) {
	 * 
	 * currentMenu = null; }
	 * 
	 * else { int firstQuote = s.indexOf('"'); String name = firstQuote < 0 ? s
	 * : s.substring(0, firstQuote).trim(); currentMenu = name; int comma =
	 * name.indexOf(','); if (comma >= 0) name = name.substring(0, comma);
	 * currentMenu = name;
	 * 
	 * if (name.startsWith("Help>")) {
	 * 
	 * name = "Help>About Plugins";
	 * 
	 * if (pluginsMenuTable.containsKey(name) == false) { Menu newMenu = new
	 * Menu(pluginsMenu);
	 * 
	 * MenuItem it = new MenuItem(pluginsMenu, SWT.CASCADE);
	 * it.setMenu(newMenu); it.setText(name); pluginsMenuTable.put(name,
	 * newMenu); currentMenu = name;
	 * 
	 * pluginsMenuTable.put("Help>About Plugins", newMenu); }
	 * 
	 * } else { currentMenu = name;
	 * 
	 * }
	 * 
	 * } int firstQuote = s.indexOf('"'); if (firstQuote == -1) return; s =
	 * s.substring(firstQuote, s.length()); // remove menu
	 * 
	 * String menuEntry = s;
	 * 
	 * if (s.startsWith("\"")) {
	 * 
	 * int quote = s.indexOf('"', 1); menuEntry = quote < 0 ? s.substring(1) :
	 * s.substring(1, quote); final String ent = menuEntry; if (currentMenu !=
	 * null) {
	 * 
	 * 
	 * Get the specified submenu from the hashtable and add menu items!
	 * 
	 * Menu men = (Menu) pluginsMenuTable.get(currentMenu); if (men != null) {
	 * 
	 * MenuItem it = new MenuItem(men, SWT.CASCADE); it.setText(menuEntry);
	 * it.addSelectionListener(new SelectionListener() {
	 * 
	 * public void widgetSelected(SelectionEvent e) {
	 * 
	 * IJ.doCommand(ent); }
	 * 
	 * public void widgetDefaultSelected(SelectionEvent e) {
	 * 
	 * } }); }
	 * 
	 * } else {
	 * 
	 * The plugins general menu! MenuItem it = new MenuItem(pluginsMenu,
	 * SWT.PUSH); it.setText(menuEntry);
	 * 
	 * it.addSelectionListener(new SelectionListener() {
	 * 
	 * public void widgetSelected(SelectionEvent e) {
	 * 
	 * IJ.doCommand(ent);
	 * 
	 * }
	 * 
	 * public void widgetDefaultSelected(SelectionEvent e) {
	 * 
	 * } });
	 * 
	 * }
	 * 
	 * } else { int comma = s.indexOf(','); if (comma > 0) menuEntry =
	 * s.substring(0, comma);
	 * 
	 * } } }
	 * 
	 * private void createSubmenuEntry(String name) { if
	 * (pluginsMenuTable.containsKey(name) == false) { Menu newMenu = new
	 * Menu(pluginsMenu);
	 * 
	 * MenuItem it = new MenuItem(pluginsMenu, SWT.CASCADE);
	 * it.setMenu(newMenu); it.setText(name); currentMenu = name;
	 * pluginsMenuTable.put(name, newMenu); } }
	 */

}