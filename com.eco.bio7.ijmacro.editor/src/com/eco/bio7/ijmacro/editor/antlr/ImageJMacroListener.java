// Generated from ImageJMacro.g4 by ANTLR 4.6
package com.eco.bio7.ijmacro.editor.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ImageJMacroParser}.
 */
public interface ImageJMacroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ImageJMacroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ImageJMacroParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(ImageJMacroParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(ImageJMacroParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(ImageJMacroParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(ImageJMacroParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ImageJMacroParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ImageJMacroParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ImageJMacroParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ImageJMacroParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(ImageJMacroParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(ImageJMacroParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableStatement(ImageJMacroParser.VariableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#variableStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableStatement(ImageJMacroParser.VariableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationList(ImageJMacroParser.VariableDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#variableDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationList(ImageJMacroParser.VariableDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ImageJMacroParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ImageJMacroParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void enterInitialiser(ImageJMacroParser.InitialiserContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#initialiser}.
	 * @param ctx the parse tree
	 */
	void exitInitialiser(ImageJMacroParser.InitialiserContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(ImageJMacroParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(ImageJMacroParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(ImageJMacroParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(ImageJMacroParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ImageJMacroParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ImageJMacroParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(ImageJMacroParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(ImageJMacroParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ImageJMacroParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ImageJMacroParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ImageJMacroParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ImageJMacroParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarStatement(ImageJMacroParser.ForVarStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarStatement(ImageJMacroParser.ForVarStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(ImageJMacroParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(ImageJMacroParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForVarInStatement(ImageJMacroParser.ForVarInStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForVarInStatement}
	 * labeled alternative in {@link ImageJMacroParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForVarInStatement(ImageJMacroParser.ForVarInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(ImageJMacroParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(ImageJMacroParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(ImageJMacroParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(ImageJMacroParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ImageJMacroParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ImageJMacroParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(ImageJMacroParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#withStatement}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(ImageJMacroParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ImageJMacroParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ImageJMacroParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ImageJMacroParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ImageJMacroParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void enterCaseClauses(ImageJMacroParser.CaseClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#caseClauses}.
	 * @param ctx the parse tree
	 */
	void exitCaseClauses(ImageJMacroParser.CaseClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void enterCaseClause(ImageJMacroParser.CaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#caseClause}.
	 * @param ctx the parse tree
	 */
	void exitCaseClause(ImageJMacroParser.CaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultClause(ImageJMacroParser.DefaultClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#defaultClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultClause(ImageJMacroParser.DefaultClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabelledStatement(ImageJMacroParser.LabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#labelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabelledStatement(ImageJMacroParser.LabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(ImageJMacroParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(ImageJMacroParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(ImageJMacroParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(ImageJMacroParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void enterCatchProduction(ImageJMacroParser.CatchProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#catchProduction}.
	 * @param ctx the parse tree
	 */
	void exitCatchProduction(ImageJMacroParser.CatchProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void enterFinallyProduction(ImageJMacroParser.FinallyProductionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#finallyProduction}.
	 * @param ctx the parse tree
	 */
	void exitFinallyProduction(ImageJMacroParser.FinallyProductionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterDebuggerStatement(ImageJMacroParser.DebuggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#debuggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitDebuggerStatement(ImageJMacroParser.DebuggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(ImageJMacroParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(ImageJMacroParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ImageJMacroParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ImageJMacroParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(ImageJMacroParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(ImageJMacroParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ImageJMacroParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ImageJMacroParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(ImageJMacroParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(ImageJMacroParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#elision}.
	 * @param ctx the parse tree
	 */
	void enterElision(ImageJMacroParser.ElisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#elision}.
	 * @param ctx the parse tree
	 */
	void exitElision(ImageJMacroParser.ElisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ImageJMacroParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ImageJMacroParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyNameAndValueList(ImageJMacroParser.PropertyNameAndValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#propertyNameAndValueList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyNameAndValueList(ImageJMacroParser.PropertyNameAndValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyExpressionAssignment(ImageJMacroParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyExpressionAssignment}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyExpressionAssignment(ImageJMacroParser.PropertyExpressionAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetter(ImageJMacroParser.PropertyGetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyGetter}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetter(ImageJMacroParser.PropertyGetterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetter(ImageJMacroParser.PropertySetterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertySetter}
	 * labeled alternative in {@link ImageJMacroParser#propertyAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetter(ImageJMacroParser.PropertySetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(ImageJMacroParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(ImageJMacroParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetParameterList(ImageJMacroParser.PropertySetParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#propertySetParameterList}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetParameterList(ImageJMacroParser.PropertySetParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ImageJMacroParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ImageJMacroParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(ImageJMacroParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(ImageJMacroParser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSequence(ImageJMacroParser.ExpressionSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#expressionSequence}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSequence(ImageJMacroParser.ExpressionSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(ImageJMacroParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(ImageJMacroParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ImageJMacroParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ImageJMacroParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(ImageJMacroParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(ImageJMacroParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteralExpression(ImageJMacroParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectLiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteralExpression(ImageJMacroParser.ObjectLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(ImageJMacroParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(ImageJMacroParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ImageJMacroParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ImageJMacroParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(ImageJMacroParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(ImageJMacroParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(ImageJMacroParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(ImageJMacroParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsExpression(ImageJMacroParser.ArgumentsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArgumentsExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsExpression(ImageJMacroParser.ArgumentsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpression(ImageJMacroParser.ThisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpression(ImageJMacroParser.ThisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(ImageJMacroParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(ImageJMacroParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(ImageJMacroParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinusExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(ImageJMacroParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(ImageJMacroParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(ImageJMacroParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(ImageJMacroParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(ImageJMacroParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeofExpression(ImageJMacroParser.TypeofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeofExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeofExpression(ImageJMacroParser.TypeofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterInstanceofExpression(ImageJMacroParser.InstanceofExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InstanceofExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitInstanceofExpression(ImageJMacroParser.InstanceofExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExpression(ImageJMacroParser.UnaryPlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlusExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExpression(ImageJMacroParser.UnaryPlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpression(ImageJMacroParser.DeleteExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpression(ImageJMacroParser.DeleteExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ImageJMacroParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ImageJMacroParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitXOrExpression(ImageJMacroParser.BitXOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitXOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitXOrExpression(ImageJMacroParser.BitXOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ImageJMacroParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ImageJMacroParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitShiftExpression(ImageJMacroParser.BitShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitShiftExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitShiftExpression(ImageJMacroParser.BitShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ImageJMacroParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ImageJMacroParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ImageJMacroParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ImageJMacroParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ImageJMacroParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ImageJMacroParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(ImageJMacroParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(ImageJMacroParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitNotExpression(ImageJMacroParser.BitNotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitNotExpression(ImageJMacroParser.BitNotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpression(ImageJMacroParser.NewExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpression(ImageJMacroParser.NewExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(ImageJMacroParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(ImageJMacroParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralExpression(ImageJMacroParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLiteralExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralExpression(ImageJMacroParser.ArrayLiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberDotExpression(ImageJMacroParser.MemberDotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberDotExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberDotExpression(ImageJMacroParser.MemberDotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterMemberIndexExpression(ImageJMacroParser.MemberIndexExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberIndexExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitMemberIndexExpression(ImageJMacroParser.MemberIndexExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(ImageJMacroParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(ImageJMacroParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitAndExpression(ImageJMacroParser.BitAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitAndExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitAndExpression(ImageJMacroParser.BitAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterBitOrExpression(ImageJMacroParser.BitOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitOrExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitBitOrExpression(ImageJMacroParser.BitOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperatorExpression(ImageJMacroParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOperatorExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperatorExpression(ImageJMacroParser.AssignmentOperatorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterVoidExpression(ImageJMacroParser.VoidExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VoidExpression}
	 * labeled alternative in {@link ImageJMacroParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitVoidExpression(ImageJMacroParser.VoidExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(ImageJMacroParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(ImageJMacroParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ImageJMacroParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ImageJMacroParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ImageJMacroParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ImageJMacroParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierName(ImageJMacroParser.IdentifierNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#identifierName}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierName(ImageJMacroParser.IdentifierNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(ImageJMacroParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(ImageJMacroParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ImageJMacroParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ImageJMacroParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterFutureReservedWord(ImageJMacroParser.FutureReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#futureReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitFutureReservedWord(ImageJMacroParser.FutureReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#getter}.
	 * @param ctx the parse tree
	 */
	void enterGetter(ImageJMacroParser.GetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#getter}.
	 * @param ctx the parse tree
	 */
	void exitGetter(ImageJMacroParser.GetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#setter}.
	 * @param ctx the parse tree
	 */
	void enterSetter(ImageJMacroParser.SetterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#setter}.
	 * @param ctx the parse tree
	 */
	void exitSetter(ImageJMacroParser.SetterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(ImageJMacroParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(ImageJMacroParser.EosContext ctx);
	/**
	 * Enter a parse tree produced by {@link ImageJMacroParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(ImageJMacroParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link ImageJMacroParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(ImageJMacroParser.EofContext ctx);
}