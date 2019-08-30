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
package com.eco.bio7.ijmacro.editor.toolbar.debug;

import java.net.Socket;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.ITextEditor;
import com.eco.bio7.ijmacro.editor.IJMacroEditorPlugin;
import com.eco.bio7.ijmacro.editors.IJMacroEditor;

public class DebugIjMacroScript extends Action {
	private IEditorPart part;
	private IMarker[] markers;
	boolean untrace = false;
	private IEditorPart editor;

	public DebugIjMacroScript() {
		super("Debug");

		setId("Debug");
		setText("Debug Action");

		//ImageDescriptor desc = ImageDescriptor.createFromImage(new Image(Display.getCurrent(), getClass().getResourceAsStream("/pics/rundebug.gif")));
		ImageDescriptor desc = IJMacroEditorPlugin.getImageDescriptor("/icons/ijmacrodebug/rundebug.png");
		this.setImageDescriptor(desc);
	}

	public void dispose() {

	}

	public void init(IWorkbenchWindow window) {

	}

	public void run() {

		IEditorPart editore = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getActiveEditor();
		if (editore != null) {
			IJMacroEditor editor = (IJMacroEditor) editore;
			editor.enableDebugging();
			/*
			 * Changes Mac OS 9 (CR) and Windows (CRLF) line separators to line feeds (LF).
			 */
			editor.fixLineEndings();
			editor.runMacro(true);

			//editor = (IEditorPart) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			if (editor.isDirty()) {
				editor.doSave(new NullProgressMonitor());
			}

			IResource resource = (IResource) editor.getEditorInput().getAdapter(IResource.class);

			IDocument doc = ((ITextEditor) editor).getDocumentProvider().getDocument(editor.getEditorInput());

			IEditorInput editorInput = editor.getEditorInput();
			IFile aFile = null;

			if (editorInput instanceof IFileEditorInput) {
				aFile = ((IFileEditorInput) editorInput).getFile();
			}
			String loc = aFile.getLocation().toString();

			// Work.openView("com.eco.bio7.rbridge.debug.DebugVariablesView");
			/* Find the line numbers of the markers! */
			int lineNum = 0;
			String expression = null;

			if (resource != null) {
				Map<Integer, String> map1 = findMyMarkers(resource);
				/* Sorting the Map with a Treemap! */
				Map<Integer, String> map = new TreeMap<Integer, String>(map1);

				for (Map.Entry<Integer, String> entry : map.entrySet()) {

					lineNum = entry.getKey();
					expression = entry.getValue();

					if (lineNum > 0) {

					}
					/* If an expression is available! */
					else {

					}
				}
			}

		}

	}

	public Map<Integer, String> findMyMarkers(IResource target) {
		String type = "com.eco.bio7.redit.debugMarker";

		try {
			markers = target.findMarkers(type, false, IResource.DEPTH_ZERO);

		} catch (CoreException e) {

			e.printStackTrace();
		}

		Map<Integer, String> map1 = new HashMap<Integer, String>();

		for (int i = 0; i < markers.length; ++i) {
			try {
				map1.put((Integer) markers[i].getAttribute(IMarker.LINE_NUMBER),
						(String) markers[i].getAttribute(IMarker.MESSAGE));

			} catch (CoreException e) {

				e.printStackTrace();
			}
		}

		return map1;
	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

	public void selectionChanged(IAction action, ISelection selection) {

	}

	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		part = targetEditor;
	}

}
