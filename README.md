# EclipseImageJ1Plugin
A repository for an Eclipse ImageJ1 plugin contributed from the Bio7 project.

### New in 1.51p (new macro editor available!):

In this relase a macro editor and ImageJ perspective have been added to the ImageJ plugin. The editor has the following features:

1. Dynamic error detection (grammar derived from the ECMA grammar by Bart Kiers)
2. Toolbar action to execute ImageJ macros
3. Syntax highlightening
4. Debugging support (reusing and implementing interfaces and methods from @Wayne - same keyboard shortcuts - see animation below)
5. Code completion (with browser help)
6. Code templates (add you own templates)
7. Info popups (text hoover)
8. Outline view (var variables, variables, methods and macros)
9. Automatic closing of braces, parentheses and strings
Automatic indention of functions,loops, etc.
10. Code folding
11. Code formatting (based on the Eclipse-javascript-formatter by Sebastian Moran)
12. Resize fonts functions (with Ctrl++ or CMD++, CTRL+- or CMD +-)
13. Font preferences
14. Mark occurences (scope independant)
15. A copy function for this forum


### New in 1.51n:

1. Updated ImageJ to 1.51k.
2. Added a fake editor to register and open standard image files from the Navigator or Project Explorer, etc.
3. Fixed several bugs to convert image types

Please note that the update site has changed (due to a cert. problem with on sourceforge) to:

https://bio7.github.io/imagej/

Uninstall the old plugins before you install from the new location!

### New in 1.51k:

1. Updated ImageJ to 1.51k.

2. Reworked the ImageJ plugin view menus. Now all Imagej menus and nested submenus are displayed correctly!

3. Added a menu switch (menu 'Window') to open images in a Swing in JavaFX in SWT tab (future replacement for SWT_AWT). Images can subsequently be opened in fullscreen with: F1 = primary monitor true fullscreen, F2 = primary monitor fullscreen, F3 = secondary monitor fullscreen, F4 = tertiary monitor fullscreen, F5 = quartary monitor fullscreen.

4. Plugins, scripts and macros are now displayed in their defined menus or submenus.

5. All ImageJ Menus are updated dynamically to recognize copied scripts and macros instantly.

6. Added two preferences to define the install location of plugins and macros.

7. Improved plugin compatibility by going back to AWT in some dialogs.

### Installation:

**Important for MacOSX : Please add the option -Dprism.order=sw in the Eclipse.ini to avoid a crash when using JavaFX!**

**Important for Linux : Please add the option --launcher.GTK_version 2 (don't forget the linebreak before the version number) in the Eclipse.ini to avoid a crash when using JavaFX (JavaFX doesn't run with GTK3 on Linux)!**

Add the following URL as update site: 

**https://bio7.github.io/imagej/**

The important views to open are the ImageJ-Canvas which essentially implements the ImageJ interface and the toolbar. You find them in Eclipse under: Window->Show View->Other. First open the ImageJ-Canvas!

**Window->Show View->Other->ImageJ->ImageJ-Canvas (ImageJ panel and menu)**

**Window->Show View->Other->ImageJ->ImageJ-Toolbar (ImageJ toolbar)**

The ImageJ toolbar can also be opened in the ImageJ-Canvas (ImageJ 'Window' menu).

There is also a self-created thumbnails browser (not speed optimized) for ImageJ default formats included (Thumbnails):

***Window->Show View->Other->ImageJ Extra->Thumbnails***

Ignore the 'Image' view in the same section which is used to show a detached image (opened with a mouse right-click on a image tab).

Preferences can be found under "Preferences ImageJ".

Plugins can be installed in the ImageJ plugins folder (see the plugin folder inside of the Eclipse ImageJ plugin). They will be added to the plugin menu automatically.

A right-click on an image tab will open the displayed image in an extra view for, e.g., side by side views (x,y,z views). They must be closed separately. 

Fullscreen in default SWT_AWT mode is supported for the primary monitor (Press F2 to open and Esc to abort).

Drag and drop of images and plugins should work, too (Drag them on the view or the ImageJ toolbar to open or install!)

### First start: 

Open the ImageJ perspective (***Window->Perspective->Open perspective->Other->ImageJ Edit*** - or use the toolbar action).

To create an ImageJ macro first create a general eclipse project (***File->New->Project->General Project*** - Other Project types are allowed, too!) and then create an ImageJ macro in the project folder (***New->Other->ImageJ->ImageJ Macro File***).

The ImageJ toolbar can be opened in the ImageJ-Canvas view menu (***Window->ImageJ-Toolbar***)

Images can be dropped in a folder of Eclipse and can be opened from within Eclipse (special image icon available when image extension is detected) in the Eclipse ImageJ view. Unknown image formats (default extensions are used only) can be opened with (***Open with->Other->ImageJ Image Editor***) or simply by a drag and
drop action.

