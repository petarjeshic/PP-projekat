/* The following code was generated by JFlex 1.4.3 on 4/21/17 4:21 PM */

package rs.ac.bg.etf.pp1;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/21/17 4:21 PM from the specification file
 * <tt>spec/mjlexer.flex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\1\1\1\1\3\1\0\1\1\1\2\22\0\1\1\1\44"+
    "\1\61\2\0\1\25\1\26\1\60\1\33\1\34\1\23\1\21\1\32"+
    "\1\22\1\41\1\24\12\57\1\0\1\31\1\42\1\30\1\43\2\0"+
    "\32\55\1\37\1\0\1\40\1\0\1\56\1\0\1\10\1\45\1\47"+
    "\1\20\1\15\1\52\1\7\1\55\1\12\1\55\1\46\1\50\1\11"+
    "\1\13\1\6\1\4\1\55\1\5\1\51\1\14\1\16\1\17\1\53"+
    "\1\54\2\55\1\35\1\27\1\36\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\10\3\1\4\1\5\1\6"+
    "\1\7\1\10\2\1\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\1"+
    "\4\3\1\25\2\1\2\26\2\3\1\27\5\3\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\6\3\2\0\1\45\1\46"+
    "\4\3\1\47\10\3\1\50\1\3\1\51\2\3\1\52"+
    "\1\3\1\53\1\54\1\3\1\55\6\3\1\56\2\3"+
    "\1\57\1\3\1\60\1\61\2\3\1\62\2\3\1\63"+
    "\1\64\1\65\1\3\1\66";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\144\0\226\0\310\0\372\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a\0\u02bc"+
    "\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\144\0\144\0\144"+
    "\0\144\0\144\0\144\0\144\0\144\0\144\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa"+
    "\0\144\0\u05dc\0\u060e\0\u0640\0\u012c\0\u0672\0\u06a4\0\u06d6"+
    "\0\u0708\0\u073a\0\144\0\144\0\144\0\144\0\144\0\144"+
    "\0\144\0\144\0\144\0\144\0\144\0\144\0\144\0\u076c"+
    "\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u05aa\0\u05aa"+
    "\0\144\0\u08ca\0\u08fc\0\u092e\0\u0960\0\u012c\0\u0992\0\u09c4"+
    "\0\u09f6\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u012c\0\u0b22"+
    "\0\144\0\u0b54\0\u0b86\0\u012c\0\u0bb8\0\u012c\0\u012c\0\u0bea"+
    "\0\u012c\0\u0c1c\0\u0c4e\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u012c"+
    "\0\u0d48\0\u0d7a\0\u012c\0\u0dac\0\u012c\0\u012c\0\u0dde\0\u0e10"+
    "\0\u012c\0\u0e42\0\u0e74\0\u012c\0\u012c\0\u012c\0\u0ea6\0\u012c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\0\1\6\1\7\4\10\1\11"+
    "\1\12\1\13\1\14\1\10\1\15\1\10\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\10\1\43\1\10\1\44\1\45"+
    "\3\10\1\3\1\46\1\47\1\50\2\51\1\52\1\0"+
    "\56\51\65\0\1\4\62\0\1\10\1\53\13\10\6\0"+
    "\1\10\15\0\13\10\6\0\11\10\1\54\3\10\6\0"+
    "\1\10\15\0\13\10\6\0\15\10\6\0\1\10\15\0"+
    "\13\10\6\0\15\10\6\0\1\10\15\0\5\10\1\55"+
    "\5\10\6\0\11\10\1\56\3\10\6\0\1\10\15\0"+
    "\13\10\6\0\1\10\1\57\13\10\6\0\1\10\15\0"+
    "\13\10\6\0\15\10\6\0\1\10\15\0\3\10\1\60"+
    "\3\10\1\61\3\10\6\0\2\10\1\62\12\10\6\0"+
    "\1\10\15\0\13\10\23\0\1\63\6\0\1\64\53\0"+
    "\1\65\5\0\1\66\61\0\1\67\55\0\1\51\3\0"+
    "\1\70\61\0\1\71\57\0\1\72\62\0\1\73\62\0"+
    "\1\74\61\0\1\75\61\0\1\76\61\0\1\77\35\0"+
    "\1\10\1\100\13\10\6\0\1\10\15\0\13\10\6\0"+
    "\2\10\1\101\12\10\6\0\1\10\15\0\3\10\1\102"+
    "\7\10\6\0\10\10\1\103\4\10\6\0\1\10\15\0"+
    "\13\10\6\0\2\10\1\104\1\10\1\105\10\10\6\0"+
    "\1\10\15\0\13\10\61\0\1\46\2\0\3\106\1\0"+
    "\56\106\3\107\1\0\55\107\1\110\3\0\1\111\62\0"+
    "\2\10\1\112\3\10\1\113\6\10\6\0\1\10\15\0"+
    "\13\10\6\0\4\10\1\114\3\10\1\115\4\10\6\0"+
    "\1\10\15\0\13\10\6\0\15\10\6\0\1\10\15\0"+
    "\6\10\1\116\4\10\6\0\12\10\1\117\2\10\6\0"+
    "\1\10\15\0\13\10\6\0\15\10\6\0\1\10\15\0"+
    "\4\10\1\120\6\10\6\0\10\10\1\121\4\10\6\0"+
    "\1\10\15\0\13\10\6\0\6\10\1\122\6\10\6\0"+
    "\1\10\15\0\13\10\6\0\11\10\1\123\3\10\6\0"+
    "\1\10\15\0\13\10\6\0\7\10\1\124\5\10\6\0"+
    "\1\10\15\0\13\10\6\0\4\10\1\125\10\10\6\0"+
    "\1\10\15\0\13\10\6\0\4\10\1\126\10\10\6\0"+
    "\1\10\15\0\13\10\6\0\1\10\1\127\13\10\6\0"+
    "\1\10\15\0\13\10\6\0\15\10\6\0\1\10\15\0"+
    "\3\10\1\130\7\10\62\0\1\131\5\0\3\10\1\132"+
    "\11\10\6\0\1\10\15\0\13\10\6\0\7\10\1\133"+
    "\5\10\6\0\1\10\15\0\13\10\6\0\14\10\1\134"+
    "\6\0\1\10\15\0\13\10\6\0\12\10\1\135\2\10"+
    "\6\0\1\10\15\0\13\10\6\0\11\10\1\136\3\10"+
    "\6\0\1\10\15\0\13\10\6\0\11\10\1\137\3\10"+
    "\6\0\1\10\15\0\13\10\6\0\11\10\1\140\3\10"+
    "\6\0\1\10\15\0\13\10\6\0\14\10\1\141\6\0"+
    "\1\10\15\0\13\10\6\0\4\10\1\142\10\10\6\0"+
    "\1\10\15\0\13\10\6\0\10\10\1\143\4\10\6\0"+
    "\1\10\15\0\4\10\1\144\6\10\6\0\15\10\6\0"+
    "\1\10\15\0\4\10\1\145\6\10\6\0\10\10\1\146"+
    "\4\10\6\0\1\10\15\0\13\10\6\0\15\10\6\0"+
    "\1\10\15\0\4\10\1\117\6\10\6\0\1\10\1\147"+
    "\13\10\6\0\1\10\15\0\13\10\6\0\10\10\1\150"+
    "\4\10\6\0\1\10\15\0\13\10\6\0\1\10\1\151"+
    "\13\10\6\0\1\10\15\0\13\10\6\0\7\10\1\152"+
    "\5\10\6\0\1\10\15\0\13\10\6\0\15\10\6\0"+
    "\1\10\15\0\1\10\1\153\11\10\6\0\6\10\1\154"+
    "\6\10\6\0\1\10\15\0\13\10\6\0\10\10\1\155"+
    "\4\10\6\0\1\10\15\0\13\10\6\0\15\10\6\0"+
    "\1\10\15\0\4\10\1\156\6\10\6\0\6\10\1\157"+
    "\6\10\6\0\1\10\15\0\13\10\6\0\4\10\1\160"+
    "\10\10\6\0\1\10\15\0\13\10\6\0\7\10\1\161"+
    "\5\10\6\0\1\10\15\0\13\10\6\0\14\10\1\162"+
    "\6\0\1\10\15\0\13\10\6\0\7\10\1\163\5\10"+
    "\6\0\1\10\15\0\13\10\6\0\15\10\6\0\1\10"+
    "\15\0\2\10\1\164\10\10\6\0\5\10\1\165\7\10"+
    "\6\0\1\10\15\0\13\10\6\0\15\10\6\0\1\10"+
    "\15\0\4\10\1\166\6\10\6\0\12\10\1\167\2\10"+
    "\6\0\1\10\15\0\13\10\6\0\11\10\1\170\3\10"+
    "\6\0\1\10\15\0\13\10\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3800];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\21\1\11\11\12\1\1\11\11\1\15\11"+
    "\6\1\2\0\1\1\1\11\17\1\1\11\37\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private Symbol	next_token(int type){
		return new Symbol(type,yyline+1,yycolumn);
	}
	private Symbol next_token(int type,Object value){
		return new Symbol(type,yyline+1,yycolumn,value);
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 35: 
          { return next_token(sym.GREATEQ,yytext());
          }
        case 55: break;
        case 18: 
          { return next_token(sym.DOT,yytext());
          }
        case 56: break;
        case 54: 
          { return next_token(sym.CONTINUE,yytext());
          }
        case 57: break;
        case 19: 
          { return next_token(sym.LOWER,yytext());
          }
        case 58: break;
        case 9: 
          { return next_token(sym.EQUAL,yytext());
          }
        case 59: break;
        case 14: 
          { return next_token(sym.LBRACE,yytext());
          }
        case 60: break;
        case 16: 
          { return next_token(sym.LMEDBRACE,yytext());
          }
        case 61: break;
        case 32: 
          { return next_token(sym.OR,yytext());
          }
        case 62: break;
        case 41: 
          { return next_token(sym.CHAR, new Character (yytext().charAt(1)));
          }
        case 63: break;
        case 28: 
          { return next_token(sym.MULEQ,yytext());
          }
        case 64: break;
        case 4: 
          { return next_token(sym.PLUS,yytext());
          }
        case 65: break;
        case 42: 
          { return next_token(sym.READ,yytext());
          }
        case 66: break;
        case 6: 
          { return next_token(sym.MULI,yytext());
          }
        case 67: break;
        case 24: 
          { return next_token(sym.PLUSPLUS,yytext());
          }
        case 68: break;
        case 8: 
          { return next_token(sym.MODI,yytext());
          }
        case 69: break;
        case 36: 
          { return next_token(sym.NOTEQ,yytext());
          }
        case 70: break;
        case 38: 
          { yybegin(YYINITIAL);
          }
        case 71: break;
        case 40: 
          { return next_token(sym.FOR,yytext());
          }
        case 72: break;
        case 22: 
          { yybegin(COMMENT);
          }
        case 73: break;
        case 37: 
          { return next_token(sym.STRING, new String (yytext().substring(1, yytext().length()-1)));
          }
        case 74: break;
        case 21: 
          { return next_token(sym.NUMBER,new Integer(yytext()));
          }
        case 75: break;
        case 17: 
          { return next_token(sym.RMEDBRACE,yytext());
          }
        case 76: break;
        case 23: 
          { return next_token(sym.IF,yytext());
          }
        case 77: break;
        case 29: 
          { return next_token(sym.DIVEQ,yytext());
          }
        case 78: break;
        case 44: 
          { return next_token(sym.ELSE,yytext());
          }
        case 79: break;
        case 31: 
          { return next_token(sym.AND,yytext());
          }
        case 80: break;
        case 51: 
          { return next_token(sym.STATIC,yytext());
          }
        case 81: break;
        case 45: 
          { return next_token(sym.VOID,yytext());
          }
        case 82: break;
        case 20: 
          { return next_token(sym.GREATER,yytext());
          }
        case 83: break;
        case 5: 
          { return next_token(sym.MINUS,yytext());
          }
        case 84: break;
        case 34: 
          { return next_token(sym.LOWEQ,yytext());
          }
        case 85: break;
        case 13: 
          { return next_token(sym.RPAREN,yytext());
          }
        case 86: break;
        case 11: 
          { return next_token(sym.COMMA,yytext());
          }
        case 87: break;
        case 47: 
          { return next_token(sym.BREAK,yytext());
          }
        case 88: break;
        case 26: 
          { return next_token(sym.MINUSMINUS,yytext());
          }
        case 89: break;
        case 30: 
          { return next_token(sym.MODEQ,yytext());
          }
        case 90: break;
        case 27: 
          { return next_token(sym.MINUSEQ,yytext());
          }
        case 91: break;
        case 53: 
          { return next_token(sym.EXTENDS,yytext());
          }
        case 92: break;
        case 25: 
          { return next_token(sym.PLUSEQ,yytext());
          }
        case 93: break;
        case 3: 
          { return next_token(sym.IDENT,yytext());
          }
        case 94: break;
        case 48: 
          { return next_token(sym.CONST,yytext());
          }
        case 95: break;
        case 43: 
          { return next_token(sym.BOOL, new Boolean (yytext().equals("true") ? true : false));
          }
        case 96: break;
        case 33: 
          { return next_token(sym.EQEQ,yytext());
          }
        case 97: break;
        case 1: 
          { System.err.println("Leksicka greska ("+yytext()+") u liniji: "+(yyline+1));
          }
        case 98: break;
        case 12: 
          { return next_token(sym.LPAREN,yytext());
          }
        case 99: break;
        case 15: 
          { return next_token(sym.RBRACE,yytext());
          }
        case 100: break;
        case 52: 
          { return next_token(sym.PROG,yytext());
          }
        case 101: break;
        case 10: 
          { return next_token(sym.SEMI,yytext());
          }
        case 102: break;
        case 49: 
          { return next_token(sym.CLASS,yytext());
          }
        case 103: break;
        case 39: 
          { return next_token(sym.NEW,yytext());
          }
        case 104: break;
        case 50: 
          { return next_token(sym.RETURN,yytext());
          }
        case 105: break;
        case 46: 
          { return next_token(sym.PRINT,yytext());
          }
        case 106: break;
        case 7: 
          { return next_token(sym.DIVI,yytext());
          }
        case 107: break;
        case 2: 
          { 
          }
        case 108: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return next_token(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}