// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\ChocoPyLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocoPyLexer extends ChocoPyLexerBase {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "RETURN", "AS", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", 
			"NONE", "FINALLY", "WITH", "EXCEPT", "LAMBDA", "OR", "AND", "NOT", "IS", 
			"CLASS", "PASS", "CONTINUE", "BREAK", "TRUE", "FALSE", "NONLOCAL", "GLOBAL", 
			"PLUS", "MINUS", "DOT", "COMMA", "ARROW", "BANG_EQUAL", "EQUALS", "ASSIGN", 
			"GREATER_THAN_EQUAL", "LESS_THAN_EQUAL", "GREATER_THAN", "LESS_THAN", 
			"MOD", "STAR", "IDIV", "COLON", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "IDENTIFIER", "NEWLINE", "WHITESPACE", "INTEGER", "STRING", 
			"IDSTRING", "RN", "NON_ZERO_DIGIT", "DIGIT", "ZERO", "ID_CONTINUE", "ID_START"
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


	public ChocoPyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ChocoPyLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 48:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			WHITESPACE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			HandleNewLine();
			break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			HandleSpaces();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0172\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\7\61\u0139\n"+
		"\61\f\61\16\61\u013c\13\61\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0144\n"+
		"\63\r\63\16\63\u0145\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u014e\n\64\f\64"+
		"\16\64\u0151\13\64\3\64\5\64\u0154\n\64\3\65\3\65\7\65\u0158\n\65\f\65"+
		"\16\65\u015b\13\65\3\65\3\65\3\66\3\66\3\67\5\67\u0162\n\67\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\5;\u016e\n;\3<\5<\u0171\n<\2\2=\3\6\5\7\7\b\t"+
		"\t\13\n\r\13\17\f\21\r\23\16\25\17\27\20\31\21\33\22\35\23\37\24!\25#"+
		"\26%\27\'\30)\31+\32-\33/\34\61\35\63\36\65\37\67 9!;\"=#?$A%C&E\'G(I"+
		")K*M+O,Q-S.U/W\60Y\61[\62]\63_\64a\65c\66e\67g8i9k:m\2o\2q\2s\2u\2w\2"+
		"\3\2\7\4\2\13\13\"\"\3\2$$\3\2\63;\3\2\62;\5\2C\\aac|\2\u0172\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3y\3\2\2\2\5}\3"+
		"\2\2\2\7\u0084\3\2\2\2\t\u0087\3\2\2\2\13\u008a\3\2\2\2\r\u008f\3\2\2"+
		"\2\17\u0094\3\2\2\2\21\u009a\3\2\2\2\23\u009e\3\2\2\2\25\u00a1\3\2\2\2"+
		"\27\u00a5\3\2\2\2\31\u00aa\3\2\2\2\33\u00b2\3\2\2\2\35\u00b7\3\2\2\2\37"+
		"\u00be\3\2\2\2!\u00c5\3\2\2\2#\u00c8\3\2\2\2%\u00cc\3\2\2\2\'\u00d0\3"+
		"\2\2\2)\u00d3\3\2\2\2+\u00d9\3\2\2\2-\u00de\3\2\2\2/\u00e7\3\2\2\2\61"+
		"\u00ed\3\2\2\2\63\u00f2\3\2\2\2\65\u00f8\3\2\2\2\67\u0101\3\2\2\29\u0108"+
		"\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010e\3\2\2\2A\u0110\3\2\2\2C"+
		"\u0113\3\2\2\2E\u0116\3\2\2\2G\u0119\3\2\2\2I\u011b\3\2\2\2K\u011e\3\2"+
		"\2\2M\u0121\3\2\2\2O\u0123\3\2\2\2Q\u0125\3\2\2\2S\u0127\3\2\2\2U\u0129"+
		"\3\2\2\2W\u012c\3\2\2\2Y\u012e\3\2\2\2[\u0130\3\2\2\2]\u0132\3\2\2\2_"+
		"\u0134\3\2\2\2a\u0136\3\2\2\2c\u013d\3\2\2\2e\u0143\3\2\2\2g\u0153\3\2"+
		"\2\2i\u0155\3\2\2\2k\u015e\3\2\2\2m\u0161\3\2\2\2o\u0165\3\2\2\2q\u0167"+
		"\3\2\2\2s\u0169\3\2\2\2u\u016d\3\2\2\2w\u0170\3\2\2\2yz\7f\2\2z{\7g\2"+
		"\2{|\7h\2\2|\4\3\2\2\2}~\7t\2\2~\177\7g\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7w\2\2\u0081\u0082\7t\2\2\u0082\u0083\7p\2\2\u0083\6\3\2\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u0086\7u\2\2\u0086\b\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089"+
		"\7h\2\2\u0089\n\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7h\2\2\u008e\f\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093\16\3\2\2\2\u0094\u0095"+
		"\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7g\2\2\u0099\20\3\2\2\2\u009a\u009b\7h\2\2\u009b\u009c\7q\2\2\u009c"+
		"\u009d\7t\2\2\u009d\22\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\24\3\2\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7{\2\2\u00a4"+
		"\26\3\2\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7k\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7n\2\2"+
		"\u00b0\u00b1\7{\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7"+
		"k\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\34\3\2\2\2\u00b7\u00b8"+
		"\7g\2\2\u00b8\u00b9\7z\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc\u00bd\7v\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7n\2\2\u00bf"+
		"\u00c0\7c\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3\u00c4\7c\2\2\u00c4 \3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7t\2"+
		"\2\u00c7\"\3\2\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7"+
		"f\2\2\u00cb$\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7v\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2(\3"+
		"\2\2\2\u00d3\u00d4\7e\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7c\2\2\u00d6"+
		"\u00d7\7u\2\2\u00d7\u00d8\7u\2\2\u00d8*\3\2\2\2\u00d9\u00da\7r\2\2\u00da"+
		"\u00db\7c\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7u\2\2\u00dd,\3\2\2\2\u00de"+
		"\u00df\7e\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6"+
		"\7g\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea"+
		"\7g\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7m\2\2\u00ec\60\3\2\2\2\u00ed\u00ee"+
		"\7V\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7g\2\2\u00f1"+
		"\62\3\2\2\2\u00f2\u00f3\7H\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7\64\3\2\2\2\u00f8\u00f9\7p\2\2\u00f9"+
		"\u00fa\7q\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7q\2\2"+
		"\u00fd\u00fe\7e\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7n\2\2\u0100\66\3\2"+
		"\2\2\u0101\u0102\7i\2\2\u0102\u0103\7n\2\2\u0103\u0104\7q\2\2\u0104\u0105"+
		"\7d\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u01078\3\2\2\2\u0108\u0109"+
		"\7-\2\2\u0109:\3\2\2\2\u010a\u010b\7/\2\2\u010b<\3\2\2\2\u010c\u010d\7"+
		"\60\2\2\u010d>\3\2\2\2\u010e\u010f\7.\2\2\u010f@\3\2\2\2\u0110\u0111\7"+
		"/\2\2\u0111\u0112\7@\2\2\u0112B\3\2\2\2\u0113\u0114\7#\2\2\u0114\u0115"+
		"\7?\2\2\u0115D\3\2\2\2\u0116\u0117\7?\2\2\u0117\u0118\7?\2\2\u0118F\3"+
		"\2\2\2\u0119\u011a\7?\2\2\u011aH\3\2\2\2\u011b\u011c\7@\2\2\u011c\u011d"+
		"\7?\2\2\u011dJ\3\2\2\2\u011e\u011f\7>\2\2\u011f\u0120\7?\2\2\u0120L\3"+
		"\2\2\2\u0121\u0122\7@\2\2\u0122N\3\2\2\2\u0123\u0124\7>\2\2\u0124P\3\2"+
		"\2\2\u0125\u0126\7\'\2\2\u0126R\3\2\2\2\u0127\u0128\7,\2\2\u0128T\3\2"+
		"\2\2\u0129\u012a\7\61\2\2\u012a\u012b\7\61\2\2\u012bV\3\2\2\2\u012c\u012d"+
		"\7<\2\2\u012dX\3\2\2\2\u012e\u012f\7*\2\2\u012fZ\3\2\2\2\u0130\u0131\7"+
		"+\2\2\u0131\\\3\2\2\2\u0132\u0133\7]\2\2\u0133^\3\2\2\2\u0134\u0135\7"+
		"_\2\2\u0135`\3\2\2\2\u0136\u013a\5w<\2\u0137\u0139\5u;\2\u0138\u0137\3"+
		"\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"b\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e\5m\67\2\u013e\u013f\b\62\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\u0141\b\62\3\2\u0141d\3\2\2\2\u0142\u0144\t"+
		"\2\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\63\4\2\u0148\u0149\3"+
		"\2\2\2\u0149\u014a\b\63\3\2\u014af\3\2\2\2\u014b\u014f\5o8\2\u014c\u014e"+
		"\5q9\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0154\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7\62"+
		"\2\2\u0153\u014b\3\2\2\2\u0153\u0152\3\2\2\2\u0154h\3\2\2\2\u0155\u0159"+
		"\7$\2\2\u0156\u0158\n\3\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015c\u015d\7$\2\2\u015dj\3\2\2\2\u015e\u015f\5i\65\2\u015fl\3\2"+
		"\2\2\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\7\f\2\2\u0164n\3\2\2\2\u0165\u0166\t\4\2\2"+
		"\u0166p\3\2\2\2\u0167\u0168\t\5\2\2\u0168r\3\2\2\2\u0169\u016a\7\62\2"+
		"\2\u016at\3\2\2\2\u016b\u016e\5w<\2\u016c\u016e\t\5\2\2\u016d\u016b\3"+
		"\2\2\2\u016d\u016c\3\2\2\2\u016ev\3\2\2\2\u016f\u0171\t\6\2\2\u0170\u016f"+
		"\3\2\2\2\u0171x\3\2\2\2\13\2\u013a\u0145\u014f\u0153\u0159\u0161\u016d"+
		"\u0170\5\3\62\2\2\3\2\3\63\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}