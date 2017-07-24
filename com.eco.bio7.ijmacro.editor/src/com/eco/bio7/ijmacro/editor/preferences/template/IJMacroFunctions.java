package com.eco.bio7.ijmacro.editor.preferences.template;

public class IJMacroFunctions {
	public static String functions=""+
			"abs(n)####Returns the absolute value of n.\r\n" +
			"Array.concat(array1,array2)####Returns a new array created by joining two or more arrays or values (examples). Requires 1.46c.\r\n" + 
			"Array.copy(array)####Returns a copy of array.\r\n" + 
			"Array.fill(array, value)####Assigns the specified numeric value to each element of array.\r\n" + 
			"Array.getStatistics(array, min, max, mean, stdDev)####Returns the min, max, mean, and stdDev of array, which must contain all numbers.\r\n" + 
			"Array.print(array)####Prints the array on a single line. Requires 1.46c.\r\n" + 
			"Array.rankPositions(array)####Returns, as an array, the rank positions of array, which must contain all numbers or all strings (example). Requires 1.44k.\r\n" + 
			"Array.reverse(array)####Reverses (inverts) the order of the elements in array. Requires 1.46c.\r\n" + 
			"Array.slice(array,start,end)####Extracts a part of an array and returns it. (examples). Requires 1.46c.\r\n" + 
			"Array.sort(array)####Sorts array, which must contain all numbers or all strings. String sorts are case-insensitive in v1.44i or later.\r\n" + 
			"Array.trim(array, n)####Returns an array that contains the first n elements of array.\r\n"+
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
			"Dialog.create(\"Title\")####Creates a dialog box with the specified title. Call Dialog.addString(), Dialog.addNumber(), etc. to add components to the dialog. Call Dialog.show() to display the dialog and Dialog.getString(), Dialog.getNumber(), etc. to retrieve the values entered by the user. Refer to the DialogDemo macro for an example.\r\n"+
			"Dialog.addMessage(string)####Adds a message to the dialog. The message can be broken into multiple lines by inserting new line characters (\"\\n\") into the string.\r\n" + 
			"Dialog.addString(\"Label\", \"Initial text\")####Adds a text field to the dialog, using the specified label and initial text.\r\n" + 
			"Dialog.addString(\"Label\", \"Initial text\", columns)####Adds a text field to the dialog, where columns specifies the field width in characters.\r\n" + 
			"Dialog.addNumber(\"Label\", default)####Adds a numeric field to the dialog, using the specified label and default value.\r\n" + 
			"Dialog.addNumber(\"Label\", default, decimalPlaces, columns, units)####Adds a numeric field, using the specified label and default value. DecimalPlaces specifies the number of digits to right of decimal point, columns specifies the the field width in characters and units is a string that is displayed to the right of the field.\r\n" + 
			"Dialog.addSlider(\"Label\", min, max, default)####Adds a slider controlled numeric field to the dialog, using the specified label, and min, max and default values (example). Values with decimal points are used when (max-min)<=5 and min, max or default are non-integer. Requires 1.45f.\r\n" + 
			"Dialog.addCheckbox(\"Label\", default)####Adds a checkbox to the dialog, using the specified label and default state (true or false).\r\n" + 
			"Dialog.addCheckboxGroup(rows, columns, labels, defaults)####Adds a rowsxcolumns grid of checkboxes to the dialog, using the specified labels and default states (example).\r\n" + 
			"Dialog.addChoice(\"Label\", items)####Adds a popup menu to the dialog, where items is a string array containing the menu items.\r\n" + 
			"Dialog.addChoice(\"Label\", items, default)####Adds a popup menu, where items is a string array containing the choices and default is the default choice.\r\n" + 
			"Dialog.addHelp(url)####Adds a \"Help\" button that opens the specified URL in the default browser. This can be used to supply a help page for this dialog or macro. With v1.46b or later, displays an HTML formatted message if 'url' starts with \"<html>\" (example).\r\n" + 
			"Dialog.setInsets(top, left, bottom)####Overrides the default insets (margins) used for the next component added to the dialog.\r\n"+
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
			"File.append(string, path)####Appends string to the end of the specified file.\r\n" + 
			"File.close(f)####Closes the specified file, which must have been opened using File.open().\r\n" + 
			"File.dateLastModified(path)####Returns the date and time the specified file was last modified.\r\n" + 
			"File.delete(path)####Deletes the specified file or directory. With v1.41e or later, returns \"1\" (true) if the file or directory was successfully deleted. If the file is a directory, it must be empty. The file must be in the user's home directory, the ImageJ directory or the temp directory.\r\n" + 
			"File.directory####The directory path of the last file opened using open(), saveAs(), File.open() or File.openAsString().\r\n" + 
			"File.exists(path)####Returns \"1\" (true) if the specified file exists.\r\n" + 
			"File.getName(path)####Returns the last name in path's name sequence.\r\n" + 
			"File.getParent(path)####Returns the parent of the file specified by path.\r\n" + 
			"File.isDirectory(path)####Returns \"1\" (true) if the specified file is a directory.\r\n" + 
			"File.lastModified(path)####Returns the time the specified file was last modified as the number of milliseconds since January 1, 1970.\r\n" + 
			"File.length(path)####Returns the length in bytes of the specified file.\r\n" + 
			"File.makeDirectory(path)####Creates a directory.\r\n" + 
			"File.name####The name of the last file opened using a file open dialog, a file save dialog, drag and drop, or the open(path) function.\r\n" + 
			"File.nameWithoutExtension####The name of the last file opened with the extension removed.\r\n" + 
			"File.open(path)####Creates a new text file and returns a file variable that refers to it. To write to the file, pass the file variable to the print function. Displays a file save dialog box if path is an empty string. The file is closed when the macro exits. Currently, only one file can be open at a time. For an example, refer to the SaveTextFileDemo macro.\r\n" + 
			"File.openAsString(path)####Opens a text file and returns the contents as a string. Displays a file open dialog box if path is an empty string. Use lines=split(str,\"\\n\") to convert the string to an array of lines.\r\n" + 
			"File.openAsRawString(path)####Opens a file and returns up to the first 5,000 bytes as a string. Returns all the bytes in the file if the name ends with \".txt\". Refer to the First10Bytes and ZapGremlins macros for examples.\r\n" + 
			"File.openAsRawString(path, count)####Opens a file and returns up to the first count bytes as a string.\r\n" + 
			"File.openUrlAsString(url)####Opens a URL and returns the contents as a string. Returns an emptly string if the host or file cannot be found. With v1.41i and later, returns \"<Error: message>\" if there any error, including host or file not found.\r\n" + 
			"File.openDialog(title)####Displays a file open dialog and returns the path to the file choosen by the user (example). The macro exits if the user cancels the dialog.\r\n" + 
			"File.rename(path1, path2)####Renames, or moves, a file or directory. Returns \"1\" (true) if successful.\r\n" + 
			"File.saveString(string, path)####Saves string as a file.\r\n" + 
			"File.separator####Returns the file name separator character (\"/\" or \"\\\").\r\n" + 
			"fill()####Fills the image or selection with the current drawing color.\r\n" + 
			"fillOval(x, y, width, height)####Fills an oval bounded by the specified rectangle with the current drawing color. See also: drawOval, setColor, autoUpdate.\r\n" + 
			"fillRect(x, y, width, height)####Fills the specified rectangle with the current drawing color. See also: drawRect, setColor, autoUpdate.\r\n" + 
			"Fit.doFit(equation, xpoints, ypoints)####Fits the specified equation to the points defined by xpoints, ypoints. Equation can be either the equation name or an index. The equation names are shown in the drop down menu in the Analyze>Tools>Curve Fitting window. With ImageJ 1.42f or later, equation can be a string containing a user-defined equation (example).\r\n" + 
			"Fit.doFit(equation, xpoints, ypoints, initialGuesses)####Fits the specified equation to the points defined by xpoints, ypoints, using initial parameter values contained in initialGuesses, an array equal in length to the number of parameters in equation (example).\r\n" + 
			"Fit.rSquared####Returns R^2=1-SSE/SSD, where SSE is the sum of the squares of the errors and SSD is the sum of the squares of the deviations about the mean.\r\n" + 
			"Fit.p(index)####Returns the value of the specified parameter.\r\n" + 
			"Fit.nParams####Returns the number of parameters.\r\n" + 
			"Fit.f(x)####Returns the y value at x (example).\r\n" + 
			"Fit.nEquations####Returns the number of equations.\r\n" + 
			"Fit.getEquation(index, name, formula)####Gets the name and formula of the specified equation.\r\n" + 
			"Fit.plot####Plots the current curve fit.\r\n" + 
			"Fit.logResults####Causes doFit() to write a description of the curve fitting results to the Log window.\r\n" + 
			"Fit.showDialog####Causes doFit() to display the simplex settings dialog.\r\n" + 
			"floodFill(x, y)####Fills, with the foreground color, pixels that are connected to, and the same color as, the pixel at (x, y). With 1.37e or later, does 8-connected filling if there is an optional string argument containing \"8\", for example floodFill(x, y, \"8-connected\"). This function is used to implement the flood fill (paint bucket) macro tool.\r\n" + 
			"floor(n)####Returns the largest value that is not greater than n and is equal to an integer. See also: round.\r\n" + 
			"fromCharCode(value1,...,valueN)####This function takes one or more Unicode values and returns a string.\r\n" + 
			"getArgument()####Returns the string argument passed to macros called by runMacro(macro, arg), eval(macro), IJ.runMacro(macro, arg) or IJ.runMacroFile(path, arg).\r\n" + 
			"getBoolean(\"message\")####Displays a dialog box containing the specified message and \"Yes\", \"No\" and \"Cancel\" buttons. Returns true (1) if the user clicks \"Yes\", returns false (0) if the user clicks \"No\" and exits the macro if the user clicks \"Cancel\".\r\n" + 
			"getBoundingRect(x, y, width, height)####Replace by getSelectionBounds.\r\n" + 
			"getCursorLoc(x, y, z, modifiers)####Returns the cursor location in pixels and the mouse event modifier flags. The z coordinate is zero for 2D images. For stacks, it is one less than the slice number. For examples, see the GetCursorLocDemo and the GetCursorLocDemoTool macros.\r\n" + 
			"getDateAndTime(year, month, dayOfWeek, dayOfMonth, hour, minute, second, msec)####Returns the current date and time. For an example, refer to the GetDateAndTime macro. See also: getTime.\r\n" + 
			"getDimensions(width, height, channels, slices, frames)####Returns the dimensions of the current image. Requires 1.38s.\r\n" + 
			"getDirectory(string)####Displays a \"choose directory\" dialog and returns the selected directory, or returns the path to a specified directory, such as \"plugins\", \"home\", etc. The returned path ends with a file separator, either \"\\\" (Windows) or \"/\". Returns an empty string if the specified directory is not found or aborts the macro if the user cancels the \"choose directory\" dialog box. For examples, see the GetDirectoryDemo and ListFilesRecursively macros. See also: getFileList and the File functions.\r\n"+
			"getDirectory(\"Choose a Directory\")####Displays a file open dialog, using the argument as a title, and returns the path to the directory selected by the user.\r\n" + 
			"getDirectory(\"plugins\")####Returns the path to the plugins directory.\r\n" + 
			"getDirectory(\"macros\")####Returns the path to the macros directory.\r\n" + 
			"getDirectory(\"luts\")####Returns the path to the luts directory.\r\n" + 
			"getDirectory(\"image\")####Returns the path to the directory that the active image was loaded from.\r\n" + 
			"getDirectory(\"imagej\")####Returns the path to the ImageJ directory.\r\n" + 
			"getDirectory(\"startup\")####Returns the path to the directory that ImageJ was launched from.\r\n" + 
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
			"IJ.deleteRows(index1, index2)####Deletes rows index1 through index2 in the results table.\r\n" + 
			"IJ.getToolName()####Returns the name of the currently selected tool. See also: setTool.\r\n" + 
			"IJ.freeMemory()####Returns the memory status string (e.g., \"2971K of 658MB (<1%)\") that is displayed when the users clicks in the ImageJ status bar.\r\n" + 
			"IJ.currentMemory()####Returns, as a string, the amount of memory in bytes currently used by ImageJ.\r\n" + 
			"IJ.log(string)####Displays string in the Log window.\r\n" + 
			"IJ.maxMemory()####Returns, as a string, the amount of memory in bytes available to ImageJ. This value (the Java heap size) is set in the Edit>Options>Memory & Threads dialog box.\r\n" + 
			"IJ.pad(n, length)####Pads 'n' with leading zeros and returns the result (example). Requires 1.45d.\r\n" + 
			"IJ.redirectErrorMessages()####Causes next image opening error to be redirected to the Log window and prevents the macro from being aborted (example). Requires 1.43n.\r\n" + 
			"IJ.renameResults(name)####Changes the title of the Results table to the string name. Requires 1.44c.\r\n"+
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
			"lineTo(x, y)####Draws a line from current location to (x,y).\r\n" + 
			"List.set(key, value)####Adds a key/value pair to the list.\r\n" + 
			"List.get(key)####Returns the string value associated with key, or an empty string if the key is not found.\r\n" + 
			"List.getValue(key)####When used in an assignment statement, returns the value associated with key as a number. Aborts the macro if the value is not a number or the key is not found.\r\n" + 
			"List.size####Returns the size of the list.\r\n" + 
			"List.clear()####Resets the list.\r\n" + 
			"List.setList(list)####Loads the key/value pairs in the string list.\r\n" + 
			"List.getList####Returns the list as a string.\r\n" + 
			"List.setMeasurements####Measures the current image or selection and loads the resulting parameter names (as keys) and values. All parameters listed in the Analyze>Set Measurements dialog box are measured. Use List.getValue() in an assignment statement to retrieve the values. See the DrawEllipse macro for an example.\r\n" + 
			"List.setCommands####Loads the ImageJ menu commands (as keys) and the plugins that implement them (as values). Requires v1.43f. \r\n" + 
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
			"Overlay.moveTo(x, y)####Sets the current drawing location.\r\n" + 
			"Overlay.lineTo(x, y)####Draws a line from the current location to (x,y) .\r\n" + 
			"Overlay.drawLine(x1, y1, x2, y2)####Draws a line between (x1,y1) and (x2,y2)).\r\n" + 
			"Overlay.add####Adds the drawing created by Overlay.lineTo(), Overlay.drawLine(), etc. to the overlay without updating the display.\r\n" + 
			"Overlay.setPosition(n)####Sets the stack position (slice number) of the last item added to the overlay (example).\r\n" + 
			"Overlay.setPosition(c, z, t)####Sets the hyperstack position (channel, slice, frame) of the last item added to the overlay.\r\n" + 
			"Overlay.drawRect(x, y, width, height)####Draws a rectangle, where (x,y) specifies the upper left corner.\r\n" + 
			"Overlay.drawEllipse(x, y, width, height)####Draws an ellipse, where (x,y) specifies the upper left corner of the bounding rectangle.\r\n" + 
			"Overlay.drawString(\"text\", x, y)####Draws text at the specified location and adds it to the overlay. Use setFont() to specify the font and setColor to set specify the color (example).\r\n" + 
			"Overlay.drawString(\"text\", x, y, angle)####Draws text at the specified location and angle and adds it to the overlay (example).\r\n" + 
			"Overlay.show####Displays the current overlay.\r\n" + 
			"Overlay.hide####Hides the current overlay.\r\n" + 
			"Overlay.hidden####Returns true if the active image has an overlay and it is hidden.\r\n" + 
			"Overlay.remove####Removes the current overlay.\r\n" + 
			"Overlay.clear####Resets the overlay without updating the display.\r\n" + 
			"Overlay.size####Returns the size (selection count) of the current overlay. Returns zero if the image does not have an overlay.\r\n" + 
			"Overlay.addSelection####Adds the current selection to the overlay.\r\n" + 
			"Overlay.addSelection(strokeColor)####Sets the stroke color (\"red\", \"green\", \"ff8800\", etc.) of the current selection and adds it to the overlay.\r\n" + 
			"Overlay.addSelection(strokeColor, strokeWidth)####Sets the stroke color (\"blue\", \"yellow\", \"ffaa77\" etc.) and stroke width of the current selection and adds it to the overlay.\r\n" + 
			"Overlay.addSelection(\"\", 0, fillColor)####Sets the fill color (\"red\", \"green\", etc.) of the current selection and adds it to the overlay.\r\n" + 
			"Overlay.activateSelection(index)####Activates the specified overlay selection.\r\n" + 
			"Overlay.moveSelection(index, x, y)####Moves the specified selection to the specified location.\r\n" + 
			"Overlay.removeSelection(index)####Removes the specified selection from the overlay.\r\n" + 
			"Overlay.copy####Copies the overlay on the current image to the overlay clipboard.\r\n" + 
			"Overlay.paste####Copies the overlay on the overlay clipboard to the current image.\r\n" + 
			"Overlay.drawLabels(boolean)####Enables/disables overlay labels.\r\n" + 
			"Overlay.measure####Measures all the selections in the current overlay.\r\n"+
			"parseInt(string)####Converts string to an integer and returns it. Returns NaN if the string cannot be converted into a integer.\r\n" + 
			"parseInt(string, radix)####Converts string to an integer and returns it. The optional second argument (radix) specifies the base of the number contained in the string. The radix must be an integer between 2 and 36. For radixes above 10, the letters of the alphabet indicate numerals greater than 9. Set radix to 16 to parse hexadecimal numbers. Returns NaN if the string cannot be converted into a integer. For examples, see ParseFloatIntExamples.\r\n" + 
			"PI####Returns the constant π (3.14159265), the ratio of the circumference to the diameter of a circle.\r\n"+
			"Plot.create(\"Title\", \"X-axis Label\", \"Y-axis Label\", xValues, yValues)####Generates a plot using the specified title, axis labels and X and Y coordinate arrays. If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used as the X values. It is also permissible to specify no arrays and use Plot.setLimits() and Plot.add() to generate the plot. Use Plot.show() to display the plot in a window, or it will be displayed automatically when the macro exits.\r\n" + 
			"Plot.add(type, xValues, yValues)####Adds a curve, set of points or error bars to a plot created using Plot.create(). If only one array is specified it is assumed to contain the Y values and a 0..n-1 sequence is used as the X values. The first argument (type) can be \"line\", \"circles\", \"boxes\", \"triangles\", \"crosses\", \"dots\", \"x\", \"connected\" (requires 1.49t), \"error bars\" (in y direction) or \"xerror bars\". In 1.49t or later, error bars apply to the last dataset provided by Plot.create or Plot.add.\r\n" + 
			"Plot.drawVectors(xStarts, yStarts, xEnds, yEnds)####Draws arrows from the starting to ending coordinates contained in the arrays.\r\n" + 
			"Plot.drawLine(x1, y1, x2, y2)####Draws a line between x1,y1 and x2,y2, using the coordinate system defined by Plot.setLimits().\r\n" + 
			"Plot.drawNormalizedLine(x1, y1, x2, y2)####Draws a line using a normalized 0-1, 0-1 coordinate system, with (0,0) at the top left and (1,1) at the lower right corner.\r\n" + 
			"Plot.addText(\"A line of text\", x, y)####Adds text to the plot at the specified location, where (0,0) is the upper left corner of the the plot frame and (1,1) is the lower right corner. Call Plot.setJustification() to have the text centered or right justified. Plot.setLimits(xMin, xMax, yMin, yMax)\r\n" + 
			"Plot.setLimits(xMin, xMax, yMin, yMax)####Sets the range of the x-axis and y-axis of plots. With version 1.50g and later, when 'NaN' is used as a limit, the range is calculated automatically from the plots that have been added so far.\r\n" + 
			"Plot.getLimits(xMin, xMax, yMin, yMax)####Returns the current axis limits. Note that min>max if the axis is reversed. Requires 1.49t.\r\n" + 
			"Plot.setLimitsToFit()####Sets the range of the x and y axes to fit all data. Requires 1.49t.\r\n" + 
			"Plot.setColor(color)####Specifies the color used in subsequent calls to Plot.add() or Plot.addText(). The argument can be \"black\", \"blue\", \"cyan\", \"darkGray\", \"gray\", \"green\", \"lightGray\", \"magenta\", \"orange\", \"pink\", \"red\", \"white\", \"yellow\", or a hex value like \"#ff00ff\". Note that the curve specified in Plot.create() is drawn last.\r\n" + 
			"Plot.setColor(color1, color2)####This is a two argument version of Plot.setColor, where the second argument is used for filling symbols or as the line color for connected points. Requires 1.49t.\r\n" + 
			"Plot.setBackgroundColor(color)####Sets the background color of the plot frame (example). Requires 1.49h.\r\n" + 
			"Plot.setLineWidth(width)####Specifies the width of the line used to draw a curve. Points (circle, box, etc.) are also drawn larger if a line width greater than one is specified. Note that the curve specified in Plot.create() is the last one drawn before the plot is dispayed or updated.\r\n" + 
			"Plot.setJustification(\"center\")####Specifies the justification used by Plot.addText(). The argument can be \"left\", \"right\" or \"center\". The default is \"left\".\r\n" + 
			"Plot.setLegend(\"label1\\tlabel2...\", \"options\")####Creates a legend for each of the data sets added with Plot.create and Plot.add. In the first argument, the labels for the data sets should be separated with tab or newline characters. The optional second argument can contain the legend position (\"top-left\", \"top-right\", \"bottom-left\", \"bottom-right\"; default is automatic positioning), \"bottom-to-top\" for reversed sequence of the labels, and \"transparent\" to make the legend background transparent. Requires 1.49t.\r\n" + 
			"Plot.setFrameSize(width, height)####Sets the plot frame size in pixels, overriding the default size defined in the Edit>Options>Profile Plot Options dialog box.\r\n" + 
			"Plot.setLogScaleX(boolean)####Sets the x axis scale to Logarithmic, or back to linear if the optional boolean argument is false. In versions up to 1.49s, it must be called immediately after Plot.create and before Plot.setLimits. See the LogLogPlot macro for an example.\r\n" + 
			"Plot.setLogScaleY(boolean)####Sets the y axis scale to Logarithmic, or back to linear if the optional boolean argument is false.\r\n" + 
			"Plot.setXYLabels(\"x Label\", \"y Label\")####Sets the axis labels. Requires 1.49t.\r\n" + 
			"Plot.setFontSize(size, \"options\")####Sets the default font size in the plot (otherwise specified in Profile Plot Options), used e.g. for axes labels. Can be also called prior to Plot.addText. The optional second argument can include \"bold\" and/or \"italic\". Requires 1.49t.\r\n" + 
			"Plot.setAxisLabelSize(size, \"options\")####Sets the fort size of the axis labels. The optional second argument can include \"bold\" and/or \"italic\". Requires 1.49t. Plot.setFormatFlags(\"11001100001111\")\r\n" + 
			"Plot.setFormatFlags(\"11001100001111\")####Controls whether to draw axes labels, grid lines and ticks (major/minor/ticks for log axes). Use the macro recorder and More>>Axis Options in any plot window to determine the binary code. Requires 1.49t.\r\n" + 
			"Plot.useTemplate(\"plot name\" or id)####Transfers the formatting of an open plot window to the current plot. Requires 1.49t.\r\n" + 
			"Plot.makeHighResolution(factor)####Creates a high-resolution image of the plot enlarged by factor. Add the second argument \"disable\" to avoid antialiased text. Requires 1.49t. Plot.show()\r\n" + 
			"Plot.show()####Displays the plot generated by Plot.create(), Plot.add(), etc. in a window. This function is automatically called when a macro exits.\r\n" + 
			"Plot.update()####Draws the plot generated by Plot.create(), Plot.add(), etc. in an existing plot window. Equivalent to Plot.show if no plot window is open.\r\n" + 
			"Plot.getValues(xpoints, ypoints)####Returns the values displayed by clicking on \"List\" in a plot or histogram window (example).\r\n" + 
			"Plot.showValues()####Displays the plot values in the Results window. Must be preceded by Plot.show.\r\n" + 
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
			"Roi.contains(x, y)####Returns \"1\" if the point x,y is inside the current selection or \"0\" if it is not. Aborts the macro if there is no selection. Requires 1.49h. See also: selectionContains.\r\n" + 
			"Roi.getBounds(x, y, width, height)####Returns the location and size of the selection's bounding rectangle.\r\n" + 
			"Roi.getCoordinates(xpoints, ypoints)####Returns, as two arrays, the x and y coordinates that define this selection.\r\n" + 
			"Roi.getDefaultColor####Returns the current default selection color.\r\n" + 
			"Roi.getStrokeColor####Returns the selection stroke color.\r\n" + 
			"Roi.getFillColor####Returns the selection fill color.\r\n" + 
			"Roi.getName####Returns the selection name or an empty string if the selection does not have a name.\r\n" + 
			"Roi.getProperty(key)####Returns the value (a string) associated with the specified key or an empty string if the key is not found.\r\n" + 
			"Roi.setProperty(key, value)####Adds the specified key and value pair to the selection properties. Assumes a value of \"1\" (true) if there is only one argument.\r\n" + 
			"Roi.getProperties####Returns all selection properties or an empty string if the selection does not have properties.\r\n" + 
			"Roi.getSplineAnchors(x, y)####Returns the x and y coordinates of the anchor points of a spline fitted selection (example).\r\n" + 
			"Roi.setPolygonSplineAnchors(x, y)####Creates or updates a spline fitted polygon selection (example).\r\n" + 
			"Roi.setPolylineSplineAnchors(x, y)####Creates or updates a spline fitted polyline selection (example).\r\n" + 
			"Roi.getType####Returns, as a string, the type of the current selection.\r\n" + 
			"Roi.move(x, y)####Moves the selection to the specified location.\r\n" + 
			"Roi.setStrokeColor(color)####Sets the selection stroke color (\"red\", \"5500ff00\". etc.).\r\n" + 
			"Roi.setStrokeColor(red, green, blue)####Sets the selection stroke color, where 'red', 'green' and 'blue' are integers (0-255).\r\n" + 
			"Roi.setStrokeColor(rgb)####Sets the selection stroke color, where 'rgb' is an integer.\r\n" + 
			"Roi.setFillColor(color)####Sets the selection fill color (\"red\", \"5500ff00\". etc.).\r\n" + 
			"Roi.setFillColor(red, green, blue)####Sets the selection fill color, where 'red', 'green' and 'blue' are integers (0-255).\r\n" + 
			"Roi.setFillColor(rgb)####Sets the selection fill color, where 'rgb' is an integer.\r\n" + 
			"Roi.setName(name)####Sets the selection name.\r\n" + 
			"Roi.setStrokeWidth(width)####Sets the selection stroke width."+
			"roiManager(\"and\")####Uses the conjunction operator on the selected ROIs, or all ROIs if none are selected, to create a composite selection.\r\n" + 			
			"roiManager(\"add\")####Adds the current selection to the ROI Manager.\r\n" + 			
			"roiManager(\"add & draw\")####Outlines the current selection and adds it to the ROI Manager.\r\n" + 
 			"roiManager(\"combine\")####Uses the union operator on the selected ROIs to create a composite selection. Combines all ROIs if none are selected.\r\n" + 
 			"roiManager(\"count\")####Returns the number of ROIs in the ROI Manager list.\r\n" + 
			"roiManager(\"delete\")####Deletes the selected ROIs from the list, or deletes all ROIs if none are selected.\r\n" + 
			"roiManager(\"deselect\")####Deselects all ROIs in the list. When ROIs are deselected, subsequent ROI Manager commands are applied to all ROIs.\r\n" + 
			"roiManager(\"draw\")####Draws the selected ROIs, or all ROIs if none are selected, using the equivalent of the Edit>Draw command.\r\n" + 
			"roiManager(\"fill\")####Fills the selected ROIs, or all ROIs if none are selected, using the equivalent of the Edit>Fill command.\r\n" + 
			"roiManager(\"index\")####Returns the index of the currently selected ROI on the list, or -1 if the list is empty or no ROIs are selected. Returns the index of the first selected ROI if more than one is selected\r\n" + 
			"roiManager(\"measure\")####Measures the selected ROIs, or if none is selected, all ROIs on the list.\r\n" +  
			"roiManager(\"multi measure\")####Measures all the ROIs on all slices in the stack, creating a Results Table with one row per slice.\r\n" + 
			"roiManager(\"multi-measure append\")####Measures all the ROIs on all slices in the stack, appending the measurements to the Results Table, with one row per slice.\r\n" + 
			"roiManager(\"multi-measure one\")####Measures all the ROIs on all slices in the stack, creating a Results Table with one row per measurement.\r\n" + 
			"roiManager(\"multi plot\")####Plots the selected ROIs, or all ROIs if none are selected, on a single graph.\r\n" + 
			"roiManager(\"open\", file-path)####Opens a .roi file and adds it to the list or opens a ZIP archive (.zip file) and adds all the selections contained in it to the list.\r\n" + 
			"roiManager(\"remove slice info\")####Removes the information in the ROI names that associates them with particular stack slices.\r\n" + 
			"roiManager(\"rename\", name)####Renames the selected ROI. You can get the name of an ROI on the list using call(\"ij.plugin.frame.RoiManager.getName\", index).\r\n" + 
			"roiManager(\"reset\")####Deletes all ROIs on the list.\r\n" + 
			"roiManager(\"save, file-path)####Saves all the ROIs on the list in a ZIP archive.\r\n" + 
			"roiManager(\"save selected\", file-path)####Saves the selected ROI as a .roi file.\r\n" + 
			"roiManager(\"select\", index)####Selects an item in the ROI Manager list, where index must be greater than or equal zero and less than the value returned by roiManager(\"count\"). Note that macros that use this function sometimes run orders of magnitude faster in batch mode. Use roiManager(\"deselect\") to deselect all items on the list. For an example, refer to the ROI Manager Stack Demo macro.\r\n" + 
			"roiManager(\"select\", indexes)####Selects multiple items in the ROI Manager list, where indexes is an array of integers, each of which must be greater than or equal to 0 and less than the value returned by roiManager(\"count\"). The selected ROIs are not highlighted in the ROI Manager list and are no longer selected after the next ROI Manager command is executed.\r\n" + 
			"roiManager(\"show all\")####Displays all the ROIs as an overlay.\r\n" + 
			"roiManager(\"show all with labels\")####Displays all the ROIs as an overlay, with labels.\r\n" +  
			"roiManager(\"show all without labels\")####Displays all the ROIs as an overlay, without labels.\r\n" +  
			"roiManager(\"show none\")####Removes the ROI Manager overlay.\r\n" +  
			"roiManager(\"sort\")####Sorts the ROI list in alphanumeric order.\r\n" + 
			"roiManager(\"split\")####Splits the current selection (it must be a composite selection) into its component parts and adds them to the ROI Manager.\r\n" +  
			"roiManager(\"update\")####Replaces the selected ROI on the list with the current selection."+
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
			"setOption(option, boolean)####Enables or disables an ImageJ option, where option is one of the following options and boolean is either true or false. \"AutoContrast\" enables/disables the Edit>Options>Appearance \"Auto contrast stacks\" option. You can also have newly displayed stack slices contrast enhanced by holding the shift key down when navigating stacks. \"Bicubic\" provides a way to force commands like Edit>Selection>Straighten, that normally use bilinear interpolation, to use bicubic interpolation. \"BlackBackground\" enables/disables the Process>Binary>Options \"Black background\" option. \"Changes\" sets/resets the 'changes' flag of the current image. Set this option false to avoid \"Save Changes?\" dialog boxes when closing images. \"DebugMode\" enables/disables the ImageJ debug mode. ImageJ displays information, such as TIFF tag values, when it is in debug mode. \"DisablePopupMenu\" enables/disables the the menu displayed when you right click on an image. \"DisableUndo\" enables/disables the Edit>Undo command. Note that a setOption(\"DisableUndo\",true) call without a corresponding setOption(\"DisableUndo\",false) will cause Edit>Undo to not work as expected until ImageJ is restarted. \"Display label\", \"Limit to threshold\", \"Area\", \"Mean\" and \"Std\", \"Perimeter\", \"Stack position\" and \"Add to overlay\" enable/disable the corresponding Analyze>Set Measurements options. \"ExpandableArrays\" enables/disables support for auto-expanding arrays (example). Note that macros that use auto-expanding arrays will not be compatible with Image 2.0. \"JFileChooser\" enables/disables use of the Java JFileChooser to open and save files instead of the native OS file chooser. \"Loop\" enables/disables the Image>Stacks>Tools>Animation Options \"Loop back and forth\" option. \"OpenUsingPlugins\" controls whether standard file types (TIFF, JPEG, GIF, etc.) are opened by external plugins or by ImageJ (example). \"QueueMacros\" controls whether macros invoked using keyboard shortcuts run sequentially on the event dispatch thread (EDT) or in separate, possibly concurrent, threads (example). In \"QueueMacros\" mode, screen updates, which also run on the EDT, are delayed until the macro finishes. \"Show All\" enables/disables the the \"Show All\" mode in the ROI Manager. \"ShowAngle\" determines whether or not the \"Angle\" value is displayed in the Results window when measuring straight line lengths. Requires 1.49c. \"ShowMin\" determines whether or not the \"Min\" value is displayed in the Results window when \"Min & Max Gray Value\" is enabled in the Analyze>Set Measurements dialog box. \"ShowRowNumbers\" enables/disables display of Results table row numbers (example). \"AntialiasedText\" controls the \"Antialiased text\" option in the Edit>Options>Fonts dialog. Requires v1.51h. "+
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
			"Stack.setChannel(n)####Displays channel n.\r\n" + 
			"Stack.setSlice(n)####Displays slice n.\r\n" + 
			"Stack.setFrame(n)####Displays frame n.\r\n" + 
			"Stack.getPosition(channel, slice, frame)####Returns the current position.\r\n" + 
			"Stack.setPosition(channel, slice, frame)####Sets the position.\r\n" + 
			"Stack.getFrameRate()####Returns the frame rate (FPS).\r\n" + 
			"Stack.setFrameRate(fps)####Sets the frame rate.\r\n" + 
			"Stack.getFrameInterval()####Returns the frame interval in time (T) units.\r\n" + 
			"Stack.setFrameInterval(interval)####Sets the frame interval in time (T) units.\r\n" + 
			"Stack.getUnits(X, Y, Z, Time, Value)####Returns the x, y, z, time and value units.\r\n" + 
			"Stack.setTUnit(string)####Sets the time unit.\r\n" + 
			"Stack.setZUnit(string)####Sets the Z-dimension unit.\r\n" + 
			"Stack.setDisplayMode(mode)####Sets the display mode, where mode is \"composite\", \"color\" or \"grayscale\". Requires a multi-channel stack and v1.40a or later.\r\n" + 
			"Stack.getDisplayMode(mode)####Sets the string mode to the current display mode.\r\n" + 
			"Stack.setActiveChannels(string)####Controls which channels in a composite color image are displayed, where string is a list of ones and zeros that specify the channels to display. For example, \"101\" causes channels 1 and 3 to be displayed.\r\n" + 
			"Stack.getActiveChannels(string)####Returns a string that represents the state of the channels in a composite color image, where '1' indicates a displayed channel and '0' indicates an inactive channel.\r\n" + 
			"Stack.swap(n1, n2)####Swaps the two specified stack images, where n1 and n2 are integers greater than 0 and less than or equal to nSlices.\r\n" + 
			"Stack.getStatistics(voxelCount, mean, min, max, stdDev)####Calculates and returns stack statistics.\r\n" + 
			"Stack.setOrthoViews(x, y, z)####If an Orthogonal Views is active, its crosspoint is set to x, y, z (example).\r\n" + 
			"Stack.getOrthoViewsID####Returns the image ID of the current Orthogonal Views, or zero if none is active.\r\n" + 
			"Stack.stopOrthoViews####Stops the current Orthogonal Views and closes the \"YZ\" and \"XZ\" windows.\r\n"+
			"String.resetBuffer####Resets (clears) the buffer.\r\n" + 
			"String.append(str)####Appends str to the buffer.\r\n" + 
			"String.buffer####Returns the contents of the buffer.\r\n" + 
			"String.copy(str)####Copies str to the clipboard.\r\n" + 
			"String.copyResults####Copies the Results table to the clipboard.\r\n" +
			"String.getResultsHeadings####Returns the Results window headers.\r\n"+
			"String.paste####Returns the contents of the clipboard.\r\n" + 
			"String.show(str)####Displays str in a text window.\r\n" + 
			"String.show(title, str)####Displays str in a text window using title as the title.\r\n"+
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
			
}
