/*******************************************************************************
 * Copyright (c) 2007-2014 M. Austenfeld
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     M. Austenfeld
 *******************************************************************************/

package com.eco.bio7.ImageJPluginActions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MenuListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public class ImageJHelp extends Action implements IMenuCreator {

	private Menu fMenu;

	MenuItem[] plugins_;

	protected Point p;

	public ImageJHelp() {
		setId("ImageJ Help");
		setToolTipText("ImageJ Help");
		setText("Help");

		setMenuCreator(this);
	}

	public Menu getMenu(Control parent) {
		if (fMenu != null) {
			fMenu.dispose();
		}
		fMenu = new Menu(parent);

		fMenu.addMenuListener(new MenuListener() {
			public void menuHidden(MenuEvent e) {

			}

			@Override
			public void menuShown(MenuEvent e) {

				MenuItem[] menuItems = fMenu.getItems();
				// Only delete the plugins menu items and menus!
				for (int i = 0; i < menuItems.length; i++) {
					if (menuItems[i] != null) {
						menuItems[i].dispose();
					}
				}
				new ImageJSubmenu().addSubMenus(fMenu,"Help");

			}
		});

		return fMenu;
	}

	public void dispose() {

	}

	public Menu getMenu(Menu parent) {

		return null;
	}

}