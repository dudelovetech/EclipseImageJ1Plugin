# EclipseImageJ1Plugin
A repository for an Eclipse ImageJ1 plugin contributed from the Bio7 project.

### New in 1.51f:

1. Updated ImageJ to 1.51f.

2. Reworked the ImageJ plugin view menus. Now all Imagej menus and nested submenus are displayed correctly!

3. Added a menu switch (menu 'Window') to open images in a Swing in JavaFX in SWT tab (future replacement for SWT_AWT). Images can subsequently be opened in fullscreen with: F1 = primary monitor true fullscreen, F2 = primary monitor fullscreen, F3 = secondary monitor fullscreen, F4 = tertiary monitor fullscreen, F5 = quartary monitor fullscreen.

4. Plugins, scripts and macros are now displayed in their defined menus or submenus.

5. All ImageJ Menus are updated dynamically to recognize copied scripts and macros instantly.

6. Added two preferences to define the install location of plugins and macros.

7. Improved plugin compatibility by going back to AWT in some dialogs.

### Installation:

**Important for MacOSX : Please add the option -Dprism.order=sw in the Eclipse.ini to avoid a crash when using JavaFX!**

Add the following URL as update site: 

**https://sourceforge.net/projects/bio7/files/imagej/**

The important views to open are the ImageJ-Canvas which essentially implements the ImageJ interface and the toolbar. You find them in Eclipse under: Window->Show View->Other. First open the ImageJ-Canvas!

**Window->Show View->Other->ImageJ->ImageJ-Canvas (ImageJ panel and menu)**

**Window->Show View->Other->ImageJ->ImageJ-Toolbar (ImageJ toolbar)**

There is also a self-created thumbnails browser (not speed optimized) for ImageJ default formats included (“Thumbnails”):

***Window->Show View->Other->ImageJ Extra->Thumbnails***

Ignore the 'Image' view in the same section which is used to show a detached image (opened with a mouse right-click on a image tab).

Preferences can be found under "Preferences ImageJ".

Plugins can be installed in the ImageJ plugins folder (see the plugin folder inside of the Eclipse ImageJ plugin). They will be added to the plugin menu automatically.

Some plugins will not work by default because of the different interfaces (Swing vs. AWT) but can be adapted more or less easily.

A right-click on an image tab will open the displayed image in an extra view for, e.g., side by side views (x,y,z views). They must be closed separately. 

Fullscreen in default SWT_AWT mode is supported for the primary monitor (Press F2 to open and Esc to abort).

Drag and drop of images and plugins should work, too (Drag them on the view or the ImageJ toolbar to open or install!)
