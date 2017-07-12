package com.eco.bio7.ijmacro.editor.preferences.template;

public class IJMacroFunctions {
	public static String functions=""+
			"abs(n)####Returns the absolute value of n.\r\n" + 
			"acos(n)####Returns the inverse cosine (in radians) of n.\r\n" + 
			"asin(n)####Returns the inverse sine (in radians) of n.\r\n" + 
			"atan(n)####Calculates the inverse tangent (arctangent) of n. Returns a value in the range -PI/2 through PI/2.\r\n" + 
			"atan2(y, x)####Calculates the inverse tangent of y/x and returns an angle in the range -PI to PI, using the signs of the arguments to determine the quadrant. Multiply the result by 180/PI to convert to degrees.\r\n" + 
			"autoUpdate(boolean)####If boolean is true, the display is refreshed each time lineTo(), drawLine(), drawString(), etc. are called, otherwise, the display is refreshed only when updateDisplay() is called or when the macro terminates.\r\n" + 
			"beep()####Emits an audible beep.\r\n" + 
			"bitDepth()####Returns the bit depth of the active image: 8, 16, 24 (RGB) or 32 (float).\r\n" + 
			"calibrate(value)####Uses the calibration function of the active image to convert a raw pixel value to a density calibrated value. The argument must be an integer in the range 0-255 (for 8-bit images) or 0-65535 (for 16-bit images). Returns the same value if the active image does not have a calibration function.\r\n" + 
			"call(\"class.method\", arg1, arg2, ...)####Calls a public static method in a Java class, passing an arbitrary number of string arguments, and returning a string. Refer to the CallJavaDemo macro and the ImpProps plugin for examples. Note that the call() function does not work when ImageJ is running as an unsigned applet.\r\n" + 
			"changeValues(v1, v2, v3)####Changes pixels in the image or selection that have a value in the range v1-v2 to v3. For example, changeValues(0,5,5) changes all pixels less than 5 to 5, and changeValues(0x0000ff,0x0000ff,0xff0000) changes all blue pixels in an RGB image to red.\r\n" + 
			"charCodeAt(string, index)####Returns the Unicode value of the character at the specified index in string. Index values can range from 0 to lengthOf(string). Use the fromCharCode() function to convert one or more Unicode characters to a string.\r\n" + 
			"close()####Closes the active image. This function has the advantage of not closing the \"Log\" or \"Results\" window when you meant to close the active image.\r\n" + 
			"cos(angle)####Returns the cosine of an angle (in radians).####\r\n" + 
			"d2s(n, decimalPlaces)####Converts the number n into a string using the specified number of decimal places. Note that d2s stands for \"double to string\". This function will probably be replaced by one with a better name.\r\n" + 
			"Dialog.create(\"Title\")####Creates a dialog box with the specified title. Call Dialog.addString(), Dialog.addNumber(), etc. to add components to the dialog. Call Dialog.show() to display the dialog and Dialog.getString(), Dialog.getNumber(), etc. to retrieve the values entered by the user. Refer to the DialogDemo macro for an example.\r\n" + 
			"Dialog.addMessage(string)####Adds a message to the dialog. The message can be broken into multiple lines by inserting new line characters (\"\\n\") into the string.\r\n" + 
			"Dialog.addString(\"Label\", \"Initial text\")####Adds a text field to the dialog, using the specified label and initial text.\r\n" + 
			"Dialog.addString(\"Label\", \"Initial text\", columns)####Adds a text field to the dialog, where columns specifies the field width in characters.\r\n" + 
			"Dialog.addNumber(\"Label\", default)####Adds a numeric field to the dialog, using the specified label and default value.\r\n" + 
			"Dialog.addNumber(\"Label\", default, decimalPlaces, columns, units)####Adds a numeric field, using the specified label and default value. DecimalPlaces specifies the number of digits to right of decimal point, columns specifies the the field width in characters and units is a string that is displayed to the right of the field.\r\n" + 
			"Dialog.addCheckbox(\"Label\", default)####Adds a checkbox to the dialog, using the specified label and default state (true or false).\r\n" + 
			"Dialog.addCheckboxGroup(rows, columns, labels, defaults)####Adds a rowsxcolumns grid of checkboxes to the dialog, using the specified labels and default states (example). Requires 1.41c.\r\n" + 
			"Dialog.addChoice(\"Label\", items)####Adds a popup menu to the dialog, where items is a string array containing the menu items.\r\n" + 
			"Dialog.addChoice(\"Label\", items, default)####Adds a popup menu, where items is a string array containing the choices and default is the default choice.\r\n" + 
			"Dialog.show()####Displays the dialog and waits until the user clicks \"OK\" or \"Cancel\". The macro terminates if the user clicks \"Cancel\".\r\n" + 
			"Dialog.getString()####Returns a string containing the contents of the next text field.\r\n" + 
			"Dialog.getNumber()####Returns the contents of the next numeric field.\r\n" + 
			"Dialog.getCheckbox()####Returns the state (true or false) of the next checkbox.\r\n" + 
			"Dialog.getChoice()####Returns the selected item (a string) from the next popup menu.\r\n" + 
			"doCommand(\"Command\")####Runs an ImageJ menu command in a separate thread and returns immediately. As an example, doCommand(\"Start Animation\") starts animating the current stack in a separate thread and the macro continues to execute. Use run(\"Start Animation\") and the macro hangs until the user stops the animation.\r\n" + 
			"doWand(x, y)####Equivalent to clicking on the current image at (x,y) with the wand tool. Note that some objects, especially one pixel wide lines, may not be reliably traced unless they have been thresholded (highlighted in red) using setThreshold.\r\n" + 
			"drawLine(x1, y1, x2, y2)####Draws a line between (x1, y1) and (x2, y2). Use setColor() to specify the color of the line and setLineWidth() to vary the line width.\r\n" + 
			"drawOval(x, y, width, height)####Draws the outline of an oval using the current color and line width. See also: fillOval, setColor, setLineWidth, autoUpdate.\r\n" + 
			"drawRect(x, y, width, height)####Draws the outline of a rectangle using the current color and line width. See also: fillRect, setColor, setLineWidth, autoUpdate.\r\n" + 
			"drawString(\"text\", x, y)####Draws text at the specified location. Call setFont() to specify the font. Call setJustification() to have the text centered or right justified. Call getStringWidth() to get the width of the text in pixels. Refer to the TextDemo macro for examples.\r\n" + 
			"dump()####Writes the contents of the symbol table, the tokenized macro code and the variable stack to the \"Log\" window.\r\n" + 
			"endsWith(string, suffix)####Returns true (1) if string ends with suffix. See also: startsWith, indexOf, substring, matches.\r\n" + 
			"eval(macro)####Evaluates (runs) one or more lines of macro code. See also: EvalDemo macro and runMacro function.\r\n" + 
			"eval(\"script\", javascript)####Evaluates the JavaScript code contained in the string javascript, for example eval(\"script\",\"IJ.getInstance().setAlwaysOnTop(true);\"). Mac users, and users of Java 1.5, must have a copy of JavaScript.jar in the plugins folder. Requires 1.41m.\r\n" + 
			"exec(string or strings)####Executes a native command and returns the output of that command as a string. Also opens Web pages in the default browser and documents in other applications (e.g., Excel). Refer to the ExecExamples macro for examples. Requires 1.39c.\r\n" + 
			"exit() or exit(\"error message\")####Terminates execution of the macro and, optionally, displays an error message.\r\n" + 
			"exp(n)####Returns the exponential number e (i.e., 2.718...) raised to the power of n.\r\n" + 
			"Ext (Macro Extension) Functions####These are functions that have been added to the macro language by plugins using the MacroExtension interface. As an example, the Image5D_Extensions plugin adds functions that work with the Image5D plugins, such as Ext.setDisplayMode(\"color\") and Ext.setChannel(ch).\r\n" + 
			"File.append(string, path)####Appends string to the end of the specified file. Requires 1.41j.\r\n" + 
			"File.close(f)####Closes the specified file, which must have been opened using File.open().\r\n" + 
			"File.dateLastModified(path)####the date and time the specified file was last modified.\r\n" + 
			"File.delete(path)####Deletes the specified file or directory. With v1.41e or later, returns \"1\" (true) if the file or directory was successfully deleted. If the file is a directory, it must be empty. The file must be in the user's home directory, the ImageJ directory or the temp directory.\r\n" + 
			"File.directory####The directory path of the last file opened using open(), saveAs(), File.open() or File.openAsString(). Requires 1.38q.\r\n" + 
			"File.exists(path)####Returns \"1\" (true) if the specified file exists.\r\n" + 
			"File.getName(path)####Returns the last name in path's name sequence.\r\n" + 
			"File.getParent(path)####Returns the parent of the file specified by path.\r\n" + 
			"File.isDirectory(path)####Returns \"1\" (true) if the specified file is a directory.\r\n" + 
			"File.lastModified(path)####Returns the time the specified file was last modified as the number of milliseconds since January 1, 1970.\r\n" + 
			"File.length(path)####Returns the length in bytes of the specified file.\r\n" + 
			"File.makeDirectory(path)####Creates a directory.\r\n" + 
			"File.name####The name of the last file opened using open(), saveAs(), File.open() or File.openAsString(). Requires 1.38q.\r\n" + 
			"File.open(path)####Creates a new text file and returns a file variable that refers to it. To write to the file, pass the file variable to the print function. Displays a file save dialog box if path is an empty string. The file is closed when the macro exits. Currently, only one file can be open at a time. For an example, refer to the SaveTextFileDemo macro.\r\n" + 
			"File.openAsString(path)####Opens a text file and returns the contents as a string. Displays a file open dialog box if path is an empty string. Use lines=split(str,\"\\n\") to convert the string to an array of lines.\r\n" + 
			"File.openAsRawString(path)####Opens a file and returns the first 5,000 bytes as a string. Returns up to 10 megabytes if the name ends with \".txt\". Refer to the First10Bytes and ZapGremlins macros for examples. Requires 1.39f.\r\n" + 
			"File.openUrlAsString(url)####Opens a URL and returns the contents as a string. Returns an emptly string if the host or file cannot be found. With v1.41i and later, returns \"<Error: message>\" if there any error, including host or file not found.\r\n" + 
			"File.openDialog(title)####Displays a file open dialog and returns the path to the file choosen by the user (example). The macro exits if the user cancels the dialog. Requires 1.39d.\r\n" + 
			"File.rename(path1, path2)####Renames, or moves, a file or directory. Returns \"1\" (true) if successful. Requires 1.38b.\r\n" + 
			"File.saveString(string, path)####Saves string as a file. Requires 1.41j.\r\n" + 
			"File.separator####Returns the file name separator character (\"/\" or \"\\\").\r\n" + 
			"fill()####Fills the image or selection with the current drawing color.\r\n" + 
			"fillOval(x, y, width, height)####Fills an oval bounded by the specified rectangle with the current drawing color. See also: drawOval, setColor, autoUpdate.\r\n" + 
			"fillRect(x, y, width, height)####Fills the specified rectangle with the current drawing color. See also: drawRect, setColor, autoUpdate.\r\n" + 
			"Fit.doFit(equation, xpoints, ypoints)####Fits the specified equation to the points defined by xpoints, ypoints. Equation can be either the equation name or an index. The equation names are shown in the drop down menu in the Analyze>Tools>Curve Fitting window.\r\n" + 
			"Fit.rSquared####Returns R^2=1-SSE/SSD, where SSE is the sum of the squares of the errors and SSD is the sum of the squares of the deviations about the mean.\r\n" + 
			"Fit.p(index)####Returns the specified parameter.\r\n" + 
			"Fit.nParams####Returns the number of parameters.\r\n" + 
			"Fit.f(x)####Returns the y value at x.\r\n" + 
			"Fit.nEquations####Returns the number of equations.\r\n" + 
			"Fit.getEquation(index, name, formula)####Gets the name and formula of the specified equation.\r\n" + 
			"Fit.plot####Plots the current curve fit.\r\n" + 
			"floodFill(x, y)####Fills, with the foreground color, pixels that are connected to, and the same color as, the pixel at (x, y). With 1.37e or later, does 8-connected filling if there is an optional string argument containing \"8\", for example floodFill(x, y, \"8-connected\"). This function is used to implement the flood fill (paint bucket) macro tool.\r\n" + 
			"floor(n)####Returns the largest value that is not greater than n and is equal to an integer. See also: round.\r\n" + 
			"fromCharCode(value1,...,valueN)####This function takes one or more Unicode values and returns a string.\r\n" + 
			"getArgument()####Returns the string argument passed to macros called by runMacro(macro, arg), eval(macro), IJ.runMacro(macro, arg) or IJ.runMacroFile(path, arg).\r\n" + 
			"getBoolean(\"message\")####Displays a dialog box containing the specified message and \"Yes\", \"No\" and \"Cancel\" buttons. Returns true (1) if the user clicks \"Yes\", returns false (0) if the user clicks \"No\" and exits the macro if the user clicks \"Cancel\".\r\n" + 
			"getBoundingRect(x, y, width, height)####Replace by getSelectionBounds.\r\n" + 
			"getCursorLoc(x, y, z, modifiers)####Returns the cursor location in pixels and the mouse event modifier flags. The z coordinate is zero for 2D images. For stacks, it is one less than the slice number. For examples, see the GetCursorLocDemo and the GetCursorLocDemoTool macros.\r\n" + 
			"getDateAndTime(year, month, dayOfWeek, dayOfMonth, hour, minute, second, msec)####Returns the current date and time. For an example, refer to the GetDateAndTime macro. See also: getTime.\r\n" + 
			"getDimensions(width, height, channels, slices, frames)####Returns the dimensions of the current image. Requires 1.38s.\r\n" + 
			"getDirectory(string)####Displays a \"choose directory\" dialog and returns the selected directory, or returns the path to a specified directory, such as \"plugins\", \"home\", etc. The returned path ends with a file separator, either \"\\\" (Windows) or \"/\". Returns an empty string if the specified directory is not found or aborts the macro if the user cancels the \"choose directory\" dialog box. For examples, see the GetDirectoryDemo and ListFilesRecursively macros. See also: getFileList and the File functions.\r\n" + 
			"getDirectory(\"Choose a Directory\")####Displays a file open dialog, using the argument as a title, and returns the path to the directory selected by the user.\r\n" + 
			"getDirectory(\"plugins\")####Returns the path to the plugins directory.\r\n" + 
			"getDirectory(\"macros\")####Returns the path to the macros directory.\r\n" + 
			"getDirectory(\"image\")####Returns the path to the directory that the active image was loaded from.\r\n" + 
			"getDirectory(\"startup\")####Returns the path to the directory that ImageJ was launched from (usually the ImageJ directory).\r\n" + 
			"getDirectory(\"home\")####Returns the path to users home directory.\r\n" + 
			"getDirectory(\"temp\")####Returns the path to the temporary directory (/tmp on Linux and Mac OS X).\r\n" + 
			"getFileList(directory)####Returns an array containing the names of the files in the specified directory path. The names of subdirectories have a \"/\" appended. For an example, see the ListFilesRecursively macro.\r\n" + 
			"getHeight()####Returns the height in pixels of the current image.\r\n" + 
			"getHistogram(values, counts, nBins[, histMin, histMax])####Returns the histogram of the current image or selection. Values is an array that will contain the pixel values for each of the histogram counts (or the bin starts for 16 and 32 bit images), or set this argument to 0. Counts is an array that will contain the histogram counts. nBins is the number of bins that will be used. It must be 256 for 8 bit and RGB image, or an integer greater than zero for 16 and 32 bit images. With 16-bit images, the Values argument is ignored if nBins is 65536. With 16-bit and 32-bit images, and ImageJ 1.35a and later, the histogram range can be specified using optional histMin and histMax arguments. See also: getStatistics, HistogramLister, HistogramPlotter, StackHistogramLister and CustomHistogram.\r\n" + 
			"getImageID()####Returns the unique ID (a negative number) of the active image. Use the selectImage(id), isOpen(id) and isActive(id) functions to activate an image or to determine if it is open or active.\r\n" + 
			"getImageInfo()####Returns a string containing the text that would be displayed by the Image>Show Info command. To retrieve the contents of a text window, use getInfo(\"window.contents\"). For an example, see the ListDicomTags macros. See also: getMetadata.\r\n" + 
			"getInfo(\"window.contents\")####If the front window is a text window, returns the contents of that window. If the front window is an image, returns a string containing the text that would be displayed by Image>Show Info. Note that getImageInfo() is a more reliable way to retrieve information about an image. Use split(getInfo(),'\\n') to break the string returned by this function into separate lines. Replaces the getInfo() function. Requires 1.38m.\r\n" + 
			"getInfo(\"image.description\")####Returns the TIFF image description tag, or an empty string if this is not a TIFF image or the image description is not available. Requires 1.39t.\r\n" + 
			"getInfo(\"image.subtitle\")####Returns the subtitle of the current image. This is the line of information displayed above the image and below the title bar. Requires 1.38m.\r\n" + 
			"getInfo(\"slice.label\")####Return the label of the current stack slice. This is the string that appears in parentheses in the subtitle, the line of information above the image. Returns an empty string if the current image is not a stack or the current slice does not have a label. Requires 1.38m.\r\n" + 
			"getInfo(key)####Returns the Java property associated with the specified key (e.g., \"java.version\", \"os.name\", \"user.home\", \"user.dir\", etc.). Returns an empty string if there is no value associated with the key. See also: getList(\"java.properties\"). Requires 1.38m.\r\n" + 
			"getLine(x1, y1, x2, y2, lineWidth)####Returns the starting coordinates, ending coordinates and width of the current straight line selection. The coordinates and line width are in pixels. Sets x1 = -1 if there is no line selection. Refer to the GetLineDemo macro for an example. See also: makeLine.\r\n" + 
			"getList(\"window.titles\")####Returns a list (array) of non-image window titles. For an example, see the DisplayWindowTitles macro. Requires 1.38m.\r\n" + 
			"getList(\"java.properties\")####Returns a list (array) of Java property keys. For an example, see the DisplayJavaProperties macro. See also: getInfo(key). Requires 1.38m.\r\n" + 
			"getLocationAndSize(x, y, width, height)####Returns the location and size, in screen coordinates, of the active image window. Use getWidth and getHeight to get the width and height, in image coordinates, of the active image. See also: setLocation,\r\n" + 
			"getLut(reds, greens, blues)####Returns three arrays containing the red, green and blue intensity values from the current lookup table. See the LookupTables macros for examples.\r\n" + 
			"getMetadata(\"Info\")####Returns the metadata (a string) from the \"Info\" property of the current image. With DICOM images, this is the information (tags) in the DICOM header. See also: setMetadata. Requires 1.40b.\r\n" + 
			"getMetadata(\"Label\")####Returns the current slice label. The first line of the this label (up to 60 characters) is display as part of the image subtitle. With DICOM stacks, returns the metadata from the DICOM header. See also: setMetadata. Requires 1.40b.\r\n" + 
			"getMinAndMax(min, max)####Returns the minimum and maximum displayed pixel values (display range). See the DisplayRangeMacros for examples.\r\n" + 
			"getNumber(\"prompt\", defaultValue)####Displays a dialog box and returns the number entered by the user. The first argument is the prompting message and the second is the value initially displayed in the dialog. Exits the macro if the user clicks on \"Cancel\" in the dialog. Returns defaultValue if the user enters an invalid number. See also: Dialog.create.\r\n" + 
			"getPixel(x, y)####Returns the value of the pixel at (x,y). Note that pixels in RGB images contain red, green and blue components that need to be extracted using shifting and masking. See the Color Picker Tool macro for an example that shows how to do this.\r\n" + 
			"getPixelSize(unit, pixelWidth, pixelHeight)####Returns the unit of length (as a string) and the pixel dimensions. For an example, see the ShowImageInfo macro. See also: getVoxelSize.\r\n" + 
			"getProfile()####Runs Analyze>Plot Profile (without displaying the plot) and returns the intensity values as an array. For an example, see the GetProfileExample macro.\r\n" + 
			"getRawStatistics(nPixels, mean, min, max, std, histogram)####This function is similar to getStatistics except that the values returned are uncalibrated and the histogram of 16-bit images has a bin width of one and is returned as a max+1 element array. For examples, refer to the ShowStatistics macro set. See also: calibrate.\r\n" + 
			"getResult(\"Column\", row)####Returns a measurement from the ImageJ results table or NaN if the specified column is not found. The first argument specifies a column in the table. It must be a \"Results\" window column label, such as \"Area\", \"Mean\" or \"Circ.\". The second argument specifies the row, where 0<=row<nResults. nResults is a predefined variable that contains the current measurement count. (Actually, it's a built-in function with the \"()\" optional.) With ImageJ 1.34g and later, you can omit the second argument and have the row default to nResults-1 (the last row in the results table). See also: nResults, setResult, isNaN, getResultLabel.\r\n" + 
			"getResultLabel(row)####Returns the label of the specified row in the results table, or an empty string if Display Label is not checked in Analalyze>Set Measurements.\r\n" + 
			"getSelectionBounds(x, y, width, height)####Returns the smallest rectangle that can completely contain the current selection. x and y are the pixel coordinates of the upper left corner of the rectangle. width and height are the width and height of the rectangle in pixels. If there is no selection, returns (0, 0, ImageWidth, ImageHeight). See also: selectionType and setSelectionLocation.\r\n" + 
			"getSelectionCoordinates(xCoordinates, yCoordinates)####Returns two arrays containing the X and Y coordinates of the points that define the current selection. See the SelectionCoordinates macro for an example. See also: selectionType, getSelectionBounds.\r\n" + 
			"getSliceNumber()####Returns the number of the currently displayed stack image, an integer between 1 and nSlices. Returns 1 if the active image is not a stack. See also: setSlice.\r\n" + 
			"getStatistics(area, mean, min, max, std, histogram)####Returns the area, average pixel value, minimum pixel value, maximum pixel value, standard deviation of the pixel values and histogram of the active image or selection. The histogram is returned as a 256 element array. For 8-bit and RGB images, the histogram bin width is one. For 16-bit and 32-bit images, the bin width is (max-min)/256. For examples, refer to the ShowStatistics macro set. Note that trailing arguments can be omitted. For example, you can use getStatistics(area), getStatistics(area, mean) or getStatistics(area, mean, min, max). See also: getRawStatistics\r\n" + 
			"getString(\"prompt\", \"default\")####Displays a dialog box and returns the string entered by the user. The first argument is the prompting message and the second is the initial string value. Exits the macro if the user clicks on \"Cancel\" or enters an empty string. See also: Dialog.create.\r\n" + 
			"getStringWidth(string)####Returns the width in pixels of the specified string. See also: setFont, drawString. Requires v1.41d.\r\n" + 
			"getThreshold(lower, upper)####Returns the lower and upper threshold levels. Both variables are set to -1 if the active image is not thresholded. See also: setThreshold, getThreshold, resetThreshold.\r\n" + 
			"getTime()####Returns the current time in milliseconds. The granularity of the time varies considerably from one platform to the next. On Windows NT, 2K, XP it is about 10ms. On other Windows versions it can be as poor as 50ms. On many Unix platforms, including Mac OS X, it actually is 1ms. See also: getDateAndTime.\r\n" + 
			"getTitle()####Returns the title of the current image.\r\n" + 
			"getVoxelSize(width, height, depth, unit)####Returns the voxel size and unit of length (\"pixel\", \"mm\", etc.) of the current image or stack. See also: getPixelSize, setVoxelSize.\r\n" + 
			"getVersion()####Returns the ImageJ version number as a string (e.g., \"1.34s\"). See also: requires.\r\n" + 
			"getWidth()####Returns the width in pixels of the current image.\r\n" + 
			"getZoom()####Returns the magnification of the active image, a number in the range 0.03125 to 32.0 (3.1% to 3200%).\r\n" + 
			"imageCalculator(operator, img1, img2)####Runs the Process>Image Calculator tool, where operator (\"add\",\"subtract\",\"multiply\",\"divide\", \"and\", \"or\", \"xor\", \"min\", \"max\", \"average\", \"difference\" or \"copy\") specifies the operation, and img1 and img2 specify the operands. img1 and img2 can be either an image title (a string) or an image ID (an integer). The operator string can include up to three modifiers: \"create\" (e.g., \"add create\") causes the result to be stored in a new window, \"32-bit\" causes the result to be 32-bit floating-point and \"stack\" causes the entire stack to be processed. See the ImageCalculatorDemo macros for examples.\r\n" + 
			"indexOf(string, substring)####Returns the index within string of the first occurrence of substring. See also: lastIndexOf, startsWith, endsWith, substring, toLowerCase, replace, matches.\r\n" + 
			"indexOf(string, substring, fromIndex)####Returns the index within string of the first occurrence of substring, with the search starting at fromIndex.\r\n" + 
			"is(\"Applet\")####Returns true if ImageJ is running as an applet. Requires v1.39p.\r\n" + 
			"is(\"Batch Mode\")####Returns true if the macro interpreter is running in batch mode. Requires v1.39p.\r\n" + 
			"is(\"Caps Lock Set\")####Returns true if the caps lock key is set. Always return false on some platforms. Requires v1.42e.\r\n" + 
			"is(\"Composite\")####Returns true if the current image is a a multi-channel stack that uses the CompositeImage class. Requires v1.39r.\r\n" + 
			"is(\"Inverting LUT\")####Returns true if the current image is using an inverting lookup table.\r\n" + 
			"is(\"Hyperstack\")####Returns true if the current image is a hyperstack. Requires v1.39k.\r\n" + 
			"is(\"Locked\")####Returns true if the current image is locked.\r\n" + 
			"is(\"Virtual Stack\")####Returns true if the current image is a virtual stack. Requires v1.39q.\r\n" + 
			"isActive(id)####Returns true if the image with the specified ID is active.\r\n" + 
			"isKeyDown(key)####Returns true if the specified key is pressed, where key must be \"shift\", \"alt\" or \"space\". See also: setKeyDown.\r\n" + 
			"isNaN(n)####Returns true if the value of the number n is NaN (Not-a-Number). A common way to create a NaN is to divide zero by zero. This function is required because (n==NaN) is always false. Note that the numeric constant NaN is predefined in the macro language.\r\n" + 
			"isOpen(id)####Returns true if the image with the specified ID is open.\r\n" + 
			"isOpen(\"Title\")####Returns true if the window with the specified title is open.\r\n" + 
			"lastIndexOf(string, substring)####Returns the index within string of the rightmost occurrence of substring. See also: indexOf, startsWith, endsWith, substring.\r\n" + 
			"lengthOf(str)####Returns the length of a string or array.\r\n" + 
			"lineTo(x, y)####Draws a line from current location to (x,y) .\r\n" + 
			"List.set(key, value)####Adds a key/value pair to the list.\r\n" + 
			"List.get(key)####Returns the value associated with key, or an empty string if the key is not found.\r\n" + 
			"List.size()####Returns the size of the list.\r\n" + 
			"List.clear()####Resets the list.\r\n" + 
			"List.setList(list)####Loads the key/value pairs in list.\r\n" + 
			"List.getList()####Returns the list as a string.\r\n" + 
			"log(n)####Returns the natural logarithm (base e) of n. Note that log10(n) = log(n)/log(10).\r\n" + 
			"makeLine(x1, y1, x2, y2)####Creates a new straight line selection. The origin (0,0) is assumed to be the upper left corner of the image. Coordinates are in pixels. With ImageJ 1.35b and letter, you can create segmented line selections by specifying more than two coordinate pairs, for example makeLine(25,34,44,19,69,30,71,56).\r\n" + 
			"makeLine(x1, y1, x2, y2, lineWidth)####Creates a straight line selection with the specified width. Requires 1.38u. See also: getLine.\r\n" + 
			"makeOval(x, y, width, height)####Creates an elliptical selection, where (x,y) define the upper left corner of the bounding rectangle of the ellipse.\r\n" + 
			"makePoint(x, y)####Creates a point selection at the specified location. Create a multi-point selection by using makeSelection(\"point\",xpoints,ypoints). Use setKeyDown(\"shift\"); makePoint(x, y); to add a point to an existing point selection.\r\n" + 
			"makePolygon(x1, y1, x2, y2, x3, y3, ...)####Creates a polygonal selection. At least three coordinate pairs must be specified, but not more than 200. As an example, makePolygon(20,48,59,13,101,40,75,77,38,70) creates a polygon selection with five sides.\r\n" + 
			"makeRectangle(x, y, width, height)####Creates a rectangular selection. The x and y arguments are the coordinates (in pixels) of the upper left corner of the selection. The origin (0,0) of the coordinate system is the upper left corner of the image.\r\n" + 
			"makeSelection(type, xcoord, ycoord)####Creates a selection from a list of XY coordinates. The first argument should be \"polygon\", \"freehand\", \"polyline\", \"freeline\", \"angle\" or \"point\". In ImageJ 1.32g or later, it can also be the numeric value returned by selectionType. The xcoord and ycoord arguments are numeric arrays that contain the X and Y coordinates. See the MakeSelectionDemo macro for examples.\r\n" + 
			"matches(string, regex)####Returns true if string matches the specified regular expression. See also: startsWith, endsWith, indexOf, replace. Requires v1.39r.\r\n" + 
			"maxOf(n1, n2)####Returns the greater of two values.\r\n" + 
			"minOf(n1, n2)####Returns the smaller of two values.\r\n" + 
			"moveTo(x, y)####Sets the current drawing location. The origin is always assumed to be the upper left corner of the image.\r\n" + 
			"newArray(size)####Returns a new array containing size elements. You can also create arrays by listing the elements, for example newArray(1,4,7) or newArray(\"a\",\"b\",\"c\"). For more examples, see the Arrays macro. The ImageJ macro language does not directly support 2D arrays. As a work around, either create a blank image and use setPixel() and getPixel(), or create a 1D array using a=newArray(xmax*ymax) and do your own indexing (e.g., value=a[x+y*xmax]).\r\n" + 
			"newImage(title, type, width, height, depth)####Opens a new image or stack using the name title. The string type should contain \"8-bit\", \"16-bit\", \"32-bit\" or \"RGB\". In addition, it can contain \"white\", \"black\" or \"ramp\" (the default is \"white\"). As an example, use \"16-bit ramp\" to create a 16-bit image containing a grayscale ramp. Width and height specify the width and height of the image in pixels. Depth specifies the number of stack slices.\r\n" + 
			"newMenu(macroName, stringArray)####Defines a menu that will be added to the toolbar when the menu tool named macroName is installed. Menu tools are macros with names ending in \"Menu Tool\". StringArray is an array containing the menu commands. Returns a copy of stringArray. For an example, refer to the Menus toolset. Requires v1.38b or later.\r\n" + 
			"nImages####Returns number of open images. The parentheses \"()\" are optional.\r\n" + 
			"nResults####Returns the current measurement counter value. The parentheses \"()\" are optional.\r\n" + 
			"nSlices####Returns the number of images in the current stack. Returns 1 if the current image is not a stack. The parentheses \"()\" are optional. See also: getSliceNumber,\r\n" + 
			"open(path)####Opens and displays a tiff, dicom, fits, pgm, jpeg, bmp, gif, lut, roi, or text file. Displays an error message and aborts the macro if the specified file is not in one of the supported formats, or if the file is not found. Displays a file open dialog box if path is an empty string or if there is no argument. Use the File>Open command with the command recorder running to generate calls to this function. With 1.41k or later, opens images specified by a URL, for example open(\"http://rsb.info.nih.gov/ij/images/clown.gif\").\r\n" + 
			"parseFloat(string)####Converts the string argument to a number and returns it. Returns NaN (Not a Number) if the string cannot be converted into a number. Use the isNaN() function to test for NaN. For examples, see ParseFloatIntExamples.\r\n" + 
			"parseInt(string)####Converts string to an integer and returns it. Returns NaN if the string cannot be converted into a integer.\r\n" + 
			"parseInt(string, radix)####Converts string to an integer and returns it. The optional second argument (radix) specifies the base of the number contained in the string. The radix must be an integer between 2 and 36. For radixes above 10, the letters of the alphabet indicate numerals greater than 9. Set radix to 16 to parse hexadecimal numbers. Returns NaN if the string cannot be converted into a integer. For examples, see ParseFloatIntExamples.\r\n" + 
			"Plot.create(\"Title\", \"X-axis Label\", \"Y-axis Label\", xValues, yValues)####Generates a plot using the specified title, axis labels and X and Y coordinate arrays. If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used as the X values. It is also permissible to specify no arrays and use Plot.setLimits() and Plot.add() to generate the plot. Use\r\n" + 
			"Plot.show()####to display the plot in a window or it will be displayed automatically when the macro exits. For examples, check out the ExamplePlots macro file.\r\n" + 
			"Plot.setLimits(xMin, xMax, yMin, yMax)####Sets the range of the x-axis and y-axis of plots created using Plot.create(). Must be called immediately after Plot.create().\r\n" + 
			"Plot.setLineWidth(width)####Specifies the width of the line used to draw a curve. Points (circle, box, etc.) are also drawn larger if a line width greater than one is specified. Note that the curve specified in Plot.create() is the last one drawn before the plot is dispayed or updated.\r\n" + 
			"Plot.setColor(\"red\")####Specifies the color used in subsequent calls to Plot.add() or Plot.addText(). The argument can be \"black\", \"blue\", \"cyan\", \"darkGray\", \"gray\", \"green\", \"lightGray\", \"magenta\", \"orange\", \"pink\", \"red\", \"white\" or \"yellow\". Note that the curve specified in Plot.create() is drawn last.\r\n" + 
			"Plot.add(\"circles\", xValues, yValues)####Adds a curve, set of points or error bars to a plot created using Plot.create(). If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used as the X values. The first argument can be \"line\", \"circles\", \"boxes\", \"triangles\", \"crosses\", \"dots\", \"x\" or \"error bars\".\r\n" + 
			"Plot.addText(\"A line of text\", x, y)####Adds text to the plot at the specified location, where (0,0) is the upper left corner of the the plot frame and (1,1) is the lower right corner. Call Plot.setJustification() to have the text centered or right justified.\r\n" + 
			"Plot.setJustification(\"center\")####Specifies the justification used by Plot.addText(). The argument can be \"left\", \"right\" or \"center\". The default is \"left\".\r\n" + 
			"Plot.show()####Displays the plot generated by Plot.create(), Plot.add(), etc. in a window. This function is automatically called when a macro exits.\r\n" + 
			"Plot.update()####Draws the plot generated by Plot.create(), Plot.add(), etc. in an existing plot window. Equivalent to Plot.show() if no plot window is open.\r\n" + 
			"Plot.getValues(xpoints, ypoints)####Returns the values displayed by clicking on \"List\" in a plot or histogram window (example). Requires 1.41k.\r\n" + 
			"pow(base, exponent)####Returns the value of base raised to the power of exponent.\r\n" + 
			"print(string)####Outputs a string to the \"Log\" window. Numeric arguments are automatically converted to strings. Starting with ImageJ v1.34b, print() accepts multiple arguments. For example, you can use print(x,y,width, height) instead of print(x+\" \"+y+\" \"+width+\" \"+height). If the first argument is a file handle returned by File.open(path), then the second is saved in the refered file (see SaveTextFileDemo). Numeric expressions are automatically converted to strings using four decimal places, or use the d2s function to specify the decimal places. For example, print(2/3) outputs \"0.6667\" but print(d2s(2/3,1)) outputs \"0.7\". Starting with ImageJ 1.37j, print() accepts commands such as \"\\\\Clear\", \"\\\\Update:<text>\" and \"\\\\Update<n>:<text>\" (for n<26) that clear the \"Log\" window and update its contents. For example, print(\"\\\\Clear\") erases the Log window, print(\"\\\\Update:new text\") replaces the last line with \"new text\" and print(\"\\\\Update8:new 8th line\") replaces the 8th line with \"new 8th line\". Refer to the LogWindowTricks macro for an example. Starting with ImageJ 1.38m, the second argument to print(arg1, arg2) is appended to a text window or table if the first argument is a window title in brackets, for example print(\"[My Window]\", \"Hello, world\"). With text windows, newline characters (\"\\n\") are not automatically appended and text that starts with \"\\\\Update:\" replaces the entire contents of the window. Refer to the PrintToTextWindow, Clock and ProgressBar macros for examples. The second argument to print(arg1, arg2) is appended to a table (e.g., ResultsTable) if the first argument is the title of the table in brackets. Use the Plugins>New command to open a blank table. Any command that can be sent to the \"Log\" window (\"\\\\Clear\", \"\\\\Update:<text>\" , etc.) can also be sent to a table. Refer to the SineCosineTable and TableTricks macros for examples.\r\n" + 
			"random####Returns a random number between 0 and 1.\r\n" + 
			"rename(name)####Changes the title of the active image to the string name.\r\n" + 
			"replace(string, old, new)####Returns the new string that results from replacing all occurrences of old in string with new, where old and new are single character strings. If old or new are longer than one character, each substring of string that matches the regular expression old is replaced with new. See also: matches.\r\n" + 
			"requires(\"1.29p\")####Display a message and aborts the macro if the ImageJ version is less than the one specified. See also: getVersion.\r\n" + 
			"reset####Restores the backup image created by the snapshot function. Note that reset() and run(\"Undo\") are basically the same, so only one run() call can be reset.\r\n" + 
			"resetMinAndMax####With 16-bit and 32-bit images, resets the minimum and maximum displayed pixel values (display range) to be the same as the current image's minimum and maximum pixel values. With 8-bit images, sets the display range to 0-255. With RGB images, does nothing. See the DisplayRangeMacros for examples.\r\n" + 
			"resetThreshold####Disables thresholding. See also: setThreshold, setAutoThreshold, getThreshold.\r\n" + 
			"restorePreviousTool####Switches back to the previously selected tool. Useful for creating a tool macro that performs an action, such as opening a file, when the user clicks on the tool icon.\r\n" + 
			"restoreSettings####Restores Edit/Options submenu settings saved by the saveSettings() function.\r\n" + 
			"roiManager(cmd)####Runs an ROI Manager command, where cmd must be \"Add\", \"Add & Draw\", \"Update\", \"Delete\", \"Deselect\", \"Measure\", \"Draw\", \"Fill\", \"Label\", \"Combine\", \"Split\", \"Sort\", \"Reset\" or \"Multi Measure\". The ROI Manager is opened if it is not already open. Use roiManager(\"reset\") to delete all items on the list. Use setOption(\"Show All\", boolean) to enable/disable \"Show All\" mode. For examples, refer to the RoiManagerMacros, RoiManagerAddParticles and ROI Manager Stack Demo macros.\r\n" + 
			"roiManager(cmd, name)####Runs an ROI Manager I/O command, where cmd is \"Open\", \"Save or \"Rename\", and name is a file path or name. The \"Save\" option ignores selections and saves all the ROIs as a ZIP archive. With ImageJ 1.38o and later, it displays a file save dialog if name is \"\". The \"Rename\" option requires v1.37h or later. With v1.37i or later, you can get the selection name using call(\"ij.plugin.frame.RoiManager.getName\", index). The ROI Manager is opened if it is not already open.\r\n" + 
			"roiManager(\"count\")####Returns the number of items in the ROI Manager list.\r\n" + 
			"roiManager(\"index\")####Returns the index of the currently selected item on the ROI Manager list, or -1 if the list is empty, no items are selected, or more than one item is selected.\r\n" + 
			"roiManager(\"select\", index)####Selects an item in the ROI Manager list, where index must be greater than or equal zero and less than the value returned by roiManager(\"count\"). Use roiManager(\"deselect\") to deselect all items on the list. For an example, refer to the ROI Manager Stack Demo macro.\r\n" + 
			"round(n)####Returns the closest integer to n. See also: floor.\r\n" + 
			"run(\"command\"[, \"options\"])####Executes an ImageJ menu command. The optional second argument contains values that are automatically entered into dialog boxes (must be GenericDialog or OpenDialog). Use the Command Recorder (Plugins>Macros>Record) to generate run() function calls. Use string concatentation to pass a variable as an argument. For examples, see the ArgumentPassingDemo macro.\r\n" + 
			"runMacro(name)####Runs the specified macro file, which is assumed to be in the Image macros folder. A full file path may also be used. The \".txt\" extension is optional. Returns any string argument returned by the macro. May have an optional second string argument that is passed to macro. For an example, see the CalculateMean macro. See also: eval and getArgument.\r\n" + 
			"save(path)####Saves an image, lookup table, selection or text window to the specified file path. The path must end in \".tif\", \".jpg\", \".gif\", \".zip\", \".raw\", \".avi\", \".bmp\", \".fits\", \".png\", \".pgm\", \".lut\", \".roi\" or \".txt\".\r\n" + 
			"saveAs(format, path)####Saves the active image, lookup table, selection, measurement results, selection XY coordinates or text window to the specified file path. The format argument must be \"tiff\", \"jpeg\", \"gif\", \"zip\", \"raw\", \"avi\", \"bmp\", \"fits\", \"png\", \"pgm\", \"text image\", \"lut\", \"selection\", \"measurements\", \"xy Coordinates\" or \"text\". Use saveAs(format) to have a \"Save As\" dialog displayed.\r\n" + 
			"saveSettings()####Saves most Edit/Options submenu settings so they can be restored later by calling restoreSettings().\r\n" + 
			"screenHeight####Returns the screen height in pixels. See also: getLocationAndSize, setLocation.\r\n" + 
			"screenWidth####Returns the screen width in pixels.\r\n" + 
			"selectionName####Returns the name of the current selection, or an empty string if the selection does not have a name. Aborts the macro if there is no selection. See also: setSelectionName and selectionType.\r\n" + 
			"selectionType()####Returns the selection type, where 0=rectangle, 1=oval, 2=polygon, 3=freehand, 4=traced, 5=straight line, 6=segmented line, 7=freehand line, 8=angle, 9=composite and 10=point. Returns -1 if there is no selection. For an example, see the ShowImageInfo macro.\r\n" + 
			"selectImage(id)####Activates the image with the specified ID (a negative number). If id is greater than zero, activates the idth image listed in the Window menu. With ImageJ 1.33n and later, id can be an image title (a string).\r\n" + 
			"selectWindow(\"name\")####Activates the image window with the title \"name\". Also activates non-image windows in v1.30n or later.\r\n" + 
			"setAutoThreshold()####Sets the threshold levels based on an analysis of the histogram of the current image or selection. Equivalent to clicking on \"Auto\" in the Image>Adjust>Threshold window. See also: setThreshold, getThreshold, resetThreshold.\r\n" + 
			"setBackgroundColor(r, g, b)####Sets the background color, where r, g, and b are >= 0 and <= 255.\r\n" + 
			"setBatchMode(arg)####If arg is true, the interpreter enters batch mode and images are not displayed, allowing the macro to run up to 20 times faster. If arg is false, exits batch mode and displays the active image in a window. ImageJ exits batch mode when the macro terminates if there is no setBatchMode(false) call. Note that a macro should not call setBatchMode(true) more than once. With ImageJ 1.37j or later, set arg to \"exit and display\" to exit batch mode and display all open batch mode images. Here are five example batch mode macros: BatchModeTest, BatchMeasure, BatchSetScale, ReplaceRedWithMagenta.\r\n" + 
			"setColor(r, g, b)####Sets the drawing color, where r, g, and b are >= 0 and <= 255. With 16 and 32 bit images, sets the color to 0 if r=g=b=0. With 16 and 32 bit images, use setColor(1,0,0) to make the drawing color the same is the minimum displayed pixel value. SetColor() is faster than setForegroundColor(), and it does not change the system wide foreground color or repaint the color picker tool icon, but it cannot be used to specify the color used by commands called from macros, for example run(\"Fill\").\r\n" + 
			"setColor(value)####Sets the drawing color. For 8 bit images, 0<=value<=255. For 16 bit images, 0<=value<=65535. For RGB images, use hex constants (e.g., 0xff0000 for red). This function does not change the foreground color used by run(\"Draw\") and run(\"Fill\").\r\n" + 
			"setFont(name, size[, style])####The first argument is the font name. It should be \"SansSerif\", \"Serif\" or \"Monospaced\". The second argument is the point size of the font. The optional third argument is a string containing \"bold\" or \"italic\", or both. With ImageJ 1.37e or later, the third argument can also contain the keyword \"antialiased\". For examples, run the TextDemo macro.\r\n" + 
			"setForegroundColor(r, g, b)####Sets the foreground color, where r, g, and b are >= 0 and <= 255. See also: setColor.\r\n" + 
			"setJustification(\"center\")####Specifies the justification used by drawString() and Plot.addText(). The argument can be \"left\", \"right\" or \"center\". The default is \"left\".\r\n" + 
			"setKeyDown(keys)####Simulates pressing the shift, alt or space keys, where keys is a string containing some combination of \"shift\", \"alt\" or \"space\". Any key not specified is set \"up\". Use setKeyDown(\"none\") to set all keys in the \"up\" position. With ImageJ 1.38e or later, call setKeyDown(\"esc\") to abort the currently running macro or plugin. For examples, see the CompositeSelections, DoWandDemo and AbortMacroActionTool macros. See also: isKeyDown.\r\n" + 
			"setLineWidth(width)####Specifies the line width (in pixels) used by drawLine(), lineTo(), drawRect() and drawOval().\r\n" + 
			"setLocation(x, y)####Moves the active image window to a new location. With v1.39e or later, moves the active window. See also: getLocationAndSize, screenWidth, screenHeight.\r\n" + 
			"setLocation(x, y, width, height)####Moves and resizes the active image window. The new location of the top-left corner is specified by x and y, and the new size by width and height. Requires v1.39e.\r\n" + 
			"setLut(reds, greens, blues)####Creates a new lookup table and assigns it to the current image. Three input arrays are required, each containing 256 intensity values. See the LookupTables macros for examples.\r\n" + 
			"setMetadata(\"Info\", string)####Assigns the metadata in string to the \"Info\" image property of the current image. This metadata is displayed by Image>Show Info and saved as part of the TIFF header. See also: getMetadata. Requires v1.40b.\r\n" + 
			"setMetadata(\"Label\", string)####Sets string as the label of the current image or stack slice. The first 60 characters, or up to the first newline, of the label are displayed as part of the image subtitle. The labels are saved as part of the TIFF header. See also: getMetadata. Requires v1.40b.\r\n" + 
			"setMinAndMax(min, max)####Sets the minimum and maximum displayed pixel values (display range). See the DisplayRangeMacros for examples.\r\n" + 
			"setMinAndMax(min, max, channels)####Sets the display range of specified channels in an RGB image, where 4=red, 2=green, 1=blue, 6=red+green, etc. Note that the pixel data is altered since RGB images, unlike composite color images, do not have a LUT for each channel. Requires v1.42d.\r\n" + 
			"setOption(option, boolean)####Enables or disables an ImageJ option, where option is one of the following options and boolean is either true or false. \"DisablePopupMenu\" enables/disables the the menu displayed when you right click on an image. \"Show All\" enables/disables the ROI Manager's \"Show All\" mode. \"Changes\" sets/resets the 'changes' flag of the current image. Set \"DebugMode\" true to put ImageJ in debug mode. \"OpenUsingPlugins\", added in v1.38f, controls whether standard file types (TIFF, JPEG, GIF, etc.) are opened by external plugins or by ImageJ (example). \"QueueMacros\", added in v1.38g, controls whether macros invoked using keyboard shortcuts run sequentially on the event dispatch thread (EDT) or in separate, possibly concurrent, threads (example). In \"QueueMacros\" mode, screen updates, which also run on the EDT, are delayed until the macro finishes. Note that \"QueueMacros\" does not work with macros using function key shortcuts in ImageJ 1.41g and earlier. \"DisableUndo\", added in v1.38h, enables/disables the Edit>Undo command. Note that a setOption(\"DisableUndo\",true) call without a corresponding setOption(\"DisableUndo\",false) will cause Edit>Undo to not work as expected until ImageJ is restarted. \"Display Label\", \"Limit to Threshold\", \"Area\", \"Mean\" and \"Std\", added in v1.41, enable/disable the corresponding Analyze>Set Measurements options.\r\n" + 
			"setPasteMode(mode)####Sets the transfer mode used by the Edit>Paste command, where 'mode' is \"Copy\", \"Blend\", \"Average\", \"Difference\", \"Transparent\", \"AND\", \"OR\", \"XOR\", \"Add\", \"Subtract\", \"Multiply\", or \"Divide\". In v1.37a or later, 'mode' can also be \"Min\" or \"Max\".\r\n" + 
			"setPixel(x, y, value)####Stores value at location (x,y) of the current image. The screen is updated when the macro exits or call updateDisplay() to have it updated immediately.\r\n" + 
			"setResult(\"Column\", row, value)####Adds an entry to the ImageJ results table or modifies an existing entry. The first argument specifies a column in the table. If the specified column does not exist, it is added. The second argument specifies the row, where 0<=row<=nResults. (nResults is a predefined variable.) A row is added to the table if row=nResults. The third argument is the value to be added or modified. Call setResult(\"Label\", row, string) to set the row label. Call updateResults() to display the updated table in the \"Results\" window. For examples, see the SineCosineTable and ConvexitySolidarity macros.\r\n" + 
			"setRGBWeights(redWeight, greenWeight, blueWeight)####Sets the weighting factors used by the Analyze>Measure, Image>Type>8-bit and Analyze>Histogram commands when they convert RGB pixels values to grayscale. The sum of the weights must be 1.0. Use (1/3,1/3,1/3) for equal weighting of red, green and blue. The weighting factors in effect when the macro started are restored when it terminates. For examples, see the MeasureRGB, ExtractRGBChannels and RGB_Histogram macros.\r\n" + 
			"setSelectionLocation(x, y)####Moves the current selection to (x,y), where x and y are the pixel coordinates of the upper left corner of the selection's bounding rectangle. The RoiManagerMoveSelections macro uses this function to move all the ROI Manager selections a specified distance. See also: getSelectionBounds.\r\n" + 
			"setSelectionName(name)####Sets the name of the current selection to the specified name. Aborts the macro if there is no selection. See also: selectionName and selectionType.\r\n" + 
			"setSlice(n)####Displays the nth slice of the active stack. Does nothing if the active image is not a stack. For an example, see the MeasureStack macros. See also: getSliceNumber, nSlices.\r\n" + 
			"setThreshold(lower, upper)####Sets the lower and upper threshold levels. The values are uncalibrated except for 16-bit images (e.g., unsigned 16-bit images). Starting with v1.34g, there is an optional third argument that can be \"red\", \"black & white\", \"over/under\" or \"no color\". See also: setAutoThreshold, getThreshold, resetThreshold.\r\n" + 
			"setTool(name)####Switches to the specified tool, where name is \"rectangle\", \"elliptical\", \"brush\", \"polygon\", \"freehand\", \"line\", \"polyline\", \"freeline\", \"angle\", \"point\", \"wand\", \"text\", \"zoom\", \"hand\" or \"dropper\". Refer to the SetToolDemo macro for an example. Requires 1.39l.\r\n" + 
			"setTool(id)####Switches to the specified tool, where 0=rectangle, 1=oval, 2=polygon, 3=freehand, 4=straight line, 5=polyline, 6=freeline, 7=point, 8=wand, 9=text, 10=spare, 11=zoom, 12=hand, 13=dropper, 14=angle, 15...21=spare. See also: toolID.\r\n" + 
			"setupUndo()####Call this function before drawing on an image to allow the user the option of later restoring the original image using Edit/Undo. Note that setupUndo() may not work as intended with macros that call the run() function. For an example, see the DrawingTools tool set.\r\n" + 
			"setVoxelSize(width, height, depth, unit)####Defines the voxel dimensions and unit of length (\"pixel\", \"mm\", etc.) for the current image or stack. The depth argument is ignored if the current image is not a stack. See also: getVoxelSize.\r\n" + 
			"setZCoordinate(z)####Sets the Z coordinate used by getPixel(), setPixel() and changeValues(). The argument must be in the range 0 to n-1, where n is the number of images in the stack. For an examples, see the Z Profile Plotter Tool.\r\n" + 
			"showMessage(\"message\")####Displays \"message\" in a dialog box.\r\n" + 
			"showMessage(\"title\", \"message\")####Displays \"message\" in a dialog box using \"title\" as the the dialog box title.\r\n" + 
			"showMessageWithCancel([\"title\",]\"message\")####Displays \"message\" in a dialog box with \"OK\" and \"Cancel\" buttons. \"Title\" (optional) is the dialog box title. The macro exits if the user clicks \"Cancel\" button.\r\n" + 
			"showProgress(progress)####Updates the ImageJ progress bar, where 0.0<=progress<=1.0. The progress bar is not displayed if the time between the first and second calls to this function is less than 30 milliseconds. It is erased when the macro terminates or progress is >=1.0.\r\n" + 
			"showStatus(\"message\")####Displays a message in the ImageJ status bar.\r\n" + 
			"sin(angle)####Returns the sine of an angle (in radians).\r\n" + 
			"snapshot()####Creates a backup copy of the current image that can be later restored using the reset function. For examples, see the ImageRotator and BouncingBar macros. split(string, delimiters) Breaks a string into an array of substrings. Delimiters is a string containing one or more delimiter characters. The default delimiter set \" \\t\\n\\r\" (space, tab, newline, return) is used if delimiters is an empty string or split is called with only one argument. Returns a one element array if no delimiter is found.\r\n" + 
			"sqrt(n)####Returns the square root of n. Returns NaN if n is less than zero.\r\n" + 
			"Stack.isHyperstack####Returns true if the current image is a hyperstack.\r\n" + 
			"Stack.getDimensions(width, height, channels, slices, frames)####Returns the dimensions of the current image.\r\n" + 
			"Stack.setDimensions(channels, slices, frames)####Sets the 3rd, 4th and 5th dimensions of the current stack.\r\n" + 
			"Stack.setChannel(n)####Displays channel n .\r\n" + 
			"Stack.setSlice(n)####Displays slice n .\r\n" + 
			"Stack.setFrame(n)####Displays frame n .\r\n" + 
			"Stack.getPosition(channel, slice, frame)####Returns the current position.\r\n" + 
			"Stack.setPosition(channel, slice, frame)####Sets the position.\r\n" + 
			"Stack.getFrameRate()####Returns the frame rate (FPS).\r\n" + 
			"Stack.setFrameRate(fps)####Sets the frame rate.\r\n" + 
			"Stack.setDisplayMode(mode)####Sets the display mode, where mode is \"composite\", \"color\" or \"grayscale\". Requires a multi-channel stack and v1.40a or later.\r\n" + 
			"Stack.getDisplayMode(mode)####Sets the string mode to the current display mode. Requires v1.40a.\r\n" + 
			"Stack.setActiveChannels(string)####Sets the active channels in a composite color image, where string is a list of ones and zeros that specify the channels to activate. For example, \"101\" activates channels 1 and 3. Requires v1.41b.\r\n" + 
			"Stack.swap(n1, n2)####Swaps the two specified stack images, where n1 and n2 are integers greater than 0 and less than or equal to nSlices. Requires v1.40c.\r\n" + 
			"startsWith(string, prefix)####Returns true (1) if string starts with prefix. See also: endsWith, indexOf, substring, toLowerCase, matches.\r\n" + 
			"String.resetBuffer####Resets (clears) the buffer.\r\n" + 
			"String.append(str)####Appends str to the buffer.\r\n" + 
			"String.buffer####Returns the contents of the buffer.\r\n" + 
			"String.copy(str)####Copies str to the clipboard.\r\n" + 
			"String.copyResults####Copies the Results table to the clipboard.\r\n" + 
			"String.paste####Returns the contents of the clipboard.\r\n" + 
			"substring(string, index1, index2)####Returns a new string that is a substring of string. The substring begins at index1 and extends to the character at index2 - 1. See also: indexOf, startsWith, endsWith, replace.\r\n" + 
			"substring(string, index)####Returns a substring of string that begins at index and extends to the end of string. Requires v1.41i.\r\n" + 
			"tan(angle)####Returns the tangent of an angle (in radians).\r\n" + 
			"toBinary(number)####Returns a binary string representation of number.\r\n" + 
			"toHex(number)####Returns a hexadecimal string representation of number.\r\n" + 
			"toLowerCase(string)####Returns a new string that is a copy of string with all the characters converted to lower case.\r\n" + 
			"toolID####Returns the ID of the currently selected tool. See also: setTool.\r\n" + 
			"toString(number)####Returns a decimal string representation of number. See also: toBinary, toHex, parseFloat and parseInt.\r\n" + 
			"toString(number, decimalPlaces)####Converts number into a string, using the specified number of decimal places. Requires v1.39r.\r\n" + 
			"toUpperCase(string)####Returns a new string that is a copy of string with all the characters converted to upper case.\r\n" + 
			"updateDisplay()####Redraws the active image.\r\n" + 
			"updateResults()####Call this function to update the \"Results\" window after the results table has been modified by calls to the setResult() function.\r\n" + 
			"wait(n)####Delays (sleeps) for n milliseconds.\r\n" + 
			"waitForUser(string)####Halts the macro and displays string in a dialog box. The macro proceeds when the user clicks \"OK\". Unlike showMessage, the dialog box is not modal, so the user can, for example, create a selection or adjust the threshold while the dialog is open. To display a multi-line message, add newline characters (\"\\n\") to string. This function is based on Michael Schmid's Wait_For_User plugin. Example: WaitForUserDemo. Requires v1.39r.\r\n" + 
			"waitForUser(title, message)####This is a two argument version of waitForUser, where title is the dialog box title and message is the text dispayed in the dialog.\r\n" + 
			"write(string)####Outputs a string to the \"Results\" window. Numeric arguments are automatically converted to strings.";
			
public static String IJMacroFunctionsHtml="<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n" + 
		"<html>\r\n" + 
		"\r\n" + 
		"<head>\r\n" + 
		"<title>Built-in Macro Functions</title>\r\n" + 
		"<link rel=\"stylesheet\" type=\"text/css\" href=\"../../docs/ij.css\" />\r\n" + 
		"<link rel=\"stylesheet\" type=\"text/css\" media=\"print\" href=\"../../docs/print.css\" />\r\n" + 
		"<link rel=\"shortcut icon\" href=\"../../favicon.ico\">\r\n" + 
		"<script type=\"text/javascript\" src=\"../../docs/print.js\"> </script> \r\n" + 
		"</head>\r\n" + 
		"<body bgcolor=\"#ffffff\">\r\n" + 
		"<noscript><style type=\"text/css\">#printlink{display:none;}</style></noscript>\r\n" + 
		"\r\n" + 
		"<font color=\"#224488\">\r\n" + 
		"\r\n" + 
		"<a name = Top></a>\r\n" + 
		"<p class=navbar> <a href=\"../../index.html\">home</a> | <a href=\"../../notes.html\">news</a> | <a href=\"../../docs/index.html\">docs</a> | <a href=\"../../download.html\">download</a> | <a href=\"../../plugins/index.html\">plugins</a> | <a href=\"../index.html\">resources</a> | <a href=\"../../list.html\">list</a> | <a href=\"../../links.html\">links</a></p>\r\n" + 
		"<h1>Built-in Macro Functions</h1>\r\n" + 
		"</font>\r\n" + 
		"\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<hr>\r\n" + 
		"<div class=alphabar>\r\n" + 
		"<a href=\"#A\">[&nbsp;A&nbsp;]</a><a href=\"#B\">[&nbsp;B&nbsp;]</a><a\r\n" + 
		"href=\"#C\">[&nbsp;C&nbsp;]</a><a href=\"#D\">[&nbsp;D&nbsp;]</a><a\r\n" + 
		"href=\"#E\">[&nbsp;E&nbsp;]</a><a href=\"#F\">[&nbsp;F&nbsp;]</a><a\r\n" + 
		"href=\"#G\">[&nbsp;G&nbsp;]</a><a href=\"#H\">[&nbsp;H&nbsp;]</a><a\r\n" + 
		"href=\"#I\">[&nbsp;I&nbsp;]</a><a href=\"#J\">[&nbsp;J&nbsp;]</a><a\r\n" + 
		"href=\"#K\">[&nbsp;K&nbsp;]</a><a href=\"#L\">[&nbsp;L&nbsp;]</a><a\r\n" + 
		"href=\"#M\">[&nbsp;M&nbsp;]</a>\r\n" + 
		"<a id=\"printlink\" style=\"float:right;\" href=\"#\" onclick=\"javascript:replaceLinks();\"><b>Print List</i></b>\r\n" + 
		"<br><a href=\"#N\">[&nbsp;N&nbsp;]</a><a href=\"#O\">[&nbsp;O&nbsp;]</a><a\r\n" + 
		"href=\"#P\">[&nbsp;P&nbsp;]</a><a href=\"#Q\">[&nbsp;Q&nbsp;]</a><a\r\n" + 
		"href=\"#R\">[&nbsp;R&nbsp;]</a><a href=\"#S\">[&nbsp;S&nbsp;]</a><a\r\n" + 
		"href=\"#T\">[&nbsp;T&nbsp;]</a><a href=\"#U\">[&nbsp;U&nbsp;]</a><a\r\n" + 
		"href=\"#V\">[&nbsp;V&nbsp;]</a><a href=\"#W\">[&nbsp;W&nbsp;]</a><a\r\n" + 
		"href=\"#X\">[&nbsp;X&nbsp;]</a><a href=\"#Y\">[&nbsp;Y&nbsp;]</a><a\r\n" + 
		"href=\"#Z\">[&nbsp;Z&nbsp;]</a>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"<hr>\r\n" + 
		"<p>\r\n" + 
		"<a name=\"A\"></a> A    <a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=abs></a>\r\n" + 
		"<b>abs(n)</b><br>\r\n" + 
		"Returns the absolute value of <i>n</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=acos></a>\r\n" + 
		"<b>acos(n)</b><br>\r\n" + 
		"Returns the inverse cosine (in radians) of <i>n</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=Array></a>\r\n" + 
		" <b>Array Functions</b><br>\r\n" + 
		"These functions operate on arrays. Refer to the\r\n" + 
		"<a href=\"../../macros/examples/ArrayFunctions.txt\">ArrayFunctions</a>\r\n" + 
		"macro for examples.\r\n" + 
		"<p>\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Array.concat></a>\r\n" + 
		"<b>Array.concat(array1,array2)</b> - \r\n" + 
		"Returns a new array created by joining two or more arrays or values\r\n" + 
		"(<a href=\"../../macros/examples/ArrayConcatExamples.txt\">examples</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.copy></a>\r\n" + 
		"<b>Array.copy(array)</b> - \r\n" + 
		"Returns a copy of <i>array</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.fill></a>\r\n" + 
		"<b>Array.fill(array, value)</b> - \r\n" + 
		"Assigns the specified numeric value to each element of <i>array</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.findMaxima></a>\r\n" + 
		"<b>Array.findMaxima(array, tolerance)</b> - \r\n" + 
		"Returns an array holding the peak positions\r\n" + 
		"(sorted with descending strength). 'Tolerance' is the minimum amplitude difference\r\n" + 
		"needed to separate two peaks. With v1.51n and later, there is an optional\r\n" + 
		"'edgeMode' argument: 0=include edges, 1=exclude edges(default), 2=circular array.\r\n" + 
		"<a href=\"../../macros/examples/FindMaxima1D.txt\">Examples</a>.<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.findMinima></a>\r\n" + 
		"<b>Array.findMinima(array, tolerance)</b> - \r\n" + 
		"Returns an array holding the minima positions.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.fourier></a>\r\n" + 
		"<b>Array.fourier(array, windowType)</b> - \r\n" + 
		"Calculates and returns the Fourier amplitudes of <i>array</i>.\r\n" + 
		"<i>WindowType</i> can be \"none\", \"Hamming\", \"Hann\",\r\n" + 
		"or \"flat-top\", or may be omitted (meaning \"none\").\r\n" + 
		"See the <a href=\"../../macros/examples/TestArrayFourier.txt\">TestArrayFourier</a>\r\n" + 
		"macro for an example and more documentation.\r\n" + 
		"Requires 1.49i.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.getSequence></a>\r\n" + 
		"<b>Array.getSequence(n)</b> - \r\n" + 
		"Returns an array containing the numeric sequence 0,1,2...n-1.\r\n" + 
		"Requires 1.49u.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.getStatistics></a>\r\n" + 
		"<b>Array.getStatistics(array, min, max, mean, stdDev)</b> - \r\n" + 
		"Returns the <i>min</i>, <i>max</i>, <i>mean</i>, and <i>stdDev</i> of <i>array</i>,\r\n" + 
		"which must contain all numbers.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.print></a>\r\n" + 
		"<b>Array.print(array)</b> - \r\n" + 
		"Prints the array on a single line.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.rankPositions></a>\r\n" + 
		"<b>Array.rankPositions(array)</b> - \r\n" + 
		"Returns, as an array, the rank position indexes of <i>array</i>, starting with the index of the smallest value\r\n" + 
		"(<a href=\"../../macros/examples/ArraySortingDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.resample></a>\r\n" + 
		"<b>Array.resample(array,len)</b> - \r\n" + 
		"Returns an array which is linearly resampled to a different length.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.reverse></a>\r\n" + 
		"<b>Array.reverse(array)</b> - \r\n" + 
		"Reverses (inverts) the order of the elements in <i>array</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.show></a>\r\n" + 
		"<b>Array.show(array)</b> - \r\n" + 
		"Displays the contents of <i>array</i> in a window.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Array.show(\"title\", array1, array2, ...)</b> - \r\n" + 
		"Displays one or more arrays in a Results window\r\n" + 
		"(<a href=\"../../macros/examples/ShowArrayDemo.txt\">examples</a>).\r\n" + 
		"If <i>title</i> (optional) is \"Results\", the window will be the active Results\r\n" + 
		"window, otherwise, it will be a dormant Results window\r\n" + 
		"(see also <a href=\"#IJ.renameResults\">IJ.renameResults</a>).\r\n" + 
		"If <i>title</i> ends with \"(indexes)\", a 0-based Index column is shown.\r\n" + 
		"If <i>title</i> ends with \"(row numbers)\", the row number column is shown.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.slice></a>\r\n" + 
		"<b>Array.slice(array,start,end)</b> - \r\n" + 
		"Extracts a part of an array and returns it.\r\n" + 
		"(<a href=\"../../macros/examples/ArraySliceExamples.txt\">examples</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.sort></a>\r\n" + 
		"<b>Array.sort(array)</b> - \r\n" + 
		"Sorts <i>array</i>, which must contain all numbers or all strings.\r\n" + 
		"String sorts are case-insensitive in v1.44i or later.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.trim></a>\r\n" + 
		"<b>Array.trim(array, n)</b> - \r\n" + 
		"Returns an array that contains the first <i>n</i> elements of <i>array</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.rotate></a>\r\n" + 
		"<b>Array.rotate(array, d)</b> - \r\n" + 
		"Rotates the array elements by 'd' steps (positive 'd' = rotate right). Requires 1.51n.\r\n" + 
		"<a href=\"../../macros/examples/RotateArray.txt\">Examples</a>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Array.getVertexAngles></a>\r\n" + 
		"<b>Array.getVertexAngles(xArr, yArr, arm)</b> - \r\n" + 
		"From a closed contour given by 'xArr', 'yArr', an array is returned holding vertex angles in degrees (straight=0, convex = positive if contour is clockwise). Set 'arm'=1 to calculate the angle from the closest vertex points left and right, or use arm&gt;1 for more distant neighbours and smoother results.\r\n" + 
		"Requires 1.51n.\r\n" + 
		"<a href=\"../../macros/examples/VertexAngles.txt\">Examples</a>.<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=asin></a>\r\n" + 
		"<b>asin(n)</b><br>\r\n" + 
		"Returns the inverse sine (in radians) of <i>n</i>.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=atan></a>\r\n" + 
		"<b>atan(n)</b><br>\r\n" + 
		"Calculates the inverse tangent (arctangent) of <i>n</i>. Returns \r\n" + 
		"a value in the range -PI/2 through PI/2.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=atan2></a>\r\n" + 
		"<b>atan2(y, x)</b><br>\r\n" + 
		"Calculates the inverse tangent of <i>y/x</i> and returns an angle in the \r\n" + 
		"range -PI to PI, using the signs of the arguments \r\n" + 
		"to determine the quadrant. Multiply the result by 180/PI to convert to degrees.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=autoUpdate></a>\r\n" + 
		"<b>autoUpdate(boolean)</b><br>\r\n" + 
		"If <i>boolean</i> is true, the display is refreshed each time lineTo(), drawLine(),  \r\n" + 
		"drawString(), etc. are called, otherwise, the display is refreshed only when updateDisplay() \r\n" + 
		"is called or when the macro terminates.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> B  </b><a name = B><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=beep></a>\r\n" + 
		"<b>beep()</b><br>\r\n" + 
		"Emits an audible beep.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=butDepth></a>\r\n" + 
		"<b>bitDepth() </b><br> \r\n" + 
		"Returns the bit depth of the active image: 8, 16, 24 (RGB) or 32 (float).\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		" <b> C  </b><a name = C><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=calibrate></a>\r\n" + 
		"<b>calibrate(value)</b><br>\r\n" + 
		"Uses the calibration function of the active image to convert a raw pixel value \r\n" + 
		"to a density calibrated value.  The argument must be an integer in the range 0-255 \r\n" + 
		"(for 8-bit images) or 0-65535 (for 16-bit images). Returns the same value if the active \r\n" + 
		"image does not have a calibration function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=call></a>\r\n" + 
		"<b>call(\"class.method\", arg1, arg2, ...)</b><br>\r\n" + 
		"Calls a public static method in a Java class, passing an arbitrary number\r\n" + 
		"of string arguments, and returning a string. Refer to the\r\n" + 
		"<a href=\"../../macros/CallJavaDemo.txt\">CallJavaDemo</a> macro\r\n" + 
		"and the <a href=\"../../plugins/imp-props.html\">ImpProps</a>\r\n" + 
		"plugin for examples. Note that the call() function does not work when ImageJ is \r\n" + 
		"running as an unsigned applet.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=changeValues></a>\r\n" + 
		"<b>changeValues(v1, v2, v3)</b><br>\r\n" + 
		"Changes pixels in the image or selection that have a value in the range <i>v1</i>-<i>v2</i> \r\n" + 
		"to <i>v3</i>. For example, <i>changeValues(0,5,5)</i> changes all pixels less than 5 to 5, \r\n" + 
		"and <i>changeValues(0x0000ff,0x0000ff,0xff0000)</i> changes all blue pixels in an RGB image to red.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=charCodeAt></a>\r\n" + 
		"<b>charCodeAt(string, index)</b><br>\r\n" + 
		"Returns the Unicode value of the character at the specified index in <i>string</i>. \r\n" + 
		"Index values can range from 0 to lengthOf(<i>string</i>). Use the fromCharCode() function\r\n" + 
		"to convert one or more Unicode characters to a string.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=close></a>\r\n" + 
		"<b>close()</b><br>\r\n" + 
		"Closes the active image.  This function has the advantage of not closing the \"Log\"\r\n" + 
		"or \"Results\" window when you meant to close the active image. Use\r\n" + 
		"<i>run(\"Close\")</i> to close non-image windows.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>close(pattern)</b><br>\r\n" + 
		"Closes all image windows whose title matches <i>pattern</i>. <i>Pattern</i> may contain the wildcard\r\n" + 
		"characters \"*\" (matches any character sequence) or \"?\" (matches any single character).\r\n" + 
		"For example, close(\"Histo*\") could be used to dispose all histogram windows.  The front\r\n" + 
		"image remains in front if it still exists. <i>Pattern</i> is not case sensitive. Use close(\"\\\\Others\")\r\n" + 
		"to close all except the front image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=cos></a>\r\n" + 
		"<b>cos(angle)</b><br>\r\n" + 
		"Returns the cosine of an angle (in radians).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> D  </b><a name = D><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=d2s></a>\r\n" + 
		"<b>d2s(n, decimalPlaces)</b><br>\r\n" + 
		"Converts the number <i>n</i> into a string using the specified\r\n" + 
		"number of decimal places.\r\n" + 
		"Uses scientific notation if 'decimalPlaces is negative.\r\n" + 
		"Note that d2s stands for \"double to string\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=dialog></a>\r\n" + 
		"<b>Dialog.create(\"Title\")</b><br>\r\n" + 
		"Creates a dialog box with the specified title. Call <i>Dialog.addString()</i>, <i>Dialog.addNumber(),</i> etc. to \r\n" + 
		"add components to the dialog. Call <i>Dialog.show()</i> to display the dialog and <i>Dialog.getString()</i>, \r\n" + 
		"<a name=Dialog.getNumber></a>\r\n" + 
		"<i>Dialog.getNumber()</i>, etc. to retrieve the values entered by the user.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/DialogDemo.txt\">DialogDemo</a>\r\n" + 
		"macro for an example.\r\n" + 
		"<p>\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Dialog.addMessage></a>\r\n" + 
		"<b>Dialog.addMessage(string)</b> - \r\n" + 
		"Adds a message to the dialog.</i> The message can be broken into multiple\r\n" + 
		"lines by inserting new line characters (\"\\n\") into the string.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addString></a>\r\n" + 
		"<b>Dialog.addString(label, initialText)</b> -\r\n" + 
		"Adds a text field to the dialog, using the specified label and initial text.\r\n" + 
		"<br>\r\n" + 
		"<b>Dialog.addString(label, initialText, columns)</b> -\r\n" + 
		"Adds a text field to the dialog, where <i>columns</i> specifies the field \r\n" + 
		"width in characters.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addNumber></a>\r\n" + 
		"<b>Dialog.addNumber(label, default)</b> -\r\n" + 
		"Adds a numeric field to the dialog, using the specified label and default value.\r\n" + 
		"<br>\r\n" + 
		"<b>Dialog.addNumber(label, default, decimalPlaces, columns, units)</b> -\r\n" + 
		"Adds a numeric field, using the specified label and default value. <i>DecimalPlaces</i>\r\n" + 
		"specifies the number of digits to right of decimal point, <i>columns</i> specifies the the field \r\n" + 
		"width in characters and <i>units</i> is a string that is displayed to \r\n" + 
		"the right of the field.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addSlider></a>\r\n" + 
		"<b>Dialog.addSlider(label, min, max, default)</b> -\r\n" + 
		"Adds a slider controlled numeric field to the dialog, using the specified label,\r\n" + 
		"and min, max and default values\r\n" + 
		"(<a href=\"../../macros/examples/SliderDemo.txt\">example</a>).\r\n" + 
		"Values with decimal points are used when \r\n" + 
		"(max-min)<=5 and min, max or default\r\n" + 
		"are non-integer.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addCheckbox></a>\r\n" + 
		"<b>Dialog.addCheckbox(label, default)</b> -\r\n" + 
		"Adds a checkbox to the dialog, using the specified label and default state (true or false).\r\n" + 
		"<br>\r\n" + 
		"<b>Dialog.addCheckboxGroup(rows, columns, labels, defaults)</b> -\r\n" + 
		"Adds a <i>rows</i>x<i>columns</i> grid of checkboxes to the dialog, using the specified labels and default states\r\n" + 
		"(<a href=\"../../macros/AddCheckboxGroupDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addRadioButtonGroup></a>\r\n" + 
		"<b>Dialog.addRadioButtonGroup(label, items, rows, columns, default)</b> -\r\n" + 
		"Adds a group of radio buttons to the dialog, where 'label' is the group label, 'items' is\r\n" + 
		"an array containing the button labels, 'rows' and 'columns' specify the grid size, and\r\n" + 
		"'default' is the label of the default button.\r\n" + 
		"(<a href=\"../../macros/examples/RadioButtonDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addChoice></a>\r\n" + 
		"<b>Dialog.addChoice(label, items)</b> -\r\n" + 
		"Adds a popup menu to the dialog, where <i>items</i> is a string array containing the menu items.\r\n" + 
		"<br>\r\n" + 
		"<b>Dialog.addChoice(label, items, default)</b> -\r\n" + 
		"Adds a popup menu, where <i>items</i> is a string array containing the choices\r\n" + 
		"and <i>default</i> is the default choice.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.addHelp></a>\r\n" + 
		"<b>Dialog.addHelp(url)</b> -\r\n" + 
		"Adds a \"Help\" button that opens the specified URL in the default browser. This can be used to supply\r\n" + 
		"a help page for this dialog or macro. With v1.46b or later, displays an HTML formatted message if\r\n" + 
		"'url' starts with \"&lt;html&gt;\"\r\n" + 
		"(<a href=\"../../macros/examples/DialogWithHelp.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.setInsets></a>\r\n" + 
		"<b>Dialog.setInsets(top, left, bottom)</b> -\r\n" + 
		"Overrides the default insets (margins) used for the next component added to the dialog.<br>\r\n" + 
		"<small>\r\n" + 
		"Default insets:<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addMessage: 0,20,0 (empty string) or 10,20,0<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addCheckbox: 15,20,0 (first checkbox) or 0,20,0<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addCheckboxGroup: 10,0,0<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addNumericField: 5,0,3 (first field) or 0,0,3<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addStringField: 5,0,5 (first field) or 0,0,5<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;addChoice: 5,0,5 (first field) or 0,0,5<br>\r\n" + 
		"</small>\r\n" + 
		"<a name=Dialog.setLocation></a>\r\n" + 
		"<b>Dialog.setLocation(x,y)</b> -\r\n" + 
		"Sets the screen location where this dialog will be displayed.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.show></a>\r\n" + 
		"<b>Dialog.show()</b> -\r\n" + 
		"Displays the dialog and waits until the user clicks \"OK\" or \"Cancel\". The macro \r\n" + 
		"terminates if the user clicks \"Cancel\".\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.getString></a>\r\n" + 
		"<b>Dialog.getString()</b> -\r\n" + 
		"Returns a string containing the contents of the next text field.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.getNumber></a>\r\n" + 
		"<b>Dialog.getNumber()</b> -\r\n" + 
		"Returns the contents of the next numeric field.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.getCheckbox></a>\r\n" + 
		"<b>Dialog.getCheckbox()</b> -\r\n" + 
		"Returns the state (true or false) of the next checkbox.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.getChoice></a>\r\n" + 
		"<b>Dialog.getChoice()</b> -\r\n" + 
		"Returns the selected item (a string) from the next popup menu.\r\n" + 
		"<br>\r\n" + 
		"<a name=Dialog.getRadioButton></a>\r\n" + 
		"<b>Dialog.getRadioButton()</b> -\r\n" + 
		"Returns the selected item (a string) from the next radio button group.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=doCommand></a>\r\n" + 
		"<b>doCommand(\"Command\")</b><br>\r\n" + 
		"Runs an ImageJ menu command in a separate thread and returns immediately. As an example, \r\n" + 
		"<i>doCommand(\"Start Animation\")</i> starts animating the current stack in a separate \r\n" + 
		"thread and the macro continues to execute. Use <i>run(\"Start Animation\")</i> and the \r\n" + 
		"macro hangs until the user stops the animation.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=doWand></a>\r\n" + 
		"<b>doWand(x, y)</b><br>\r\n" + 
		"Equivalent to clicking on the current image at (x,y) with the wand tool.\r\n" + 
		"Note that some objects, especially one pixel wide lines,\r\n" + 
		"may not be reliably traced unless they have been thresholded (highlighted in red) \r\n" + 
		"using <a href=\"#setThreshold\">setThreshold</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>doWand(x, y, tolerance, mode)</b><br>\r\n" + 
		"Traces the boundary of the area with pixel values within\r\n" + 
		"'tolerance' of the value of the pixel at (x,y).\r\n" + 
		"'mode' can be \"4-connected\", \"8-connected\" or \"Legacy\".\r\n" + 
		"\"Legacy\" is for compatibility with previous versions of ImageJ;\r\n" + 
		"it is ignored if 'tolerance' > 0.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=drawLine></a>\r\n" + 
		"<b>drawLine(x1, y1, x2, y2)</b><br>\r\n" + 
		"Draws a line between (x1, y1) and (x2, y2). Use setColor() to \r\n" + 
		"specify the color of the line and setLineWidth() to vary the line width.\r\n" + 
		"See also:  <a href=\"#Overlay\">Overlay.drawLine</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=drawOval></a>\r\n" + 
		"<b>drawOval(x, y, width, height)</b><br>\r\n" + 
		"Draws the outline of an oval using the current color and line width.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#fillOval\">fillOval</a>, \r\n" + 
		"<a href=\"#setColor\">setColor</a>, \r\n" + 
		"<a href=\"#setLineWidth\">setLineWidth</a>, \r\n" + 
		"<a href=\"#autoUpdate\">autoUpdate</a> and\r\n" + 
		"<a href=\"#Overlay\">Overlay.drawEllipse</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=drawRect></a>\r\n" + 
		"<b>drawRect(x, y, width, height)</b><br>\r\n" + 
		"Draws the outline of a rectangle using the current color and line width.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#fillRect\">fillRect</a>, \r\n" + 
		"<a href=\"#setColor\">setColor</a>, \r\n" + 
		"<a href=\"#setLineWidth\">setLineWidth</a>, \r\n" + 
		"<a href=\"#autoUpdate\">autoUpdate</a> and\r\n" + 
		"<a href=\"#Overlay\">Overlay.drawRect</a>\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=drawString></a>\r\n" + 
		"<b>drawString(\"text\", x, y)</b><br>\r\n" + 
		"Draws text at the specified location. \r\n" + 
		"Call <a href=\"#setFont\">setFont()</a>\r\n" + 
		"to specify the font.\r\n" + 
		"Call <a href=\"#setJustification\">setJustification()</a>\r\n" + 
		"to have the text centered or right justified.\r\n" + 
		"Call <a href=\"#getStringWidth\">getStringWidth()</a> to get the width of the\r\n" + 
		"text in pixels.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/TextDemo.txt\">TextDemo</a> macro for examples\r\n" + 
		"and to\r\n" + 
		"<a href=\"../../macros/examples/DrawTextWithBackground.txt\">DrawTextWithBackground</a>\r\n" + 
		"to see how to draw text with a background.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>drawString(\"text\", x, y, background)</b><br>\r\n" + 
		"Draws text at the specified location with a filled background\r\n" + 
		"(<a href=\"../../macros/examples/DrawTextWithBackground.txt\">examples</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=dump></a>\r\n" + 
		"<b>dump()</b><br>\r\n" + 
		"Writes the contents of the symbol table, the tokenized macro code and the variable stack to the \"Log\" window.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> E  </b><a name = E><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=endsWith></a>\r\n" + 
		"<b>endsWith(string, suffix)</b><br>\r\n" + 
		"Returns <i>true</i> (1) if <i>string</i> ends with <i>suffix</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#startsWith\">startsWith</a>, \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>,\r\n" + 
		"<a href=\"#substring\">substring</a>,\r\n" + 
		"<a href=\"#matches\">matches</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=eval></a>\r\n" + 
		"<b>eval(macro)</b><br>\r\n" + 
		"Evaluates (runs) one or more lines of macro code. An optional\r\n" + 
		"second argument can be used to pass a string to the macro\r\n" + 
		"being evaluated.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"../../macros/EvalDemo.txt\">EvalDemo</a> macro and\r\n" + 
		"<a href=\"#runMacro\">runMacro</a> function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>eval(\"script\", javascript)</b><br>\r\n" + 
		"Evaluates the\r\n" + 
		"<a href=\"../javascript.html\">JavaScript</a>\r\n" + 
		"code contained in the string <i>javascript</i>, for example\r\n" + 
		"<i>eval(\"script\",\"IJ.getInstance().setAlwaysOnTop(true);\")</i>.\r\n" + 
		"See also: <a href=\"#runMacro\">runMacro(path,arg)</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>eval(\"bsh\", script)</b><br>\r\n" + 
		"Evaluates the\r\n" + 
		"<a href=\"../../plugins/bsh/index.html\">BeanShell</a>\r\n" + 
		"code contained in the string <i>script</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>eval(\"python\", script)</b><br>\r\n" + 
		"Evaluates the\r\n" + 
		"<a href=\"../../plugins/jython/index.html\">Python</a>\r\n" + 
		"code contained in the string <i>script</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=exec></a>\r\n" + 
		"<b>exec(string or strings)</b><br>\r\n" + 
		"Executes a native command and returns the output of that command\r\n" + 
		"as a string. Also opens Web pages in the default browser and documents\r\n" + 
		"in other applications (e.g., Excel).\r\n" + 
		"With commands with multiple arguments, each argument should be passed as a separate string. For example<br>\r\n" + 
		"&nbsp;&nbsp;&nbsp;<i>exec(\"open\", \"/Users/wayne/test.jpg\", \"-a\", \"/Applications/Gimp.app\");</i><br>\r\n" + 
		" Refer to the \r\n" + 
		"<a href=\"../../macros/ExecExamples.txt\">ExecExamples</a>\r\n" + 
		"macro for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=exit></a>\r\n" + 
		"<b>exit() or exit(\"error message\")</b><br>\r\n" + 
		"Terminates execution of the macro and, optionally, displays an error message. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=exp></a>\r\n" + 
		"<b>exp(n)</b><br>\r\n" + 
		"Returns the exponential number e (i.e., 2.718...) raised to the power of <i>n</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=ext></a>\r\n" + 
		"<a name=Ext></a>\r\n" + 
		"<b>Ext (Macro Extension) Functions</b><br>\r\n" + 
		"These are functions that have been added to the macro language by plugins using\r\n" + 
		"the MacroExtension interface. The\r\n" + 
		"<a href=\"../../plugins/5d-extensions.html\">Image5D_Extensions</a>\r\n" + 
		"plugin, for example, adds functions that work with Image5D. The\r\n" + 
		"<a href=\"http://imagejdocu.tudor.lu/doku.php?id=plugin:utilities:serial_macro_extensions:start\">Serial Macro Extensions</a>\r\n" + 
		"plugin adds functions, such as Ext.open(\"COM8\",9600,\"\") and Ext.write(\"a\"), that talk to serial devices.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> F  </b><a name = F><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=file></a>\r\n" + 
		" <b>File Functions</b><br>\r\n" + 
		"These functions allow you to get information about a file, read or write a text file,\r\n" + 
		"create a directory, or to delete, rename or move a file or directory.\r\n" + 
		"Note that these functions return a string, with the exception of\r\n" + 
		"<i>File.length</i>, <i>File.exists</i>, <i>File.isDirectory</i>, <i>File.rename</i>\r\n" + 
		"and <i>File.delete</i> when used in an assignment statement,\r\n" + 
		"for example \"length=File.length(path)\".\r\n" + 
		"The\r\n" + 
		"<a href=\"../../macros/FileDemo.txt\">FileDemo</a>\r\n" + 
		"macro demonstrates how to use these functions.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getDirectory\">getDirectory</a> and\r\n" + 
		"<a href=\"#getFileList\">getFileList</a>.\r\n" + 
		"<p>\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=File.append></a>\r\n" + 
		"<b>File.append(string, path)</b> - \r\n" + 
		"Appends <i>string</i> to the end of the specified file.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.close></a>\r\n" + 
		"<b>File.close(f)</b> - \r\n" + 
		"Closes the specified file, which must have been opened using File.open().\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.copy></a>\r\n" + 
		"<b>File.copy(path1, path2)</b> - \r\n" + 
		"Copies a file.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.dateLastModified></a>\r\n" + 
		"<b>File.dateLastModified(path)</b> - \r\n" + 
		"Returns the date and time the specified file was last modified.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.delete></a>\r\n" + 
		"<b>File.delete(path)</b> - \r\n" + 
		"Deletes the specified file or directory. With v1.41e or later, returns \"1\" (true)\r\n" + 
		"if the file or directory was successfully deleted.\r\n" + 
		"If the file is a directory, it must be empty.\r\n" + 
		"The file must be in the user's home directory,  the ImageJ directory\r\n" + 
		"or the temp directory.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.directory></a>\r\n" + 
		"<b>File.directory</b> - \r\n" + 
		"The directory path of the last file opened using a file open dialog, a file save dialog,\r\n" + 
		"drag and drop, or the <a href=\"#open\">open(path)</a> function.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.exists></a>\r\n" + 
		"<b>File.exists(path)</b> - \r\n" + 
		"Returns \"1\" (true) if the specified file exists.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.getName></a>\r\n" + 
		"<b>File.getName(path)</b> - \r\n" + 
		"Returns the last name in <i>path</i>'s name  sequence.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.getParent></a>\r\n" + 
		"<b>File.getParent(path)</b> - \r\n" + 
		"Returns the parent of the file specified by <i>path</i>.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.getDirectory></a>\r\n" + 
		"<b>File.isDirectory(path)</b> - \r\n" + 
		"Returns \"1\" (true) if the specified file is a directory.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.lastModified></a>\r\n" + 
		"<b>File.lastModified(path)</b> - \r\n" + 
		"Returns the time the specified file was last modified as\r\n" + 
		"the number of milliseconds since January 1, 1970.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.length></a>\r\n" + 
		"<b>File.length(path)</b> - \r\n" + 
		"Returns the length in bytes of the specified file as a string, or as\r\n" + 
		"a number when used in an assignment statement, \r\n" + 
		"for example \"length=File.length(path)\".\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.makeDirectory></a>\r\n" + 
		"<b>File.makeDirectory(path)</b> - \r\n" + 
		"Creates a directory.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.name></a>\r\n" + 
		"<b>File.name</b> - \r\n" + 
		"The name of the last file opened using a file open dialog, a file save dialog,\r\n" + 
		"drag and drop, or the <a href=\"#open\">open(path)</a> function.<br>\r\n" + 
		"\r\n" + 
		"<a name=File.nameWithoutExtension></a>\r\n" + 
		"<b>File.nameWithoutExtension</b> - \r\n" + 
		"The name of the last file opened with the extension removed.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.open></a>\r\n" + 
		"<b>File.open(path)</b> - \r\n" + 
		"Creates a new text file and returns a file variable that refers to it. To write to the file, \r\n" + 
		"pass the file variable to the\r\n" + 
		"<a href=\"#print\">print</a> function.\r\n" + 
		"Displays a file save dialog box if <i>path</i> is an empty string.\r\n" + 
		"The file is closed when the macro exits.\r\n" + 
		"Currently, only one file can be open at a time.\r\n" + 
		"For an example, refer to the\r\n" + 
		"<a href=\"../../macros/SaveTextFileDemo.txt\">SaveTextFileDemo</a> macro.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.openAsString></a>\r\n" + 
		"<b>File.openAsString(path)</b> - \r\n" + 
		"Opens a text file and returns the contents as a string. Displays a file \r\n" + 
		"open dialog box if <i>path</i> is an empty string. \r\n" + 
		"Use <i>lines=split(str,\"\\n\")</i> to convert the string to\r\n" + 
		"an array of lines.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.openAsRawString></a>\r\n" + 
		"<b>File.openAsRawString(path)</b> - \r\n" + 
		"Opens a file and returns up to the first 5,000 bytes as a string.\r\n" + 
		"Returns all the bytes in the file if the name ends with \".txt\".\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/First10Bytes.txt\">First10Bytes</a>\r\n" + 
		"and\r\n" + 
		"<a href=\"../../macros/ZapGremlins.txt\">ZapGremlins</a>\r\n" + 
		"macros for examples.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.openAsRawString></a>\r\n" + 
		"<b>File.openAsRawString(path, count)</b> - \r\n" + 
		"Opens a file and returns up to the first <i>count</i> bytes as a string.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.openUrlAsString></a>\r\n" + 
		"<b>File.openUrlAsString(url)</b> - \r\n" + 
		"Opens a URL and returns the contents as a string. Returns an emptly\r\n" + 
		"string if the host or file cannot be found. With v1.41i and later, returns \"&lt;Error: message&gt;\"\r\n" + 
		"if there any error, including host or file not found.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.openDialog></a>\r\n" + 
		"<b>File.openDialog(title)</b> - \r\n" + 
		"Displays a file open dialog and returns the path to the\r\n" + 
		"file choosen by the user\r\n" + 
		"(<a href=\"../../macros/OpenDialogDemo.txt\">example</a>). \r\n" + 
		"The macro exits if\r\n" + 
		"the user cancels the dialog.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.rename></a>\r\n" + 
		"<b>File.rename(path1, path2)</b> - \r\n" + 
		"Renames, or moves, a file or directory. Returns \"1\" (true) if successful.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.saveString></a>\r\n" + 
		"<b>File.saveString(string, path)</b> - \r\n" + 
		"Saves <i>string</i> as a file.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=File.separator></a>\r\n" + 
		"<b>File.separator</b> - \r\n" + 
		"Returns the file name separator character (\"/\" or \"\\\").<br>\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=fill></a>\r\n" + 
		"<b>fill()</b><br>\r\n" + 
		"Fills the image or selection with the current drawing color.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=fillOval></a>\r\n" + 
		"<b>fillOval(x, y, width, height)</b><br>\r\n" + 
		"Fills an oval bounded by the specified rectangle with the current drawing color.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#drawOval\">drawOval</a>, \r\n" + 
		"<a href=\"#setColor\">setColor</a>, \r\n" + 
		"<a href=\"#autoUpdate\">autoUpdate</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=fillRect></a>\r\n" + 
		"<b>fillRect(x, y, width, height)</b><br>\r\n" + 
		"Fills the specified rectangle with the current drawing color. \r\n" + 
		"See also: \r\n" + 
		"<a href=\"#drawRect\">drawRect</a>, \r\n" + 
		"<a href=\"#setColor\">setColor</a>, \r\n" + 
		"<a href=\"#autoUpdate\">autoUpdate</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=Fit></a>\r\n" + 
		" <b>Fit Functions</b><br>\r\n" + 
		" These functions do curve fitting.\r\n" + 
		"The\r\n" + 
		"<a href=\"../../macros/examples/CurveFittingDemo.txt\">CurveFittingDemo</a>\r\n" + 
		"macro demonstrates how to use them.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Fit.doFit></a>\r\n" + 
		"<b>Fit.doFit(equation, xpoints, ypoints)</b> - \r\n" + 
		"Fits the specified equation to the points defined by <i>xpoints</i>, <i>ypoints</i>. <i>Equation</i>\r\n" + 
		"can be either the equation name or an index. The equation names are shown in the drop down menu\r\n" + 
		" in the <i>Analyze&gt;Tools&gt;Curve Fitting</i> window. With ImageJ 1.42f or later, <i>equation</i> can\r\n" + 
		" be a string containing a user-defined equation\r\n" + 
		" (<a href=\"../../macros/examples/UserDefinedCurveFits.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Fit.doFit(equation, xpoints, ypoints, initialGuesses)</b> - \r\n" + 
		"Fits the specified equation to the points defined by <i>xpoints</i>, <i>ypoints</i>, using initial parameter\r\n" + 
		"values contained in <i>initialGuesses</i>, an array equal in length to the number of\r\n" + 
		"parameters in <i>equation</i>\r\n" + 
		"(<a href=\"../../macros/examples/RodbardSigmoidFit.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.rSquared></a>\r\n" + 
		"<b>Fit.rSquared</b> - \r\n" + 
		"Returns R^2=1-SSE/SSD, where SSE is the sum of the squares of the errors and\r\n" + 
		"SSD is the sum of the squares of the deviations about the mean.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.p></a>\r\n" + 
		"<b>Fit.p(index)</b> - \r\n" + 
		"Returns the value of the specified parameter.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.nParams></a>\r\n" + 
		"<b>Fit.nParams</b> - \r\n" + 
		"Returns the number of parameters.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.f></a>\r\n" + 
		"<b>Fit.f(x)</b> - \r\n" + 
		"Returns the y value at <i>x</i>\r\n" + 
		"(<a href=\"../../macros/examples/PlotSigmoidDerivatives.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.nEquations></a>\r\n" + 
		"<b>Fit.nEquations</b> - \r\n" + 
		"Returns the number of equations.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.getEquation></a>\r\n" + 
		"<b>Fit.getEquation(index, name, formula)</b> - \r\n" + 
		"Gets the name and formula of the specified equation.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.plot></a>\r\n" + 
		"<b>Fit.plot</b> - \r\n" + 
		"Plots the current curve fit.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.logResults></a>\r\n" + 
		"<b>Fit.logResults</b> - \r\n" + 
		"Causes doFit() to write a description of the curve fitting results to the Log window.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Fit.showDialog></a>\r\n" + 
		"<b>Fit.showDialog</b> - \r\n" + 
		"Causes doFit() to display the simplex settings dialog.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=floodFill></a>\r\n" + 
		"<b>floodFill(x, y)</b><br>\r\n" + 
		"Fills,  with the foreground color, pixels that are connected to, \r\n" + 
		"and the same color as, the pixel at <i>(x, y)</i>.  \r\n" + 
		"Does 8-connected filling if  there is an optional string argument containing \"8\", \r\n" + 
		"for example <i>floodFill(x, y, \"8-connected\")</i>.\r\n" + 
		"This function is used to implement the \r\n" + 
		"<A href=\"../../macros/tools/FloodFillTool.txt\">flood fill (paint bucket)</a> macro tool.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=floor></a>\r\n" + 
		"<b>floor(n)</b><br>\r\n" + 
		"Returns the largest value that is not greater than\r\n" + 
		"<i>n</i> and is equal to an integer.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#round\">round</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=fromCharCode></a>\r\n" + 
		"<b>fromCharCode(value1,...,valueN)</b><br>\r\n" + 
		"This function takes one or more Unicode values and returns a string. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> G  </b><a name = G><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=getArgument></a>\r\n" + 
		"<b>getArgument()</b><br>\r\n" + 
		"\r\n" + 
		"Returns the string argument passed to macros called by <a href=\"#runMacro\">runMacro(macro, arg)</a>, \r\n" + 
		"<a href=\"#eval\">eval(macro)</a>, \r\n" + 
		"<i>IJ.runMacro(macro, arg)</i> or <i>IJ.runMacroFile(path, arg)</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getBoolean></a>\r\n" + 
		"<b>getBoolean(\"message\")</b><br>\r\n" + 
		"Displays a dialog box containing the specified message and \"Yes\", \"No\" and \"Cancel\" buttons. \r\n" + 
		"Returns <i>true</i> (1) if the user clicks \"Yes\", returns <i>false</i> (0) if the user clicks\r\n" + 
		"\"No\" and exits the macro if the user clicks \"Cancel\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getBoolean(message, yesLabel, noLabel)</b><br>\r\n" + 
		"Displays a dialog box containing the specified message and buttons with custom labels.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getBoundingRect></a>\r\n" + 
		"<b>getBoundingRect(x, y, width, height)</b><br>\r\n" + 
		"Replace by <a href=\"#getSelectionBounds\">getSelectionBounds</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getCursorLoc></a>\r\n" + 
		"<b>getCursorLoc(x, y, z, modifiers)</b><br>\r\n" + 
		"Returns the cursor location in pixels and the mouse event modifier flags.\r\n" + 
		"The <i>z</i> coordinate is zero for 2D images. For stacks, it is one less than the \r\n" + 
		"slice number. Use <a href=\"#toScaled\">toScaled(x,y)</a> to scale the coordinates.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros//GetCursorLocDemo.txt\">GetCursorLocDemo</a>  and the\r\n" + 
		"<a href=\"../../macros/tools/GetCursorLocDemoTool.txt\">GetCursorLocDemoTool</a> macros.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getDateAndTime></a>\r\n" + 
		"<b>getDateAndTime(year, month, dayOfWeek, dayOfMonth, hour, minute, second, msec)</b><br>\r\n" + 
		"Returns the current date and time. Note that 'month' and 'dayOfWeek' are zero-based indexes.\r\n" + 
		"For an example, refer to the\r\n" + 
		"<a href=\"../../macros/GetDateAndTime.txt\">GetDateAndTime</a> macro.\r\n" + 
		"See also: <a href=\"#getTime\">getTime</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getDimensions></a>\r\n" + 
		"<b>getDimensions(width, height, channels, slices, frames)</b><br>\r\n" + 
		"Returns the dimensions of the current image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <a name=getDirectory></a>\r\n" + 
		"<b>getDirectory(string)</b><br>\r\n" + 
		"Displays a \"choose directory\" dialog and returns the selected directory, or returns\r\n" + 
		"the path to a specified directory, such as \"plugins\", \"home\", etc.\r\n" + 
		"The returned path ends with a file separator, either \"\\\" (Windows) or \"/\".\r\n" + 
		"Returns an empty string if the specified directory is not found or \r\n" + 
		"aborts the macro if the user cancels the \"choose directory\" dialog box.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/GetDirectoryDemo.txt\">GetDirectoryDemo</a> and\r\n" + 
		"<a href=\"../../macros/ListFilesRecursively.txt\">ListFilesRecursively</a> macros.\r\n" + 
		"See also: <a href=\"#getFileList\">getFileList</a> and the <a href=\"#file\">File functions</a>.\r\n" + 
		"\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=getDirectory></a>\r\n" + 
		"<b>getDirectory(\"Choose a Directory\")</b> - \r\n" + 
		"Displays a file open dialog, using the argument as a title, and\r\n" + 
		"returns the path to the directory selected by the user.<br>\r\n" + 
		"<b>getDirectory(\"plugins\")</b> - \r\n" + 
		"Returns the path to the plugins directory.<br>\r\n" + 
		"<b>getDirectory(\"macros\")</b> - \r\n" + 
		"Returns the path to the macros directory.<br>\r\n" + 
		"<b>getDirectory(\"luts\")</b> - \r\n" + 
		"Returns the path to the luts directory.<br>\r\n" + 
		"<b>getDirectory(\"image\")</b> - \r\n" + 
		"Returns the path to the directory that the active image was loaded from.<br>\r\n" + 
		"<b>getDirectory(\"imagej\")</b> - \r\n" + 
		"Returns the path to the ImageJ directory.<br>\r\n" + 
		"<b>getDirectory(\"startup\")</b> - \r\n" + 
		"Returns the path to the directory that ImageJ was launched from.<br>\r\n" + 
		"<b>getDirectory(\"home\")</b> - \r\n" + 
		"Returns the path to users home directory.<br>\r\n" + 
		"<b>getDirectory(\"temp\")</b> - \r\n" + 
		"Returns the path to the temporary directory (/tmp on Linux and Mac OS X).<br>\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=getDisplayedArea></a>\r\n" + 
		"<b>getDisplayedArea(x, y, width, height)</b><br>\r\n" + 
		"Returns the pixel coordinates of the actual displayed area of the image canvas.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/tools/Pixel_Sampler_Tool.txt\">Pixel Sampler Tool</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getFileList></a>\r\n" + 
		"<b>getFileList(directory)</b><br>\r\n" + 
		"Returns an array containing the names of the files in the specified directory path. \r\n" + 
		"The names of subdirectories have a \"/\" appended.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/ListFilesRecursively.txt\">ListFilesRecursively</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getFontList></a>\r\n" + 
		"<b>getFontList()</b><br>\r\n" + 
		"Returns an array containing the names of available system fonts\r\n" + 
		"(<a href=\"../../macros/Fonts.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getHeight></a>\r\n" + 
		"<b>getHeight()</b><br>\r\n" + 
		"Returns the height in pixels of the current image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getHistogram></a>\r\n" + 
		"<b>getHistogram(values, counts, nBins[, histMin, histMax])</b><br>\r\n" + 
		"Returns the histogram of the current image or selection.  <i>Values</i> is an array that will \r\n" + 
		"contain the pixel values for each of the histogram counts (or the bin starts for 16 and 32 bit images), or set this argument to 0.\r\n" + 
		"<i>Counts</i> is an array that\r\n" + 
		"will contain the histogram counts. <i>nBins</i> is the number of bins that will be used. \r\n" + 
		"It must be 256 for 8 bit and RGB image, or an integer \r\n" + 
		"greater than zero for 16 and 32 bit images. With 16-bit images, the <i>Values</i> argument\r\n" + 
		"is ignored if <i>nBins</i> is 65536.\r\n" + 
		"With 16-bit and 32-bit images, the histogram range can be specified\r\n" + 
		"using optional <i>histMin</i> and <i>histMax</i> arguments.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getStatistics\">getStatistics</a>,\r\n" + 
		"<a href=\"../../macros/HistogramLister.txt\">HistogramLister</a>,\r\n" + 
		"<a href=\"../../macros/HistogramPlotter.txt\">HistogramPlotter</a>,\r\n" + 
		"<a href=\"../../macros/StackHistogramLister.txt\">StackHistogramLister</a> and\r\n" + 
		"<a href=\"../../macros/CustomHistogram.txt\">CustomHistogram</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getImageID></a>\r\n" + 
		"<b>getImageID()</b><br>\r\n" + 
		"Returns the unique ID (a negative number) of the active image. Use the <i>selectImage(id)</i>, \r\n" + 
		"<i>isOpen(id)</i> and <i>isActive(id)</i> functions to activate an image or to determine if \r\n" + 
		"it is open or active. \r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getImageInfo></a>\r\n" + 
		"<b>getImageInfo()</b><br>\r\n" + 
		"Returns a string containing the text that would\r\n" + 
		"be displayed by the <i>Image&gt;Show Info</i> command. \r\n" + 
		"To retrieve the contents of a text window, use \r\n" + 
		"<a HREF=\"#getInfo\">getInfo(\"window.contents\")</a>. \r\n" + 
		"For an example, see the\r\n" + 
		"<a HREF=\"../../macros/ListDicomTags.txt\">ListDicomTags</a> macros.\r\n" + 
		"See also: <a href=\"#getMetadata\">getMetadata</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getInfo></a>\r\n" + 
		"<a name=font-name></a>\r\n" + 
		"<b>getInfo(\"command.name\")</b><br>\r\n" + 
		"Returns the name of the most recently invoked command. The names of commands invoked\r\n" + 
		"using keyboard shortcuts are preceded by \"^\"\r\n" + 
		"(<a href=\"../../macros/examples/GetCommandNameDemo.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(DICOM_TAG)</b><br>\r\n" + 
		"Returns the value of a DICOM tag in the form \"xxxx,xxxx\",\r\n" + 
		"e.g. getInfo(\"0008,0060\"). Returns an empty string if\r\n" + 
		"the current image is not a DICOM or if the tag was not found.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"font.name\")</b><br>\r\n" + 
		"Returns the name of the current font.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"image.description\")</b><br>\r\n" + 
		"Returns the TIFF image description tag, or an empty string\r\n" + 
		"if this is not a TIFF image or the image description is not\r\n" + 
		"available.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"image.directory\")</b><br>\r\n" + 
		"Returns the directory that the current image was loaded\r\n" + 
		"from, or an empty string if the directory is not available.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"image.filename\")</b><br>\r\n" + 
		"Returns the name of the file that the current image was loaded\r\n" + 
		"from, or an empty string if the file name is not available.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"image.subtitle\")</b><br>\r\n" + 
		"Returns the subtitle of the current image. This is the line of\r\n" + 
		"information displayed above the image and below the title bar.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"log\")</b><br>\r\n" + 
		"Returns the contents of the Log window,\r\n" + 
		"or \"\" if the Log window is not open.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"macro.filepath\")</b><br>\r\n" + 
		"Returns the filepath of the most recently loaded macro or script.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"micrometer.abbreviation\")</b><br>\r\n" + 
		"Returns \"&micro;m\", the abbreviation for micrometer.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"os.name\")</b><br>\r\n" + 
		"Returns the OS name (\"Mac OS X\", \"Linux\" or \"Windows\").\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"overlay\")</b><br>\r\n" + 
		"Returns information about the current image's overlay.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"selection.name\")</b><br>\r\n" + 
		"Returns the name of the current selection, or \"\" if there is no selection\r\n" + 
		"or the selection does not have a name. The argument can also be\r\n" + 
		"\"roi.name\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"selection.color\")</b><br>\r\n" + 
		"Returns the color of the current selection.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getInfo-label></a>\r\n" + 
		"<b>getInfo(\"slice.label\")</b><br>\r\n" + 
		"Return the label of the current stack slice. This is the string that \r\n" + 
		"appears in parentheses in the subtitle, the line of information \r\n" + 
		"above the image. Returns an empty\r\n" + 
		"string if the current image is not a stack or the current\r\n" + 
		"slice does not have a label.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"threshold.method\")</b><br>\r\n" + 
		"Returns the current thresholding method (\"IsoData\", \"Otsu\", etc).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"threshold.mode\")</b><br>\r\n" + 
		"Returns the current thresholding mode (\"Red\",\"B&W\" or\"Over/Under\").\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"window.contents\")</b><br>\r\n" + 
		"If the front window is a text window, returns the contents of that window. \r\n" + 
		"If the front window is an image, returns a string containing the text that would\r\n" + 
		"be displayed by <i>Image&gt;Show Info</i>.  Note that \r\n" + 
		"<a HREF=\"#getImageInfo\">getImageInfo()</a>\r\n" + 
		"is a more reliable way to retrieve information about an image.\r\n" + 
		"Use split(getInfo(),'\\n') to break the string returned by this function into separate lines.\r\n" + 
		"Replaces the getInfo() function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getInfo(\"window.type\")</b><br>\r\n" + 
		"Returns the type (\"Image\", \"Text\", \"ResultsTable\", \"Editor\", \"Plot\", \"Histogram\", etc.) of the front window.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getInfo-java></a>\r\n" + 
		"<b>getInfo(key)</b><br>\r\n" + 
		"Returns the Java property associated with the specified key (e.g., \"java.version\",\r\n" + 
		"\"os.name\", \"user.home\", \"user.dir\", etc.). Returns an empty string if there is\r\n" + 
		"no value associated with the key.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#getList-properties\">getList(\"java.properties\")</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getLine></a>\r\n" + 
		"<b>getLine(x1, y1, x2, y2, lineWidth)</b><br>\r\n" + 
		"Returns the starting coordinates, ending coordinates and width of the current straight line \r\n" + 
		"selection. The coordinates and line width are in pixels.\r\n" + 
		"Sets x1 = -1 if there is no line selection.\r\n" + 
		"Refer to the\r\n" + 
		"<a HREF=\"../../macros/GetLineDemo.txt\">GetLineDemo</a> macro for an example.\r\n" + 
		"See also: <a href=\"#makeLine\">makeLine</a>.<p>\r\n" + 
		"\r\n" + 
		"<a name=getList></a>\r\n" + 
		"\r\n" + 
		"<a name=getList-titles></a>\r\n" + 
		"<b>getList(\"image.titles\")</b><br>\r\n" + 
		"Returns a list (array) of image window titles.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/DisplayWindowTitles.txt\">DisplayWindowTitles</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getList(\"window.titles\")</b><br>\r\n" + 
		"Returns a list (array) of non-image window titles.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/DisplayWindowTitles.txt\">DisplayWindowTitles</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getList-properties></a>\r\n" + 
		"<b>getList(\"java.properties\")</b><br>\r\n" + 
		"Returns a list (array) of Java property keys.\r\n" + 
		"For an example, see the\r\n" + 
		"<a HREF=\"../../macros/DisplayJavaProperties.txt\">DisplayJavaProperties</a> macro.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#getInfo-java\">getInfo(key)</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getList-methods></a>\r\n" + 
		"<b>getList(\"threshold.methods\")</b><br>\r\n" + 
		"Returns a list of the available automatic thresholding methods\r\n" + 
		"(<a HREF=\"../../macros/examples/AutoThresholdingDemo.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getList-luts></a>\r\n" + 
		"<b>getList(\"LUTs\")</b><br>\r\n" + 
		"Returns, as an array, a list of the LUTs in the <i>Image&gt;Lookup Tables</i> menu\r\n" + 
		"(<a HREF=\"../../macros/Time-Lapse_Color_Coder.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getLocationAndSize></a>\r\n" + 
		"<b>getLocationAndSize(x, y, width, height)</b><br>\r\n" + 
		"Returns the location and size, in screen coordinates, of the active image window. Use \r\n" + 
		"<a href=\"#getWidth\">getWidth</a> and\r\n" + 
		"<a href=\"#getHeight\">getHeight</a>\r\n" + 
		"to get the width and height, in image coordinates, of the active image.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#setLocation\">setLocation</a>,\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getLut></a>\r\n" + 
		"<b>getLut(reds, greens, blues)</b><br>\r\n" + 
		"Returns three arrays containing the red, green and blue intensity values from the\r\n" + 
		"current lookup table. See the\r\n" + 
		"<a href=\"../../macros/LookupTables.txt\">LookupTables</a>\r\n" + 
		"macros for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getMetadata></a>\r\n" + 
		"<b>getMetadata(\"Info\")</b><br>\r\n" + 
		"Returns the metadata (a string) from the \"Info\" property of the current image.\r\n" + 
		"With DICOM images, this is the information (tags) in the DICOM header.\r\n" + 
		"See also: <a href=\"#setMetadata\">setMetadata</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>getMetadata(\"Label\")</b><br>\r\n" + 
		"Returns the current slice label.\r\n" + 
		"The first line of the this label (up to 60 characters) is display\r\n" + 
		"as part of the image subtitle. \r\n" + 
		"With DICOM stacks, returns the metadata from the DICOM header.\r\n" + 
		"See also: <a href=\"#setMetadata\">setMetadata</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getMinAndMax></a>\r\n" + 
		"<b>getMinAndMax(min, max)</b><br>\r\n" + 
		"Returns the minimum and maximum displayed pixel values (display range).\r\n" + 
		"See the\r\n" + 
		"<a href=\"../../macros/DisplayRangeMacros.txt\">DisplayRangeMacros</a>\r\n" + 
		"for examples.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getNumber></a>\r\n" + 
		"<b>getNumber(\"prompt\", defaultValue)</b><br>\r\n" + 
		"Displays a dialog box and returns the number entered by the user. \r\n" + 
		"The first argument is the prompting message and the second is the value initially \r\n" + 
		"displayed in the dialog. Exits the macro if the user clicks on \"Cancel\" in the dialog.\r\n" + 
		"Returns <i>defaultValue</i> if the user enters an invalid number.\r\n" + 
		"See also: <a href=\"#dialog\">Dialog.create</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getPixel></a>\r\n" + 
		"<b>getPixel(x, y)</b><br>\r\n" + 
		"Returns the value of the pixel at <i>(x,y)</i>. Note that pixels in RGB images\r\n" + 
		"contain red, green and blue components that need to be extracted using shifting\r\n" + 
		"and masking. See the <a href=\"../../macros/tools/ColorPickerTool.txt\">Color Picker Tool</a>\r\n" + 
		"macro for an example that shows how to do this.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getPixelSize></a>\r\n" + 
		"<b>getPixelSize(unit, pixelWidth, pixelHeight)</b><br>\r\n" + 
		"Returns the unit of length (as a string) and the pixel dimensions.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/ShowImageInfo.txt\">ShowImageInfo</a> macro.\r\n" + 
		"See also: <a href=\"#getVoxelSize\">getVoxelSize</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getProfile></a>\r\n" + 
		"<b>getProfile()</b><br>\r\n" + 
		"Runs <i>Analyze&gt;Plot Profile</i> (without displaying the plot) and returns the \r\n" + 
		"intensity values as an array. For an example, see the\r\n" + 
		"<a href=\"../../macros/GetProfileExample.txt\">GetProfileExample</a> macro.\r\n" + 
		"See also: <a href=\"#Plot.getValues\">Plot.getValues()</a>.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getRawStatistics></a>\r\n" + 
		"<b>getRawStatistics(nPixels, mean, min, max, std, histogram)</b><br>\r\n" + 
		"This function is similar to <a href=\"#getStatistics\">getStatistics</a> except that the values \r\n" + 
		"returned are uncalibrated and the histogram of\r\n" + 
		"16-bit images has a bin width of one and is returned as a <i>max</i>+1 element array.\r\n" + 
		"For examples, refer to the\r\n" + 
		"<a href=\"../../macros/ShowStatistics.txt\">ShowStatistics</a> macro set.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#calibrate\">calibrate</a> and\r\n" + 
		"<a href=\"#List.setMeasurements\">List.setMeasurements</a>\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"<a name=getResult></a>\r\n" + 
		"<b>getResult(\"Column\", row)</b><br>\r\n" + 
		"Returns a measurement from the ImageJ results table or NaN if the\r\n" + 
		"specified column is not found. The first \r\n" + 
		"argument specifies a column in the table. It must be a\r\n" + 
		"\"Results\" window column label, such as \"Area\", \"Mean\" or \"Circ.\".\r\n" + 
		"The second argument specifies the row, where 0&lt;=<i>row</i>&lt;nResults.\r\n" + 
		"<i>nResults</i> is a predefined variable that contains the current measurement \r\n" + 
		"count. (Actually, it's a built-in function with the \"()\" optional.) \r\n" + 
		"Omit the second argument and the row defaults to \r\n" + 
		"nResults-1 (the last row in the results table).\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#nResults\">nResults</a>,\r\n" + 
		"<a href=\"#setResult\">setResult</a>,\r\n" + 
		"<a href=\"#isNaN\">isNaN</a>,\r\n" + 
		"<a href=\"#getResultLabel\">getResultLabel</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getResultString></a>\r\n" + 
		"<b>getResultString(\"Column\", row)</b><br>\r\n" + 
		"Returns a string from the ImageJ results table or \"null\" if the\r\n" + 
		"specified column is not found. The first \r\n" + 
		"argument specifies a column in the table.\r\n" + 
		"The second specifies the row, where 0&lt;=<i>row</i>&lt;nResults.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getResultLabel></a>\r\n" + 
		"<b>getResultLabel(row)</b><br>\r\n" + 
		"Returns the label of the specified row in the results table, or an empty\r\n" + 
		"string if <i>Display Label</i> is not checked in <i>Analyze&gt;Set Measurements</i>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getSelectionBounds></a>\r\n" + 
		"<b>getSelectionBounds(x, y, width, height)</b><br>\r\n" + 
		"Returns the smallest rectangle that can completely contain the current selection. <i>x</i> and <i>y</i> \r\n" + 
		"are the pixel coordinates of the upper left corner of the rectangle. <i>width</i> and <i>height</i> are the width and \r\n" + 
		"height of the rectangle in pixels. If there is no selection, \r\n" + 
		"returns (0, 0, ImageWidth, ImageHeight). \r\n" + 
		"See also: <a href=\"#selectionType\">selectionType</a> and\r\n" + 
		"<a href=\"#setSelectionLocation\">setSelectionLocation</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getSelectionCoordinates></a>\r\n" + 
		"<b>getSelectionCoordinates(xpoints, ypoints)</b><br>\r\n" + 
		"Returns two arrays containing the X and Y coordinates, in pixels, of the\r\n" + 
		"points that define the current selection. See the\r\n" + 
		"<a href=\"../../macros/SelectionCoordinates.txt\">SelectionCoordinates</a>\r\n" + 
		"macro for an example.\r\n" + 
		"See also:\r\n" + 
		"\r\n" + 
		"<a href=\"#selectionType\">selectionType</a>,\r\n" + 
		"<a href=\"#getSelectionBounds\">getSelectionBounds</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getSliceNumber></a>\r\n" + 
		"<b>getSliceNumber()</b><br>\r\n" + 
		"Returns the number of the currently displayed stack image, an integer between 1 and \r\n" + 
		"<a href=\"#nSlices\">nSlices</a>.  Returns 1 if the active image is not a stack. \r\n" + 
		"See also:\r\n" + 
		"<a href=\"#setSlice\">setSlice</a>, <a href=\"#Stack.getPosition\">Stack.getPosition</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getStatistics></a>\r\n" + 
		"<b>getStatistics(area, mean, min, max, std, histogram)</b><br>\r\n" + 
		"Returns the area, average pixel value, minimum pixel value,\r\n" + 
		"maximum pixel value, standard deviation of the pixel values \r\n" + 
		"and histogram of the active image or selection. The histogram \r\n" + 
		"is returned  as a 256 element array. For 8-bit and RGB\r\n" + 
		"images, the histogram bin width is one. For 16-bit and 32-bit images,\r\n" + 
		"the bin width is (<i>max</i>-<i>min</i>)/256.\r\n" + 
		"For examples, refer to the\r\n" + 
		"<a href=\"../../macros/ShowStatistics.txt\">ShowStatistics</a> macro set.\r\n" + 
		"Note that trailing arguments can be omitted. For example, you can use <i>getStatistics(area)</i>, \r\n" + 
		"<i>getStatistics(area, mean)</i> or <i>getStatistics(area, mean, min, max)</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getRawStatistics\">getRawStatistics</a> and\r\n" + 
		"<a href=\"#List.setMeasurements\">List.setMeasurements</a>\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getString></a>\r\n" + 
		"<b>getString(\"prompt\", \"default\")</b><br>\r\n" + 
		"Displays a dialog box and returns the string entered by the user. \r\n" + 
		"The first argument is the prompting message and the second is the initial \r\n" + 
		"string value. Exits the macro if the user clicks on \"Cancel\" or enters an empty string.\r\n" + 
		"See also: <a href=\"#dialog\">Dialog.create</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getStringWidth></a>\r\n" + 
		"<b>getStringWidth(string)</b><br>\r\n" + 
		"Returns the width in pixels of the specified string. \r\n" + 
		"See also: <a href=\"#setFont\">setFont</a>, <a href=\"#drawString\">drawString</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getThreshold></a>\r\n" + 
		"<b>getThreshold(lower, upper)</b><br>\r\n" + 
		"Returns the lower and upper threshold levels. Both variables are set to -1 \r\n" + 
		"if the active image is not thresholded.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#setThreshold\">setThreshold</a>, \r\n" + 
		"<a href=\"#getThreshold\">getThreshold</a>, \r\n" + 
		"<a href=\"#resetThreshold\">resetThreshold</a>. \r\n" + 
		" <p>\r\n" + 
		"\r\n" + 
		"<a name=getTime></a>\r\n" + 
		"<b>getTime()</b><br>\r\n" + 
		"Returns the current time in milliseconds. The granularity of the time varies considerably \r\n" + 
		"from one platform to the next.  On Windows NT, 2K, XP it is about 10ms.  On other Windows\r\n" + 
		"versions it can be as poor as 50ms.  On many Unix platforms, including Mac OS X,  it \r\n" + 
		"actually is 1ms.\r\n" + 
		"See also: <a href=\"#getDateAndTime\">getDateAndTime</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getTitle></a>\r\n" + 
		"<b>getTitle()</b><br>\r\n" + 
		"Returns the title of the current image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getValue></a>\r\n" + 
		"<a name=get-foreground></a>\r\n" + 
		"<b>getValue(\"color.foreground\")</b><br>\r\n" + 
		"Returns the current foreground color as a value that can be passed to\r\n" + 
		"the <a href=\"#setColor\">setColor(value)</a> function.\r\n" + 
		"The value returned is the pixel value used by the <i>Edit&gt;Fill</i>\r\n" + 
		"command and by drawing tools.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=get-background></a>\r\n" + 
		"<b>getValue(\"color.background\")</b><br>\r\n" + 
		"Returns the current background color as a value that can be passed to\r\n" + 
		"the <a href=\"#setColor\">setColor(value)</a> function. \r\n" + 
		"The value returned is the pixel value used by the <i>Edit&gt;Clear</i>\r\n" + 
		"command.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=get-foreground></a>\r\n" + 
		"<b>getValue(\"rgb.foreground\")</b><br>\r\n" + 
		"Returns the current foregound color as an RGB pixel value\r\n" + 
		"(<a href=\"../../macros/examples/ForegroundBackgroundColors.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=get-background></a>\r\n" + 
		"<b>getValue(\"rgb.background\")</b><br>\r\n" + 
		"Returns the current backgound color as an RGB pixel value.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=font-size></a>\r\n" + 
		"<b>getValue(\"font.size\")</b><br>\r\n" + 
		"Returns the size, in points, of the current font.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=font-height></a>\r\n" + 
		"<b>getValue(\"font.height\")</b><br>\r\n" + 
		"Returns the height, in pixels, of the current font.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selection-width></a>\r\n" + 
		"<b>getValue(\"selection.width\")</b><br>\r\n" + 
		"Returns the stroke width of the current selection.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=results-count></a>\r\n" + 
		"<b>getValue(\"results.count\")</b><br>\r\n" + 
		"Returns the number of lines in the current results table. Unlike\r\n" + 
		"<a href=\"#nResults\">nResults</a>, works with tables that\r\n" + 
		"are not named \"Results\".\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getVoxelSize></a>\r\n" + 
		"<b>getVoxelSize(width, height, depth, unit)</b><br>\r\n" + 
		"Returns the voxel size and unit of length (\"pixel\", \"mm\", etc.) of the current \r\n" + 
		"image or stack.\r\n" + 
		"See also: <a href=\"#getPixelSize\">getPixelSize</a>, <a href=\"#setVoxelSize\">setVoxelSize</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getVersion></a>\r\n" + 
		"<b>getVersion()</b><br>\r\n" + 
		"Returns the ImageJ version number as a string (e.g., \"1.34s\").\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#requires\">requires</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=getWidth></a>\r\n" + 
		"<b>getWidth()</b><br>\r\n" + 
		"Returns the width in pixels of the current image.<p>\r\n" + 
		"\r\n" + 
		"<a name=getZoom></a>\r\n" + 
		"<b>getZoom()</b><br>\r\n" + 
		"Returns the magnification of the active image, a number in the range 0.03125 to 32.0\r\n" + 
		"(3.1% to 3200%).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> I  </b><a name = I><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=IJ></a>\r\n" + 
		" <b>IJ Functions</b><br>\r\n" + 
		" These functions provide access to miscellaneous methods in ImageJ's IJ class.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=IJ.deleteRows></a>\r\n" + 
		"<b>IJ.deleteRows(index1, index2)</b> - \r\n" + 
		"Deletes rows <i>index1</i> through <i>index2</i> in the results table.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.getToolName></a>\r\n" + 
		"<a name=getToolName></a>\r\n" + 
		"<b>IJ.getToolName()</b> - \r\n" + 
		"Returns the name of the currently selected tool.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setTool\">setTool</a>.\r\n" + 
		"\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.freeMemory></a>\r\n" + 
		"<b>IJ.freeMemory()</b> - \r\n" + 
		"Returns the memory status string (e.g., \"2971K of 658MB (<1%)\") that is displayed\r\n" + 
		"when the users clicks in the ImageJ status bar.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.currentMemory></a>\r\n" + 
		"<b>IJ.currentMemory()</b> - \r\n" + 
		"Returns, as a string, the amount of memory in bytes currently used by ImageJ.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.log></a>\r\n" + 
		"<b>IJ.log(string)</b> - \r\n" + 
		"Displays <i>string</i> in the Log window.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.maxMemory></a>\r\n" + 
		"<b>IJ.maxMemory()</b> - \r\n" + 
		"Returns, as a string, the amount of memory in bytes available to ImageJ. This value\r\n" + 
		"(the Java heap size) is set in the <i>Edit&gt;Options&gt;Memory & Threads</i> dialog box.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.pad></a>\r\n" + 
		"<b>IJ.pad(n, length)</b> - \r\n" + 
		"Pads 'n' with leading zeros and returns the result\r\n" + 
		"(<a href=\"../../macros/examples/StackOverlay.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.redirectErrorMessages></a>\r\n" + 
		"<b>IJ.redirectErrorMessages()</b> - \r\n" + 
		"Causes next image opening error to be redirected to the Log window\r\n" + 
		"and prevents the macro from being aborted\r\n" + 
		"(<a href=\"../../macros/examples/BatchMeasureWithRedirectedErrors.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=IJ.renameResults></a>\r\n" + 
		"<b>IJ.renameResults(name)</b> - \r\n" + 
		"Changes the title of the \"Results\" table to the string <i>name</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>IJ.renameResults(oldName,newName)</b> - \r\n" + 
		"Changes the title of a results table from <i>oldName</i> to <i>newName</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=imageCalculator></a>\r\n" + 
		"<b>imageCalculator(operator, img1, img2)</b><br>\r\n" + 
		"Runs the <i>Process&gt;Image Calculator</i> tool, where\r\n" + 
		"\r\n" + 
		"<i>operator</i> (\"add\",\"subtract\",\"multiply\",\"divide\", \"and\", \"or\", \"xor\", \"min\", \"max\", \"average\", \"difference\" or \"copy\") \r\n" + 
		"specifies the operation, and <i>img1</i> and <i>img2</i> specify the operands. <i>img1</i> and <i>img2</i> can be\r\n" + 
		"either an image title (a string) or an image ID (an integer). The <i>operator</i> string can include up to three modifiers: \r\n" + 
		"\"create\" (e.g., \"add create\") causes the result to\r\n" + 
		"be stored in a new window, \"32-bit\" causes the result to be 32-bit floating-point \r\n" + 
		"and \"stack\" causes the entire stack to be processed.\r\n" + 
		"See the <a href=\"../../macros/ImageCalculatorDemo.txt\">ImageCalculatorDemo</a> macros for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=indexOf></a>\r\n" + 
		"<b>indexOf(string, substring)</b><br>\r\n" + 
		"Returns the index within <i>string</i> of the first occurrence of\r\n" + 
		"<i>substring</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#lastIndexOf\">lastIndexOf</a>,\r\n" + 
		"<a href=\"#startsWith\">startsWith</a>, \r\n" + 
		"<a href=\"#endsWith\">endsWith</a>,\r\n" + 
		"<a href=\"#substring\">substring</a>,\r\n" + 
		"<a href=\"#toLowerCase\">toLowerCase</a>, \r\n" + 
		"<a href=\"#replace\">replace</a>,\r\n" + 
		"<a href=\"#matches\">matches</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>indexOf(string, substring, fromIndex)</b><br>\r\n" + 
		"Returns the index within <i>string</i> of the first occurrence of\r\n" + 
		"<i>substring</i>, with the search starting at <i>fromIndex</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=is></a>\r\n" + 
		"<b>is(\"animated\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is an animated stack.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"applet\")</b><br>\r\n" + 
		"Returns <i>true</i> if ImageJ is running as an applet.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"Batch Mode\")</b><br>\r\n" + 
		"Returns <i>true</i> if the macro interpreter is running in batch mode.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"binary\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is binary (8-bit with only 0 and 255 values).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"Caps Lock Set\")</b><br>\r\n" + 
		"Returns <i>true</i> if the caps lock key is set. Always return <i>false</i>\r\n" + 
		"on some platforms.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"changes\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image's 'changes' flag is set.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"composite\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is a a multi-channel\r\n" + 
		"stack that uses the CompositeImage class.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"global scale\")</b><br>\r\n" + 
		"Returns <i>true</i> if there is global spatial calibration.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"grayscale\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is grayscale, or\r\n" + 
		"an RGB image with identical R, G and B channels.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"Inverting LUT\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is using an inverting (monotonically decreasing) lookup table.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"locked\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is locked.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>is(\"Virtual Stack\")</b><br>\r\n" + 
		"Returns <i>true</i> if the current image is a virtual stack.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>isActive(id)</b><br>\r\n" + 
		"Returns <i>true</i> if the image with the specified ID is active.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=isKeyDown></a>\r\n" + 
		"<b>isKeyDown(key)</b><br>\r\n" + 
		"Returns <i>true</i> if the specified key is pressed, where <i>key</i> must be \"shift\", \"alt\" or \"space\".\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setKeyDown\">setKeyDown</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=isNaN></a>\r\n" + 
		"<b>isNaN(n)</b><br>\r\n" + 
		"Returns <i>true</i> if the value of the number <i>n</i> is NaN (Not-a-Number).\r\n" + 
		"A common way to create a NaN is to divide zero by zero. Comparison with a NaN always\r\n" + 
		"returns <i>false</i> so \"if (n!=n)\" is equilvalent to (isNaN(n))\". Note that the numeric constant\r\n" + 
		"NaN is predefined in the macro language. The\r\n" + 
		"<a href=\"../../macros/examples/NaNs.txt\">NaNs</a>\r\n" + 
		"macro demonstrates how to remove NaNs from an image.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=isOpen></a>\r\n" + 
		"<b>isOpen(id)</b><br>\r\n" + 
		"Returns <i>true</i> if the image with the specified ID is open.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>isOpen(\"Title\")</b><br>\r\n" + 
		"Returns <i>true</i> if the window with the specified title is open.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"<a name=J></a><a name=K></a>\r\n" + 
		" <b> L  </b><a name = L><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=lastIndexOf></a>\r\n" + 
		"<b>lastIndexOf(string, substring)</b><br>\r\n" + 
		"Returns the index within <i>string</i> of the rightmost occurrence of\r\n" + 
		"<i>substring</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>,\r\n" + 
		"<a href=\"#startsWith\">startsWith</a>, \r\n" + 
		"<a href=\"#endsWith\">endsWith</a>,\r\n" + 
		"<a href=\"#substring\">substring</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=lengthOf></a>\r\n" + 
		"<b>lengthOf(str)</b><br>\r\n" + 
		"Returns the length of a string or array.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=lineTo></a>\r\n" + 
		"<b>lineTo(x, y)</b><br>\r\n" + 
		"Draws a line from current location to (<i>x,y</i>) .\r\n" + 
		"See also: <a href=\"#Overlay\">Overlay.lineTo</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=List></a>\r\n" + 
		" <b>List Functions</b><br>\r\n" + 
		" These functions work with a list of key/value pairs.\r\n" + 
		"The\r\n" + 
		"<a href=\"../../macros/ListDemo.txt\">ListDemo</a>\r\n" + 
		"macro demonstrates how to use them.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=List.set></a>\r\n" + 
		"<b>List.set(key, value)</b> - \r\n" + 
		"Adds a key/value pair to the list.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=List.get></a>\r\n" + 
		"<b>List.get(key)</b> - \r\n" + 
		"Returns the string value associated with <i>key</i>, or\r\n" + 
		"an empty string if the key is not found.<br>\r\n" + 
		"\r\n" + 
		"<a name=List.getValue></a>\r\n" + 
		"<b>List.getValue(key)</b> - \r\n" + 
		"When used in an assignment statement, returns the value\r\n" + 
		"associated with <i>key</i> as a number. Aborts the\r\n" + 
		"macro if the value is not a number or the key is not found.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=List.size></a>\r\n" + 
		"<b>List.size</b> - \r\n" + 
		"Returns the size of the list.<br>\r\n" + 
		"\r\n" + 
		"<a name=List.clear></a>\r\n" + 
		"<b>List.clear()</b> - \r\n" + 
		"Resets the list.<br>\r\n" + 
		"\r\n" + 
		"<a name=List.setList></a>\r\n" + 
		"<b>List.setList(list)</b> - \r\n" + 
		"Loads the key/value pairs in the string <i>list</i>.<br>\r\n" + 
		"\r\n" + 
		"<a name=List.getList></a>\r\n" + 
		"<b>List.getList</b> - \r\n" + 
		"Returns the list as a string.<br>\r\n" + 
		"\r\n" + 
		"<a name=List.setMeasurements></a>\r\n" + 
		"<b> List.setMeasurements</b> - \r\n" + 
		"Measures the current image or selection and loads the resulting\r\n" + 
		"keys (Results table column headings) and values into the list.\r\n" + 
		"Use <i>List.setMeasurements(\"limit\")</i> to measure using the\r\n" + 
		"\"Limit to threshold\" option. All parameters listed in\r\n" + 
		"the <i>Analyze&gt;Set Measurements</i> dialog box are measured,\r\n" + 
		"including those that are unchecked.\r\n" + 
		"Use List.getValue() in an assignment statement to retrieve the values.\r\n" + 
		"See the\r\n" + 
		"<a href=\"../../macros/DrawEllipse.txt\">DrawEllipse</a>\r\n" + 
		"macro for an example.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b> List.setMeasurements(\"limit\")</b> - \r\n" + 
		"This is a version of List.setMeasurements that enables the\r\n" + 
		"\"Limit to threshold\" option.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=List.setCommands></a>\r\n" + 
		"<b>List.setCommands</b> - \r\n" + 
		"Loads the ImageJ menu commands (as keys) and the plugins that\r\n" + 
		"implement them (as values).<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=log></a>\r\n" + 
		"<b>log(n)</b><br>\r\n" + 
		"Returns the natural logarithm (base e) of <i>n</i>. Note that log10(n) = log(n)/log(10).\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> M  </b><a name = M><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=makeArrow></a>\r\n" + 
		"<b>makeArrow(x1, y1, x2, y2, style)</b><br>\r\n" + 
		"Creates an arrow selection, where 'style' is a string containing\r\n" + 
		"\"filled\", \"notched\", \"open\", \"headless\" or \"bar\", plus the optionial modifiers\r\n" + 
		"\"outline\", \"double\", \"small\", \"medium\" and \"large\"\r\n" + 
		"(<a href=\"../../macros/examples/Arrows.txt\">example</a>).\r\n" + 
		"See also: <a href=\"#Roi.setStrokeWidth\">Roi.setStrokeWidth</a>\r\n" + 
		"and <a href=\"#Roi.setStrokeColor\">Roi.setStrokeColor</a>.\r\n" + 
		"Requires 1.49a.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeEllipse></a>\r\n" + 
		"<b>makeEllipse(x1, y1, x2, y2, aspectRatio)</b><br>\r\n" + 
		"Creates an elliptical selection, where <i>x1,y1,x2,y2</i> specify the major axis of the \r\n" + 
		"ellipse and <i>aspectRatio</i> (<=1.0) is the ratio of the lengths of minor and major axis.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeLine></a>\r\n" + 
		"<b>makeLine(x1, y1, x2, y2)</b><br>\r\n" + 
		"Creates a new straight line selection. The origin (0,0) is assumed to be the upper left \r\n" + 
		"corner of the image. Coordinates are in pixels. You can create\r\n" + 
		"segmented line selections by specifying more than two coordinate pairs, for example\r\n" + 
		"<i>makeLine(25,34,44,19,69,30,71,56)</i>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>makeLine(x1, y1, x2, y2, lineWidth)</b><br>\r\n" + 
		"Creates a straight line selection with the specified width.\r\n" + 
		"See also: <a href=\"#getLine\">getLine</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeOval></a>\r\n" + 
		"<b>makeOval(x, y, width, height)</b><br>\r\n" + 
		"Creates an elliptical selection, where (<i>x,y</i>) define the upper left \r\n" + 
		"corner of the bounding rectangle of the ellipse.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makePoint></a>\r\n" + 
		"<b>makePoint(x, y)</b><br>\r\n" + 
		"Creates a point selection at the specified location. Create\r\n" + 
		"a multi-point selection by using\r\n" + 
		"<i>makeSelection(\"point\",xpoints,ypoints)</i>.  Use <i>setKeyDown(\"shift\"); makePoint(x, y);</i> to add a point\r\n" + 
		"to an existing point selection.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makePolygon></a>\r\n" + 
		"<b>makePolygon(x1, y1, x2, y2, x3, y3, ...)</b><br>\r\n" + 
		"Creates a polygonal selection. At least three coordinate pairs must be specified, \r\n" + 
		"but not more than 200. As an example, <i>makePolygon(20,48,59,13,101,40,75,77,38,70)</i>\r\n" + 
		"creates a polygon selection with five sides.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeRectangle></a>\r\n" + 
		"<b>makeRectangle(x, y, width, height)</b><br>\r\n" + 
		"Creates a rectangular selection. The <i>x</i> and <i>y</i> arguments are the coordinates \r\n" + 
		"(in pixels) of the upper left corner of the selection. The origin (0,0) of the \r\n" + 
		"coordinate system is the upper left corner of the image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>makeRectangle(x, y, width, height, arcSize)</b><br>\r\n" + 
		"Creates a rounded rectangular selection using the specified corner arc size. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeSelection></a>\r\n" + 
		"<b>makeSelection(type, xcoord, ycoord)</b><br>\r\n" + 
		"Creates a selection from a list of XY coordinates. The first argument should be\r\n" + 
		"\"polygon\", \"freehand\", \"polyline\", \"freeline\", \"angle\" or \"point\", or\r\n" + 
		"the numeric value returned by <a href=\"#selectionType\">selectionType</a>.\r\n" + 
		"The <i>xcoord</i> and <i>ycoord</i> arguments\r\n" + 
		"are numeric arrays that contain the X and Y coordinates.\r\n" + 
		"See the <a href=\"../../macros/MakeSelectionDemo.txt\">MakeSelectionDemo</a>\r\n" + 
		"macro for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=makeText></a>\r\n" + 
		"<b>makeText(string, x, y)</b><br>\r\n" + 
		"Creates a text selection at the specified coordinates.\r\n" + 
		"The selection will use the font and size specified by\r\n" + 
		"the last call to <a href=\"#setFont\">setFont()</a>.\r\n" + 
		"The\r\n" + 
		"<a href=\"../../macros/examples/CreateOverlay.txt\">CreateOverlay</a>\r\n" + 
		"macro provides an example.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=matches></a>\r\n" + 
		"<b>matches(string, regex)</b><br>\r\n" + 
		"Returns <i>true</i> if <i>string</i> matches the specified \r\n" + 
		"<a href=\"http://en.wikipedia.org/wiki/Regular_expression\">regular expression</a>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#startsWith\">startsWith</a>, \r\n" + 
		"<a href=\"#endsWith\">endsWith</a>, \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>,\r\n" + 
		"<a href=\"#replace\">replace</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=mmaxOff></a>\r\n" + 
		"<b>maxOf(n1, n2)</b><br>\r\n" + 
		"Returns the greater of two values.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=minOff></a>\r\n" + 
		"<b>minOf(n1, n2)</b><br>\r\n" + 
		"Returns the smaller of two values.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=moveTo></a>\r\n" + 
		"<b>moveTo(x, y)</b><br>\r\n" + 
		"Sets the current drawing location. The origin is always assumed to be the upper \r\n" + 
		"left corner of the image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> N  </b><a name = N><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=newArray></a>\r\n" + 
		"<b>newArray(size)</b><br>\r\n" + 
		"Returns a new array containing <i>size</i> elements.  \r\n" + 
		"You can also create arrays by listing the \r\n" + 
		"elements, for example newArray(1,4,7) or newArray(\"a\",\"b\",\"c\").\r\n" + 
		"For more examples, see the\r\n" + 
		"\r\n" + 
		"<a href=\"../../macros/Arrays.txt\">Arrays</a> macro.\r\n" + 
		"<p>\r\n" + 
		"The ImageJ macro language does not directly support 2D arrays. As a work around, \r\n" + 
		"either create a blank image and use setPixel() and getPixel(), or \r\n" + 
		"create a 1D array using a=newArray(xmax*ymax) and do your own \r\n" + 
		"indexing (e.g., value=a[x+y*xmax]).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=newImage></a>\r\n" + 
		"<b>newImage(title, type, width, height, depth)</b><br>\r\n" + 
		"Opens a new image or stack using the name <i>title</i>.\r\n" + 
		"The string <i>type</i> should contain\r\n" + 
		"\"8-bit\", \"16-bit\", \"32-bit\" or \"RGB\". In addition, it can contain \"white\", \"black\" or \"ramp\" (the default is \"white\").\r\n" + 
		"As an example, use \"16-bit ramp\" to create a 16-bit image containing a grayscale ramp.\r\n" + 
		"Precede with <i>call(\"ij.gui.ImageWindow.setNextLocation\", x, y)</i>\r\n" + 
		"to set the location of the new image.\r\n" + 
		"<i>Width</i> and <i>height</i> specify the width and height of the image in pixels. \r\n" + 
		"<i>Depth</i> specifies the number of stack slices.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=newMenu></a>\r\n" + 
		"<b>newMenu(macroName, stringArray)</b><br>\r\n" + 
		"Defines a menu that will be added to the toolbar when the menu tool\r\n" + 
		"named <i>macroName</i> is installed. Menu tools are macros with\r\n" + 
		"names ending in \"Menu Tool\".\r\n" + 
		"<i>StringArray</i> is an array containing the menu commands.\r\n" + 
		"Returns a copy of <i>stringArray</i>. For an example, refer to the\r\n" + 
		"<a href=\"../../macros/toolsets/Toolbar%20Menus.txt\">Toolbar Menus</a>\r\n" + 
		"toolset.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=nImages></a>\r\n" + 
		"<b>nImages</b><br>\r\n" + 
		"Returns number of open images. The parentheses \"()\" are optional. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=nResults></a>\r\n" + 
		"<b>nResults</b><br>\r\n" + 
		"Returns the current measurement counter value. The parentheses \"()\" are optional.\r\n" + 
		"See also: <a href=\"#results-count\">getValue(\"results.count\")</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=nSlices></a>\r\n" + 
		"<b>nSlices</b><br>\r\n" + 
		"Returns the number of images in the current stack. Returns 1 if the current image is not a stack.\r\n" + 
		"The parentheses \"()\" are optional.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getSliceNumber\">getSliceNumber</a>,\r\n" + 
		"<a href=\"#getDimensions\">getDimensions</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> O  </b><a name = O><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=open></a>\r\n" + 
		"<b>open(path)</b><br>\r\n" + 
		"Opens and displays a tiff, dicom, fits, pgm, jpeg, bmp, gif, lut, \r\n" + 
		"roi, or text file. Displays an error message and aborts the macro\r\n" + 
		"if the specified file is not in one of the supported formats, \r\n" + 
		"or if the file is not found. \r\n" + 
		"Displays a file open dialog box if\r\n" + 
		"<i>path</i> is an empty string or if there is no argument.\r\n" + 
		"Use the <i>File&gt;Open</i> command with the command recorder running\r\n" + 
		"to generate calls to this function.\r\n" + 
		"With 1.41k or later, opens images specified by a URL, for example\r\n" + 
		"<i>open(\"../../images/clown.gif\").</i>\r\n" + 
		"With 1.49v or later, opens a folder of images as a stack. Use\r\n" + 
		"open(\"path/to/folder\",\"virtual\") to open a folder of images\r\n" + 
		"as a virtual stack.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=open></a>\r\n" + 
		"<b>open(path, n)</b><br>\r\n" + 
		"Opens the <i>n</i><small>th</small> image in the TIFF stack specified by <i>path</i>. For\r\n" + 
		"example, the first image in the stack is opened if <i>n</i>=1 and the tenth is opened if <i>n</i>=10.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <a name=Overlay></a>\r\n" + 
		" <b>Overlay Functions</b><br>\r\n" + 
		"Use these functions to create and manage non-destructive graphic overlays.\r\n" + 
		"For an exmple, refer to the \r\n" + 
		"<a href=\"../../macros/examples/OverlayPolygons.txt\">OverlayPolygons</a>\r\n" + 
		"macro.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setColor\">setColor</a>,\r\n" + 
		"<a href=\"#setLineWidth\">setLineWidth</a> and\r\n" + 
		"<a href=\"#setFont\">setFont</a>.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.moveTo></a>\r\n" + 
		"<b>Overlay.moveTo(x, y)</b><br>\r\n" + 
		"Sets the current drawing location.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.lineTo></a>\r\n" + 
		"<b>Overlay.lineTo(x, y)</b><br>\r\n" + 
		"Draws a line from the current location to (<i>x,y</i>) .\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.drawLine></a>\r\n" + 
		"<b>Overlay.drawLine(x1, y1, x2, y2)</b><br>\r\n" + 
		"Draws a line between (<i>x1,y1</i>) and (<i>x2,y2</i>)). \r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.add></a>\r\n" + 
		"<b>Overlay.add</b><br>\r\n" + 
		"Adds the drawing created by Overlay.lineTo(), Overlay.drawLine(), etc. to the\r\n" + 
		"overlay without updating the display.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.setPosition></a>\r\n" + 
		"<b>Overlay.setPosition(n)</b><br>\r\n" + 
		"Sets the stack position (slice number) of the last item added to the overlay\r\n" + 
		"(<a href=\"../../macros/examples/StackOverlay.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Overlay.setPosition(c, z, t)</b><br>\r\n" + 
		"Sets the hyperstack position (channel, slice, frame) of the last item added to the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.drawRect></a>\r\n" + 
		"<b>Overlay.drawRect(x, y, width, height)</b><br>\r\n" + 
		"Draws a rectangle, where (<i>x,y</i>) specifies the upper left \r\n" + 
		"corner.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.drawEllipse></a>\r\n" + 
		"<b>Overlay.drawEllipse(x, y, width, height)</b><br>\r\n" + 
		"Draws an ellipse, where (<i>x,y</i>) specifies the upper left \r\n" + 
		"corner of the bounding rectangle.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.drawString></a>\r\n" + 
		"<b>Overlay.drawString(\"text\", x, y)</b><br>\r\n" + 
		"Draws text at the specified location and adds it to the overlay.\r\n" + 
		"Use <a href=\"#setFont\">setFont()</a> to specify the font\r\n" + 
		"and <a href=\"#setColor\">setColor</a> to set specify the color\r\n" + 
		"(<a href=\"../../macros/examples/OverlayDrawStringDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Overlay.drawString(\"text\", x, y, angle)</b><br>\r\n" + 
		"Draws text at the specified location and angle and adds it to the overlay\r\n" + 
		"(<a href=\"../../macros/examples/RotatedText.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.show></a>\r\n" + 
		"<b>Overlay.show</b><br>\r\n" + 
		"Displays the current overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.hide></a>\r\n" + 
		"<b>Overlay.hide</b><br>\r\n" + 
		"Hides the current overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.hidden></a>\r\n" + 
		"<b>Overlay.hidden</b><br>\r\n" + 
		"Returns <i>true</i> if the active image has an overlay and it is hidden.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.remove></a>\r\n" + 
		"<b>Overlay.remove</b><br>\r\n" + 
		"Removes the current overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.clear></a>\r\n" + 
		"<b>Overlay.clear</b><br>\r\n" + 
		"Resets the overlay without updating the display.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.size></a>\r\n" + 
		"<b>Overlay.size</b><br>\r\n" + 
		"Returns the size (selection count) of the current overlay. Returns zero if the image does not have an overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.addSelection></a>\r\n" + 
		"<b>Overlay.addSelection</b><br>\r\n" + 
		"Adds the current selection to the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Overlay.addSelection(strokeColor)</b><br>\r\n" + 
		"Sets the stroke color (\"red\", \"green\", \"ff8800\", etc.) of the current selection\r\n" + 
		"and adds it to the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Overlay.addSelection(strokeColor, strokeWidth)</b><br>\r\n" + 
		"Sets the stroke color (\"blue\", \"yellow\", \"ffaa77\" etc.) and stroke width of the \r\n" + 
		"current selection and adds it to the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Overlay.addSelection(\"\", 0, fillColor)</b><br>\r\n" + 
		"Sets the fill color (\"red\", \"green\", etc.) of the current selection\r\n" + 
		"and adds it to the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.activateSelection></a>\r\n" + 
		"<b>Overlay.activateSelection(index)</b><br>\r\n" + 
		"Activates the specified overlay selection.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.moveSelection></a>\r\n" + 
		"<b>Overlay.moveSelection(index, x, y)</b><br>\r\n" + 
		"Moves the specified selection to the specified location.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.removeSelection></a>\r\n" + 
		"<b>Overlay.removeSelection(index)</b><br>\r\n" + 
		"Removes the specified selection from the overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.copy></a>\r\n" + 
		"<b>Overlay.copy</b><br>\r\n" + 
		"Copies the overlay on the current image to the overlay clipboard.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.paste></a>\r\n" + 
		"<b>Overlay.paste</b><br>\r\n" + 
		"Copies the overlay on the overlay clipboard to the current image.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.drawLabels></a>\r\n" + 
		"<b>Overlay.drawLabels(boolean)</b><br>\r\n" + 
		"Enables/disables overlay labels.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Overlay.measure></a>\r\n" + 
		"<b>Overlay.measure</b><br>\r\n" + 
		"Measures all the selections in the current overlay.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<b> P  </b><a name = P><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=parseFloat></a>\r\n" + 
		"<b>parseFloat(string)</b><br>\r\n" + 
		"Converts the string argument to a number and returns it. Returns NaN (Not a Number) if the\r\n" + 
		"string cannot be converted into a number. Use the\r\n" + 
		"<a HREF=\"#isNaN\">isNaN()</a> function to test for NaN.\r\n" + 
		"For examples, see\r\n" + 
		"<a href=\"../../macros/ParseFloatIntExamples.txt\">ParseFloatIntExamples</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=parseInt></a>\r\n" + 
		"<b>parseInt(string)</b><br>\r\n" + 
		"Converts <i>string</i> to an integer and returns it. Returns NaN if the\r\n" + 
		"string cannot be converted into a integer.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=parseInt></a>\r\n" + 
		"<b>parseInt(string, radix)</b><br>\r\n" + 
		"Converts <i>string</i> to an integer and returns it. \r\n" + 
		"The optional second argument (<i>radix</i>) specifies the base of the number \r\n" + 
		"contained in the string.\r\n" + 
		"The radix must be an integer between 2 and 36. For radixes above 10, \r\n" + 
		"the letters of the alphabet indicate numerals greater than 9. Set <i>radix</i> to 16 to parse hexadecimal numbers.\r\n" + 
		"Returns NaN if the string cannot be converted into a integer. For examples, see\r\n" + 
		"<a href=\"../../macros/ParseFloatIntExamples.txt\">ParseFloatIntExamples</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=PI></a>\r\n" + 
		"<b>PI</b><br>\r\n" + 
		"Returns the constant &pi; (3.14159265), the ratio of the circumference to the diameter of a circle.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=Plot></a>\r\n" + 
		" <b>Plot Functions</b><br>\r\n" + 
		" Use these functions to generate and display plots.\r\n" + 
		"For examples, check out the\r\n" + 
		"<a href=\"../../macros/examples/Example_Plot.txt\">Example Plot</a>,\r\n" + 
		"<a href=\"../../macros/ExamplePlots.txt\">More Example Plots</a>,\r\n" + 
		"<a href=\"../../macros/examples/AdvancedPlots.txt\">AdvancedPlots</a>,\r\n" + 
		"<a href=\"../../macros/examples/Semi-log_Plot.txt\">Semi-log Plot</a> and\r\n" + 
		"<a href=\"../../macros/examples/ArrowPlot.txt\">Arrow Plot</a>\r\n" + 
		"macros.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Plot.create></a>\r\n" + 
		"<b>Plot.create(\"Title\", \"X-axis Label\", \"Y-axis Label\", xValues, yValues)</b><br>\r\n" + 
		"Generates a plot using the specified title, axis labels and X and Y coordinate arrays.\r\n" + 
		"If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used\r\n" + 
		"as the X values. It is also permissible to specify no arrays and use <i>Plot.setLimits()</i> and <i>Plot.add()</i> to generate the plot.\r\n" + 
		"Use <i>Plot.show()</i> to display the plot in a window, or it will be displayed automatically when\r\n" + 
		"the macro exits.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.add></a>\r\n" + 
		"<b>Plot.add(type, xValues, yValues)</b><br>\r\n" + 
		"Adds a curve, set of points or error bars to a plot created using <i>Plot.create()</i>.\r\n" + 
		"If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used\r\n" + 
		"as the X values. The first argument (<i>type</i>) can be  \"line\", \"circles\", \"boxes\", \"triangles\", \"crosses\", \"dots\",\r\n" + 
		"\"x\", \"connected\" (requires 1.49t), \"error bars\" (in y direction) or \"xerror bars\".\r\n" + 
		"In 1.49t or later, error bars apply to the last dataset provided by <i>Plot.create</i> or <i>Plot.add</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.drawVectors></a>\r\n" + 
		"<b>Plot.drawVectors(xStarts, yStarts, xEnds, yEnds)</b><br>\r\n" + 
		"Draws arrows from the starting to ending coordinates contained in the arrays.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.drawLine></a>\r\n" + 
		"<b>Plot.drawLine(x1, y1, x2, y2)</b><br>\r\n" + 
		"Draws a line between <i>x1,y1</i> and <i>x2,y2</i>, using the coordinate system\r\n" + 
		"defined by <i>Plot.setLimits()</i>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.drawNormalizedLine></a>\r\n" + 
		"<b>Plot.drawNormalizedLine(x1, y1, x2, y2)</b><br>\r\n" + 
		"Draws a line using a normalized 0-1, 0-1 coordinate system,\r\n" + 
		"with (0,0) at the top left and (1,1) at the lower right corner.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.addText></a>\r\n" + 
		"<b>Plot.addText(\"A line of text\", x, y)</b><br>\r\n" + 
		"Adds text to the plot at the specified location, where (0,0)\r\n" + 
		"is the upper left corner of the the plot frame and (1,1) is the lower right corner. Call\r\n" + 
		"<i>Plot.setJustification()</i> to have the text centered or right justified.\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLimits></a>\r\n" + 
		"<b>Plot.setLimits(xMin, xMax, yMin, yMax)</b><br>\r\n" + 
		"Sets the range of the x-axis and y-axis of plots.\r\n" + 
		"With version 1.50g and later, when 'NaN' is used as a limit, the range\r\n" + 
		"is calculated automatically from the plots that \r\n" + 
		"have been added so far.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.getLimits></a>\r\n" + 
		"<b>Plot.getLimits(xMin, xMax, yMin, yMax)</b><br>\r\n" + 
		"Returns the current axis limits. Note that min&gt;max if the\r\n" + 
		"axis is reversed. Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLimitsToFit></a>\r\n" + 
		"<b>Plot.setLimitsToFit()</b><br>\r\n" + 
		"Sets the range of the x and y axes to fit all data. Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setColor></a>\r\n" + 
		"<b>Plot.setColor(color)</b><br>\r\n" + 
		"Specifies the color used in subsequent calls to <i>Plot.add()</i> or <i>Plot.addText()</i>. \r\n" + 
		"The argument can be\r\n" + 
		"\"black\", \"blue\", \"cyan\", \"darkGray\", \"gray\", \"green\", \"lightGray\", \r\n" + 
		"\"magenta\", \"orange\", \"pink\", \"red\", \"white\", \"yellow\", or a hex value like \"#ff00ff\".  \r\n" + 
		"Note that the curve specified in <i>Plot.create()</i> is drawn last.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Plot.setColor(color1, color2)</b><br>\r\n" + 
		"This is a two argument version of Plot.setColor, where the second argument\r\n" + 
		"is used for filling symbols or as the line color for connected points.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setBackgroundColor></a>\r\n" + 
		"<b>Plot.setBackgroundColor(color)</b><br>\r\n" + 
		"Sets the background color of the plot frame\r\n" + 
		"(<a href=\"../../macros/examples/PlotBackgroundColorDemo.txt\">example</a>).\r\n" + 
		"Requires 1.49h.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLineWidth></a>\r\n" + 
		"<b>Plot.setLineWidth(width)</b><br>\r\n" + 
		"Specifies the width of the line used to draw a curve. Points (circle, box, etc.) are also drawn larger if a line width greater than one is specified. \r\n" + 
		"Note that the curve specified in <i>Plot.create()</i>\r\n" + 
		"is the last one drawn before the plot is dispayed or updated.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setJustification></a>\r\n" + 
		"<b>Plot.setJustification(\"center\")</b><br>\r\n" + 
		"Specifies the justification used by <i>Plot.addText()</i>.\r\n" + 
		"The argument can be \"left\", \"right\" or \"center\". The default is \"left\".\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLegend></a>\r\n" + 
		"<b>Plot.setLegend(\"label1\\tlabel2...\", \"options\")</b><br>\r\n" + 
		"Creates a legend for each of the data sets added with <i>Plot.create</i>\r\n" + 
		"and <i>Plot.add</i>. In the first argument, the labels for the data sets should be\r\n" + 
		"separated with tab or newline characters. The optional second argument can contain\r\n" + 
		"the legend position (\"top-left\", \"top-right\", \"bottom-left\", \"bottom-right\";\r\n" + 
		"default is automatic positioning), \"bottom-to-top\" for reversed sequence of the labels,\r\n" + 
		"and \"transparent\" to make the legend background transparent.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setFrameSize></a>\r\n" + 
		"<b>Plot.setFrameSize(width, height)</b><br>\r\n" + 
		"Sets the plot frame size in pixels, overriding the default size\r\n" + 
		"defined in the <i>Edit&gt;Options&gt;Profile Plot Options</i> dialog box.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLogScaleX></a>\r\n" + 
		"<b>Plot.setLogScaleX(boolean)</b><br>\r\n" + 
		"Sets the x axis scale to Logarithmic, or back to linear if the optional boolean argument is false.\r\n" + 
		"In versions up to 1.49s, it must be called immediately after <i>Plot.create</i> and\r\n" + 
		"before <i>Plot.setLimits</i>.\r\n" + 
		"See the <a href=\"../../macros/examples/LogLogPlot.txt\">LogLogPlot</a>\r\n" + 
		"macro for an example.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setLogScaleY></a>\r\n" + 
		"<b>Plot.setLogScaleY(boolean)</b><br>\r\n" + 
		"Sets the y axis scale to Logarithmic, or back to linear if the optional boolean argument is false.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setXYLabels></a>\r\n" + 
		"<b>Plot.setXYLabels(\"x Label\", \"y Label\")</b><br>\r\n" + 
		"Sets the axis labels.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setFontSize></a>\r\n" + 
		"<b>Plot.setFontSize(size, \"options\")</b><br>\r\n" + 
		"Sets the default font size in the plot (otherwise specified in <i>Profile Plot Options</i>),\r\n" + 
		"used e.g. for axes labels. Can be also called prior to <i>Plot.addText</i>.\r\n" + 
		"The optional second argument can include \"bold\" and/or \"italic\".\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.setAxisLabelSize></a>\r\n" + 
		"<b>Plot.setAxisLabelSize(size, \"options\")</b><br>\r\n" + 
		"Sets the fort size of the axis labels. The optional second argument\r\n" + 
		"can include \"bold\" and/or \"italic\".\r\n" + 
		"Requires 1.49t.\r\n" + 
		"\r\n" + 
		"<a name=Plot.setFormatFlags></a>\r\n" + 
		"<b>Plot.setFormatFlags(\"11001100001111\")</b><br>\r\n" + 
		"Controls whether to draw axes labels, grid lines and ticks\r\n" + 
		"(major/minor/ticks for log axes). Use the macro recorder and\r\n" + 
		"<i>More&gt;&gt;Axis Options</i> in any plot window to determine the binary code.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.useTemplate></a>\r\n" + 
		"<b>Plot.useTemplate(\"plot name\" or id)</b><br>\r\n" + 
		"Transfers the formatting of an open plot window to the current plot.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Plot.makeHighResolution></a>\r\n" + 
		"<b>Plot.makeHighResolution(factor)</b><br>\r\n" + 
		"Creates a high-resolution image of the plot enlarged by\r\n" + 
		"<i>factor</i>. Add the second argument \"disable\" to\r\n" + 
		"avoid antialiased text.\r\n" + 
		"Requires 1.49t.\r\n" + 
		"\r\n" + 
		"<a name=Plot.show></a>\r\n" + 
		"<b>Plot.show()</b><br>\r\n" + 
		"Displays the plot generated by <i>Plot.create()</i>, <i>Plot.add()</i>, etc. in a window. \r\n" + 
		"This function is automatically called when a macro exits.\r\n" + 
		"<br>\r\n" + 
		"<a name=Plot.update></a>\r\n" + 
		"<b>Plot.update()</b><br>\r\n" + 
		"Draws the plot generated by <i>Plot.create()</i>, <i>Plot.add()</i>, etc. in an existing plot window. \r\n" + 
		"Equivalent to <i>Plot.show</i> if no plot window is open.\r\n" + 
		"<br>\r\n" + 
		"<a name=Plot.getValues></a>\r\n" + 
		"<b>Plot.getValues(xpoints, ypoints)</b><br>\r\n" + 
		"Returns the values displayed by clicking on \"List\" in a plot or histogram window\r\n" + 
		"(<a href=\"../../macros/examples/PlotGetValuesDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"<a name=Plot.showValues></a>\r\n" + 
		"<b>Plot.showValues()</b><br>\r\n" + 
		"Displays the plot values in the Results window. Must be\r\n" + 
		"preceded by <i>Plot.show</i>.\r\n" + 
		"<br>\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=pow></a>\r\n" + 
		"<b>pow(base, exponent)</b><br>\r\n" + 
		"Returns the value of <i>base</i> raised to the power of <i>exponent</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=print></a>\r\n" + 
		"<b>print(string)</b><br>\r\n" + 
		"Outputs a string to the \"Log\" window. Numeric arguments are automatically converted to strings.\r\n" + 
		"The print() function accepts multiple arguments. For example, you can use\r\n" + 
		"<i>print(x,y,width, height)</i> instead of <i>print(x+\" \"+y+\" \"+width+\" \"+height)</i>.\r\n" + 
		"If the first argument is a file handle returned by <a href=\"#File.open\">File.open(path)</a>, then the second \r\n" + 
		"is saved in the refered file\r\n" + 
		"(see <a href=\"../../macros/SaveTextFileDemo.txt\">SaveTextFileDemo</a>).\r\n" + 
		"<p>\r\n" + 
		"Numeric expressions are automatically converted to strings using four decimal places, or use the \r\n" + 
		"<a href=\"#d2s\">d2s</a> function to\r\n" + 
		"specify the decimal places. For example, <i>print(2/3)</i> outputs \"0.6667\" but <i>print(d2s(2/3,1))</i> outputs \"0.7\".\r\n" + 
		"<p>\r\n" + 
		"The print() function accepts commands such as <i>\"\\\\Clear\"</i>, \r\n" + 
		"<i>\"\\\\Update:&lt;text&gt;\"</i> and <i>\"\\\\Update&lt;n&gt;:&lt;text&gt;\"</i> (for n<26)\r\n" + 
		"that clear the \"Log\"  window and update its contents. For example,\r\n" + 
		"<i>print(\"\\\\Clear\")</i> erases the Log window, <i>print(\"\\\\Update:new text\")</i> replaces the\r\n" + 
		"last line with \"new text\" and\r\n" + 
		"<i>print(\"\\\\Update8:new 8th line\")</i> replaces the 8th line with \"new 8th line\". Refer to the \r\n" + 
		"<a href=\"../../macros/LogWindowTricks.txt\">LogWindowTricks</a> macro\r\n" + 
		"for an example.\r\n" + 
		"<p>\r\n" + 
		"The second argument to print(arg1, arg2) is appended to a text window or table\r\n" + 
		"if the first argument is a window title in brackets, for example <i>print(\"[My Window]\", \"Hello, world\")</i>. With text windows, \r\n" + 
		"newline characters (\"\\n\") are not automatically appended and\r\n" + 
		"text that starts with <i>\"\\\\Update:\"</i> replaces the entire contents of the window.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/PrintToTextWindow.txt\">PrintToTextWindow</a>, \r\n" + 
		"<a href=\"../../macros/Clock.txt\">Clock</a> and \r\n" + 
		"<a href=\"../../macros/ProgressBar.txt\">ProgressBar</a>\r\n" + 
		"macros for examples.\r\n" + 
		"<p>\r\n" + 
		"The second argument to print(arg1, arg2) is appended to a table (e.g., ResultsTable)\r\n" + 
		"if the first argument is the title of the table in brackets. Use the <i>Plugins&gt;New </i>command\r\n" + 
		"to open a blank table. Any command that can be\r\n" + 
		"sent to the \"Log\" window (<i>\"\\\\Clear\"</i>, <i>\"\\\\Update:&lt;text&gt;\" </i>, etc.)\r\n" + 
		"can also be sent to a table.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/SineCosineTable2.txt\">SineCosineTable2</a> and\r\n" + 
		"<a href=\"../../macros/TableTricks.txt\">TableTricks</a>\r\n" + 
		"macros for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=Q></a>\r\n" + 
		" <b> R  </b><a name = R><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		" \r\n" + 
		"<a name=random></a>\r\n" + 
		"<b>random</b><br>\r\n" + 
		"Returns a random number between 0 and 1.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>random(\"seed\", seed)</b><br>\r\n" + 
		"Sets the seed (a whole number) used by the <i>random()</i> function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=rename></a>\r\n" + 
		"<b>rename(name)</b><br>\r\n" + 
		"Changes the title of the active image to the string <i>name</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=replace></a>\r\n" + 
		"<b>replace(string, old, new)</b><br>\r\n" + 
		"Returns the new string that results from replacing all occurrences of\r\n" + 
		"<i>old</i> in <i>string</i> with <i>new</i>, where <i>old</i> and <i>new</i> \r\n" + 
		"are single character strings. If <i>old</i> or <i>new</i> are longer than\r\n" + 
		"one character, each substring of \r\n" + 
		"<i>string</i> that matches the \r\n" + 
		"<a href=\"http://en.wikipedia.org/wiki/Regular_expression\">regular expression</a>\r\n" + 
		"<i>old</i> is replaced with <i>new</i>. \r\n" + 
		"When doing a simple string replacement, and <i>old</i> contains\r\n" + 
		"regular expression metacharacters ('.', '[', ']', '^', '$', etc.), you must escape\r\n" + 
		"them with a \"\\\\\". For example, to replace \"[xx]\" with \"yy\", use\r\n" + 
		"<i>string=replace(string,\"\\\\[xx\\\\]\",\"yy\")</i>.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#matches\">matches</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=requires></a>\r\n" + 
		"<b>requires(\"1.29p\")</b><br>\r\n" + 
		"Display a message and aborts the macro if the ImageJ version is less than the one specified.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getVersion\">getVersion</a>.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=reset></a>\r\n" + 
		"<b>reset</b><br>\r\n" + 
		"Restores the backup image created by the\r\n" + 
		"<a href=\"#snapshot\">snapshot</a> function.\r\n" + 
		"Note that reset() and run(\"Undo\") are basically the same, so\r\n" + 
		"only one run() call can be reset.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=resetMinAndMax></a>\r\n" + 
		"<b>resetMinAndMax</b><br>\r\n" + 
		"With 16-bit and 32-bit images, resets the minimum and maximum displayed pixel values (display range)\r\n" + 
		"to be the same as the current image's minimum and maximum pixel values.\r\n" + 
		"With 8-bit images, sets the display range to 0-255.\r\n" + 
		"With RGB images, does nothing.\r\n" + 
		"See the\r\n" + 
		"<a href=\"../../macros/DisplayRangeMacros.txt\">DisplayRangeMacros</a>\r\n" + 
		"for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=resetThreshold></a>\r\n" + 
		"<b>resetThreshold</b><br>\r\n" + 
		"Disables thresholding.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setThreshold\">setThreshold</a>, \r\n" + 
		"<a href=\"#setAutoThreshold\">setAutoThreshold</a>, \r\n" + 
		"<a href=\"#getThreshold\">getThreshold</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=restoreSettings></a>\r\n" + 
		"<b>restoreSettings</b><br>\r\n" + 
		"Restores <i>Edit&gt;Options</i> submenu settings saved by \r\n" + 
		"the <a href=\"#saveSettings\">saveSettings</a> function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <a name=Roi></a>\r\n" + 
		" <b>ROI Functions</b><br>\r\n" + 
		"Use these functions to get information about the current selection or to get or set selection properties.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/examples/RoiFunctionsDemo.txt\">RoiFunctionsDemo</a>\r\n" + 
		"macro for examples. These functions require ImageJ 1.48h or later.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Roi.contains></a>\r\n" + 
		"<b>Roi.contains(x, y)</b><br>\r\n" + 
		"Returns \"1\" if the point <i>x,y</i> is inside the current selection or \"0\" if it is not.\r\n" + 
		"Aborts the macro if there is no selection. Requires 1.49h. See also: \r\n" + 
		"<a href=\"#selectionContains\">selectionContains</a>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getBounds></a>\r\n" + 
		"<b>Roi.getBounds(x, y, width, height)</b><br>\r\n" + 
		"Returns the location and size of the selection's bounding rectangle.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getCoordinates></a>\r\n" + 
		"<b>Roi.getCoordinates(xpoints, ypoints)</b><br>\r\n" + 
		"Returns, as two arrays, the x and y coordinates that define this selection.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getDefaultColor></a>\r\n" + 
		"<b>Roi.getDefaultColor</b><br>\r\n" + 
		"Returns the current default selection color.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getStrokeColor></a>\r\n" + 
		"<b>Roi.getStrokeColor</b><br>\r\n" + 
		"Returns the selection stroke color.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getFillColor></a>\r\n" + 
		"<b>Roi.getFillColor</b><br>\r\n" + 
		"Returns the selection fill color.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getName></a>\r\n" + 
		"<b>Roi.getName</b><br>\r\n" + 
		"Returns the selection name or an empty string if the selection does not have a name.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getProperty></a>\r\n" + 
		"<b>Roi.getProperty(key)</b><br>\r\n" + 
		"Returns the value (a string) associated with the specified key\r\n" + 
		"or an empty string if the key is not found. \r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setProperty></a>\r\n" + 
		"<b>Roi.setProperty(key, value)</b><br>\r\n" + 
		"Adds the specified key and value pair to the selection properties. Assumes\r\n" + 
		"a value of \"1\" (true) if there is only one argument.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getProperties></a>\r\n" + 
		"<b>Roi.getProperties</b><br>\r\n" + 
		"Returns all selection properties or an empty string\r\n" + 
		"if the selection does not have properties.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getSplineAnchors></a>\r\n" + 
		"<b>Roi.getSplineAnchors(x, y)</b><br>\r\n" + 
		"Returns the x and y coordinates of the anchor points of a spline fitted selection\r\n" + 
		"(<a href=\"../../macros/examples/GetSetAnchors.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setPolygonSplineAnchors></a>\r\n" + 
		"<b>Roi.setPolygonSplineAnchors(x, y)</b><br>\r\n" + 
		"Creates or updates a spline fitted polygon selection\r\n" + 
		"(<a href=\"../../macros/examples/GetSetAnchors.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setPolylineSplineAnchors></a>\r\n" + 
		"<b>Roi.setPolylineSplineAnchors(x, y)</b><br>\r\n" + 
		"Creates or updates a spline fitted polyline selection\r\n" + 
		"(<a href=\"../../macros/examples/GetSetAnchors.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.getType></a>\r\n" + 
		"<b>Roi.getType</b><br>\r\n" + 
		"Returns, as a string, the type of the current selection.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.move></a>\r\n" + 
		"<b>Roi.move(x, y)</b><br>\r\n" + 
		"Moves the selection to the specified location.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setStrokeColor></a>\r\n" + 
		"<b>Roi.setStrokeColor(color)</b><br>\r\n" + 
		"Sets the selection stroke color (\"red\", \"5500ff00\". etc.).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Roi.setStrokeColor(red, green, blue)</b><br>\r\n" + 
		"Sets the selection stroke color, where 'red', 'green'\r\n" + 
		"and 'blue' are integers (0-255).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Roi.setStrokeColor(rgb)</b><br>\r\n" + 
		"Sets the selection stroke color, where 'rgb' is an integer.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setFillColor></a>\r\n" + 
		"<b>Roi.setFillColor(color)</b><br>\r\n" + 
		"Sets the selection fill color (\"red\", \"5500ff00\". etc.).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Roi.setFillColor(red, green, blue)</b><br>\r\n" + 
		"Sets the selection fill color, where 'red', 'green'\r\n" + 
		"and 'blue' are integers (0-255).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>Roi.setFillColor(rgb)</b><br>\r\n" + 
		"Sets the selection fill color, where 'rgb' is an integer.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setName></a>\r\n" + 
		"<b>Roi.setName(name)</b><br>\r\n" + 
		"Sets the selection name.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Roi.setStrokeWidth></a>\r\n" + 
		"<b>Roi.setStrokeWidth(width)</b><br>\r\n" + 
		"Sets the selection stroke width.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<b>ROI Manager Functions</b><br>\r\n" + 
		"These function run ROI Manager commands.\r\n" + 
		"The ROI Manager is opened if it is not already open.\r\n" + 
		"Use <i>roiManager(\"reset\")</i> to delete all ROIs on the list.\r\n" + 
		"Use <a href=\"#setOption\"\">setOption(\"Show All\", boolean)</a>\r\n" + 
		"to enable/disable \"Show All\" mode.\r\n" + 
		"For examples, refer to the\r\n" + 
		"<a href=\"../../macros/RoiManagerMacros.txt\">RoiManagerMacros</a>,\r\n" + 
		"<a href=\"../../macros/ROI_Manager_Stack_Demo.txt\">ROI Manager Stack Demo</a> and\r\n" + 
		"<a href=\"../../macros/RoiManagerSpeedTest.txt\">RoiManagerSpeedTest</a>\r\n" + 
		"macros.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"and\")></a>\r\n" + 
		"<b>roiManager(\"and\")</b><br>\r\n" + 
		"Uses the conjunction operator on the selected ROIs, or all ROIs if none are selected,\r\n" + 
		"to create a composite selection.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"add\")></a>\r\n" + 
		"<b>roiManager(\"add\")</b><br>\r\n" + 
		"Adds the current selection to the ROI Manager.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"add & draw\")></a>\r\n" + 
		"<b>roiManager(\"add & draw\")</b><br>\r\n" + 
		"Outlines the current selection and adds it to the ROI Manager.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"combine\")></a>\r\n" + 
		"<b>roiManager(\"combine\")</b><br>\r\n" + 
		"Uses the union operator on the selected ROIs to create a composite\r\n" + 
		"selection. Combines all ROIs if none are selected.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"count\")></a>\r\n" + 
		"<b>roiManager(\"count\")</b><br>\r\n" + 
		"Returns the number of ROIs in the ROI Manager list.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"delete\")></a>\r\n" + 
		"<b>roiManager(\"delete\")</b><br>\r\n" + 
		"Deletes the selected ROIs from the list, or deletes all ROIs if none are selected.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"deselect\")></a>\r\n" + 
		"<b>roiManager(\"deselect\")</b><br>\r\n" + 
		"Deselects all ROIs in the list. When ROIs are deselected,\r\n" + 
		"subsequent ROI Manager commands are applied to all ROIs.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"draw\")></a>\r\n" + 
		"<b>roiManager(\"draw\")</b><br>\r\n" + 
		"Draws the selected ROIs, or all ROIs if none are selected, using\r\n" + 
		"the equivalent of the <i>Edit&gt;Draw</i> command.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"fill\")></a>\r\n" + 
		"<b>roiManager(\"fill\")</b><br>\r\n" + 
		"Fills the selected ROIs, or all ROIs if none are selected, using\r\n" + 
		"the equivalent of the <i>Edit&gt;Fill</i> command.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"index\")></a>\r\n" + 
		"<b>roiManager(\"index\")</b><br>\r\n" + 
		"Returns the index of the currently selected ROI on the list, or\r\n" + 
		"-1 if the list is empty or no ROIs are selected. Returns the index of the first\r\n" + 
		"selected ROI if more than one is selected\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"measure\")></a>\r\n" + 
		"<b>roiManager(\"measure\")</b><br>\r\n" + 
		"Measures the selected ROIs, or if none is selected, all ROIs on the list.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"multi measure\")></a>\r\n" + 
		"<b>roiManager(\"multi measure\")</b><br>\r\n" + 
		"Measures all the ROIs on all slices in the stack, creating a Results Table\r\n" + 
		"with one row per slice.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"multi-measure append\")></a>\r\n" + 
		"<b>roiManager(\"multi-measure append\")</b><br>\r\n" + 
		"Measures all the ROIs on all slices in the stack, appending the measurements\r\n" + 
		"to the Results Table, with one row per slice.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"multi-measure one\")></a>\r\n" + 
		"<b>roiManager(\"multi-measure one\")</b><br>\r\n" + 
		"Measures all the ROIs on all slices in the stack, creating a Results Table with\r\n" + 
		"one row per measurement.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"multi plot\")></a>\r\n" + 
		"<b>roiManager(\"multi plot\")</b><br>\r\n" + 
		"Plots the selected ROIs, or all ROIs if none are selected, on a single graph.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"open\", file-path)></a>\r\n" + 
		"<b>roiManager(\"open\", file-path)</b><br>\r\n" + 
		"Opens a .roi file and adds it to the list or opens a ZIP archive (.zip file) and\r\n" + 
		"adds all the selections contained in it to the list.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"remove slice info\")></a>\r\n" + 
		"<b>roiManager(\"remove slice info\")</b><br>\r\n" + 
		"Removes the information in the ROI names that associates them with particular stack slices.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"rename\", name)></a>\r\n" + 
		"<b>roiManager(\"rename\", name)</b><br>\r\n" + 
		"Renames the selected ROI.\r\n" + 
		"You can get the name of an ROI on the list\r\n" + 
		"using <i>call(\"ij.plugin.frame.RoiManager.getName\", index)</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"reset\")></a>\r\n" + 
		"<b>roiManager(\"reset\")</b><br>\r\n" + 
		"Deletes all ROIs on the list.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"save\", file-path)></a>\r\n" + 
		"<b>roiManager(\"save, file-path)</b><br>\r\n" + 
		"Saves all the ROIs on the list in a ZIP archive.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"save selected\", file-path)></a>\r\n" + 
		"<b>roiManager(\"save selected\", file-path)</b><br>\r\n" + 
		"Saves the selected ROI as a .roi file.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"select\", index)></a>\r\n" + 
		"<b>roiManager(\"select\", index)</b><br>\r\n" + 
		"Selects an item in the ROI Manager list, where\r\n" + 
		"<i>index</i> must be greater than or equal zero and less than the\r\n" + 
		"value returned by <i>roiManager(\"count\")</i>. Note that macros that\r\n" + 
		"use this function sometimes run orders of magnitude faster in batch mode.\r\n" + 
		"Use <i>roiManager(\"deselect\") </i> to deselect all items on the list.\r\n" + 
		"For an example, refer to the\r\n" + 
		"<a href=\"../../macros/ROI_Manager_Stack_Demo.txt\">ROI Manager Stack Demo</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"select\", indexes)></a>\r\n" + 
		"<b>roiManager(\"select\", indexes)</b><br>\r\n" + 
		"Selects multiple items in the ROI Manager list, where\r\n" + 
		"<i>indexes</i> is an array of integers, each of which must be greater\r\n" + 
		"than or equal to 0 and less than the value returned by <i>roiManager(\"count\")</i>.\r\n" + 
		"The selected ROIs are not highlighted in the ROI Manager list and\r\n" + 
		"are no longer selected after the next ROI Manager command is executed.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"show all\")></a>\r\n" + 
		"<b>roiManager(\"show all\")</b><br>\r\n" + 
		"Displays all the ROIs as an overlay.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"show all with labels\")></a>\r\n" + 
		"<b>roiManager(\"show all with labels\")</b><br>\r\n" + 
		"Displays all the ROIs as an overlay, with labels.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"show all without labels\")></a>\r\n" + 
		"<b>roiManager(\"show all without labels\")</b><br>\r\n" + 
		"Displays all the ROIs as an overlay, without labels.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"show none\")></a>\r\n" + 
		"<b>roiManager(\"show none\")</b><br>\r\n" + 
		"Removes the ROI Manager overlay.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"sort\")></a>\r\n" + 
		"<b>roiManager(\"sort\")</b><br>\r\n" + 
		"Sorts the ROI list in alphanumeric order.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"split\")></a>\r\n" + 
		"<b>roiManager(\"split\")</b><br>\r\n" + 
		"Splits the current selection (it must be a composite selection) into its\r\n" + 
		"component parts and adds them to the ROI Manager.<p>\r\n" + 
		"\r\n" + 
		"<a name=roiManager(\"update\")></a>\r\n" + 
		"<b>roiManager(\"update\")</b><br>\r\n" + 
		"Replaces the selected ROI on the list with the current selection.<p>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=round></a>\r\n" + 
		"<b>round(n)</b><br>\r\n" + 
		"Returns the closest integer to <i>n</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#floor\">floor</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=run></a>\r\n" + 
		"<b>run(\"command\"[, \"options\"])</b><br>\r\n" + 
		"Executes an ImageJ menu command. The optional second argument contains values that \r\n" + 
		"are automatically entered into dialog boxes (must be GenericDialog or OpenDialog). Use\r\n" + 
		"the Command Recorder (<i>Plugins&gt;Macros&gt;Record</i>) to generate run() function calls.\r\n" + 
		"Use string concatentation to pass a variable as an argument. With ImageJ 1.43 and later,\r\n" + 
		"variables can be passed without using string concatenation by adding \"&\" to the variable name.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/ArgumentPassingDemo.txt\">ArgumentPassingDemo</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=runMacro></a>\r\n" + 
		"<b>runMacro(name)</b><br>\r\n" + 
		"Runs the specified macro or script, which is assumed to be in the\r\n" + 
		"Image macros folder. A full file path may also be used.\r\n" + 
		"Returns any string argument returned by the macro or the last\r\n" + 
		"expression evaluated in the script.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/CalculateMean.txt\">CalculateMean</a> macro.\r\n" + 
		"See also: <a href=\"#eval\">eval</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>runMacro(name, arg)</b><br>\r\n" + 
		"Runs the specified macro or script, which is assumed to be in the\r\n" + 
		"macros folder, or use a full file path. The string argument 'arg' can be retrieved by the\r\n" + 
		"macro or script using the getArgument() function. Returns the string argument\r\n" + 
		"returned by the macro or the last expression evaluated in the script. \r\n" + 
		"See also: <a href=\"#getArgument\">getArgument</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> S  </b><a name = S><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"\r\n" + 
		"<a name=save></a>\r\n" + 
		"<b>save(path)</b><br>\r\n" + 
		"Saves an image, lookup table, selection or text window to the specified file path.  The path must end in \r\n" + 
		"\".tif\", \".jpg\", \".gif\", \".zip\", \".raw\", \".avi\", \".bmp\", \".fits\", \".png\", \".pgm\", \".lut\", \".roi\" or \".txt\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=saveAs></a>\r\n" + 
		"<b>saveAs(format, path)</b><br>\r\n" + 
		"Saves the active image, lookup table, selection, measurement results, selection XY coordinates \r\n" + 
		"or text window  to the specified file path.  The <i>format</i> argument\r\n" + 
		"must be \"tiff\", \"jpeg\", \"gif\", \"zip\", \"raw\", \"avi\", \"bmp\", \"fits\", \"png\", \"pgm\", \"text image\", \"lut\", \"selection\",\r\n" + 
		"\"results\", \"xy Coordinates\" or \"text\". Use <i>saveAs(format)</i> to\r\n" + 
		"have a \"Save As\" dialog displayed.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=saveSettings></a>\r\n" + 
		"<b>saveSettings()</b><br>\r\n" + 
		"Saves most <i>Edit&gt;Options</i> submenu settings so they can be \r\n" + 
		"restored later by calling <a href=\"#restoreSettings\">restoreSettings</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=screenHeight></a>\r\n" + 
		"<b>screenHeight</b><br>\r\n" + 
		"Returns the screen height in pixels. \r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getLocationAndSize\">getLocationAndSize</a>,\r\n" + 
		"<a href=\"#setLocation\">setLocation</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=screenWidth></a>\r\n" + 
		"<b>screenWidth</b><br>\r\n" + 
		"Returns the screen width in pixels. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selectionContains></a>\r\n" + 
		"<b>selectionContains(x, y)</b><br>\r\n" + 
		"Returns <i>true</i> if the point <i>x,y</i> is inside the current selection.\r\n" + 
		"Aborts the macro if there is no selection.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selectionName></a>\r\n" + 
		"<b>selectionName</b><br>\r\n" + 
		"Returns the name of the current selection, or an empty string \r\n" + 
		"if the selection does not have a name.\r\n" + 
		"Aborts the macro if there is no selection.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#setSelectionName\">setSelectionName</a> and\r\n" + 
		"<a href=\"#selectionType\">selectionType</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selectionType></a>\r\n" + 
		"<b>selectionType() </b><br> \r\n" + 
		"Returns the selection type, where 0=rectangle, 1=oval, 2=polygon, 3=freehand, 4=traced, \r\n" + 
		"5=straight line, 6=segmented line, 7=freehand line, 8=angle, 9=composite and 10=point. \r\n" + 
		"Returns -1 if there is no selection. For an example, see the\r\n" + 
		"<a href=\"../../macros/ShowImageInfo.txt\">ShowImageInfo</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selectImage></a>\r\n" + 
		"<b>selectImage(id)</b><br>\r\n" + 
		"Activates the image with the specified ID (a negative number). If <i>id</i> is greater than zero, \r\n" + 
		"activates the <i>id</i>th image listed in the Window menu. The <i>id</i>\r\n" + 
		"can also be an image title (a string). \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=selectWindow></a>\r\n" + 
		"<b>selectWindow(\"name\")</b><br>\r\n" + 
		"Activates the window with the title \"name\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setAutoThreshold></a>\r\n" + 
		"<b>setAutoThreshold()</b><br>\r\n" + 
		"Uses the \"Default\" method\r\n" + 
		"to determine the threshold. It may select dark or bright areas as\r\n" + 
		"thresholded, as was the case with the <i>Image&gt;Adjust&gt;Threshold</i> \"Auto\"\r\n" + 
		"option in ImageJ 1.42o and earlier.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setThreshold\">setThreshold</a>, \r\n" + 
		"<a href=\"#getThreshold\">getThreshold</a>, \r\n" + 
		"<a href=\"#resetThreshold\">resetThreshold</a>. \r\n" + 
		"<p>\r\n" + 
		" \r\n" + 
		"<a name=setAutoThreshold></a>\r\n" + 
		"<b>setAutoThreshold(method)</b><br>\r\n" + 
		"Uses the specified method to set the threshold levels of  the current\r\n" + 
		"image. Use the getList(\"threshold.methods\") function to get a list of\r\n" + 
		"the available methods. Concatenate \" dark\" to the method name if the image\r\n" + 
		"has a dark background. For an example, see the \r\n" + 
		"<a href=\"../../macros/examples/AutoThresholdingDemo.txt\">AutoThresholdingDemo</a>\r\n" + 
		"macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setBackgroundColor></a>\r\n" + 
		"<b>setBackgroundColor(r, g, b)</b><br>\r\n" + 
		"Sets the background color, where <i>r</i>, <i>g</i>, and <i>b</i> are &gt;= 0 and &lt;= 255.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#setForegroundColor\">setForegroundColor</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setBackgroundColor(rgb)</b><br>\r\n" + 
		"Sets the background color, where <i>rgb</i> is an RGB pixel value.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#get-background\">getValue(\"rgb.background\")</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setBatchMode></a>\r\n" + 
		"<b>setBatchMode(arg)</b><br>\r\n" + 
		"Controls whether images are visible or hidden during macro execution.\r\n" + 
		"If <i>arg</i> is 'true', the interpreter enters batch mode and newly opened\r\n" + 
		"images are not displayed. If <i>arg</i> is 'false', exits batch mode and disposes \r\n" + 
		"of all hidden images except for the active image, which is displayed in a window.\r\n" + 
		"The interpreter also exits batch mode when the macro terminates, disposing of all\r\n" + 
		"hidden images.\r\n" + 
		"<p>\r\n" + 
		"With ImageJ 1.48h or later, you can use 'show' and 'hide' arguments to\r\n" + 
		"individually show or hide images.�By not displaying and updating images, \r\n" + 
		"batch mode macros run up to 20 times faster. \r\n" + 
		"Examples:\r\n" + 
		"<a href=\"../../macros/BatchModeTest.txt\">BatchModeTest</a>,\r\n" + 
		"<a href=\"../../macros/BatchMeasure.txt\">BatchMeasure</a>,\r\n" + 
		"<a href=\"../../macros/BatchSetScale.txt\">BatchSetScale</a> and\r\n" + 
		"<a href=\"../../macros/ReplaceRedWithMagenta.txt\">ReplaceRedWithMagenta</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setBatchMode(\"exit and display\")</b><br>\r\n" + 
		"Exits batch mode and displays all hidden images.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setBatchMode(\"show\")</b><br>\r\n" + 
		"Displays the active hidden image, while batch mode remains in same state.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setBatchMode(\"hide\")</b><br>\r\n" + 
		"Enters (or remains in) batch mode and hides the active image\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setColor></a>\r\n" + 
		"<b>setColor(r, g, b)</b><br>\r\n" + 
		"Sets the drawing color, where <i>r</i>, <i>g</i>, and <i>b</i> are &gt;= 0 and &lt;= 255.\r\n" + 
		"With 16 and 32 bit images, sets the color to 0 if r=g=b=0. With 16 and 32 bit images, \r\n" + 
		"use <i>setColor(1,0,0)</i> to make the drawing color the same is the minimum \r\n" + 
		"displayed pixel value.\r\n" + 
		"SetColor() is faster than \r\n" + 
		"<a href=\"#setForegroundColor\">setForegroundColor()</a>, and it does not change\r\n" + 
		" the system wide foreground color or repaint the color picker tool icon, but it cannot be\r\n" + 
		"used to specify the color used by commands called from macros, for example <i>run(\"Fill\")</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setColor(value)</b><br>\r\n" + 
		"Sets the drawing color. For 8 bit images, 0&lt;=<i>value</i>&lt;=255.\r\n" + 
		"For 16 bit images, 0&lt;=<i>value</i>&lt;=65535. For RGB images, use hex \r\n" + 
		"constants (e.g., 0xff0000 for red). This function does not change the foreground color used\r\n" + 
		"by <i>run(\"Draw\")</i> and <i>run(\"Fill\")</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setColor(string)</b><br>\r\n" + 
		"Sets the drawing color, where 'string' can be \r\n" + 
		"\"black\", \"blue\", \"cyan\", \"darkGray\", \"gray\", \"green\", \"lightGray\", \r\n" + 
		"\"magenta\", \"orange\", \"pink\", \"red\", \"white\", \"yellow\", or a hex value like \"#ff0000\".  \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"<a name=setFont></a>\r\n" + 
		"<b>setFont(name, size[, style])</b><br>\r\n" + 
		"Sets the font used by the <a href=\"#drawString\">drawString</a> function.\r\n" + 
		"The first argument is the font name. It should be \"SansSerif\", \"Serif\" or \"Monospaced\".\r\n" + 
		"The second is the point size. The optional third argument is a\r\n" + 
		"string containing \"bold\" or \"italic\", or both. The third argument\r\n" + 
		"can also contain the keyword \"antialiased\".\r\n" + 
		"For examples, run the\r\n" + 
		"<a href=\"../../macros/TextDemo.txt\">TextDemo</a> macro.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setFont(\"user\")</b><br>\r\n" + 
		"Sets the font to the one defined in the <i>Edit&gt;Options&gt;Fonts</i> window.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#font-name\">getInfo(\"font.name\")</a>,\r\n" + 
		"<a href=\"#font-size\">getValue(\"font.size\")</a> and\r\n" + 
		"<a href=\"#font-height\">getValue(\"font.height\")</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setForegroundColor></a>\r\n" + 
		"<b>setForegroundColor(r, g, b)</b><br>\r\n" + 
		"Sets the foreground color, where <i>r</i>, <i>g</i>, and <i>b</i> are &gt;= 0 and &lt;= 255.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setColor\">setColor</a> and\r\n" + 
		"<a href=\"#setBackgroundColor\">setBackgroundColor</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setForegroundColor(rgb)</b><br>\r\n" + 
		"Sets the foreground color, where <i>rgb</i> is an RGB pixel value.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#get-foreground\">getValue(\"rgb.foreground\")</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setJustification></a>\r\n" + 
		"<b>setJustification(\"center\")</b><br>\r\n" + 
		"Specifies the justification used by <i>drawString()</i> and <i>Plot.addText()</i>.\r\n" + 
		"The argument can be \"left\", \"right\" or \"center\". The default is \"left\".\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setKeyDown></a>\r\n" + 
		"<b>setKeyDown(keys)</b><br>\r\n" + 
		"Simulates pressing the shift, alt or space keys, where\r\n" + 
		"<i>keys</i> is a string containing some combination of \"shift\", \"alt\" or \"space\".\r\n" + 
		"Any key not specified is set \"up\". Use <i>setKeyDown(\"none\")</i> to set all keys in the\r\n" + 
		"\"up\" position. Call <i>setKeyDown(\"esc\")</i> to abort the currently\r\n" + 
		"running macro or plugin.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/CompositeSelections.txt\">CompositeSelections</a>,\r\n" + 
		"<a href=\"../../macros/DoWandDemo.txt\">DoWandDemo</a> and\r\n" + 
		"<a href=\"../../macros/tools/AbortMacroActionTool.txt\">AbortMacroActionTool</a> macros.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#isKeyDown\">isKeyDown</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setLineWidth></a>\r\n" + 
		"<b>setLineWidth(width)</b><br>\r\n" + 
		"Specifies the line width (in pixels) used by drawLine(), lineTo(), drawRect() and drawOval().\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setLocation></a>\r\n" + 
		"<b>setLocation(x, y)</b><br>\r\n" + 
		"Moves the active window to a new location. Use\r\n" + 
		" <i>call(\"ij.gui.ImageWindow.setNextLocation\", x, y)</i>\r\n" + 
		" to set the location of the next opened window.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getLocationAndSize\">getLocationAndSize</a>,\r\n" + 
		"<a href=\"#screenWidth\">screenWidth</a>,\r\n" + 
		"<a href=\"#screenHeight\">screenHeight</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setLocation(x, y, width, height)</b><br>\r\n" + 
		"Moves and resizes the active image window. The new location of the top-left\r\n" + 
		"corner is specified by <i>x</i> and <i>y</i>, and the\r\n" + 
		"new size by <i>width</i> and <i>height</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setLut></a>\r\n" + 
		"<b>setLut(reds, greens, blues)</b><br>\r\n" + 
		"Creates a new lookup table and assigns it to the current image. Three input arrays are \r\n" + 
		"required, each containing 256 intensity values. See the\r\n" + 
		"\r\n" + 
		"<a href=\"../../macros/LookupTables.txt\">LookupTables</a>\r\n" + 
		"macros for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setMetadata></a>\r\n" + 
		"<b>setMetadata(\"Info\", string)</b><br>\r\n" + 
		"Assigns the metadata in <i>string</i> to the \"Info\"\r\n" + 
		"image property of the current image.\r\n" + 
		"This metadata is displayed by <i>Image&gt;Show Info</i> and\r\n" + 
		"saved as part of the TIFF header.\r\n" + 
		"See also: <a href=\"#getMetadata\">getMetadata</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setMetadata(\"Label\", string)</b><br>\r\n" + 
		"Sets <i>string</i> as the label of the current image or stack slice.\r\n" + 
		"The first 60 characters, or up to the first newline, \r\n" + 
		"of the label are displayed as part of the image subtitle.\r\n" + 
		"The labels are saved as part of the TIFF header.\r\n" + 
		"See also: <a href=\"#getMetadata\">getMetadata</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setMinAndMax></a>\r\n" + 
		"<b>setMinAndMax(min, max)</b><br>\r\n" + 
		"Sets the minimum and maximum displayed pixel values (display range).\r\n" + 
		"See the\r\n" + 
		"<a href=\"../../macros/DisplayRangeMacros.txt\">DisplayRangeMacros</a>\r\n" + 
		"for examples.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setMinAndMax(min, max, channels)</b><br>\r\n" + 
		"Sets the display range of specified channels in an RGB image,\r\n" + 
		"where 4=red, 2=green, 1=blue, 6=red+green, etc.\r\n" + 
		"Note that the pixel data is altered since RGB images, unlike\r\n" + 
		"<a href=\"../../docs/menus/image.html#make-composite\">composite color images</a>,\r\n" + 
		"do not have a LUT for each channel.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setOption></a>\r\n" + 
		"<b>setOption(option, boolean)</b><br>\r\n" + 
		"Enables or disables an ImageJ option, where <i>option</i> is one of the following options\r\n" + 
		"and <i>boolean</i> is either <i>true</i> or <i>false</i>.\r\n" + 
		" <blockquote>\r\n" + 
		"<i>\"AutoContrast\"</i> enables/disables the <i>Edit&gt;Options&gt;Appearance</i>\r\n" + 
		"\"Auto contrast stacks\" option. You can also have newly displayed stack slices contrast\r\n" + 
		"enhanced by holding the shift key down when navigating stacks.\r\n" + 
		"<p>\r\n" + 
		"<i>\"Bicubic\"</i> provides a way to force commands like <i>Edit&gt;Selection&gt;Straighten</i>, that normally use\r\n" + 
		"bilinear interpolation, to use bicubic interpolation.\r\n" + 
		"<p>\r\n" + 
		"<i>\"BlackBackground\"</i> enables/disables the <i>Process&gt;Binary&gt;Options</i>\r\n" + 
		"\"Black background\" option.\r\n" + 
		" <p>\r\n" + 
		"<i>\"Changes\"</i> sets/resets the 'changes' flag of the current image. Set this option <i>false</i> to\r\n" + 
		"avoid  \"Save Changes?\" dialog boxes when closing images.\r\n" + 
		"<p>\r\n" + 
		"<i>\"DebugMode\"</i> enables/disables the ImageJ debug mode. ImageJ displays information, such\r\n" + 
		"as TIFF tag values, when it is in debug mode.\r\n" + 
		" <p>\r\n" + 
		"<i> \"DisablePopupMenu\"</i> enables/disables the the menu displayed when\r\n" + 
		"you right click on an image.\r\n" + 
		"   <p>\r\n" + 
		"  <i>\"DisableUndo\"</i> enables/disables the <i>Edit&gt;Undo</i> command. Note\r\n" + 
		"  that a <i>setOption(\"DisableUndo\",true)</i> call without a corresponding <i>setOption(\"DisableUndo\",false)</i> will cause \r\n" + 
		"  <i>Edit&gt;Undo</i> to not work as expected until ImageJ is restarted.\r\n" + 
		"<p>\r\n" + 
		"  <i>\"Display label\"</i>, <i>\"Limit to threshold\"</i>, <i>\"Area\"</i>,\r\n" + 
		"  <i>\"Mean\"</i> and <i>\"Std\"</i>, <i>\"Perimeter\"</i>, <i>\"Stack position\"</i> and <i>\"Add to overlay\"</i>\r\n" + 
		"  enable/disable the corresponding <i>Analyze&gt;Set Measurements</i> options.\r\n" + 
		"<p>\r\n" + 
		" <i>\"ExpandableArrays\"</i> enables/disables support for auto-expanding arrays\r\n" + 
		"  (<a href=\"../../macros/examples/ExpandableArrays.txt\">example</a>).\r\n" + 
		"  Note that macros that use auto-expanding arrays will not be compatible with Image 2.0.\r\n" + 
		" <p>\r\n" + 
		" <i>\"JFileChooser\"</i> enables/disables use of the Java JFileChooser to open and save files\r\n" + 
		" instead of the native OS file chooser.\r\n" + 
		" <p>\r\n" + 
		" <i>\"Loop\"</i> enables/disables the <i>Image&gt;Stacks&gt;Tools&gt;Animation Options</i> \"Loop back and forth\" option.\r\n" + 
		" <p>\r\n" + 
		" <i>\"OpenUsingPlugins\"</i>\r\n" + 
		" controls whether standard file types (TIFF, JPEG, GIF, etc.) are opened by external\r\n" + 
		" plugins or by ImageJ\r\n" + 
		" (<a href=\"../../macros/ToggleOpenUsingPlugins.txt\">example</a>).\r\n" + 
		" <p>\r\n" + 
		" <i>\"QueueMacros\"</i> controls whether macros invoked using keyboard shortcuts\r\n" + 
		" run sequentially on the event dispatch thread (EDT) or in separate, possibly concurrent, threads\r\n" + 
		"  (<a href=\"../../macros/DodgeBurnAndSmooth.txt\">example</a>). \r\n" + 
		"  In \"QueueMacros\" mode, screen updates, which also run on the EDT, are delayed until the macro finishes.\r\n" + 
		" <p>\r\n" + 
		" <i>\"Show All\"</i> enables/disables the the \"Show All\" mode in the ROI Manager.\r\n" + 
		"<p>\r\n" + 
		"<i>\"ShowAngle\"</i> determines whether or not  the \"Angle\" value is displayed in the Results window\r\n" + 
		"when measuring straight line lengths. Requires 1.49c.\r\n" + 
		"<p>\r\n" + 
		"<i>\"ShowMin\"</i> determines whether or not  the \"Min\" value is displayed in the Results window\r\n" + 
		"when \"Min & Max Gray Value\" is enabled in the <i>Analyze&gt;Set Measurements</i> dialog box.\r\n" + 
		"<p>\r\n" + 
		" <i>\"ShowRowNumbers\"</i> enables/disables display of Results table row numbers\r\n" + 
		"  (<a href=\"../../macros/SineCosineTable.txt\">example</a>). \r\n" + 
		"<p>\r\n" + 
		" <i>\"AntialiasedText\"</i> controls the \"Antialiased text\" option in the\r\n" + 
		" <i>Edit&gt;Options&gt;Fonts</i> dialog. Requires v1.51h.\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=setPasteMode></a>\r\n" + 
		"<b>setPasteMode(mode)</b><br>\r\n" + 
		"Sets the transfer mode used by the <i>Edit&gt;Paste</i> command, where <i>mode</i> is \"Copy\", \"Blend\", \"Average\", \"Difference\", \r\n" + 
		"\"Transparent-white\", \"Transparent-zero\", \"AND\", \"OR\", \"XOR\", \"Add\", \"Subtract\", \"Multiply\", \"Divide, \"Min\" or \"Max\".\r\n" + 
		"The <a href=\"../../macros/GetCurrentPasteMode.txt\">GetCurrentPasteMode</a> macro demonstrates how\r\n" + 
		"to get the current paste mode. In ImageJ 1.42 and later, the paste mode is saved and restored by the\r\n" + 
		"<a href=\"#saveSettings\">saveSettings</a> and <a href=\"#restoreSettings\">restoreSettings</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setPixel></a>\r\n" + 
		"<b>setPixel(x, y, value)</b><br>\r\n" + 
		"Stores <i>value</i> at location (<i>x,y</i>) of the current image. The screen is\r\n" + 
		"updated when the macro exits or call updateDisplay() to have it updated immediately.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setResult></a>\r\n" + 
		"<b>setResult(\"Column\", row, value)</b><br>\r\n" + 
		"Adds an entry to the ImageJ results table or modifies an existing entry. The first \r\n" + 
		"argument specifies a column in the table. If the specified column does not exist, it is added.\r\n" + 
		"The second argument specifies the row, where 0&lt;=<i>row</i>&lt;=nResults.\r\n" + 
		"(<i>nResults</i> is a predefined variable.) A row is added to the table if <i>row</i>=<i>nResults</i>.\r\n" + 
		"The third argument is the value to be added or modified.\r\n" + 
		"With v1.47o or later, it can be a string.\r\n" + 
		"Call <i>setResult(\"Label\", row, string)</i> to set the row label. \r\n" + 
		"Call <i>updateResults()</i> to display the updated table in the \"Results\" window.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/SineCosineTable.txt\">SineCosineTable</a> and\r\n" + 
		"<a href=\"../../macros/ConvexitySolidarity.txt\">ConvexitySolidarity</a> macros.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setRGBWeights></a>\r\n" + 
		"<b>setRGBWeights(redWeight, greenWeight, blueWeight)</b><br>\r\n" + 
		"Sets the weighting factors used by the <i>Analyze&gt;Measure</i>, <i>Image&gt;Type&gt;8-bit</i> \r\n" + 
		"and <i>Analyze&gt;Histogram</i> commands\r\n" + 
		"when they convert RGB pixels values to grayscale. The sum of the weights must be 1.0. Use\r\n" + 
		"\r\n" + 
		"<i>(1/3,1/3,1/3)</i> for equal weighting of red, green and blue.\r\n" + 
		"The weighting factors in effect when the macro started are restored when it terminates.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/MeasureRGB.txt\">MeasureRGB</a>,\r\n" + 
		"<a href=\"../../macros/ExtractRGBChannels.txt\">ExtractRGBChannels</a> and\r\n" + 
		"<a href=\"../../macros/RGB_Histogram.txt\">RGB_Histogram</a> macros.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setSelectionLocation></a>\r\n" + 
		"<b>setSelectionLocation(x, y)</b><br>\r\n" + 
		"Moves the current selection to <i>(x,y)</i>, where <i>x</i> and <i>y</i> are the pixel coordinates of the\r\n" + 
		"upper left corner of the selection's bounding rectangle. The\r\n" + 
		"<a href=\"../../macros/RoiManagerMoveSelections.txt\">RoiManagerMoveSelections</a>\r\n" + 
		"macro uses this function to move all the ROI Manager selections a specified distance.\r\n" + 
		"See also: <a href=\"#getSelectionBounds\">getSelectionBounds</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setSelectionName></a>\r\n" + 
		"<b>setSelectionName(name)</b><br>\r\n" + 
		"Sets the name of the current selection to the specified name.\r\n" + 
		"Aborts the macro if there is no selection.\r\n" + 
		"See also:\r\n" + 
		"<a href=\"#selectionName\">selectionName</a> and\r\n" + 
		"<a href=\"#selectionType\">selectionType</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setSlice></a>\r\n" + 
		"<b>setSlice(n)</b><br>\r\n" + 
		"Displays the <i>n</i>th slice of the active stack. Does nothing if the active image is not a stack.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/MeasureStack.txt\">MeasureStack</a>\r\n" + 
		"macros.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getSliceNumber\">getSliceNumber</a>, \r\n" + 
		"<a href=\"#nSlices\">nSlices</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setThreshold></a>\r\n" + 
		"<b>setThreshold(lower, upper)</b><br>\r\n" + 
		"Sets the lower and upper threshold levels.\r\n" + 
		"There is an optional third argument that can be \"red\",\r\n" + 
		"\"black & white\", \"over/under\", \"no color\" or \"raw\".\r\n" + 
		"With density calibrated images, <i>lower</i> and <i>upper</i>\r\n" + 
		"must be calibrated values unless the optional third argument is \"raw\".\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#setAutoThreshold\">setAutoThreshold</a>, \r\n" + 
		"<a href=\"#getThreshold\">getThreshold</a>, \r\n" + 
		"<a href=\"#resetThreshold\">resetThreshold</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setTool></a>\r\n" + 
		"<b>setTool(name)</b><br>\r\n" + 
		"Switches to the specified tool, where <i>name</i> is \"rectangle\", \"roundrect\", \"elliptical\", \"brush\", \"polygon\", \"freehand\",\r\n" + 
		"\"line\", \"polyline\", \"freeline\", \"arrow\", \"angle\", \"point\", \"multipoint\", \"wand\", \"text\", \"zoom\", \"hand\" or \"dropper\".\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/SetToolDemo.txt\">SetToolDemo</a>, \r\n" + 
		"<a href=\"../../macros/ToolShortcuts.txt\">ToolShortcuts</a> or \r\n" + 
		"<a href=\"../../macros/ToolSwitcher.txt\">ToolSwitcher</a>, \r\n" + 
		"macros for examples.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#getToolName\">IJ.getToolName</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>setTool(id)</b><br>\r\n" + 
		"Switches to the specified tool, where 0=rectangle, 1=oval, 2=polygon, 3=freehand,\r\n" + 
		"4=straight line, 5=polyline, 6=freeline, 7=point, 8=wand, 9=text, 10=unused,\r\n" + 
		"11=zoom, 12=hand, 13=dropper, 14=angle, 15...21=custom tools.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#toolID\">toolID</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setupUndo></a>\r\n" + 
		"<b>setupUndo()</b><br>\r\n" + 
		"Call this function before drawing on an image to allow the user the option of later restoring the original image\r\n" + 
		"using <i>Edit/Undo</i>. Note that setupUndo() may not work as intended\r\n" + 
		"with macros that call the run() function.\r\n" + 
		"For an example, see the\r\n" + 
		"<a href=\"../../macros/tools/DrawingTools.txt\">DrawingTools</a>\r\n" + 
		"tool set.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setVoxelSize></a>\r\n" + 
		"<b>setVoxelSize(width, height, depth, unit)</b><br>\r\n" + 
		"Defines the voxel dimensions and unit of length (\"pixel\", \"mm\", etc.) for the current \r\n" + 
		"image or stack. A \"um\" unit will be converted to \"&micro;m\".\r\n" + 
		"The <i>depth</i> argument is ignored if the current image is not a stack.\r\n" + 
		"See also: <a href=\"#getVoxelSize\">getVoxelSize</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=setZCoordinate></a>\r\n" + 
		"<b>setZCoordinate(z)</b><br>\r\n" + 
		"Sets the Z coordinate used by <i>getPixel()</i>, <i>setPixel()</i> and <i>changeValues()</i>. The argument must \r\n" + 
		"be in the range 0 to n-1, where n is the number of images in the stack. For an examples, see the\r\n" + 
		"<a href=\"../../macros/tools/ZProfileTool.txt\">Z Profile Plotter Tool</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=showMessage></a>\r\n" + 
		"<b>showMessage(\"message\")</b><br>\r\n" + 
		"Displays \"message\" in a dialog box. Can display HTML formatted\r\n" + 
		"text (<a href=\"../../macros/HtmlDialogDemo.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>showMessage(\"title\", \"message\")</b><br>\r\n" + 
		"Displays \"message\" in a dialog box using \"title\" as the\r\n" + 
		"the dialog box title.  Can display HTML formatted\r\n" + 
		"text (<a href=\"../../macros/HtmlDialogDemo.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=showMessageWithCancel></a>\r\n" + 
		"<b>showMessageWithCancel([\"title\",]\"message\")</b><br>\r\n" + 
		"Displays \"message\" in a dialog box with \"OK\" and \"Cancel\" buttons.\r\n" + 
		"\"Title\" (optional) is the dialog box title. The macro exits if \r\n" + 
		"the user clicks \"Cancel\" button.\r\n" + 
		"See also: <a href=\"#getBoolean\">getBoolean</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=showProgress></a>\r\n" + 
		"<b>showProgress(progress)</b><br>\r\n" + 
		"Updates the ImageJ progress bar, where 0.0<=<i>progress</i>&lt;=1.0. The progress bar is \r\n" + 
		"not displayed if the time between the first and second calls to this function\r\n" + 
		"is less than 30 milliseconds. It is erased when the macro terminates \r\n" + 
		"or <i>progress</i> is &gt;=1.0.\r\n" + 
		"Use negative values to show subordinate progress bars as moving dots\r\n" + 
		"(<a href=\"../../macros/examples/DualProgressDemo.txt\">example</a>).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>showProgress(currentIndex, finalIndex)</b><br>\r\n" + 
		"Updates the progress bar, where the length of the bar is set to\r\n" + 
		"<i>currentIndex</i>/<i>finalIndex</i> of the maximum bar length.\r\n" + 
		"The bar is erased if <i>currentIndex</i>&gt;<i>finalIndex</i> or\r\n" + 
		"<i>finalIndex</i>==0.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=showStatus></a>\r\n" + 
		"<b>showStatus(\"message\")</b><br>\r\n" + 
		"Displays a message in the ImageJ status bar.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=showText></a>\r\n" + 
		"<b>showText(\"string\")</b><br>\r\n" + 
		"Displays a string in a text window.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>showText(\"Title\", \"string\")</b><br>\r\n" + 
		"Displays a string in a text window using the specified title.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=sin></a>\r\n" + 
		"<b>sin(angle)</b><br>\r\n" + 
		"Returns the sine of an angle (in radians).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=snapshot></a>\r\n" + 
		"<b>snapshot()</b><br>\r\n" + 
		"Creates a backup copy of the current image that can be later restored using the\r\n" + 
		"<a href=\"#reset\">reset</a> function.\r\n" + 
		"For examples, see the\r\n" + 
		"<a href=\"../../macros/ImageRotator.txt\">ImageRotator</a> and\r\n" + 
		"\r\n" + 
		"<a href=\"../../macros/BouncingBar.txt\">BouncingBar</a> macros.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=split></a>\r\n" + 
		"<b>split(string, delimiters)</b><br>\r\n" + 
		"Breaks a string into an array of substrings. <i>Delimiters</i> is a string containing \r\n" + 
		"one or more delimiter characters. The default delimiter set \" \\t\\n\\r\" (space, tab, newline, return) \r\n" + 
		"is used if <i>delimiters</i> is an empty string or split is called with only one argument. \r\n" + 
		"Multiple delimiters in the <i>string</i> are merged (taken as one)\r\n" + 
		"and delimiters at the start or end of the <i>string</i> are ignored unless the delimiter\r\n" + 
		"is a single comma, a single semicolon or a regular expression.\r\n" + 
		"With ImageJ 1.49f or later, <i>delimiters</i> can be also a regular expression enclosed in\r\n" + 
		"parentheses, e.g. <i>delimiters</i>=\"(\\n\\n)\" splits only at empty lines (two newline characters\r\n" + 
		"following each other).\r\n" + 
		"<p>\r\n" + 
		"Note that split() may return empty strings when the second argument is\r\n" + 
		"\",\", \";' or \"\\n\". To avoid empty strings, use \",,\", \";;\" and \"\\n\\n\" as the second argument.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=sqrt></a>\r\n" + 
		"<b>sqrt(n)</b><br>\r\n" + 
		"Returns the square root of <i>n</i>. Returns NaN if <i>n</i> is less than zero.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=Stack></a>\r\n" + 
		" <b>Stack (hyperstack) Functions</b><br>\r\n" + 
		"These functions allow you to get and set the position (channel, slice and frame) \r\n" + 
		"of a hyperstack (a 4D or 5D stack).\r\n" + 
		"The <a href=\"../../macros/HyperStackDemo.txt\">HyperStackDemo</a>\r\n" + 
		"demonstrates how to create a hyperstack and how to work with it using these functions\r\n" + 
		"<p>\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=Stack.isHyperstack></a>\r\n" + 
		"<b>Stack.isHyperstack</b> - \r\n" + 
		"Returns true if the current image is a hyperstack.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getDimensions></a>\r\n" + 
		"<b>Stack.getDimensions(width, height, channels, slices, frames)</b>\r\n" + 
		"Returns the dimensions of the current image.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setDimensions></a>\r\n" + 
		"<b>Stack.setDimensions(channels, slices, frames)</b> - \r\n" + 
		"Sets the 3rd, 4th and 5th dimensions of the current stack.\r\n" + 
		"<br>\r\n" + 
		"	\r\n" + 
		"<a name=Stack.setChannel></a>\r\n" + 
		"<b>Stack.setChannel(n)</b> - \r\n" + 
		"Displays channel <i>n</i> .\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setSlice></a>\r\n" + 
		"<b>Stack.setSlice(n)</b> - \r\n" + 
		"Displays slice <i>n</i> .\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setFrame></a>\r\n" + 
		"<b>Stack.setFrame(n)</b> - \r\n" + 
		"Displays frame <i>n</i> .\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getPosition></a>\r\n" + 
		"<b>Stack.getPosition(channel, slice, frame)</b> - \r\n" + 
		"Returns the current position.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setPosition></a>\r\n" + 
		"<b>Stack.setPosition(channel, slice, frame)</b> - \r\n" + 
		"Sets the position.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getFrameRate></a>\r\n" + 
		"<b>Stack.getFrameRate()</b> - \r\n" + 
		"Returns the frame rate (FPS).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setFrameRate></a>\r\n" + 
		"<b>Stack.setFrameRate(fps)</b> - \r\n" + 
		"Sets the frame rate.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getFrameInterval></a>\r\n" + 
		"<b>Stack.getFrameInterval()</b> - \r\n" + 
		"Returns the frame interval in time (T) units.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setFrameInterval></a>\r\n" + 
		"<b>Stack.setFrameInterval(interval)</b> - \r\n" + 
		"Sets the frame interval in time (T) units.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getUnits></a>\r\n" + 
		"<b>Stack.getUnits(X, Y, Z, Time, Value)</b> - \r\n" + 
		"Returns the x, y, z, time and value units.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setTUnit></a>\r\n" + 
		"<b>Stack.setTUnit(string)</b> - \r\n" + 
		"Sets the time unit.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setZUnit></a>\r\n" + 
		"<b>Stack.setZUnit(string)</b> - \r\n" + 
		"Sets the Z-dimension unit.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setDisplayMode></a>\r\n" + 
		"<b>Stack.setDisplayMode(mode)</b> - \r\n" + 
		"Sets the display mode, where <i>mode</i> is \"composite\", \"color\" or \"grayscale\".\r\n" + 
		"Requires a multi-channel stack and v1.40a or later.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getDisplayMode></a>\r\n" + 
		"<b>Stack.getDisplayMode(mode)</b> - \r\n" + 
		"Sets the string <i>mode</i> to the current display mode.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setActiveChannels></a>\r\n" + 
		"<b>Stack.setActiveChannels(string)</b> - \r\n" + 
		"Controls which channels in a composite color image are displayed, where <i>string</i>\r\n" + 
		"is a list of ones and zeros that specify the channels to display.\r\n" + 
		"For example, \"101\" causes channels 1 and 3 to be displayed.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getActiveChannels></a>\r\n" + 
		"<b>Stack.getActiveChannels(string)</b> - \r\n" + 
		"Returns a string that represents the state of the channels\r\n" + 
		"in a composite color image, where '1' indicates a displayed\r\n" + 
		"channel and '0' indicates an inactive channel.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.swap></a>\r\n" + 
		"<b>Stack.swap(n1, n2)</b> - \r\n" + 
		"Swaps the two specified stack images, where <i>n1</i> and <i>n2</i>\r\n" + 
		"are integers greater than 0 and less than or equal to <a href=\"#nSlices\">nSlices</a>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getStatistics></a>\r\n" + 
		"<b>Stack.getStatistics(voxelCount, mean, min, max, stdDev)</b> - \r\n" + 
		"Calculates and returns stack statistics.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.setOrthoView></a>\r\n" + 
		"<b>Stack.setOrthoViews(x, y, z)</b> - \r\n" + 
		"If an <i>Orthogonal Views</i> is active, its crosspoint is set to x, y, z\r\n" + 
		"(<a href=\"../../macros/OrthogonalViewsDemo.txt\">example</a>).\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.getOrthoViewsID></a>\r\n" + 
		"<b>Stack.getOrthoViewsID</b> - \r\n" + 
		"Returns the image ID of the current <i>Orthogonal Views</i>, or zero if none is active.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=Stack.stopOrthoViews></a>\r\n" + 
		"<b>Stack.stopOrthoViews</b> - \r\n" + 
		"Stops the current <i>Orthogonal Views</i> and closes the \"YZ\" and \"XZ\" windows.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=startsWith></a>\r\n" + 
		"<b>startsWith(string, prefix)</b><br>\r\n" + 
		"Returns <i>true</i> (1) if <i>string</i> starts with <i>prefix</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#endsWith\">endsWith</a>, \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>,\r\n" + 
		"<a href=\"#substring\">substring</a>, \r\n" + 
		"<a href=\"#toLowerCase\">toLowerCase</a>,\r\n" + 
		"<a href=\"#matches\">matches</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=String></a>\r\n" + 
		" <b>String Functions</b><br>\r\n" + 
		"These functions do string buffering and copy strings to and from\r\n" + 
		"the system clipboard. The\r\n" + 
		"<a href=\"../../macros/CopyResultsToClipboard.txt\">CopyResultsToClipboard</a>\r\n" + 
		"macro demonstrates their use.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#endsWith\">endsWith</a>, \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>, \r\n" + 
		"<a href=\"#lastIndexOf\">lastIndexOf</a>, \r\n" + 
		"<a href=\"#lengthOf\">lengthOf</a>, \r\n" + 
		"<a href=\"#startsWith\">startsWith</a> and\r\n" + 
		"<a href=\"#substring\">substring</a>.\r\n" + 
		"<blockquote>\r\n" + 
		"\r\n" + 
		"<a name=String.resetBuffer></a>\r\n" + 
		"<b>String.resetBuffer</b> - \r\n" + 
		"Resets (clears) the buffer.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.append></a>\r\n" + 
		"<b>String.append(str)</b> - \r\n" + 
		"Appends <i>str</i> to the buffer.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.buffer></a>\r\n" + 
		"<b>String.buffer</b> - \r\n" + 
		"Returns the contents of the buffer.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.copy></a>\r\n" + 
		"<b>String.copy(str)</b> - \r\n" + 
		"Copies <i>str</i> to the clipboard.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.copyResults></a>\r\n" + 
		"<b>String.copyResults</b> - \r\n" + 
		"Copies the Results table, or selected rows in the Results\r\n" + 
		"table (1.47i or later), to the clipboard.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.getResultsHeadings></a>\r\n" + 
		"<b>String.getResultsHeadings</b> - \r\n" + 
		"Returns the Results window headers.\r\n" + 
		"<a href=\"../../macros/examples/PrintResults.txt\">Example</a>.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.paste></a>\r\n" + 
		"<b>String.paste</b> - \r\n" + 
		"Returns the contents of the clipboard.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<a name=String.show></a>\r\n" + 
		"<b>String.show(str)</b><br>\r\n" + 
		"Displays <i>str</i> in a text window.\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"<b>String.show(title, str)</b><br>\r\n" + 
		"Displays <i>str</i> in a text window using <i>title</i> as the title.\r\n" + 
		"\r\n" + 
		"<br>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<a name=substring></a>\r\n" + 
		"<b>substring(string, index1, index2)</b><br>\r\n" + 
		"Returns a new string that is a substring of <i>string</i>. The \r\n" + 
		"substring begins at <i>index1</i> and extends to the character at <i>index2</i> - 1. \r\n" + 
		"See also: \r\n" + 
		"<a href=\"#indexOf\">indexOf</a>,\r\n" + 
		"<a href=\"#startsWith\">startsWith</a>,\r\n" + 
		"<a href=\"#endsWith\">endsWith</a>,\r\n" + 
		"<a href=\"#replace\">replace</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>substring(string, index)</b><br>\r\n" + 
		"Returns a substring of <i>string</i> that\r\n" + 
		"begins at <i>index</i> and extends to the end of <i>string</i>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		" <b> T  </b><a name = T><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=tan></a>\r\n" + 
		"<b>tan(angle)</b><br>\r\n" + 
		"Returns the tangent of an angle (in radians).\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toBinary></a>\r\n" + 
		"<b>toBinary(number)</b><br>\r\n" + 
		"\r\n" + 
		"Returns a binary string representation of <i>number</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toHex></a>\r\n" + 
		"<b>toHex(number)</b><br>\r\n" + 
		"Returns a hexadecimal string representation of <i>number</i>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toLowerCase></a>\r\n" + 
		"<b>toLowerCase(string)</b><br>\r\n" + 
		"Returns a new string that is a copy of <i>string</i> with all the characters converted to lower case.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toolID></a>\r\n" + 
		"<b>toolID</b><br>\r\n" + 
		"Returns the ID of the currently selected tool.\r\n" + 
		"See also: <a href=\"#setTool\">setTool</a>,\r\n" + 
		"<a href=\"#getToolName\">IJ.getToolName</a>. \r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toScaled></a>\r\n" + 
		"<b>toScaled(x, y)</b><br>\r\n" + 
		"Converts unscaled pixel coordinates to scaled coordinates using\r\n" + 
		"the properties of the current image or plot. Also accepts arrays.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toUnscaled></a>\r\n" + 
		"<b>toUnscaled(x, y)</b><br>\r\n" + 
		"Converts scaled coordinates to unscaled pixel coordinates using\r\n" + 
		"the properties of the current image or plot. Also accepts arrays.\r\n" + 
		"Refer to the\r\n" + 
		"<a href=\"../../macros/examples/AdvancedPlots.txt\">AdvancedPlots</a>\r\n" + 
		"macro set for examples.\r\n" + 
		"\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>toScaled(length)</b><br>\r\n" + 
		"Converts (in place) a length in pixels to a scaled length using\r\n" + 
		"the properties of the current image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>toUnscaled(length)</b><br>\r\n" + 
		"Converts (in place) a scaled length to a length in pixels using\r\n" + 
		"the properties of the current image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toString></a>\r\n" + 
		"<b>toString(number)</b><br>\r\n" + 
		"Returns a decimal string representation of <i>number</i>.\r\n" + 
		"See also: \r\n" + 
		"<a href=\"#toBinary\">toBinary</a>,\r\n" + 
		"<a href=\"#toHex\">toHex</a>,\r\n" + 
		"<a href=\"#parseFloat\">parseFloat</a> and\r\n" + 
		"<a href=\"#parseInt\">parseInt</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>toString(number, decimalPlaces)</b><br>\r\n" + 
		"Converts <i>number</i> into a string, \r\n" + 
		"using the specified number of decimal places.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=toUpperCase></a>\r\n" + 
		"<b>toUpperCase(string)</b><br>\r\n" + 
		"Returns a new string that is a copy of <i>string</i> with all the characters converted to upper case.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		" <b> U  </b><a name = U><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=updateDisplay></a>\r\n" + 
		"<b>updateDisplay()</b><br>\r\n" + 
		"Redraws the active image.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=updateResults></a>\r\n" + 
		"<b>updateResults()</b><br>\r\n" + 
		"Call this function to update the \"Results\" window after the results table has been \r\n" + 
		"modified by calls to the setResult() function.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=V></a><a name=X></a><a name=Y></a><a name=Z></a>\r\n" + 
		" <b> W  </b><a name = W><a href='#Top'>[&nbsp;Top&nbsp;]</a><p>\r\n" + 
		"<a name=wait></a>\r\n" + 
		"<b>wait(n)</b><br>\r\n" + 
		"Delays (sleeps) for <i>n</i> milliseconds.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<a name=waitForUser></a>\r\n" + 
		"<b>waitForUser(string)</b><br>\r\n" + 
		"Halts the macro and displays <i>string</i> in a dialog box. The macro proceeds when the \r\n" + 
		"user clicks \"OK\".\r\n" + 
		"Unlike <a href=\"#showMessage\">showMessage</a>, the dialog box is not modal,\r\n" + 
		"so the user can, for example,\r\n" + 
		"create a selection or adjust the threshold while the dialog is open.\r\n" + 
		"To display a multi-line\r\n" + 
		"message, add newline characters (\"\\n\") to <i>string</i>. \r\n" + 
		"This function is based on \r\n" + 
		"Michael Schmid's\r\n" + 
		"<a href=\"http://imagejdocu.tudor.lu/imagej-documentation-wiki/plugins/wait_for_user\">Wait_For_User</a> plugin.\r\n" + 
		"Example:\r\n" + 
		"<a href=\"../../macros/WaitForUserDemo.txt\">WaitForUserDemo</a>.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>waitForUser(title, message)</b><br>\r\n" + 
		"This is a two argument version of <i>waitForUser</i>, where <i>title</i> is the dialog box title\r\n" + 
		"and <i>message</i> is the text dispayed in the dialog.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"<b>waitForUser</b><br>\r\n" + 
		"This is a no argument version of <i>waitForUser</i> that displays \"Click OK to continue\"\r\n" + 
		"in the dialog box.\r\n" + 
		"<p>\r\n" + 
		"\r\n" + 
		"</blockquote>\r\n" + 
		"\r\n" + 
		"<p class=navbar> <a href=\"functions.html\">top</a> | <a href=\"../../index.html\">home</a> | <a href=\"../../notes.html\">news</a> | <a href=\"../../docs/index.html\">docs</a> | <a href=\"../../download.html\">download</a> | <a href=\"../../plugins/index.html\">plugins</a> | <a href=\"../index.html\">resources</a> | <a href=\"../../list.html\">list</a> | <a href=\"../../links.html\">links</a></p>\r\n" + 
		"\r\n" + 
		"<small>Last updated 2017/05/01</small>\r\n" + 
		"\r\n" + 
		"</body>\r\n" + 
		"</html>\r\n" + 
		"";
}
