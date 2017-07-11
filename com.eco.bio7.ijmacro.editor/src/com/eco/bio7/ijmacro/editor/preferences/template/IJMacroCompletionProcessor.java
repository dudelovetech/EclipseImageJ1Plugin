/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.eco.bio7.ijmacro.editor.preferences.template;

import org.eclipse.swt.graphics.Image;
import com.eco.bio7.ijmacro.editors.TemplateEditorUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.eclipse.jface.text.templates.TemplateContext;

/**
 * A completion processor for Java and BeanShell templates.
 */
public class IJMacroCompletionProcessor extends TemplateCompletionProcessor {
	private static final String DEFAULT_IMAGE = "$nl$/icons/template_obj.png"; //$NON-NLS-1$
	private static final String METHOD_IMAGE = "$nl$/icons/methpub_obj.png"; //$NON-NLS-1$
	private static final Comparator fgProposalComparator = new ProposalComparator();
	private static String[] splitted = IJMacroFunctions.functions.split(System.lineSeparator());
	private int count = 0;// Variable to count the listed template.
	private int defaultTemplatesLength;

	/**
	 * We watch for angular brackets since those are often part of XML templates.
	 * 
	 * @param viewer
	 *            the viewer
	 * @param offset
	 *            the offset left of which the prefix is detected
	 * @return the detected prefix
	 */
	private static final class ProposalComparator implements Comparator<Object> {
		public int compare(Object o1, Object o2) {
			return ((TemplateProposal) o2).getRelevance() - ((TemplateProposal) o1).getRelevance();
		}
	}

	/* Extend prefixes for macro functions with a dot, e.g. t.test() */
	protected String extractPrefix(ITextViewer viewer, int offset) {
		int i = offset;
		IDocument document = viewer.getDocument();
		if (i > document.getLength())
			return "";

		try {
			while (i > 0) {
				char ch = document.getChar(i - 1);
				/*
				 * We need to extra include the '@' character for S4 class vars!
				 */
				if (!Character.isJavaIdentifierPart(ch) && (ch == '.') == false)
					break;
				i--;
			}

			return document.get(i, offset - i);
		} catch (BadLocationException e) {
			return "";
		}
	}

	/**
	 * Cut out angular brackets for relevance sorting, since the template name does
	 * not contain the brackets.
	 * 
	 * @param template
	 *            the template
	 * @param prefix
	 *            the prefix
	 * @return the relevance of the <code>template</code> for the given
	 *         <code>prefix</code>
	 */
	protected int getRelevance(Template template, String prefix) {
		if (prefix.startsWith("<"))
			prefix = prefix.substring(1);
		if (template.getName().startsWith(prefix))
			return 90;
		return 0;
	}

	/**
	 * Simply return all templates.
	 * 
	 * @param contextTypeId
	 *            the context type, ignored in this implementation
	 * @return all templates
	 */
	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		count = 0;
		String prefix = extractPrefix(viewer, offset);

		Region region = null;
		List<ICompletionProposal> matches = new ArrayList<ICompletionProposal>();
		region = new Region(offset - prefix.length(), prefix.length());
		TemplateContext context = createContext(viewer, region);

		Template[] templates = getTemplates(context.getContextType().getId());
		defaultTemplatesLength = templates.length;

		for (int i = 0; i < templates.length; i++) {
			Template template = templates[i];
			try {
				context.getContextType().validate(template.getPattern());
			} catch (TemplateException e) {
				continue;
			}
			if (template.matches(prefix, context.getContextType().getId())) {
				matches.add(createProposal(template, context, (IRegion) region, getRelevance(template, prefix)));
			}

		}

		Template[] tempLocalFunctions = new Template[splitted.length];
		for (int i = 0; i < splitted.length; i++) {
			String[] funArray = splitted[i].split("####");

			tempLocalFunctions[i] = new Template(funArray[0], funArray[1], context.getContextType().getId(),
					funArray[0] + "${cursor}", true);

			Template template = tempLocalFunctions[i];
			try {
				context.getContextType().validate(template.getPattern());
			} catch (TemplateException e) {
				continue;
			}
			if (template.matches(prefix, context.getContextType().getId()))
				matches.add(createProposal(template, context, (IRegion) region, getRelevance(template, prefix)));

		}


		Collections.sort(matches, fgProposalComparator);

		ICompletionProposal[] pro = (ICompletionProposal[]) matches.toArray(new ICompletionProposal[matches.size()]);

		// triggerNext = true;

		return pro;

	}

	protected Template[] getTemplates(String contextTypeId) {
		return TemplateEditorUI.getDefault().getTemplateStore().getTemplates();
	}
	// add the chars for Completion here !!!
	/*
	 * public char[] getCompletionProposalAutoActivationCharacters() { return new
	 * char[] { 'f','g' }; }
	 */

	/**
	 * Return the XML context type that is supported by this plug-in.
	 * 
	 * @param viewer
	 *            the viewer, ignored in this implementation
	 * @param region
	 *            the region, ignored in this implementation
	 * @return the supported XML context type
	 */
	protected TemplateContextType getContextType(ITextViewer viewer, IRegion region) {
		return TemplateEditorUI.getDefault().getContextTypeRegistry()
				.getContextType(IJMacroContextType.XML_CONTEXT_TYPE);
	}

	/**
	 * Always return the default image.
	 * 
	 * @param template
	 *            the template, ignored in this implementation
	 * @return the default template image
	 */
	protected Image getImage(Template template) {

		if (count < defaultTemplatesLength) {
			count++;
			ImageRegistry registry = TemplateEditorUI.getDefault().getImageRegistry();
			Image image = registry.get(DEFAULT_IMAGE);
			if (image == null) {
				ImageDescriptor desc = TemplateEditorUI.imageDescriptorFromPlugin("com.eco.bio7.ijmacro.editor", //$NON-NLS-1$
						DEFAULT_IMAGE);
				registry.put(DEFAULT_IMAGE, desc);
				image = registry.get(DEFAULT_IMAGE);
			}
			return image;

		} else {

			ImageRegistry registry = TemplateEditorUI.getDefault().getImageRegistry();
			Image image = registry.get(METHOD_IMAGE);
			if (image == null) {
				ImageDescriptor desc = TemplateEditorUI.imageDescriptorFromPlugin("com.eco.bio7.ijmacro.editor", //$NON-NLS-1$
						METHOD_IMAGE);
				registry.put(METHOD_IMAGE, desc);
				image = registry.get(METHOD_IMAGE);
			}
			return image;

		}
	}

}
