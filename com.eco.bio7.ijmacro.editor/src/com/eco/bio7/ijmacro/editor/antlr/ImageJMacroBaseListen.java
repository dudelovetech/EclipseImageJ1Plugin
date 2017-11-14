// Generated from ImageJMacro.g4 by ANTLR 4.4
package com.eco.bio7.ijmacro.editor.antlr;

import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.texteditor.IDocumentProvider;

import com.eco.bio7.ijmacro.editor.antlr.ImageJMacroParser.ForStatementContext;
import com.eco.bio7.ijmacro.editor.antlr.ImageJMacroParser.MacroBodyContext;
import com.eco.bio7.ijmacro.editor.antlr.ImageJMacroParser.MacroExpressionContext;
import com.eco.bio7.ijmacro.editor.antlr.ImageJMacroParser.MemberIndexExpressionContext;
import com.eco.bio7.ijmacro.editor.outline.IJMacroEditorOutlineNode;
import com.eco.bio7.ijmacro.editors.IJMacroEditor;

/**
 * This class provides an empty implementation of {@link ImageJMacroListener},
 * which can be extended to create a listener which only needs to handle a
 * subset of the available methods.
 */
public class ImageJMacroBaseListen extends ImageJMacroBaseListener {

	private Stack<IJMacroEditorOutlineNode> methods = new Stack<IJMacroEditorOutlineNode>();
	private IJMacroEditor editor;
	public ArrayList<String> startStop = new ArrayList<String>();

	public ImageJMacroBaseListen(IJMacroEditor editor) {
		this.editor = editor;
	}

	public void enterProgram(ImageJMacroParser.ProgramContext ctx) {
	}

	public void exitProgram(ImageJMacroParser.ProgramContext ctx) {

		if (methods.empty() == false) {
			methods.pop();
		}

	}

	public void enterAssignmentExpression(ImageJMacroParser.AssignmentExpressionContext ctx) {
		Token firstToken = ctx.getStart();
		int lineStart = firstToken.getStartIndex();
		String name = ctx.singleExpression(0).getText();
		/*Omit array assignments (x[i]=5;!*/
		if(ctx.singleExpression(0) instanceof MemberIndexExpressionContext){
			return;
		}
		/* Omit for loop variables! */
		if (ctx.getParent() != null) {
			ParserRuleContext par = ctx.getParent();
			if (par.getParent() != null) {
				ParserRuleContext par2 = par.getParent();
				if (par2 instanceof ForStatementContext) {
					return;
				}
			}
		}

		int line = calculateLine(lineStart);
		if (methods.size() == 0) {
			new IJMacroEditorOutlineNode(name, line, "variable", editor.baseNode);
		}

		else {
			new IJMacroEditorOutlineNode(name, line, "variable", methods.peek());
		}
	}

	public void enterVariableDeclarationStatement(ImageJMacroParser.VariableDeclarationStatementContext ctx) {

		Token firstToken = ctx.getStart();
		int lineStart = firstToken.getStartIndex();

		String name = ctx.Identifier().getText();
		// System.out.println(ctx.singleExpression(0).getParent().getClass());
		// Add to the editor folding action if enabled in the preferences!

		int line = calculateLine(lineStart);
		if (methods.size() == 0) {
			new IJMacroEditorOutlineNode(name, line, "globalvariable", editor.baseNode);
		}

		else {
			new IJMacroEditorOutlineNode(name, line, "globalvariable", methods.peek());
		}
	}

	public void exitAssignmentExpression(ImageJMacroParser.AssignmentExpressionContext ctx) {
	}

	public void enterFunctionDeclaration(ImageJMacroParser.FunctionDeclarationContext ctx) {
		Token firstToken = ctx.getStart();
		Token lastToken = ctx.getStop();
		int lineStart = firstToken.getStartIndex();
		String name = ctx.Identifier().getText();

		// Add to the editor folding action if enabled in the preferences!

		int lineMethod = calculateLine(lineStart);
		int lineEnd = lastToken.getStopIndex() + 1 - lineStart;
		startStop.add(lineStart + "," + lineEnd);

		/* Here we create the outline nodes in the Outline view! */
		if (methods.size() == 0) {

			methods.push(new IJMacroEditorOutlineNode(name, lineMethod, "function", editor.baseNode));

		} else {
			methods.push(new IJMacroEditorOutlineNode(name, lineMethod, "function", methods.peek()));

		}
	}

	public void exitFunctionDeclaration(ImageJMacroParser.FunctionDeclarationContext ctx) {
		if (methods.empty() == false) {
			methods.pop();
		}
	}

	public void enterMacroExpression(ImageJMacroParser.MacroExpressionContext ctx) {
		Token firstToken = ctx.getStart();
		Token lastToken = ctx.getStop();
		int lineStart = firstToken.getStartIndex();
		String name;
		if (ctx.StringLiteral() != null) {
			name = ctx.StringLiteral().getText();
		} else {
			return;
		}

		// Add to the editor folding action if enabled in the preferences!

		int lineMethod = calculateLine(lineStart);
		int lineEnd = lastToken.getStopIndex() + 1 - lineStart;
		startStop.add(lineStart + "," + lineEnd);

		/* Here we create the outline nodes in the Outline view! */
		if (methods.size() == 0) {

			methods.push(new IJMacroEditorOutlineNode(name, lineMethod, "macro", editor.baseNode));

		} else {
			methods.push(new IJMacroEditorOutlineNode(name, lineMethod, "macro", methods.peek()));

		}
	}

	public void exitMacroExpression(ImageJMacroParser.MacroExpressionContext ctx) {
		if (methods.empty() == false) {
			methods.pop();
		}
	}

	public void enterIterationStatements(ImageJMacroParser.IterationStatementsContext ctx) {
		Token firstToken = ctx.getStart();
		Token lastToken = ctx.getStop();
		int lineStart = firstToken.getStartIndex();
		if (lastToken != null) {
			int lineEnd = lastToken.getStopIndex() + 1 - lineStart;
			startStop.add(lineStart + "," + lineEnd);
		}

	}

	public void enterIfStatement(ImageJMacroParser.IfStatementContext ctx) {
		Token firstToken = ctx.getStart();
		Token lastToken = ctx.getStop();
		int lineStart = firstToken.getStartIndex();
		int lineEnd = lastToken.getStopIndex() + 1 - lineStart;
		startStop.add(lineStart + "," + lineEnd);
	}

	/* Calculates the line from the editor document! */
	private int calculateLine(int offsetStart) {
		IDocument document = null;
		int line = 0;
		if (editor.getEditorInput() != null && editor.getDocumentProvider() != null) {
			IDocumentProvider provider = editor.getDocumentProvider();
			document = provider.getDocument(editor.getEditorInput());
			int len = document.getLength();
			if (offsetStart >= 0 && offsetStart < len) {
				try {
					line = document.getLineOfOffset(offsetStart) + 1;
				} catch (BadLocationException e) {

					System.out.println("Bad line location!");
					System.out.println("\nLine Number: " + line);
					// e.printStackTrace();
				}
			}
		}
		return line;
	}

}