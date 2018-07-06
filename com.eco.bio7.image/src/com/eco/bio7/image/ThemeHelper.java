package com.eco.bio7.image;
/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*Source from: https://github.com/vogellacompany/org.eclipse.e4.ui.examples.css.rcp/blob/master/org.eclipse.e4.ui.examples.css.rcp/src/org/eclipse/e4/ui/examples/css/rcp/theme/ThemeHelper.java*/


import org.eclipse.core.runtime.Platform;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
import org.eclipse.e4.ui.css.swt.theme.IThemeManager;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ThemeHelper {
	private static IThemeEngine engine = null;
	private static Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);

	public static IThemeEngine getEngine() {
		if (engine == null) {
			engine = getThemeEngine();
		}
		return engine;
	}

	private static IThemeEngine getThemeEngine() {
		BundleContext context = bundle.getBundleContext();

		ServiceReference ref = context.getServiceReference(IThemeManager.class.getName());
		IThemeManager manager = (IThemeManager) context.getService(ref);

		return manager.getEngineForDisplay(PlatformUI.getWorkbench().getActiveWorkbenchWindow() == null ? Display.getCurrent() : PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getDisplay());
	}

}