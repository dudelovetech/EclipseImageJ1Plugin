# EclipseImageJ1Plugin
A repository for an Eclipse ImageJ1 plugin contributed from the Bio7 project.

Add the following URL as update site: 

https://raw.githubusercontent.com/Bio7/EclipseImageJ1Plugin/master/ImageJPluginUpdateSite

The important views to open are the ImageJ-Canvas which essentially implements the ImageJ interface and the toolbar:

**Window->Show View->Other->ImageJ-Canvas (ImageJ panel and menu)**

**Window->Show View->Other->ImageJ-Toolbar (ImageJ toolbar)**

There is also a self-created thumbnails browser (not speed optimized) for ImageJ default formats included (“Thumbnails”):

***Window->Show View->Other->Thumbnails***

Plugins can be installed in the ImageJ plugins folder (see the plugin folder inside of the Eclipse ImageJ plugin). They will be added to the plugin menu automatically.

Some plugins will not work by default because of the different interfaces (Swing vs. AWT) but can be adapted more or less easily.

A right-click on an image tab will open the displayed image in an extra view for, e.g., side by side views (x,y,z views). They must be closed separately. 

Fullscreen is supported for the primary monitor (Press F2 to open and Esc to abort).

Drag and drop of images and plugins should work, too (Drag them on the view or the ImageJ toolbar to open or install!)
