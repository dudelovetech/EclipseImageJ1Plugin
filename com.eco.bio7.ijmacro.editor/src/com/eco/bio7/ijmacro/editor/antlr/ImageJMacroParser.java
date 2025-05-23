// Generated from ImageJMacro.g4 by ANTLR 4.7.2
package com.eco.bio7.ijmacro.editor.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImageJMacroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, RegularExpressionLiteral=3, LineTerminator=4, OpenBracket=5, 
		CloseBracket=6, OpenParen=7, CloseParen=8, OpenBrace=9, CloseBrace=10, 
		SemiColon=11, Comma=12, Assign=13, QuestionMark=14, Dot=15, PlusPlus=16, 
		MinusMinus=17, Plus=18, Minus=19, BitNot=20, Not=21, Multiply=22, Divide=23, 
		Modulus=24, RightShiftArithmetic=25, LeftShiftArithmetic=26, LessThan=27, 
		MoreThan=28, LessThanEquals=29, GreaterThanEquals=30, Equals=31, NotEquals=32, 
		BitAnd=33, BitXOr=34, BitOr=35, And=36, Or=37, MultiplyAssign=38, DivideAssign=39, 
		PlusAssign=40, MinusAssign=41, BooleanLiteral=42, DecimalLiteral=43, HexIntegerLiteral=44, 
		OctalIntegerLiteral=45, Macro=46, Break=47, Do=48, Else=49, Var=50, Return=51, 
		Continue=52, For=53, While=54, Function=55, With=56, If=57, Identifier=58, 
		StringLiteral=59, WhiteSpaces=60, MultiLineComment=61, SingleLineComment=62, 
		UnexpectedCharacter=63;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_sourceElement = 2, RULE_statement = 3, 
		RULE_block = 4, RULE_statementList = 5, RULE_variableStatement = 6, RULE_variableDeclarationList = 7, 
		RULE_variableDeclaration = 8, RULE_initialiser = 9, RULE_emptyStatement = 10, 
		RULE_expressionStatement = 11, RULE_ifStatement = 12, RULE_iterationStatement = 13, 
		RULE_breakStatement = 14, RULE_returnStatement = 15, RULE_labelledStatement = 16, 
		RULE_functionDeclaration = 17, RULE_formalParameterList = 18, RULE_functionBody = 19, 
		RULE_macroBody = 20, RULE_arrayLiteral = 21, RULE_elementList = 22, RULE_elision = 23, 
		RULE_propertySetParameterList = 24, RULE_arguments = 25, RULE_argumentList = 26, 
		RULE_expressionSequence = 27, RULE_singleExpression = 28, RULE_assignmentOperator = 29, 
		RULE_literal = 30, RULE_numericLiteral = 31, RULE_identifierName = 32, 
		RULE_reservedWord = 33, RULE_keyword = 34, RULE_eos = 35, RULE_eof = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "sourceElement", "statement", "block", "statementList", 
			"variableStatement", "variableDeclarationList", "variableDeclaration", 
			"initialiser", "emptyStatement", "expressionStatement", "ifStatement", 
			"iterationStatement", "breakStatement", "returnStatement", "labelledStatement", 
			"functionDeclaration", "formalParameterList", "functionBody", "macroBody", 
			"arrayLiteral", "elementList", "elision", "propertySetParameterList", 
			"arguments", "argumentList", "expressionSequence", "singleExpression", 
			"assignmentOperator", "literal", "numericLiteral", "identifierName", 
			"reservedWord", "keyword", "eos", "eof"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'!=='", null, null, "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'='", "'?'", "'.'", "'++'", "'--'", "'+'", "'-'", 
			"'~'", "'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'<'", "'>'", "'<='", 
			"'>='", "'=='", "'!='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", 
			"'/='", "'+='", "'-='", null, null, null, null, "'macro'", "'break'", 
			"'do'", "'else'", "'var'", "'return'", "'continue'", "'for'", "'while'", 
			"'function'", "'with'", "'if'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "RegularExpressionLiteral", "LineTerminator", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "QuestionMark", "Dot", "PlusPlus", "MinusMinus", 
			"Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", "Modulus", "RightShiftArithmetic", 
			"LeftShiftArithmetic", "LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", 
			"Equals", "NotEquals", "BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", 
			"DivideAssign", "PlusAssign", "MinusAssign", "BooleanLiteral", "DecimalLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "Macro", "Break", "Do", "Else", 
			"Var", "Return", "Continue", "For", "While", "Function", "With", "If", 
			"Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", "SingleLineComment", 
			"UnexpectedCharacter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ImageJMacro.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  
	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     *
	     * @param type
	     *         the type of the token on the {@code HIDDEN} channel
	     *         to check.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token of the given {@code type} exists on the
	     * {@code HIDDEN} channel.
	     */
	    private boolean here(final int type) {
	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        // Check if the token resides on the HIDDEN channel and if it's of the
	        // provided type.
	        return (ahead.getChannel() == Lexer.HIDDEN) && (ahead.getType() == type);
	    }

	    /**
	     * Returns {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     *
	     * @return {@code true} iff on the current index of the parser's
	     * token stream a token exists on the {@code HIDDEN} channel which
	     * either is a line terminator, or is a multi line comment that
	     * contains a line terminator.
	     */
	    private boolean lineTerminatorAhead() {
	        // Get the token ahead of the current index.
	        int possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 1;
	        Token ahead = _input.get(possibleIndexEosToken);
	        if (ahead.getChannel() != Lexer.HIDDEN) {
	            // We're only interested in tokens on the HIDDEN channel.
	            return false;
	        }

	        if (ahead.getType() == LineTerminator) {
	            // There is definitely a line terminator ahead.
	            return true;
	        }

	        if (ahead.getType() == WhiteSpaces) {
	            // Get the token ahead of the current whitespaces.
	            possibleIndexEosToken = this.getCurrentToken().getTokenIndex() - 2;
	            ahead = _input.get(possibleIndexEosToken);
	        }

	        // Get the token's text and type.
	        String text = ahead.getText();
	        int type = ahead.getType();

	        // Check if the token is, or contains a line terminator.
	        return (type == MultiLineComment && (text.contains("\r") || text.contains("\n"))) ||
	                (type == LineTerminator);
	    }                                

	public ImageJMacroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ImageJMacroParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(74);
				sourceElements();
				}
				break;
			}
			setState(77);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitSourceElements(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					sourceElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterSourceElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitSourceElement(this);
		}
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sourceElement);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IterationStatementsContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterationStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterIterationStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitIterationStatements(this);
		}
	}
	public static class ReturnStatementsContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterReturnStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitReturnStatements(this);
		}
	}
	public static class VarStatementsContext extends StatementContext {
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public VarStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterVarStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitVarStatements(this);
		}
	}
	public static class BlockStatementsContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBlockStatements(this);
		}
	}
	public static class EmptyStatementsContext extends StatementContext {
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public EmptyStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterEmptyStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitEmptyStatements(this);
		}
	}
	public static class BreakStatementsContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBreakStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBreakStatements(this);
		}
	}
	public static class IfStatementsContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterIfStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitIfStatements(this);
		}
	}
	public static class ExpressionStatementsContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExpressionStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterExpressionStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitExpressionStatements(this);
		}
	}
	public static class FuncStatementsContext extends StatementContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FuncStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterFuncStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitFuncStatements(this);
		}
	}
	public static class LabelledStatementsContext extends StatementContext {
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public LabelledStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLabelledStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLabelledStatements(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BlockStatementsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				block();
				}
				break;
			case 2:
				_localctx = new VarStatementsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				variableStatement();
				}
				break;
			case 3:
				_localctx = new EmptyStatementsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				emptyStatement();
				}
				break;
			case 4:
				_localctx = new ExpressionStatementsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				expressionStatement();
				}
				break;
			case 5:
				_localctx = new IfStatementsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new IterationStatementsContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				iterationStatement();
				}
				break;
			case 7:
				_localctx = new BreakStatementsContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				breakStatement();
				}
				break;
			case 8:
				_localctx = new ReturnStatementsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
				returnStatement();
				}
				break;
			case 9:
				_localctx = new LabelledStatementsContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(96);
				labelledStatement();
				}
				break;
			case 10:
				_localctx = new FuncStatementsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ImageJMacroParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ImageJMacroParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(OpenBrace);
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(101);
				statementList();
				}
				break;
			}
			setState(104);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(106);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	 
		public VariableStatementContext() { }
		public void copyFrom(VariableStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationStatementContext extends VariableStatementContext {
		public TerminalNode Var() { return getToken(ImageJMacroParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VarDeclarationStatementContext(VariableStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterVarDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitVarDeclarationStatement(this);
		}
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableStatement);
		try {
			_localctx = new VarDeclarationStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(Var);
			setState(112);
			variableDeclarationList();
			setState(113);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitVariableDeclarationList(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			variableDeclaration();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(Comma);
					setState(117);
					variableDeclaration();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	 
		public VariableDeclarationContext() { }
		public void copyFrom(VariableDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationStatementContext extends VariableDeclarationContext {
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationStatementContext(VariableDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitVariableDeclarationStatement(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			_localctx = new VariableDeclarationStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Identifier);
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(124);
				initialiser();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ImageJMacroParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitInitialiser(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Assign);
			setState(128);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ImageJMacroParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			if (!((_input.LA(1) != OpenBrace) && (_input.LA(1) != Function))) throw new FailedPredicateException(this, "(_input.LA(1) != OpenBrace) && (_input.LA(1) != Function)");
			setState(133);
			expressionSequence();
			setState(134);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ImageJMacroParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ImageJMacroParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(If);
			setState(137);
			match(OpenParen);
			setState(138);
			expressionSequence();
			setState(139);
			match(CloseParen);
			setState(140);
			statement();
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(141);
				match(Else);
				setState(142);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ImageJMacroParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ImageJMacroParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitDoStatement(this);
		}
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ImageJMacroParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public TerminalNode Var() { return getToken(ImageJMacroParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ImageJMacroParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ImageJMacroParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterForVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitForVarStatement(this);
		}
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ImageJMacroParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitWhileStatement(this);
		}
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ImageJMacroParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ImageJMacroParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ImageJMacroParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitForStatement(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_iterationStatement);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(Do);
				setState(146);
				statement();
				setState(147);
				match(While);
				setState(148);
				match(OpenParen);
				setState(149);
				expressionSequence();
				setState(150);
				match(CloseParen);
				setState(151);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(While);
				setState(154);
				match(OpenParen);
				setState(155);
				expressionSequence();
				setState(156);
				match(CloseParen);
				setState(157);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(For);
				setState(160);
				match(OpenParen);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
					{
					setState(161);
					expressionSequence();
					}
				}

				setState(164);
				match(SemiColon);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
					{
					setState(165);
					expressionSequence();
					}
				}

				setState(168);
				match(SemiColon);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
					{
					setState(169);
					expressionSequence();
					}
				}

				setState(172);
				match(CloseParen);
				setState(173);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(For);
				setState(175);
				match(OpenParen);
				setState(176);
				match(Var);
				setState(177);
				variableDeclarationList();
				setState(178);
				match(SemiColon);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
					{
					setState(179);
					expressionSequence();
					}
				}

				setState(182);
				match(SemiColon);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
					{
					setState(183);
					expressionSequence();
					}
				}

				setState(186);
				match(CloseParen);
				setState(187);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ImageJMacroParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(Break);
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(192);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(193);
				match(Identifier);
				}
				break;
			}
			setState(196);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ImageJMacroParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Return);
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(199);
				if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
				setState(200);
				expressionSequence();
				}
				break;
			}
			setState(203);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLabelledStatement(this);
		}
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Identifier);
			setState(206);
			match(T__0);
			setState(207);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ImageJMacroParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ImageJMacroParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ImageJMacroParser.CloseBrace, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Function);
			setState(210);
			match(Identifier);
			setState(211);
			match(OpenParen);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(212);
				formalParameterList();
				}
			}

			setState(215);
			match(CloseParen);
			setState(216);
			match(OpenBrace);
			setState(217);
			functionBody();
			setState(218);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ImageJMacroParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ImageJMacroParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Identifier);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(221);
				match(Comma);
				setState(222);
				match(Identifier);
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(228);
				sourceElements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacroBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public MacroBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterMacroBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitMacroBody(this);
		}
	}

	public final MacroBodyContext macroBody() throws RecognitionException {
		MacroBodyContext _localctx = new MacroBodyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_macroBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(231);
				sourceElements();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ImageJMacroParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ImageJMacroParser.CloseBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ImageJMacroParser.Comma, 0); }
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(OpenBracket);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(235);
				elementList();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(238);
				match(Comma);
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(241);
				elision();
				}
			}

			setState(244);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(246);
				elision();
				}
			}

			setState(249);
			singleExpression(0);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(250);
					match(Comma);
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(251);
						elision();
						}
					}

					setState(254);
					singleExpression(0);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElisionContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterElision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitElision(this);
		}
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(260);
				match(Comma);
				}
				}
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterPropertySetParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitPropertySetParameterList(this);
		}
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(OpenParen);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Macro) | (1L << Function) | (1L << Identifier) | (1L << StringLiteral))) != 0)) {
				{
				setState(268);
				argumentList();
				}
			}

			setState(271);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			singleExpression(0);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(274);
				match(Comma);
				setState(275);
				singleExpression(0);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ImageJMacroParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ImageJMacroParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterExpressionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitExpressionSequence(this);
		}
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			singleExpression(0);
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(Comma);
					setState(283);
					singleExpression(0);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(ImageJMacroParser.QuestionMark, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitTernaryExpression(this);
		}
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(ImageJMacroParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLogicalAndExpression(this);
		}
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(ImageJMacroParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitPreIncrementExpression(this);
		}
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(ImageJMacroParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLogicalOrExpression(this);
		}
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(ImageJMacroParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitNotExpression(this);
		}
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(ImageJMacroParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitPreDecreaseExpression(this);
		}
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterArgumentsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitArgumentsExpression(this);
		}
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(ImageJMacroParser.Function, 0); }
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ImageJMacroParser.OpenBrace, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ImageJMacroParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitFunctionExpression(this);
		}
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(ImageJMacroParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitUnaryMinusExpression(this);
		}
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(ImageJMacroParser.Assign, 0); }
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitAssignmentExpression(this);
		}
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(ImageJMacroParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitPostDecreaseExpression(this);
		}
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(ImageJMacroParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterUnaryPlusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitUnaryPlusExpression(this);
		}
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(ImageJMacroParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(ImageJMacroParser.NotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitEqualityExpression(this);
		}
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(ImageJMacroParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBitXOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBitXOrExpression(this);
		}
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(ImageJMacroParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ImageJMacroParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(ImageJMacroParser.Modulus, 0); }
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitMultiplicativeExpression(this);
		}
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LeftShiftArithmetic() { return getToken(ImageJMacroParser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(ImageJMacroParser.RightShiftArithmetic, 0); }
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBitShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBitShiftExpression(this);
		}
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(ImageJMacroParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ImageJMacroParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitParenthesizedExpression(this);
		}
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(ImageJMacroParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ImageJMacroParser.Minus, 0); }
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitAdditiveExpression(this);
		}
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(ImageJMacroParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ImageJMacroParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ImageJMacroParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ImageJMacroParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitRelationalExpression(this);
		}
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ImageJMacroParser.PlusPlus, 0); }
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitPostIncrementExpression(this);
		}
	}
	public static class MacroExpressionContext extends SingleExpressionContext {
		public TerminalNode Macro() { return getToken(ImageJMacroParser.Macro, 0); }
		public TerminalNode StringLiteral() { return getToken(ImageJMacroParser.StringLiteral, 0); }
		public TerminalNode OpenBrace() { return getToken(ImageJMacroParser.OpenBrace, 0); }
		public MacroBodyContext macroBody() {
			return getRuleContext(MacroBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ImageJMacroParser.CloseBrace, 0); }
		public MacroExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterMacroExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitMacroExpression(this);
		}
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public TerminalNode BitNot() { return getToken(ImageJMacroParser.BitNot, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBitNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBitNotExpression(this);
		}
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLiteralExpression(this);
		}
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterArrayLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitArrayLiteralExpression(this);
		}
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(ImageJMacroParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterMemberDotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitMemberDotExpression(this);
		}
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(ImageJMacroParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(ImageJMacroParser.CloseBracket, 0); }
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterMemberIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitMemberIndexExpression(this);
		}
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitIdentifierExpression(this);
		}
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(ImageJMacroParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBitAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBitAndExpression(this);
		}
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(ImageJMacroParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterBitOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitBitOrExpression(this);
		}
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterAssignmentOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitAssignmentOperatorExpression(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				match(Function);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(291);
					match(Identifier);
					}
				}

				setState(294);
				match(OpenParen);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(295);
					formalParameterList();
					}
				}

				setState(298);
				match(CloseParen);
				setState(299);
				match(OpenBrace);
				setState(300);
				functionBody();
				setState(301);
				match(CloseBrace);
				}
				break;
			case Macro:
				{
				_localctx = new MacroExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(Macro);
				setState(304);
				match(StringLiteral);
				setState(305);
				match(OpenBrace);
				setState(306);
				macroBody();
				setState(307);
				match(CloseBrace);
				}
				break;
			case PlusPlus:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(309);
				match(PlusPlus);
				setState(310);
				singleExpression(23);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(MinusMinus);
				setState(312);
				singleExpression(22);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(313);
				match(Plus);
				setState(314);
				singleExpression(21);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(Minus);
				setState(316);
				singleExpression(20);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(BitNot);
				setState(318);
				singleExpression(19);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(Not);
				setState(320);
				singleExpression(18);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(Identifier);
				}
				break;
			case RegularExpressionLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				arrayLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(OpenParen);
				setState(325);
				expressionSequence();
				setState(326);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(391);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(389);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(330);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(331);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(332);
						singleExpression(18);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(333);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(334);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(335);
						singleExpression(17);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(336);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(337);
						_la = _input.LA(1);
						if ( !(_la==RightShiftArithmetic || _la==LeftShiftArithmetic) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
						singleExpression(16);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(339);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(340);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(341);
						singleExpression(15);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(342);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(343);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << Equals) | (1L << NotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(344);
						singleExpression(14);
						}
						break;
					case 6:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(345);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(346);
						match(BitAnd);
						setState(347);
						singleExpression(13);
						}
						break;
					case 7:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(348);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(349);
						match(BitXOr);
						setState(350);
						singleExpression(12);
						}
						break;
					case 8:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(351);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(352);
						match(BitOr);
						setState(353);
						singleExpression(11);
						}
						break;
					case 9:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(354);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(355);
						match(And);
						setState(356);
						singleExpression(10);
						}
						break;
					case 10:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(357);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(358);
						match(Or);
						setState(359);
						singleExpression(9);
						}
						break;
					case 11:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(360);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(361);
						match(QuestionMark);
						setState(362);
						singleExpression(0);
						setState(363);
						match(T__0);
						setState(364);
						singleExpression(8);
						}
						break;
					case 12:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(366);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(367);
						match(Assign);
						setState(368);
						singleExpression(7);
						}
						break;
					case 13:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(369);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(370);
						assignmentOperator();
						setState(371);
						singleExpression(6);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(373);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(374);
						match(OpenBracket);
						setState(375);
						expressionSequence();
						setState(376);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(378);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(379);
						match(Dot);
						setState(380);
						identifierName();
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(381);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(382);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(383);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(384);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(385);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(386);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(387);
						if (!(!here(LineTerminator))) throw new FailedPredicateException(this, "!here(LineTerminator)");
						setState(388);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(ImageJMacroParser.MultiplyAssign, 0); }
		public TerminalNode DivideAssign() { return getToken(ImageJMacroParser.DivideAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(ImageJMacroParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(ImageJMacroParser.MinusAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << PlusAssign) | (1L << MinusAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(ImageJMacroParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ImageJMacroParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(ImageJMacroParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_literal);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << BooleanLiteral) | (1L << StringLiteral))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ImageJMacroParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ImageJMacroParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ImageJMacroParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ImageJMacroParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterIdentifierName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitIdentifierName(this);
		}
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_identifierName);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				match(Identifier);
				}
				break;
			case BooleanLiteral:
			case Macro:
			case Break:
			case Do:
			case Else:
			case Var:
			case Return:
			case Continue:
			case For:
			case While:
			case Function:
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(ImageJMacroParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitReservedWord(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_reservedWord);
		try {
			setState(408);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Macro:
			case Break:
			case Do:
			case Else:
			case Var:
			case Return:
			case Continue:
			case For:
			case While:
			case Function:
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				keyword();
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(BooleanLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ImageJMacroParser.Break, 0); }
		public TerminalNode Do() { return getToken(ImageJMacroParser.Do, 0); }
		public TerminalNode Else() { return getToken(ImageJMacroParser.Else, 0); }
		public TerminalNode Var() { return getToken(ImageJMacroParser.Var, 0); }
		public TerminalNode Macro() { return getToken(ImageJMacroParser.Macro, 0); }
		public TerminalNode Return() { return getToken(ImageJMacroParser.Return, 0); }
		public TerminalNode Continue() { return getToken(ImageJMacroParser.Continue, 0); }
		public TerminalNode For() { return getToken(ImageJMacroParser.For, 0); }
		public TerminalNode While() { return getToken(ImageJMacroParser.While, 0); }
		public TerminalNode Function() { return getToken(ImageJMacroParser.Function, 0); }
		public TerminalNode If() { return getToken(ImageJMacroParser.If, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Macro) | (1L << Break) | (1L << Do) | (1L << Else) | (1L << Var) | (1L << Return) | (1L << Continue) | (1L << For) | (1L << While) | (1L << Function) | (1L << If))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ImageJMacroParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ImageJMacroParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_eos);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				if (!(lineTerminatorAhead())) throw new FailedPredicateException(this, "lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				if (!(_input.LT(1).getType() == CloseBrace)) throw new FailedPredicateException(this, "_input.LT(1).getType() == CloseBrace");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ImageJMacroParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImageJMacroListener ) ((ImageJMacroListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expressionStatement_sempred((ExpressionStatementContext)_localctx, predIndex);
		case 14:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 15:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 28:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 35:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return (_input.LA(1) != OpenBrace) && (_input.LA(1) != Function);
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 28);
		case 17:
			return precpred(_ctx, 27);
		case 18:
			return precpred(_ctx, 26);
		case 19:
			return precpred(_ctx, 25);
		case 20:
			return !here(LineTerminator);
		case 21:
			return precpred(_ctx, 24);
		case 22:
			return !here(LineTerminator);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return lineTerminatorAhead();
		case 24:
			return _input.LT(1).getType() == CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3A\u01a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\5\2N\n\2\3\2\3\2\3\3\6\3S\n\3"+
		"\r\3\16\3T\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5e\n\5\3\6\3\6\5\6i\n\6\3\6\3\6\3\7\6\7n\n\7\r\7\16\7o\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\n\3\n\5\n\u0080\n\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0092\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17\3\17\5\17\u00a9\n\17\3"+
		"\17\3\17\5\17\u00ad\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00b7\n\17\3\17\3\17\5\17\u00bb\n\17\3\17\3\17\3\17\5\17\u00c0\n\17\3"+
		"\20\3\20\3\20\5\20\u00c5\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u00cc\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u00e2\n\24\f\24\16\24\u00e5\13"+
		"\24\3\25\5\25\u00e8\n\25\3\26\5\26\u00eb\n\26\3\27\3\27\5\27\u00ef\n\27"+
		"\3\27\5\27\u00f2\n\27\3\27\5\27\u00f5\n\27\3\27\3\27\3\30\5\30\u00fa\n"+
		"\30\3\30\3\30\3\30\5\30\u00ff\n\30\3\30\7\30\u0102\n\30\f\30\16\30\u0105"+
		"\13\30\3\31\6\31\u0108\n\31\r\31\16\31\u0109\3\32\3\32\3\33\3\33\5\33"+
		"\u0110\n\33\3\33\3\33\3\34\3\34\3\34\7\34\u0117\n\34\f\34\16\34\u011a"+
		"\13\34\3\35\3\35\3\35\7\35\u011f\n\35\f\35\16\35\u0122\13\35\3\36\3\36"+
		"\3\36\5\36\u0127\n\36\3\36\3\36\5\36\u012b\n\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u014b"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0188\n\36\f\36\16\36\u018b\13\36\3\37\3\37"+
		"\3 \3 \5 \u0191\n \3!\3!\3\"\3\"\5\"\u0197\n\"\3#\3#\5#\u019b\n#\3$\3"+
		"$\3%\3%\3%\3%\5%\u01a3\n%\3&\3&\3&\2\3:\'\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\13\3\2\30\32\3\2\24\25\3\2"+
		"\33\34\3\2\35 \4\2\4\4!\"\3\2(+\5\2\5\5,,==\3\2-/\4\2\609;;\2\u01cf\2"+
		"M\3\2\2\2\4R\3\2\2\2\6X\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fm\3\2\2\2\16q\3"+
		"\2\2\2\20u\3\2\2\2\22}\3\2\2\2\24\u0081\3\2\2\2\26\u0084\3\2\2\2\30\u0086"+
		"\3\2\2\2\32\u008a\3\2\2\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00c8\3\2"+
		"\2\2\"\u00cf\3\2\2\2$\u00d3\3\2\2\2&\u00de\3\2\2\2(\u00e7\3\2\2\2*\u00ea"+
		"\3\2\2\2,\u00ec\3\2\2\2.\u00f9\3\2\2\2\60\u0107\3\2\2\2\62\u010b\3\2\2"+
		"\2\64\u010d\3\2\2\2\66\u0113\3\2\2\28\u011b\3\2\2\2:\u014a\3\2\2\2<\u018c"+
		"\3\2\2\2>\u0190\3\2\2\2@\u0192\3\2\2\2B\u0196\3\2\2\2D\u019a\3\2\2\2F"+
		"\u019c\3\2\2\2H\u01a2\3\2\2\2J\u01a4\3\2\2\2LN\5\4\3\2ML\3\2\2\2MN\3\2"+
		"\2\2NO\3\2\2\2OP\7\2\2\3P\3\3\2\2\2QS\5\6\4\2RQ\3\2\2\2ST\3\2\2\2TR\3"+
		"\2\2\2TU\3\2\2\2U\5\3\2\2\2VY\5\b\5\2WY\5$\23\2XV\3\2\2\2XW\3\2\2\2Y\7"+
		"\3\2\2\2Ze\5\n\6\2[e\5\16\b\2\\e\5\26\f\2]e\5\30\r\2^e\5\32\16\2_e\5\34"+
		"\17\2`e\5\36\20\2ae\5 \21\2be\5\"\22\2ce\5$\23\2dZ\3\2\2\2d[\3\2\2\2d"+
		"\\\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2"+
		"dc\3\2\2\2e\t\3\2\2\2fh\7\13\2\2gi\5\f\7\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2"+
		"\2jk\7\f\2\2k\13\3\2\2\2ln\5\b\5\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\r\3\2\2\2qr\7\64\2\2rs\5\20\t\2st\5H%\2t\17\3\2\2\2uz\5\22\n\2v"+
		"w\7\16\2\2wy\5\22\n\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\21\3\2"+
		"\2\2|z\3\2\2\2}\177\7<\2\2~\u0080\5\24\13\2\177~\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\23\3\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5:\36\2\u0083\25"+
		"\3\2\2\2\u0084\u0085\7\r\2\2\u0085\27\3\2\2\2\u0086\u0087\6\r\2\2\u0087"+
		"\u0088\58\35\2\u0088\u0089\5H%\2\u0089\31\3\2\2\2\u008a\u008b\7;\2\2\u008b"+
		"\u008c\7\t\2\2\u008c\u008d\58\35\2\u008d\u008e\7\n\2\2\u008e\u0091\5\b"+
		"\5\2\u008f\u0090\7\63\2\2\u0090\u0092\5\b\5\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\33\3\2\2\2\u0093\u0094\7\62\2\2\u0094\u0095\5\b\5"+
		"\2\u0095\u0096\78\2\2\u0096\u0097\7\t\2\2\u0097\u0098\58\35\2\u0098\u0099"+
		"\7\n\2\2\u0099\u009a\5H%\2\u009a\u00c0\3\2\2\2\u009b\u009c\78\2\2\u009c"+
		"\u009d\7\t\2\2\u009d\u009e\58\35\2\u009e\u009f\7\n\2\2\u009f\u00a0\5\b"+
		"\5\2\u00a0\u00c0\3\2\2\2\u00a1\u00a2\7\67\2\2\u00a2\u00a4\7\t\2\2\u00a3"+
		"\u00a5\58\35\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\7\r\2\2\u00a7\u00a9\58\35\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\r\2\2\u00ab\u00ad\58"+
		"\35\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\7\n\2\2\u00af\u00c0\5\b\5\2\u00b0\u00b1\7\67\2\2\u00b1\u00b2\7"+
		"\t\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b6\7\r\2\2\u00b5"+
		"\u00b7\58\35\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\7\r\2\2\u00b9\u00bb\58\35\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\5\b"+
		"\5\2\u00be\u00c0\3\2\2\2\u00bf\u0093\3\2\2\2\u00bf\u009b\3\2\2\2\u00bf"+
		"\u00a1\3\2\2\2\u00bf\u00b0\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c4\7\61\2"+
		"\2\u00c2\u00c3\6\20\3\2\u00c3\u00c5\7<\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\5H%\2\u00c7\37\3\2\2\2\u00c8"+
		"\u00cb\7\65\2\2\u00c9\u00ca\6\21\4\2\u00ca\u00cc\58\35\2\u00cb\u00c9\3"+
		"\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\5H%\2\u00ce"+
		"!\3\2\2\2\u00cf\u00d0\7<\2\2\u00d0\u00d1\7\3\2\2\u00d1\u00d2\5\b\5\2\u00d2"+
		"#\3\2\2\2\u00d3\u00d4\79\2\2\u00d4\u00d5\7<\2\2\u00d5\u00d7\7\t\2\2\u00d6"+
		"\u00d8\5&\24\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\7\n\2\2\u00da\u00db\7\13\2\2\u00db\u00dc\5(\25\2\u00dc"+
		"\u00dd\7\f\2\2\u00dd%\3\2\2\2\u00de\u00e3\7<\2\2\u00df\u00e0\7\16\2\2"+
		"\u00e0\u00e2\7<\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\'\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\5\4\3\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8)\3\2\2\2"+
		"\u00e9\u00eb\5\4\3\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb+\3"+
		"\2\2\2\u00ec\u00ee\7\7\2\2\u00ed\u00ef\5.\30\2\u00ee\u00ed\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\7\16\2\2\u00f1\u00f0\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5\60\31\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\b"+
		"\2\2\u00f7-\3\2\2\2\u00f8\u00fa\5\60\31\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0103\5:\36\2\u00fc\u00fe\7\16\2\2"+
		"\u00fd\u00ff\5\60\31\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0102\5:\36\2\u0101\u00fc\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104/\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0106\u0108\7\16\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\61\3\2\2\2\u010b\u010c\7<\2\2\u010c"+
		"\63\3\2\2\2\u010d\u010f\7\t\2\2\u010e\u0110\5\66\34\2\u010f\u010e\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\n\2\2\u0112"+
		"\65\3\2\2\2\u0113\u0118\5:\36\2\u0114\u0115\7\16\2\2\u0115\u0117\5:\36"+
		"\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\67\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120\5:\36\2\u011c"+
		"\u011d\7\16\2\2\u011d\u011f\5:\36\2\u011e\u011c\3\2\2\2\u011f\u0122\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u01219\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0124\b\36\1\2\u0124\u0126\79\2\2\u0125\u0127\7<\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\7\t"+
		"\2\2\u0129\u012b\5&\24\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\7\n\2\2\u012d\u012e\7\13\2\2\u012e\u012f\5"+
		"(\25\2\u012f\u0130\7\f\2\2\u0130\u014b\3\2\2\2\u0131\u0132\7\60\2\2\u0132"+
		"\u0133\7=\2\2\u0133\u0134\7\13\2\2\u0134\u0135\5*\26\2\u0135\u0136\7\f"+
		"\2\2\u0136\u014b\3\2\2\2\u0137\u0138\7\22\2\2\u0138\u014b\5:\36\31\u0139"+
		"\u013a\7\23\2\2\u013a\u014b\5:\36\30\u013b\u013c\7\24\2\2\u013c\u014b"+
		"\5:\36\27\u013d\u013e\7\25\2\2\u013e\u014b\5:\36\26\u013f\u0140\7\26\2"+
		"\2\u0140\u014b\5:\36\25\u0141\u0142\7\27\2\2\u0142\u014b\5:\36\24\u0143"+
		"\u014b\7<\2\2\u0144\u014b\5> \2\u0145\u014b\5,\27\2\u0146\u0147\7\t\2"+
		"\2\u0147\u0148\58\35\2\u0148\u0149\7\n\2\2\u0149\u014b\3\2\2\2\u014a\u0123"+
		"\3\2\2\2\u014a\u0131\3\2\2\2\u014a\u0137\3\2\2\2\u014a\u0139\3\2\2\2\u014a"+
		"\u013b\3\2\2\2\u014a\u013d\3\2\2\2\u014a\u013f\3\2\2\2\u014a\u0141\3\2"+
		"\2\2\u014a\u0143\3\2\2\2\u014a\u0144\3\2\2\2\u014a\u0145\3\2\2\2\u014a"+
		"\u0146\3\2\2\2\u014b\u0189\3\2\2\2\u014c\u014d\f\23\2\2\u014d\u014e\t"+
		"\2\2\2\u014e\u0188\5:\36\24\u014f\u0150\f\22\2\2\u0150\u0151\t\3\2\2\u0151"+
		"\u0188\5:\36\23\u0152\u0153\f\21\2\2\u0153\u0154\t\4\2\2\u0154\u0188\5"+
		":\36\22\u0155\u0156\f\20\2\2\u0156\u0157\t\5\2\2\u0157\u0188\5:\36\21"+
		"\u0158\u0159\f\17\2\2\u0159\u015a\t\6\2\2\u015a\u0188\5:\36\20\u015b\u015c"+
		"\f\16\2\2\u015c\u015d\7#\2\2\u015d\u0188\5:\36\17\u015e\u015f\f\r\2\2"+
		"\u015f\u0160\7$\2\2\u0160\u0188\5:\36\16\u0161\u0162\f\f\2\2\u0162\u0163"+
		"\7%\2\2\u0163\u0188\5:\36\r\u0164\u0165\f\13\2\2\u0165\u0166\7&\2\2\u0166"+
		"\u0188\5:\36\f\u0167\u0168\f\n\2\2\u0168\u0169\7\'\2\2\u0169\u0188\5:"+
		"\36\13\u016a\u016b\f\t\2\2\u016b\u016c\7\20\2\2\u016c\u016d\5:\36\2\u016d"+
		"\u016e\7\3\2\2\u016e\u016f\5:\36\n\u016f\u0188\3\2\2\2\u0170\u0171\f\b"+
		"\2\2\u0171\u0172\7\17\2\2\u0172\u0188\5:\36\t\u0173\u0174\f\7\2\2\u0174"+
		"\u0175\5<\37\2\u0175\u0176\5:\36\b\u0176\u0188\3\2\2\2\u0177\u0178\f\36"+
		"\2\2\u0178\u0179\7\7\2\2\u0179\u017a\58\35\2\u017a\u017b\7\b\2\2\u017b"+
		"\u0188\3\2\2\2\u017c\u017d\f\35\2\2\u017d\u017e\7\21\2\2\u017e\u0188\5"+
		"B\"\2\u017f\u0180\f\34\2\2\u0180\u0188\5\64\33\2\u0181\u0182\f\33\2\2"+
		"\u0182\u0183\6\36\26\2\u0183\u0188\7\22\2\2\u0184\u0185\f\32\2\2\u0185"+
		"\u0186\6\36\30\2\u0186\u0188\7\23\2\2\u0187\u014c\3\2\2\2\u0187\u014f"+
		"\3\2\2\2\u0187\u0152\3\2\2\2\u0187\u0155\3\2\2\2\u0187\u0158\3\2\2\2\u0187"+
		"\u015b\3\2\2\2\u0187\u015e\3\2\2\2\u0187\u0161\3\2\2\2\u0187\u0164\3\2"+
		"\2\2\u0187\u0167\3\2\2\2\u0187\u016a\3\2\2\2\u0187\u0170\3\2\2\2\u0187"+
		"\u0173\3\2\2\2\u0187\u0177\3\2\2\2\u0187\u017c\3\2\2\2\u0187\u017f\3\2"+
		"\2\2\u0187\u0181\3\2\2\2\u0187\u0184\3\2\2\2\u0188\u018b\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a;\3\2\2\2\u018b\u0189\3\2\2\2"+
		"\u018c\u018d\t\7\2\2\u018d=\3\2\2\2\u018e\u0191\t\b\2\2\u018f\u0191\5"+
		"@!\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191?\3\2\2\2\u0192\u0193"+
		"\t\t\2\2\u0193A\3\2\2\2\u0194\u0197\7<\2\2\u0195\u0197\5D#\2\u0196\u0194"+
		"\3\2\2\2\u0196\u0195\3\2\2\2\u0197C\3\2\2\2\u0198\u019b\5F$\2\u0199\u019b"+
		"\7,\2\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019bE\3\2\2\2\u019c\u019d"+
		"\t\n\2\2\u019dG\3\2\2\2\u019e\u01a3\7\r\2\2\u019f\u01a3\7\2\2\3\u01a0"+
		"\u01a3\6%\31\2\u01a1\u01a3\6%\32\2\u01a2\u019e\3\2\2\2\u01a2\u019f\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3I\3\2\2\2\u01a4\u01a5"+
		"\7\2\2\3\u01a5K\3\2\2\2*MTXdhoz\177\u0091\u00a4\u00a8\u00ac\u00b6\u00ba"+
		"\u00bf\u00c4\u00cb\u00d7\u00e3\u00e7\u00ea\u00ee\u00f1\u00f4\u00f9\u00fe"+
		"\u0103\u0109\u010f\u0118\u0120\u0126\u012a\u014a\u0187\u0189\u0190\u0196"+
		"\u019a\u01a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}