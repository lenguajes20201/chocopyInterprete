// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\ChocoPyParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocoPyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INDENT=1, DEDENT=2, LINE_BREAK=3, DEF=4, RETURN=5, AS=6, IF=7, ELIF=8, 
		ELSE=9, WHILE=10, FOR=11, IN=12, TRY=13, NONE=14, FINALLY=15, WITH=16, 
		EXCEPT=17, LAMBDA=18, OR=19, AND=20, NOT=21, IS=22, CLASS=23, PASS=24, 
		CONTINUE=25, BREAK=26, TRUE=27, FALSE=28, NONLOCAL=29, GLOBAL=30, PLUS=31, 
		MINUS=32, DOT=33, COMMA=34, ARROW=35, BANG_EQUAL=36, EQUALS=37, ASSIGN=38, 
		GREATER_THAN_EQUAL=39, LESS_THAN_EQUAL=40, GREATER_THAN=41, LESS_THAN=42, 
		MOD=43, STAR=44, IDIV=45, COLON=46, OPEN_PAREN=47, CLOSE_PAREN=48, OPEN_BRACKET=49, 
		CLOSE_BRACKET=50, IDENTIFIER=51, NEWLINE=52, WHITESPACE=53, INTEGER=54, 
		STRING=55, IDSTRING=56;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_func_body = 4, RULE_typed_var = 5, RULE_type = 6, RULE_global_decl = 7, 
		RULE_nonlocal_decl = 8, RULE_var_def = 9, RULE_stmt = 10, RULE_simple_stmt = 11, 
		RULE_block = 12, RULE_literal = 13, RULE_expr = 14, RULE_cexpr = 15, RULE_bin_op = 16, 
		RULE_target = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "func_body", "typed_var", 
			"type", "global_decl", "nonlocal_decl", "var_def", "stmt", "simple_stmt", 
			"block", "literal", "expr", "cexpr", "bin_op", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'def'", "'return'", "'as'", "'if'", "'elif'", 
			"'else'", "'while'", "'for'", "'in'", "'try'", "'None'", "'finally'", 
			"'with'", "'except'", "'lambda'", "'or'", "'and'", "'not'", "'is'", "'class'", 
			"'pass'", "'continue'", "'break'", "'True'", "'False'", "'nonlocal'", 
			"'global'", "'+'", "'-'", "'.'", "','", "'->'", "'!='", "'=='", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'//'", "':'", "'('", "')'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "LINE_BREAK", "DEF", "RETURN", "AS", "IF", 
			"ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", "NONE", "FINALLY", "WITH", 
			"EXCEPT", "LAMBDA", "OR", "AND", "NOT", "IS", "CLASS", "PASS", "CONTINUE", 
			"BREAK", "TRUE", "FALSE", "NONLOCAL", "GLOBAL", "PLUS", "MINUS", "DOT", 
			"COMMA", "ARROW", "BANG_EQUAL", "EQUALS", "ASSIGN", "GREATER_THAN_EQUAL", 
			"LESS_THAN_EQUAL", "GREATER_THAN", "LESS_THAN", "MOD", "STAR", "IDIV", 
			"COLON", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"IDENTIFIER", "NEWLINE", "WHITESPACE", "INTEGER", "STRING", "IDSTRING"
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
	public String getGrammarFileName() { return "ChocoPyParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ChocoPyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ChocoPyParser.EOF, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(39);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(36);
						var_def();
						}
						break;
					case DEF:
						{
						setState(37);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(38);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) {
				{
				{
				setState(44);
				stmt();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ChocoPyParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ChocoPyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ChocoPyParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ChocoPyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ChocoPyParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(ChocoPyParser.COLON, 0); }
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(ChocoPyParser.INDENT, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ChocoPyParser.DEDENT, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(CLASS);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(OPEN_PAREN);
			setState(55);
			match(IDENTIFIER);
			setState(56);
			match(CLOSE_PAREN);
			setState(57);
			match(COLON);
			setState(58);
			match(LINE_BREAK);
			setState(59);
			match(INDENT);
			setState(60);
			class_body();
			setState(61);
			match(DEDENT);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocoPyParser.PASS, 0); }
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(PASS);
				setState(64);
				match(LINE_BREAK);
				}
				break;
			case DEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(67);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(65);
						var_def();
						}
						break;
					case DEF:
						{
						setState(66);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF || _la==IDENTIFIER );
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(ChocoPyParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ChocoPyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ChocoPyParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(ChocoPyParser.COLON, 0); }
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(ChocoPyParser.INDENT, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ChocoPyParser.DEDENT, 0); }
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(ChocoPyParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ChocoPyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChocoPyParser.COMMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DEF);
			setState(74);
			match(IDENTIFIER);
			setState(75);
			match(OPEN_PAREN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(76);
				typed_var();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					typed_var();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(86);
			match(CLOSE_PAREN);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(87);
				match(ARROW);
				setState(88);
				type();
				}
			}

			setState(91);
			match(COLON);
			setState(92);
			match(LINE_BREAK);
			setState(93);
			match(INDENT);
			setState(94);
			func_body();
			setState(95);
			match(DEDENT);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Nonlocal_declContext> nonlocal_decl() {
			return getRuleContexts(Nonlocal_declContext.class);
		}
		public Nonlocal_declContext nonlocal_decl(int i) {
			return getRuleContext(Nonlocal_declContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(101);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(97);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(98);
						nonlocal_decl();
						}
						break;
					case IDENTIFIER:
						{
						setState(99);
						var_def();
						}
						break;
					case DEF:
						{
						setState(100);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106);
				stmt();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0) );
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

	public static class Typed_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ChocoPyParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterTyped_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitTyped_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitTyped_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_varContext typed_var() throws RecognitionException {
		Typed_varContext _localctx = new Typed_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(COLON);
			setState(113);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode IDSTRING() { return getToken(ChocoPyParser.IDSTRING, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ChocoPyParser.OPEN_BRACKET, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(ChocoPyParser.CLOSE_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(IDENTIFIER);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IDSTRING);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(OPEN_BRACKET);
				setState(118);
				type();
				setState(119);
				match(CLOSE_BRACKET);
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

	public static class Global_declContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(ChocoPyParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterGlobal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitGlobal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitGlobal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(GLOBAL);
			setState(124);
			match(IDENTIFIER);
			setState(125);
			match(LINE_BREAK);
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

	public static class Nonlocal_declContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(ChocoPyParser.NONLOCAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public Nonlocal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterNonlocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitNonlocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitNonlocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_declContext nonlocal_decl() throws RecognitionException {
		Nonlocal_declContext _localctx = new Nonlocal_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NONLOCAL);
			setState(128);
			match(IDENTIFIER);
			setState(129);
			match(LINE_BREAK);
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

	public static class Var_defContext extends ParserRuleContext {
		public Typed_varContext typed_var() {
			return getRuleContext(Typed_varContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(ChocoPyParser.ASSIGN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			typed_var();
			setState(132);
			match(ASSIGN);
			setState(133);
			literal();
			setState(134);
			match(LINE_BREAK);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public TerminalNode IF() { return getToken(ChocoPyParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(ChocoPyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ChocoPyParser.COLON, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ChocoPyParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ChocoPyParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(ChocoPyParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(ChocoPyParser.WHILE, 0); }
		public TerminalNode FOR() { return getToken(ChocoPyParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(ChocoPyParser.IN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case NONE:
			case NOT:
			case PASS:
			case TRUE:
			case FALSE:
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case IDENTIFIER:
			case INTEGER:
			case STRING:
			case IDSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				simple_stmt();
				setState(137);
				match(LINE_BREAK);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(IF);
				setState(140);
				expr(0);
				setState(141);
				match(COLON);
				setState(142);
				block();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(143);
					match(ELIF);
					setState(144);
					expr(0);
					setState(145);
					match(COLON);
					setState(146);
					block();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(153);
					match(ELSE);
					setState(154);
					match(COLON);
					setState(155);
					block();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(WHILE);
				setState(159);
				expr(0);
				setState(160);
				match(COLON);
				setState(161);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(FOR);
				setState(164);
				match(IDENTIFIER);
				setState(165);
				match(IN);
				setState(166);
				expr(0);
				setState(167);
				match(COLON);
				setState(168);
				block();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(ChocoPyParser.PASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ChocoPyParser.RETURN, 0); }
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ChocoPyParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ChocoPyParser.ASSIGN, i);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(RETURN);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) {
					{
					setState(175);
					expr(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(178);
						target();
						setState(179);
						match(ASSIGN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(183); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(185);
				expr(0);
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
		public TerminalNode LINE_BREAK() { return getToken(ChocoPyParser.LINE_BREAK, 0); }
		public TerminalNode INDENT() { return getToken(ChocoPyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(ChocoPyParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(LINE_BREAK);
			setState(190);
			match(INDENT);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				stmt();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0) );
			setState(196);
			match(DEDENT);
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
		public TerminalNode NONE() { return getToken(ChocoPyParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(ChocoPyParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ChocoPyParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(ChocoPyParser.INTEGER, 0); }
		public TerminalNode IDSTRING() { return getToken(ChocoPyParser.IDSTRING, 0); }
		public TerminalNode STRING() { return getToken(ChocoPyParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ChocoPyParser.NOT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ChocoPyParser.AND, 0); }
		public TerminalNode OR() { return getToken(ChocoPyParser.OR, 0); }
		public TerminalNode IF() { return getToken(ChocoPyParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(ChocoPyParser.ELSE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
			case TRUE:
			case FALSE:
			case MINUS:
			case OPEN_PAREN:
			case OPEN_BRACKET:
			case IDENTIFIER:
			case INTEGER:
			case STRING:
			case IDSTRING:
				{
				setState(201);
				cexpr(0);
				}
				break;
			case NOT:
				{
				setState(202);
				match(NOT);
				setState(203);
				expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(210);
						match(IF);
						setState(211);
						expr(0);
						setState(212);
						match(ELSE);
						setState(213);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class CexprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(ChocoPyParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ChocoPyParser.CLOSE_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ChocoPyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ChocoPyParser.COMMA, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ChocoPyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ChocoPyParser.CLOSE_PAREN, 0); }
		public TerminalNode MINUS() { return getToken(ChocoPyParser.MINUS, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ChocoPyParser.DOT, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitCexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitCexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(221);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(222);
				literal();
				}
				break;
			case 3:
				{
				setState(223);
				match(OPEN_BRACKET);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) {
					{
					setState(224);
					expr(0);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(225);
						match(COMMA);
						setState(226);
						expr(0);
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				{
				setState(235);
				match(OPEN_PAREN);
				setState(236);
				expr(0);
				setState(237);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(239);
				match(IDENTIFIER);
				setState(240);
				match(OPEN_PAREN);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) {
					{
					setState(241);
					expr(0);
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(242);
						match(COMMA);
						setState(243);
						expr(0);
						}
						}
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(251);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				{
				setState(252);
				match(MINUS);
				setState(253);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(256);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(257);
						bin_op();
						setState(258);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(260);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(261);
						match(DOT);
						setState(262);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(263);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(264);
						match(OPEN_BRACKET);
						setState(265);
						expr(0);
						setState(266);
						match(CLOSE_BRACKET);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(268);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(269);
						match(DOT);
						setState(270);
						match(IDENTIFIER);
						setState(271);
						match(OPEN_PAREN);
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << STRING) | (1L << IDSTRING))) != 0)) {
							{
							setState(272);
							expr(0);
							setState(277);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(273);
								match(COMMA);
								setState(274);
								expr(0);
								}
								}
								setState(279);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(282);
						match(CLOSE_PAREN);
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ChocoPyParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ChocoPyParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(ChocoPyParser.STAR, 0); }
		public TerminalNode IDIV() { return getToken(ChocoPyParser.IDIV, 0); }
		public TerminalNode MOD() { return getToken(ChocoPyParser.MOD, 0); }
		public TerminalNode EQUALS() { return getToken(ChocoPyParser.EQUALS, 0); }
		public TerminalNode BANG_EQUAL() { return getToken(ChocoPyParser.BANG_EQUAL, 0); }
		public TerminalNode LESS_THAN_EQUAL() { return getToken(ChocoPyParser.LESS_THAN_EQUAL, 0); }
		public TerminalNode GREATER_THAN_EQUAL() { return getToken(ChocoPyParser.GREATER_THAN_EQUAL, 0); }
		public TerminalNode LESS_THAN() { return getToken(ChocoPyParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(ChocoPyParser.GREATER_THAN, 0); }
		public TerminalNode IS() { return getToken(ChocoPyParser.IS, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IS) | (1L << PLUS) | (1L << MINUS) | (1L << BANG_EQUAL) | (1L << EQUALS) | (1L << GREATER_THAN_EQUAL) | (1L << LESS_THAN_EQUAL) | (1L << GREATER_THAN) | (1L << LESS_THAN) | (1L << MOD) | (1L << STAR) | (1L << IDIV))) != 0)) ) {
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ChocoPyParser.IDENTIFIER, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ChocoPyParser.DOT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ChocoPyParser.OPEN_BRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(ChocoPyParser.CLOSE_BRACKET, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_target);
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				cexpr(0);
				setState(292);
				match(DOT);
				setState(293);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				cexpr(0);
				setState(296);
				match(OPEN_BRACKET);
				setState(297);
				expr(0);
				setState(298);
				match(CLOSE_BRACKET);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 15:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0131\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\6\4F\n\4\r\4\16\4G\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f"+
		"\5\16\5U\13\5\5\5W\n\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\6\6n\n\6\r\6\16\6o\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0097\n\f\f\f\16\f\u009a\13\f\3\f\3\f\3\f\5\f\u009f\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3"+
		"\r\3\r\5\r\u00b3\n\r\3\r\3\r\3\r\6\r\u00b8\n\r\r\r\16\r\u00b9\3\r\3\r"+
		"\5\r\u00be\n\r\3\16\3\16\3\16\6\16\u00c3\n\16\r\16\16\16\u00c4\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00cf\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00da\n\20\f\20\16\20\u00dd\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e6\n\21\f\21\16\21\u00e9\13\21"+
		"\5\21\u00eb\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00f7\n\21\f\21\16\21\u00fa\13\21\5\21\u00fc\n\21\3\21\3\21\3\21\5\21"+
		"\u0101\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0116\n\21\f\21\16\21\u0119\13"+
		"\21\5\21\u011b\n\21\3\21\7\21\u011e\n\21\f\21\16\21\u0121\13\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012f\n\23"+
		"\3\23\2\4\36 \24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\5\2\20"+
		"\20\35\368:\3\2\25\26\6\2\30\30!\"&\')/\2\u014e\2+\3\2\2\2\4\66\3\2\2"+
		"\2\6I\3\2\2\2\bK\3\2\2\2\ni\3\2\2\2\fq\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2"+
		"\22\u0081\3\2\2\2\24\u0085\3\2\2\2\26\u00ac\3\2\2\2\30\u00bd\3\2\2\2\32"+
		"\u00bf\3\2\2\2\34\u00c8\3\2\2\2\36\u00ce\3\2\2\2 \u0100\3\2\2\2\"\u0122"+
		"\3\2\2\2$\u012e\3\2\2\2&*\5\24\13\2\'*\5\b\5\2(*\5\4\3\2)&\3\2\2\2)\'"+
		"\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2"+
		".\60\5\26\f\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64"+
		"\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\31\2\2\678\7"+
		"\65\2\289\7\61\2\29:\7\65\2\2:;\7\62\2\2;<\7\60\2\2<=\7\5\2\2=>\7\3\2"+
		"\2>?\5\6\4\2?@\7\4\2\2@\5\3\2\2\2AB\7\32\2\2BJ\7\5\2\2CF\5\24\13\2DF\5"+
		"\b\5\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IA\3"+
		"\2\2\2IE\3\2\2\2J\7\3\2\2\2KL\7\6\2\2LM\7\65\2\2MV\7\61\2\2NS\5\f\7\2"+
		"OP\7$\2\2PR\5\f\7\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2VN\3\2\2\2VW\3\2\2\2WX\3\2\2\2X[\7\62\2\2YZ\7%\2\2Z\\\5\16\b"+
		"\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\60\2\2^_\7\5\2\2_`\7\3\2\2`a\5"+
		"\n\6\2ab\7\4\2\2b\t\3\2\2\2ch\5\20\t\2dh\5\22\n\2eh\5\24\13\2fh\5\b\5"+
		"\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2ln\5\26\f\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2"+
		"\2\2p\13\3\2\2\2qr\7\65\2\2rs\7\60\2\2st\5\16\b\2t\r\3\2\2\2u|\7\65\2"+
		"\2v|\7:\2\2wx\7\63\2\2xy\5\16\b\2yz\7\64\2\2z|\3\2\2\2{u\3\2\2\2{v\3\2"+
		"\2\2{w\3\2\2\2|\17\3\2\2\2}~\7 \2\2~\177\7\65\2\2\177\u0080\7\5\2\2\u0080"+
		"\21\3\2\2\2\u0081\u0082\7\37\2\2\u0082\u0083\7\65\2\2\u0083\u0084\7\5"+
		"\2\2\u0084\23\3\2\2\2\u0085\u0086\5\f\7\2\u0086\u0087\7(\2\2\u0087\u0088"+
		"\5\34\17\2\u0088\u0089\7\5\2\2\u0089\25\3\2\2\2\u008a\u008b\5\30\r\2\u008b"+
		"\u008c\7\5\2\2\u008c\u00ad\3\2\2\2\u008d\u008e\7\t\2\2\u008e\u008f\5\36"+
		"\20\2\u008f\u0090\7\60\2\2\u0090\u0098\5\32\16\2\u0091\u0092\7\n\2\2\u0092"+
		"\u0093\5\36\20\2\u0093\u0094\7\60\2\2\u0094\u0095\5\32\16\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0091\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\13"+
		"\2\2\u009c\u009d\7\60\2\2\u009d\u009f\5\32\16\2\u009e\u009b\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00ad\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5\36"+
		"\20\2\u00a2\u00a3\7\60\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00ad\3\2\2\2\u00a5"+
		"\u00a6\7\r\2\2\u00a6\u00a7\7\65\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\5"+
		"\36\20\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\5\32\16\2\u00ab\u00ad\3\2\2"+
		"\2\u00ac\u008a\3\2\2\2\u00ac\u008d\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a5"+
		"\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00be\7\32\2\2\u00af\u00be\5\36\20\2\u00b0"+
		"\u00b2\7\7\2\2\u00b1\u00b3\5\36\20\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00be\3\2\2\2\u00b4\u00b5\5$\23\2\u00b5\u00b6\7(\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5\36\20\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd\u00b0\3\2"+
		"\2\2\u00bd\u00b7\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c2"+
		"\7\3\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\7\4\2\2\u00c7\33\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9\35\3\2\2\2\u00ca\u00cb"+
		"\b\20\1\2\u00cb\u00cf\5 \21\2\u00cc\u00cd\7\27\2\2\u00cd\u00cf\5\36\20"+
		"\5\u00ce\u00ca\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00db\3\2\2\2\u00d0\u00d1"+
		"\f\4\2\2\u00d1\u00d2\t\3\2\2\u00d2\u00da\5\36\20\5\u00d3\u00d4\f\3\2\2"+
		"\u00d4\u00d5\7\t\2\2\u00d5\u00d6\5\36\20\2\u00d6\u00d7\7\13\2\2\u00d7"+
		"\u00d8\5\36\20\4\u00d8\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3"+
		"\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\37\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\21\1\2\u00df\u0101\7\65"+
		"\2\2\u00e0\u0101\5\34\17\2\u00e1\u00ea\7\63\2\2\u00e2\u00e7\5\36\20\2"+
		"\u00e3\u00e4\7$\2\2\u00e4\u00e6\5\36\20\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u0101\7\64\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\5\36\20\2\u00ef"+
		"\u00f0\7\62\2\2\u00f0\u0101\3\2\2\2\u00f1\u00f2\7\65\2\2\u00f2\u00fb\7"+
		"\61\2\2\u00f3\u00f8\5\36\20\2\u00f4\u00f5\7$\2\2\u00f5\u00f7\5\36\20\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0101\7\62\2\2\u00fe\u00ff\7"+
		"\"\2\2\u00ff\u0101\5 \21\3\u0100\u00de\3\2\2\2\u0100\u00e0\3\2\2\2\u0100"+
		"\u00e1\3\2\2\2\u0100\u00ed\3\2\2\2\u0100\u00f1\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u011f\3\2\2\2\u0102\u0103\f\4\2\2\u0103\u0104\5\"\22\2\u0104"+
		"\u0105\5 \21\5\u0105\u011e\3\2\2\2\u0106\u0107\f\b\2\2\u0107\u0108\7#"+
		"\2\2\u0108\u011e\7\65\2\2\u0109\u010a\f\7\2\2\u010a\u010b\7\63\2\2\u010b"+
		"\u010c\5\36\20\2\u010c\u010d\7\64\2\2\u010d\u011e\3\2\2\2\u010e\u010f"+
		"\f\5\2\2\u010f\u0110\7#\2\2\u0110\u0111\7\65\2\2\u0111\u011a\7\61\2\2"+
		"\u0112\u0117\5\36\20\2\u0113\u0114\7$\2\2\u0114\u0116\5\36\20\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u0112\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\7\62\2\2\u011d\u0102\3"+
		"\2\2\2\u011d\u0106\3\2\2\2\u011d\u0109\3\2\2\2\u011d\u010e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120!\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122\u0123\t\4\2\2\u0123#\3\2\2\2\u0124\u012f\7"+
		"\65\2\2\u0125\u0126\5 \21\2\u0126\u0127\7#\2\2\u0127\u0128\7\65\2\2\u0128"+
		"\u012f\3\2\2\2\u0129\u012a\5 \21\2\u012a\u012b\7\63\2\2\u012b\u012c\5"+
		"\36\20\2\u012c\u012d\7\64\2\2\u012d\u012f\3\2\2\2\u012e\u0124\3\2\2\2"+
		"\u012e\u0125\3\2\2\2\u012e\u0129\3\2\2\2\u012f%\3\2\2\2#)+\61EGISV[gi"+
		"o{\u0098\u009e\u00ac\u00b2\u00b9\u00bd\u00c4\u00ce\u00d9\u00db\u00e7\u00ea"+
		"\u00f8\u00fb\u0100\u0117\u011a\u011d\u011f\u012e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}