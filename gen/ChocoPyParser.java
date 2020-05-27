// Generated from C:/Users/ACER/IdeaProjects/chocopyInterprete/grammar\ChocoPyParser.g4 by ANTLR 4.8
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
		INDENT=1, DEDENT=2, DEF=3, RETURN=4, AS=5, IF=6, ELIF=7, ELSE=8, WHILE=9, 
		FOR=10, IN=11, TRY=12, NONE=13, FINALLY=14, WITH=15, EXCEPT=16, LAMBDA=17, 
		OR=18, AND=19, NOT=20, IS=21, CLASS=22, PASS=23, CONTINUE=24, BREAK=25, 
		TRUE=26, FALSE=27, NONLOCAL=28, GLOBAL=29, PLUS=30, MINUS=31, DOT=32, 
		COMMA=33, ARROW=34, BANG_EQUAL=35, EQUALS=36, ASSIGN=37, GREATER_THAN_EQUAL=38, 
		LESS_THAN_EQUAL=39, GREATER_THAN=40, LESS_THAN=41, MOD=42, STAR=43, IDIV=44, 
		COLON=45, OPEN_PAREN=46, CLOSE_PAREN=47, OPEN_BRACKET=48, CLOSE_BRACKET=49, 
		SKIP_=50, IDENTIFIER=51, NEWLINE=52, INTEGER=53, IDSTRING=54, STRING=55, 
		COMMENT=56;
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
			null, null, null, "'def'", "'return'", "'as'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'in'", "'try'", "'None'", "'finally'", "'with'", 
			"'except'", "'lambda'", "'or'", "'and'", "'not'", "'is'", "'class'", 
			"'pass'", "'continue'", "'break'", "'True'", "'False'", "'nonlocal'", 
			"'global'", "'+'", "'-'", "'.'", "','", "'->'", "'!='", "'=='", "'='", 
			"'>='", "'<='", "'>'", "'<'", "'%'", "'*'", "'//'", "':'", "'('", "')'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INDENT", "DEDENT", "DEF", "RETURN", "AS", "IF", "ELIF", "ELSE", 
			"WHILE", "FOR", "IN", "TRY", "NONE", "FINALLY", "WITH", "EXCEPT", "LAMBDA", 
			"OR", "AND", "NOT", "IS", "CLASS", "PASS", "CONTINUE", "BREAK", "TRUE", 
			"FALSE", "NONLOCAL", "GLOBAL", "PLUS", "MINUS", "DOT", "COMMA", "ARROW", 
			"BANG_EQUAL", "EQUALS", "ASSIGN", "GREATER_THAN_EQUAL", "LESS_THAN_EQUAL", 
			"GREATER_THAN", "LESS_THAN", "MOD", "STAR", "IDIV", "COLON", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_BRACKET", "CLOSE_BRACKET", "SKIP_", "IDENTIFIER", 
			"NEWLINE", "INTEGER", "IDSTRING", "STRING", "COMMENT"
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Program_CommentsContext extends ProgramContext {
		public TerminalNode COMMENT() { return getToken(ChocoPyParser.COMMENT, 0); }
		public TerminalNode EOF() { return getToken(ChocoPyParser.EOF, 0); }
		public Program_CommentsContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterProgram_Comments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitProgram_Comments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitProgram_Comments(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Program_DeclContext extends ProgramContext {
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
		public Program_DeclContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).enterProgram_Decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ChocoPyParserListener ) ((ChocoPyParserListener)listener).exitProgram_Decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ChocoPyParserVisitor ) return ((ChocoPyParserVisitor<? extends T>)visitor).visitProgram_Decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Program_DeclContext(_localctx);
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING) | (1L << COMMENT))) != 0)) {
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
				break;
			case 2:
				_localctx = new Program_CommentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(COMMENT);
				setState(52);
				match(EOF);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ChocoPyParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ChocoPyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ChocoPyParser.IDENTIFIER, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ChocoPyParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ChocoPyParser.CLOSE_PAREN, 0); }
		public TerminalNode COLON() { return getToken(ChocoPyParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(55);
			match(CLASS);
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(OPEN_PAREN);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(CLOSE_PAREN);
			setState(60);
			match(COLON);
			setState(61);
			match(NEWLINE);
			setState(62);
			match(INDENT);
			setState(63);
			class_body();
			setState(64);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(PASS);
				setState(67);
				match(NEWLINE);
				}
				break;
			case DEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(70);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(68);
						var_def();
						}
						break;
					case DEF:
						{
						setState(69);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(72); 
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(76);
			match(DEF);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(OPEN_PAREN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(79);
				typed_var();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(80);
					match(COMMA);
					setState(81);
					typed_var();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(CLOSE_PAREN);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(90);
				match(ARROW);
				setState(91);
				type();
				}
			}

			setState(94);
			match(COLON);
			setState(95);
			match(NEWLINE);
			setState(96);
			match(INDENT);
			setState(97);
			func_body();
			setState(98);
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
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(104);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(100);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(101);
						nonlocal_decl();
						}
						break;
					case IDENTIFIER:
						{
						setState(102);
						var_def();
						}
						break;
					case DEF:
						{
						setState(103);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109);
				stmt();
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING) | (1L << COMMENT))) != 0) );
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
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(COLON);
			setState(116);
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
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(IDENTIFIER);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(IDSTRING);
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(OPEN_BRACKET);
				setState(121);
				type();
				setState(122);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(126);
			match(GLOBAL);
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(130);
			match(NONLOCAL);
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(134);
			typed_var();
			setState(135);
			match(ASSIGN);
			setState(136);
			literal();
			setState(137);
			match(NEWLINE);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
		public TerminalNode COMMENT() { return getToken(ChocoPyParser.COMMENT, 0); }
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
			setState(175);
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
			case IDSTRING:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				simple_stmt();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(140);
					match(NEWLINE);
					}
				}

				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IF);
				setState(144);
				expr(0);
				setState(145);
				match(COLON);
				setState(146);
				block();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(147);
					match(ELIF);
					setState(148);
					expr(0);
					setState(149);
					match(COLON);
					setState(150);
					block();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(157);
					match(ELSE);
					setState(158);
					match(COLON);
					setState(159);
					block();
					}
				}

				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(WHILE);
				setState(163);
				expr(0);
				setState(164);
				match(COLON);
				setState(165);
				block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(FOR);
				setState(168);
				match(IDENTIFIER);
				setState(169);
				match(IN);
				setState(170);
				expr(0);
				setState(171);
				match(COLON);
				setState(172);
				block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(COMMENT);
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
		try {
			int _alt;
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(RETURN);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(180);
					expr(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						target();
						setState(184);
						match(ASSIGN);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(188); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(190);
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
		public TerminalNode NEWLINE() { return getToken(ChocoPyParser.NEWLINE, 0); }
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
			setState(194);
			match(NEWLINE);
			setState(195);
			match(INDENT);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				stmt();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << NOT) | (1L << PASS) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING) | (1L << COMMENT))) != 0) );
			setState(201);
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
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING))) != 0)) ) {
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
			setState(209);
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
			case IDSTRING:
			case STRING:
				{
				setState(206);
				cexpr(0);
				}
				break;
			case NOT:
				{
				setState(207);
				match(NOT);
				setState(208);
				expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						match(IF);
						setState(216);
						expr(0);
						setState(217);
						match(ELSE);
						setState(218);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(226);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(227);
				literal();
				}
				break;
			case 3:
				{
				setState(228);
				match(OPEN_BRACKET);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(229);
					expr(0);
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(230);
						match(COMMA);
						setState(231);
						expr(0);
						}
						}
						setState(236);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(239);
				match(CLOSE_BRACKET);
				}
				break;
			case 4:
				{
				setState(240);
				match(OPEN_PAREN);
				setState(241);
				expr(0);
				setState(242);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(OPEN_PAREN);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
					{
					setState(246);
					expr(0);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(247);
						match(COMMA);
						setState(248);
						expr(0);
						}
						}
						setState(253);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(256);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				{
				setState(257);
				match(MINUS);
				setState(258);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(288);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(261);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(262);
						bin_op();
						setState(263);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						match(DOT);
						setState(267);
						match(IDENTIFIER);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						match(OPEN_BRACKET);
						setState(270);
						expr(0);
						setState(271);
						match(CLOSE_BRACKET);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(273);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(274);
						match(DOT);
						setState(275);
						match(IDENTIFIER);
						setState(276);
						match(OPEN_PAREN);
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << MINUS) | (1L << OPEN_PAREN) | (1L << OPEN_BRACKET) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << IDSTRING) | (1L << STRING))) != 0)) {
							{
							setState(277);
							expr(0);
							setState(282);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(278);
								match(COMMA);
								setState(279);
								expr(0);
								}
								}
								setState(284);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(287);
						match(CLOSE_PAREN);
						}
						break;
					}
					} 
				}
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			setState(293);
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
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				cexpr(0);
				setState(297);
				match(DOT);
				setState(298);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				cexpr(0);
				setState(301);
				match(OPEN_BRACKET);
				setState(302);
				expr(0);
				setState(303);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0136\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\3\2\5\28\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\6\4I\n\4\r\4\16\4J\5\4M\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\7\5U\n\5\f\5\16\5X\13\5\5\5Z\n\5\3\5\3\5\3\5\5\5_\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\6\6q\n\6\r\6\16"+
		"\6r\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0090\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009b\n\f\f\f\16\f\u009e\13\f\3\f"+
		"\3\f\3\f\5\f\u00a3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00b2\n\f\3\r\3\r\3\r\3\r\5\r\u00b8\n\r\3\r\3\r\3\r\6\r\u00bd"+
		"\n\r\r\r\16\r\u00be\3\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\16\6\16\u00c8\n"+
		"\16\r\16\16\16\u00c9\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00d4"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00df\n\20\f\20"+
		"\16\20\u00e2\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00eb\n\21"+
		"\f\21\16\21\u00ee\13\21\5\21\u00f0\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff\13\21\5\21\u0101"+
		"\n\21\3\21\3\21\3\21\5\21\u0106\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u011b"+
		"\n\21\f\21\16\21\u011e\13\21\5\21\u0120\n\21\3\21\7\21\u0123\n\21\f\21"+
		"\16\21\u0126\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\5\23\u0134\n\23\3\23\2\4\36 \24\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$\2\5\5\2\17\17\34\35\679\3\2\24\25\6\2\27\27 !%&(.\2\u0156"+
		"\2\67\3\2\2\2\49\3\2\2\2\6L\3\2\2\2\bN\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16"+
		"~\3\2\2\2\20\u0080\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2\26\u00b1"+
		"\3\2\2\2\30\u00c2\3\2\2\2\32\u00c4\3\2\2\2\34\u00cd\3\2\2\2\36\u00d3\3"+
		"\2\2\2 \u0105\3\2\2\2\"\u0127\3\2\2\2$\u0133\3\2\2\2&*\5\24\13\2\'*\5"+
		"\b\5\2(*\5\4\3\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,"+
		"\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\5\26\f\2/.\3\2\2\2\60\63\3\2\2\2\61"+
		"/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\648\7\2\2\3\65\66"+
		"\7:\2\2\668\7\2\2\3\67+\3\2\2\2\67\65\3\2\2\28\3\3\2\2\29:\7\30\2\2:;"+
		"\7\65\2\2;<\7\60\2\2<=\7\65\2\2=>\7\61\2\2>?\7/\2\2?@\7\66\2\2@A\7\3\2"+
		"\2AB\5\6\4\2BC\7\4\2\2C\5\3\2\2\2DE\7\31\2\2EM\7\66\2\2FI\5\24\13\2GI"+
		"\5\b\5\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2L"+
		"D\3\2\2\2LH\3\2\2\2M\7\3\2\2\2NO\7\5\2\2OP\7\65\2\2PY\7\60\2\2QV\5\f\7"+
		"\2RS\7#\2\2SU\5\f\7\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2"+
		"\2XV\3\2\2\2YQ\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[^\7\61\2\2\\]\7$\2\2]_\5\16"+
		"\b\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7/\2\2ab\7\66\2\2bc\7\3\2\2cd\5"+
		"\n\6\2de\7\4\2\2e\t\3\2\2\2fk\5\20\t\2gk\5\22\n\2hk\5\24\13\2ik\5\b\5"+
		"\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mp\3\2\2\2nl\3\2\2\2oq\5\26\f\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2"+
		"\2\2s\13\3\2\2\2tu\7\65\2\2uv\7/\2\2vw\5\16\b\2w\r\3\2\2\2x\177\7\65\2"+
		"\2y\177\78\2\2z{\7\62\2\2{|\5\16\b\2|}\7\63\2\2}\177\3\2\2\2~x\3\2\2\2"+
		"~y\3\2\2\2~z\3\2\2\2\177\17\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\7"+
		"\65\2\2\u0082\u0083\7\66\2\2\u0083\21\3\2\2\2\u0084\u0085\7\36\2\2\u0085"+
		"\u0086\7\65\2\2\u0086\u0087\7\66\2\2\u0087\23\3\2\2\2\u0088\u0089\5\f"+
		"\7\2\u0089\u008a\7\'\2\2\u008a\u008b\5\34\17\2\u008b\u008c\7\66\2\2\u008c"+
		"\25\3\2\2\2\u008d\u008f\5\30\r\2\u008e\u0090\7\66\2\2\u008f\u008e\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u00b2\3\2\2\2\u0091\u0092\7\b\2\2\u0092"+
		"\u0093\5\36\20\2\u0093\u0094\7/\2\2\u0094\u009c\5\32\16\2\u0095\u0096"+
		"\7\t\2\2\u0096\u0097\5\36\20\2\u0097\u0098\7/\2\2\u0098\u0099\5\32\16"+
		"\2\u0099\u009b\3\2\2\2\u009a\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a2\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a0\7\n\2\2\u00a0\u00a1\7/\2\2\u00a1\u00a3\5\32\16\2\u00a2\u009f\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00b2\3\2\2\2\u00a4\u00a5\7\13\2\2\u00a5"+
		"\u00a6\5\36\20\2\u00a6\u00a7\7/\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00b2"+
		"\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa\u00ab\7\65\2\2\u00ab\u00ac\7\r\2\2"+
		"\u00ac\u00ad\5\36\20\2\u00ad\u00ae\7/\2\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b2\3\2\2\2\u00b0\u00b2\7:\2\2\u00b1\u008d\3\2\2\2\u00b1\u0091\3\2"+
		"\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00c3\7\31\2\2\u00b4\u00c3\5\36\20\2\u00b5\u00b7\7\6"+
		"\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00c3\3\2\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\'\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b4\3\2\2\2\u00c2\u00b5\3\2\2\2\u00c2"+
		"\u00bc\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\66\2\2\u00c5\u00c7\7\3\2"+
		"\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\4"+
		"\2\2\u00cc\33\3\2\2\2\u00cd\u00ce\t\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d0"+
		"\b\20\1\2\u00d0\u00d4\5 \21\2\u00d1\u00d2\7\26\2\2\u00d2\u00d4\5\36\20"+
		"\5\u00d3\u00cf\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00e0\3\2\2\2\u00d5\u00d6"+
		"\f\4\2\2\u00d6\u00d7\t\3\2\2\u00d7\u00df\5\36\20\5\u00d8\u00d9\f\3\2\2"+
		"\u00d9\u00da\7\b\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\n\2\2\u00dc\u00dd"+
		"\5\36\20\4\u00dd\u00df\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d8\3\2\2\2"+
		"\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\37"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\b\21\1\2\u00e4\u0106\7\65\2\2"+
		"\u00e5\u0106\5\34\17\2\u00e6\u00ef\7\62\2\2\u00e7\u00ec\5\36\20\2\u00e8"+
		"\u00e9\7#\2\2\u00e9\u00eb\5\36\20\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u0106\7\63\2\2\u00f2\u00f3\7\60\2\2\u00f3\u00f4\5\36\20\2\u00f4"+
		"\u00f5\7\61\2\2\u00f5\u0106\3\2\2\2\u00f6\u00f7\7\65\2\2\u00f7\u0100\7"+
		"\60\2\2\u00f8\u00fd\5\36\20\2\u00f9\u00fa\7#\2\2\u00fa\u00fc\5\36\20\2"+
		"\u00fb\u00f9\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u00f8\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0106\7\61\2\2\u0103\u0104\7"+
		"!\2\2\u0104\u0106\5 \21\3\u0105\u00e3\3\2\2\2\u0105\u00e5\3\2\2\2\u0105"+
		"\u00e6\3\2\2\2\u0105\u00f2\3\2\2\2\u0105\u00f6\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0124\3\2\2\2\u0107\u0108\f\4\2\2\u0108\u0109\5\"\22\2\u0109"+
		"\u010a\5 \21\5\u010a\u0123\3\2\2\2\u010b\u010c\f\b\2\2\u010c\u010d\7\""+
		"\2\2\u010d\u0123\7\65\2\2\u010e\u010f\f\7\2\2\u010f\u0110\7\62\2\2\u0110"+
		"\u0111\5\36\20\2\u0111\u0112\7\63\2\2\u0112\u0123\3\2\2\2\u0113\u0114"+
		"\f\5\2\2\u0114\u0115\7\"\2\2\u0115\u0116\7\65\2\2\u0116\u011f\7\60\2\2"+
		"\u0117\u011c\5\36\20\2\u0118\u0119\7#\2\2\u0119\u011b\5\36\20\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0117\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\7\61\2\2\u0122\u0107\3"+
		"\2\2\2\u0122\u010b\3\2\2\2\u0122\u010e\3\2\2\2\u0122\u0113\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125!\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0127\u0128\t\4\2\2\u0128#\3\2\2\2\u0129\u0134\7"+
		"\65\2\2\u012a\u012b\5 \21\2\u012b\u012c\7\"\2\2\u012c\u012d\7\65\2\2\u012d"+
		"\u0134\3\2\2\2\u012e\u012f\5 \21\2\u012f\u0130\7\62\2\2\u0130\u0131\5"+
		"\36\20\2\u0131\u0132\7\63\2\2\u0132\u0134\3\2\2\2\u0133\u0129\3\2\2\2"+
		"\u0133\u012a\3\2\2\2\u0133\u012e\3\2\2\2\u0134%\3\2\2\2%)+\61\67HJLVY"+
		"^jlr~\u008f\u009c\u00a2\u00b1\u00b7\u00be\u00c2\u00c9\u00d3\u00de\u00e0"+
		"\u00ec\u00ef\u00fd\u0100\u0105\u011c\u011f\u0122\u0124\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}