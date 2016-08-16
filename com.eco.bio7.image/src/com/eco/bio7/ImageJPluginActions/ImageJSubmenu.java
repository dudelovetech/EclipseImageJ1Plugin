package com.eco.bio7.ImageJPluginActions;

import java.awt.CheckboxMenuItem;
import java.awt.MenuBar;
import java.util.Stack;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import ij.IJ;
import ij.ImagePlus;
import ij.ImageStack;
import ij.Menus;
import ij.WindowManager;

/**
 * @author M. Austenfeld A class to store and access the ImageJ SWT menus.
 */
public class ImageJSubmenu {

	private Stack<Menu> mainMenuStack = new Stack<Menu>();// Just for variable
	private MenuItem menuBit;

	public void addSubMenus(Menu mainMenu, String label) {
		mainMenuStack.push(mainMenu);
		MenuBar menuBar = Menus.getMenuBar();
		for (int i = 0; i < menuBar.getMenuCount(); i++) {
			java.awt.Menu menu = menuBar.getMenu(i);

			if (menu.getLabel().equals(label))

				recurseSubMenu(menu, mainMenu);
		}
	}

	private void recurseSubMenu(java.awt.Menu menu, Menu mainMenu) {
		int items = menu.getItemCount();
		if (items == 0)
			return;
		for (int i = 0; i < items; i++) {
			java.awt.MenuItem mItem = menu.getItem(i);
			String label = mItem.getActionCommand();

			if (mItem instanceof java.awt.Menu) {
				Menu menuSub = new Menu(mainMenu);
				MenuItem menuItem_stacks = new MenuItem(mainMenu, SWT.CASCADE);
				menuItem_stacks.setMenu(menuSub);
				menuItem_stacks.setText(mItem.getLabel());

				/* Push Menu on the stack! */
				mainMenuStack.push(menuSub);

				recurseSubMenu((java.awt.Menu) mItem, menuSub);

				mainMenuStack.pop();

			} else if (mItem instanceof java.awt.MenuItem) {

				Menu currentSubMenu = mainMenuStack.peek();

				if (mItem instanceof CheckboxMenuItem) {
					

					MenuItem it = new MenuItem(currentSubMenu, SWT.CHECK);

					String lab = mItem.getLabel();
					it.setSelection(false);

					it.setText(lab);
					it.addSelectionListener(new SelectionListener() {

						public void widgetSelected(SelectionEvent e) {
							String cmd = mItem.getActionCommand();
							IJ.doCommand(cmd);

						}

						public void widgetDefaultSelected(SelectionEvent e) {

						}
					});

					ImagePlus imp = WindowManager.getCurrentImage();
					if (imp != null) {

						if (IJ.getImage().getType() == 0 && label.equals("8-bit")) {

							it.setSelection(true);
							 menuBit=it;
							
						} else if (IJ.getImage().getType() == 1 && label.equals("16-bit")) {
							it.setSelection(true);
							 menuBit=it;
						} else if (IJ.getImage().getType() == 2 && label.equals("32-bit")) {
							it.setSelection(true);
                            menuBit=it;
						} else if (IJ.getImage().getType() == 3 && label.equals("8-bit Color")) {
							it.setSelection(true);
							 menuBit=it;
						}

						else if (IJ.getImage().getType() == 4 && label.equals("RGB Color")) {
							it.setSelection(true);
							menuBit=it;
						} else if (imp.getStack().isRGB() && label.equals("RGB Stack")) {
							it.setSelection(true);
							menuBit.setSelection(false);
						} else if (imp.getStack().isHSB() && label.equals("HSB Stack")) {
							it.setSelection(true);
							menuBit.setSelection(false);
						} else if (imp.getStack().isLab() && label.equals("Lab Stack")) {
							it.setSelection(true);
							menuBit.setSelection(false);
						}

						else {
							it.setSelection(false);
						}
					}

				}

				else {

					if (label.equals("-")) {
						new MenuItem(currentSubMenu, SWT.SEPARATOR);
					} else if (!(label.equals("-"))) {
						MenuItem it = new MenuItem(currentSubMenu, SWT.NONE);
						String lab = mItem.getLabel();

						it.setText(lab);

						it.addSelectionListener(new SelectionListener() {

							public void widgetSelected(SelectionEvent e) {
								String cmd = mItem.getActionCommand();
								IJ.doCommand(cmd);

							}

							public void widgetDefaultSelected(SelectionEvent e) {

							}
						});

					}

				}

			}

		}

	}

}
