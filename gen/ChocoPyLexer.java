// Generated from C:/Users/ACER/IdeaProjects/chocopyInterprete/grammar\ChocoPyLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChocoPyLexer extends Lexer {
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
		SKIP_=50, IDENTIFIER=51, NEWLINE=52, INTEGER=53, IDSTRING=54, STRING=55;
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
			"CLOSE_BRACKET", "SKIP_", "IDENTIFIER", "NEWLINE", "INTEGER", "IDSTRING", 
			"STRING", "RN", "NON_ZERO_DIGIT", "DIGIT", "ZERO", "ID_CONTINUE", "ID_START", 
			"SPACES", "COMMENT", "LINE_JOINING"
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
			"NEWLINE", "INTEGER", "IDSTRING", "STRING"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;
	  // The most recently produced token.
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(ChocoPyParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(ChocoPyParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }

	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(ChocoPyParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  // Calculates the indentation of the provided spaces, taking the
	  // following rules into account:
	  //
	  // "Tabs are replaced (from left to right) by one to eight spaces
	  //  such that the total number of characters up to and including
	  //  the replacement is a multiple of eight [...]"
	  //
	  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
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
		case 49:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");

			     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
			     // satisfy the final newline needed by the single_put rule used by the REPL.
			     int next = _input.LA(1);
			     int nextnext = _input.LA(2);
			     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));
			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(ChocoPyParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 49:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u019a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\61\5\61\u0140\n\61\3\61\3\61\3\62\3\62\7\62\u0146\n\62\f\62\16"+
		"\62\u0149\13\62\3\63\3\63\3\63\5\63\u014e\n\63\3\63\3\63\5\63\u0152\n"+
		"\63\3\63\5\63\u0155\n\63\5\63\u0157\n\63\3\63\3\63\3\64\3\64\7\64\u015d"+
		"\n\64\f\64\16\64\u0160\13\64\3\64\5\64\u0163\n\64\3\65\3\65\3\66\3\66"+
		"\7\66\u0169\n\66\f\66\16\66\u016c\13\66\3\66\3\66\3\67\5\67\u0171\n\67"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\5;\u017d\n;\3<\5<\u0180\n<\3=\6=\u0183"+
		"\n=\r=\16=\u0184\3>\3>\7>\u0189\n>\f>\16>\u018c\13>\3>\3>\3?\3?\5?\u0192"+
		"\n?\3?\5?\u0195\n?\3?\3?\5?\u0199\n?\2\2@\3\5\5\6\7\7\t\b\13\t\r\n\17"+
		"\13\21\f\23\r\25\16\27\17\31\20\33\21\35\22\37\23!\24#\25%\26\'\27)\30"+
		"+\31-\32/\33\61\34\63\35\65\36\67\379 ;!=\"?#A$C%E&G\'I(K)M*O+Q,S-U.W"+
		"/Y\60[\61]\62_\63a\64c\65e\66g\67i8k9m\2o\2q\2s\2u\2w\2y\2{\2}\2\3\2\b"+
		"\3\2$$\3\2\63;\3\2\62;\5\2C\\aac|\4\2\13\13\"\"\4\2\f\f\16\17\2\u01a1"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3\177\3"+
		"\2\2\2\5\u0083\3\2\2\2\7\u008a\3\2\2\2\t\u008d\3\2\2\2\13\u0090\3\2\2"+
		"\2\r\u0095\3\2\2\2\17\u009a\3\2\2\2\21\u00a0\3\2\2\2\23\u00a4\3\2\2\2"+
		"\25\u00a7\3\2\2\2\27\u00ab\3\2\2\2\31\u00b0\3\2\2\2\33\u00b8\3\2\2\2\35"+
		"\u00bd\3\2\2\2\37\u00c4\3\2\2\2!\u00cb\3\2\2\2#\u00ce\3\2\2\2%\u00d2\3"+
		"\2\2\2\'\u00d6\3\2\2\2)\u00d9\3\2\2\2+\u00df\3\2\2\2-\u00e4\3\2\2\2/\u00ed"+
		"\3\2\2\2\61\u00f3\3\2\2\2\63\u00f8\3\2\2\2\65\u00fe\3\2\2\2\67\u0107\3"+
		"\2\2\29\u010e\3\2\2\2;\u0110\3\2\2\2=\u0112\3\2\2\2?\u0114\3\2\2\2A\u0116"+
		"\3\2\2\2C\u0119\3\2\2\2E\u011c\3\2\2\2G\u011f\3\2\2\2I\u0121\3\2\2\2K"+
		"\u0124\3\2\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u012b\3\2\2\2S\u012d\3\2"+
		"\2\2U\u012f\3\2\2\2W\u0132\3\2\2\2Y\u0134\3\2\2\2[\u0136\3\2\2\2]\u0138"+
		"\3\2\2\2_\u013a\3\2\2\2a\u013f\3\2\2\2c\u0143\3\2\2\2e\u0156\3\2\2\2g"+
		"\u0162\3\2\2\2i\u0164\3\2\2\2k\u0166\3\2\2\2m\u0170\3\2\2\2o\u0174\3\2"+
		"\2\2q\u0176\3\2\2\2s\u0178\3\2\2\2u\u017c\3\2\2\2w\u017f\3\2\2\2y\u0182"+
		"\3\2\2\2{\u0186\3\2\2\2}\u018f\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7"+
		"g\2\2\u0081\u0082\7h\2\2\u0082\4\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085"+
		"\7g\2\2\u0085\u0086\7v\2\2\u0086\u0087\7w\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7p\2\2\u0089\6\3\2\2\2\u008a\u008b\7c\2\2\u008b\u008c\7u\2\2\u008c"+
		"\b\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f\n\3\2\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7k\2\2\u0093\u0094\7h\2\2"+
		"\u0094\f\3\2\2\2\u0095\u0096\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7u"+
		"\2\2\u0098\u0099\7g\2\2\u0099\16\3\2\2\2\u009a\u009b\7y\2\2\u009b\u009c"+
		"\7j\2\2\u009c\u009d\7k\2\2\u009d\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f"+
		"\20\3\2\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a6\24\3\2\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7{\2\2\u00aa\26\3\2\2\2\u00ab"+
		"\u00ac\7P\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\30\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7"+
		"p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7"+
		"\7{\2\2\u00b7\32\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7j\2\2\u00bc\34\3\2\2\2\u00bd\u00be\7g\2\2\u00be\u00bf"+
		"\7z\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7r\2\2\u00c2"+
		"\u00c3\7v\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7c\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7c\2\2"+
		"\u00ca \3\2\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd\"\3\2\2\2"+
		"\u00ce\u00cf\7c\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7f\2\2\u00d1$\3\2\2"+
		"\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7v\2\2\u00d5&\3\2"+
		"\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7u\2\2\u00d8(\3\2\2\2\u00d9\u00da"+
		"\7e\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7u\2\2\u00dd"+
		"\u00de\7u\2\2\u00de*\3\2\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7c\2\2\u00e1"+
		"\u00e2\7u\2\2\u00e2\u00e3\7u\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7e\2\2\u00e5"+
		"\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7k\2\2"+
		"\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec\7g\2\2\u00ec.\3\2\2"+
		"\2\u00ed\u00ee\7d\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1"+
		"\7c\2\2\u00f1\u00f2\7m\2\2\u00f2\60\3\2\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5"+
		"\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7g\2\2\u00f7\62\3\2\2\2\u00f8\u00f9"+
		"\7H\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7u\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\64\3\2\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7e\2\2"+
		"\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\66\3\2\2\2\u0107\u0108\7"+
		"i\2\2\u0108\u0109\7n\2\2\u0109\u010a\7q\2\2\u010a\u010b\7d\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7n\2\2\u010d8\3\2\2\2\u010e\u010f\7-\2\2\u010f:\3"+
		"\2\2\2\u0110\u0111\7/\2\2\u0111<\3\2\2\2\u0112\u0113\7\60\2\2\u0113>\3"+
		"\2\2\2\u0114\u0115\7.\2\2\u0115@\3\2\2\2\u0116\u0117\7/\2\2\u0117\u0118"+
		"\7@\2\2\u0118B\3\2\2\2\u0119\u011a\7#\2\2\u011a\u011b\7?\2\2\u011bD\3"+
		"\2\2\2\u011c\u011d\7?\2\2\u011d\u011e\7?\2\2\u011eF\3\2\2\2\u011f\u0120"+
		"\7?\2\2\u0120H\3\2\2\2\u0121\u0122\7@\2\2\u0122\u0123\7?\2\2\u0123J\3"+
		"\2\2\2\u0124\u0125\7>\2\2\u0125\u0126\7?\2\2\u0126L\3\2\2\2\u0127\u0128"+
		"\7@\2\2\u0128N\3\2\2\2\u0129\u012a\7>\2\2\u012aP\3\2\2\2\u012b\u012c\7"+
		"\'\2\2\u012cR\3\2\2\2\u012d\u012e\7,\2\2\u012eT\3\2\2\2\u012f\u0130\7"+
		"\61\2\2\u0130\u0131\7\61\2\2\u0131V\3\2\2\2\u0132\u0133\7<\2\2\u0133X"+
		"\3\2\2\2\u0134\u0135\7*\2\2\u0135Z\3\2\2\2\u0136\u0137\7+\2\2\u0137\\"+
		"\3\2\2\2\u0138\u0139\7]\2\2\u0139^\3\2\2\2\u013a\u013b\7_\2\2\u013b`\3"+
		"\2\2\2\u013c\u0140\5y=\2\u013d\u0140\5{>\2\u013e\u0140\5}?\2\u013f\u013c"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\b\61\2\2\u0142b\3\2\2\2\u0143\u0147\5w<\2\u0144\u0146\5u;\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148d\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\6\63\2\2\u014b\u0157"+
		"\5y=\2\u014c\u014e\7\17\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0152\7\f\2\2\u0150\u0152\4\16\17\2\u0151\u014d\3"+
		"\2\2\2\u0151\u0150\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0155\5y=\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u014a\3\2"+
		"\2\2\u0156\u0151\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\63\3\2\u0159"+
		"f\3\2\2\2\u015a\u015e\5o8\2\u015b\u015d\5q9\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0163\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\7\62\2\2\u0162\u015a\3\2\2\2\u0162"+
		"\u0161\3\2\2\2\u0163h\3\2\2\2\u0164\u0165\5k\66\2\u0165j\3\2\2\2\u0166"+
		"\u016a\7$\2\2\u0167\u0169\n\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2"+
		"\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016d\u016e\7$\2\2\u016el\3\2\2\2\u016f\u0171\7\17\2\2"+
		"\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\7\f\2\2\u0173n\3\2\2\2\u0174\u0175\t\3\2\2\u0175p\3\2\2\2\u0176\u0177"+
		"\t\4\2\2\u0177r\3\2\2\2\u0178\u0179\7\62\2\2\u0179t\3\2\2\2\u017a\u017d"+
		"\5w<\2\u017b\u017d\t\4\2\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"v\3\2\2\2\u017e\u0180\t\5\2\2\u017f\u017e\3\2\2\2\u0180x\3\2\2\2\u0181"+
		"\u0183\t\6\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185z\3\2\2\2\u0186\u018a\7%\2\2\u0187\u0189"+
		"\n\7\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\b>"+
		"\2\2\u018e|\3\2\2\2\u018f\u0191\7^\2\2\u0190\u0192\5y=\2\u0191\u0190\3"+
		"\2\2\2\u0191\u0192\3\2\2\2\u0192\u0198\3\2\2\2\u0193\u0195\7\17\2\2\u0194"+
		"\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0199\7\f"+
		"\2\2\u0197\u0199\4\16\17\2\u0198\u0194\3\2\2\2\u0198\u0197\3\2\2\2\u0199"+
		"~\3\2\2\2\24\2\u013f\u0147\u014d\u0151\u0154\u0156\u015e\u0162\u016a\u0170"+
		"\u017c\u017f\u0184\u018a\u0191\u0194\u0198\4\b\2\2\3\63\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}