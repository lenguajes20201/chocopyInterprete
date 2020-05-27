lexer grammar ChocoPyLexer;

//options { superClass=ChocoPyLexerBase; }


tokens { INDENT, DEDENT }



@lexer::members {
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
}




//COMMENT :  '#' ~[\r\n]* -> skip ;


DEF                : 'def';
RETURN             : 'return';
AS                 : 'as';
IF                 : 'if';
ELIF               : 'elif';
ELSE               : 'else';
WHILE              : 'while';
FOR                : 'for';
IN                 : 'in';
TRY                : 'try';
NONE               : 'None';
FINALLY            : 'finally';
WITH               : 'with';
EXCEPT             : 'except';
LAMBDA             : 'lambda';
OR                 : 'or';
AND                : 'and';
NOT                : 'not';
IS                 : 'is';
CLASS              : 'class';
PASS               : 'pass';
CONTINUE           : 'continue';
BREAK              : 'break';
TRUE               : 'True';
FALSE              : 'False';
NONLOCAL           : 'nonlocal';
GLOBAL             : 'global';

PLUS                : '+';
MINUS              : '-';
DOT                : '.';
COMMA              : ',';
ARROW              : '->';
BANG_EQUAL         : '!=';
EQUALS             : '==';
ASSIGN             : '=';
GREATER_THAN_EQUAL : '>=';
LESS_THAN_EQUAL    : '<=';
GREATER_THAN       : '>';
LESS_THAN          : '<';
MOD                : '%';
STAR               : '*';
IDIV               : '//';
COLON              : ':';

OPEN_PAREN         : '(';
CLOSE_PAREN        : ')';
OPEN_BRACKET       : '[';
CLOSE_BRACKET      : ']';


SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
;

IDENTIFIER         : ID_START ID_CONTINUE*;

//NEWLINE         : RN               ;
//WHITESPACE         : [ \t]+            {HandleSpaces();}   -> channel(HIDDEN);
//LINE_BREAK: ('\r'? '\n' | '\r' | '\f' ) SPACES?;

NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
   )
   {
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
   }
 ;







INTEGER            : NON_ZERO_DIGIT DIGIT* | '0';

IDSTRING
    : STRING
    ;

STRING
    : '"' ( ~["] )* '"'
    ;

fragment RN
    : '\r'? '\n'
    ;

fragment NON_ZERO_DIGIT
    : [1-9]
    ;

fragment DIGIT
    : [0-9]
    ;

fragment ZERO
    : '0'
    ;

fragment ID_CONTINUE
    : ID_START
    | [0-9]
    ;

fragment ID_START
    : '_'
    | [A-Z]
    | [a-z]
    ;

fragment SPACES
 : [ \t]+
 ;

fragment COMMENT : '#' ~[\r\n\f]* ->skip;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f')
 ;