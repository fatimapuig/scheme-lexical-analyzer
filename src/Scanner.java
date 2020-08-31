/* The following code was generated by JFlex 1.7.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>scanner.jflex</tt>
 */
class Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\41\1\53\1\55\1\55\1\54\22\0\1\41\1\33\1\0"+
    "\1\43\1\37\1\37\1\37\1\46\1\50\1\51\1\30\1\35\1\47"+
    "\1\16\1\36\1\40\12\42\1\37\1\56\1\37\1\37\1\37\1\25"+
    "\1\45\5\37\1\44\15\37\1\44\6\37\1\0\1\52\1\0\1\37"+
    "\1\37\1\46\1\1\1\7\1\2\1\6\1\3\1\22\1\10\1\34"+
    "\1\11\1\24\1\12\1\21\1\20\1\5\1\15\1\13\1\32\1\17"+
    "\1\4\1\14\1\23\1\31\1\37\1\27\1\26\1\37\3\0\1\37"+
    "\6\0\1\55\u1fa2\0\1\55\1\55\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\21\2\1\3\1\4\1\5\1\1\1\6"+
    "\1\7\1\10\1\11\1\12\1\1\10\2\1\13\4\2"+
    "\1\5\1\0\1\5\7\2\1\14\1\2\1\0\1\5"+
    "\3\0\1\5\3\0\1\15\1\0\1\7\1\0\2\16"+
    "\17\2\1\5\2\0\1\5\2\2\1\13\7\2\1\5"+
    "\1\0\1\5\2\0\1\5\2\0\1\5\4\0\2\17"+
    "\1\20\15\2\1\5\1\0\2\5\11\2\4\0\2\5"+
    "\2\0\1\5\1\0\13\2\1\5\10\2\4\0\1\5"+
    "\1\0\2\5\5\2\1\13\7\2\1\0\1\5\61\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[242];
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
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1"+
    "\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a\0\57"+
    "\0\u0439\0\57\0\57\0\57\0\u0468\0\u0497\0\u04c6\0\u04f5"+
    "\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\274\0\u060f\0\u063e"+
    "\0\u066d\0\u069c\0\57\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787"+
    "\0\u07b6\0\u07e5\0\u0814\0\u0843\0\57\0\u0872\0\u08a1\0\u08d0"+
    "\0\u08ff\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\57"+
    "\0\u0a48\0\57\0\u0468\0\57\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c"+
    "\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4"+
    "\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c"+
    "\0\u0f9b\0\57\0\u0fca\0\u0ff9\0\u1028\0\u1057\0\u1086\0\u10b5"+
    "\0\u10e4\0\u1113\0\u1142\0\u0234\0\u1171\0\u11a0\0\u11cf\0\57"+
    "\0\u11fe\0\57\0\u122d\0\u125c\0\u128b\0\u12ba\0\u12e9\0\u1318"+
    "\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u1432\0\u1461\0\u1490"+
    "\0\u14bf\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa\0\u15d9\0\u1608"+
    "\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722\0\u1751\0\u1780"+
    "\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a\0\u18c9\0\u18f8"+
    "\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3\0\u1a12\0\u1a41\0\u1a70"+
    "\0\u1a9f\0\u1ace\0\u1afd\0\u1b2c\0\u1b5b\0\u1b8a\0\u1bb9\0\u1be8"+
    "\0\u1c17\0\u1c46\0\u1c75\0\u1ca4\0\u1cd3\0\u1d02\0\u1d31\0\u1d60"+
    "\0\u1d60\0\u1d8f\0\u1dbe\0\u1ded\0\u1e1c\0\u1e4b\0\u1e7a\0\u1ea9"+
    "\0\u1ed8\0\u1f07\0\u1f36\0\u1f65\0\u1f94\0\u1fc3\0\u1ff2\0\u2021"+
    "\0\u2050\0\u207f\0\u20ae\0\u20dd\0\u210c\0\u213b\0\u216a\0\u2199"+
    "\0\u21c8\0\u21f7\0\u2226\0\u2255\0\u2284\0\u22b3\0\u22e2\0\u2311"+
    "\0\u2340\0\u236f\0\u239e\0\u23cd\0\u23fc\0\u242b\0\u245a\0\u2489"+
    "\0\u24b8\0\u24e7\0\u2516\0\u2545\0\u2574\0\u25a3\0\u25d2\0\u2601"+
    "\0\u2630\0\u265f\0\u268e\0\u26bd\0\u26ec\0\u271b\0\u274a\0\u2779"+
    "\0\u27a8\0\u27d7\0\u2806\0\u2835\0\u2864\0\u2893\0\u28c2\0\u28f1"+
    "\0\u2920\0\u294f";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[242];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\5\1\12\2\5\1\13\1\14\1\15\1\5\1\16"+
    "\1\17\1\20\1\21\4\5\1\22\1\5\1\23\2\5"+
    "\1\15\1\24\2\5\1\25\1\26\1\27\1\5\1\2"+
    "\1\30\1\31\1\32\1\33\1\2\2\25\1\34\1\35"+
    "\60\0\1\5\1\36\2\5\1\37\33\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\40\13\5\1\41\23\5\1\0"+
    "\1\5\1\0\1\5\13\0\40\5\1\0\1\5\1\0"+
    "\1\5\13\0\1\5\1\42\1\43\35\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\44\37\5\1\0\1\5\1\0"+
    "\1\5\13\0\2\5\1\45\11\5\1\46\23\5\1\0"+
    "\1\5\1\0\1\5\13\0\2\5\1\47\6\5\1\50"+
    "\26\5\1\0\1\5\1\0\1\5\13\0\4\5\1\51"+
    "\14\5\1\46\16\5\1\0\1\5\1\0\1\5\13\0"+
    "\33\5\1\52\4\5\1\0\1\5\1\0\1\5\13\0"+
    "\16\5\1\46\21\5\1\0\1\5\1\0\1\5\23\0"+
    "\1\53\24\0\1\54\3\0\1\55\15\0\1\56\37\5"+
    "\1\0\1\5\1\0\1\5\13\0\1\57\1\5\1\60"+
    "\11\5\1\61\23\5\1\0\1\5\1\0\1\5\13\0"+
    "\20\5\1\62\17\5\1\0\1\5\1\0\1\5\13\0"+
    "\3\5\1\63\1\64\33\5\1\0\1\5\1\0\1\5"+
    "\13\0\40\5\1\0\1\5\1\0\1\5\3\0\1\65"+
    "\7\0\22\5\1\66\15\5\1\0\1\5\1\0\1\5"+
    "\50\0\1\67\3\0\1\70\55\0\1\25\11\0\2\25"+
    "\5\0\2\71\1\0\1\71\7\0\1\72\2\0\2\71"+
    "\12\0\1\72\1\70\1\0\1\73\1\0\1\26\1\74"+
    "\1\0\1\75\14\0\1\76\2\0\1\77\2\0\1\76"+
    "\2\0\1\100\5\0\1\100\21\0\1\100\5\0\1\101"+
    "\51\0\1\102\11\0\53\103\1\104\1\105\1\104\1\103"+
    "\1\0\1\5\1\106\36\5\1\0\1\5\1\0\1\5"+
    "\13\0\5\5\1\46\32\5\1\0\1\5\1\0\1\5"+
    "\13\0\3\5\1\107\34\5\1\0\1\5\1\0\1\5"+
    "\13\0\4\5\1\110\33\5\1\0\1\5\1\0\1\5"+
    "\13\0\14\5\1\111\23\5\1\0\1\5\1\0\1\5"+
    "\13\0\13\5\1\112\15\5\1\113\6\5\1\0\1\5"+
    "\1\0\1\5\13\0\17\5\1\114\20\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\5\1\115\6\5\1\116\7\5"+
    "\1\117\1\120\16\5\1\0\1\5\1\0\1\5\13\0"+
    "\7\5\1\121\30\5\1\0\1\5\1\0\1\5\13\0"+
    "\12\5\1\122\25\5\1\0\1\5\1\0\1\5\13\0"+
    "\15\5\1\123\22\5\1\0\1\5\1\0\1\5\13\0"+
    "\2\5\1\124\35\5\1\0\1\5\1\0\1\5\54\0"+
    "\1\125\17\0\2\126\1\0\1\126\2\0\1\53\4\0"+
    "\1\72\2\0\2\126\12\0\1\72\1\125\1\0\1\127"+
    "\1\0\1\55\1\130\1\0\1\75\12\0\1\5\1\131"+
    "\7\5\1\52\26\5\1\0\1\5\1\0\1\5\13\0"+
    "\17\5\1\132\20\5\1\0\1\5\1\0\1\5\13\0"+
    "\13\5\1\133\24\5\1\0\1\5\1\0\1\5\13\0"+
    "\1\5\1\134\36\5\1\0\1\5\1\0\1\5\13\0"+
    "\22\5\1\135\15\5\1\0\1\5\1\0\1\5\13\0"+
    "\10\5\1\136\27\5\1\0\1\5\1\0\1\5\13\0"+
    "\1\137\37\5\1\0\1\5\1\0\1\5\13\0\1\140"+
    "\13\5\1\141\23\5\1\0\1\5\1\0\1\5\50\0"+
    "\1\142\23\0\2\71\1\0\1\71\7\0\1\72\2\0"+
    "\2\71\12\0\1\72\4\0\1\70\1\143\1\0\1\75"+
    "\27\0\1\144\16\0\1\144\4\0\1\145\25\0\1\53"+
    "\24\0\1\146\3\0\1\147\56\0\1\150\17\0\2\71"+
    "\1\0\1\71\7\0\1\72\2\0\2\71\12\0\1\72"+
    "\1\143\1\0\1\73\2\0\1\74\1\0\1\75\27\0"+
    "\1\151\16\0\1\151\1\152\3\0\1\153\32\0\1\154"+
    "\16\0\1\154\1\155\3\0\1\26\1\156\31\0\1\154"+
    "\16\0\1\154\1\155\3\0\1\26\1\157\13\0\41\160"+
    "\1\161\11\160\2\161\1\0\1\160\53\0\1\162\4\0"+
    "\2\5\1\163\35\5\1\0\1\5\1\0\1\5\13\0"+
    "\2\5\1\46\35\5\1\0\1\5\1\0\1\5\13\0"+
    "\3\5\1\164\1\5\1\46\32\5\1\0\1\5\1\0"+
    "\1\5\13\0\5\5\1\165\32\5\1\0\1\5\1\0"+
    "\1\5\13\0\32\5\1\46\5\5\1\0\1\5\1\0"+
    "\1\5\13\0\22\5\1\166\15\5\1\0\1\5\1\0"+
    "\1\5\13\0\2\5\1\167\35\5\1\0\1\5\1\0"+
    "\1\5\13\0\20\5\1\170\17\5\1\0\1\5\1\0"+
    "\1\5\13\0\4\5\1\171\33\5\1\0\1\5\1\0"+
    "\1\5\13\0\1\172\37\5\1\0\1\5\1\0\1\5"+
    "\13\0\1\173\7\5\1\174\27\5\1\0\1\5\1\0"+
    "\1\5\13\0\10\5\1\175\27\5\1\0\1\5\1\0"+
    "\1\5\13\0\13\5\1\46\24\5\1\0\1\5\1\0"+
    "\1\5\13\0\12\5\1\176\25\5\1\0\1\5\1\0"+
    "\1\5\13\0\15\5\1\177\22\5\1\0\1\5\1\0"+
    "\1\5\15\0\2\126\1\0\1\126\2\0\1\53\4\0"+
    "\1\72\2\0\2\126\12\0\1\72\4\0\1\125\1\200"+
    "\1\0\1\75\27\0\1\201\16\0\1\201\4\0\1\202"+
    "\56\0\1\203\17\0\2\126\1\0\1\126\2\0\1\53"+
    "\4\0\1\72\2\0\2\126\12\0\1\72\1\200\1\0"+
    "\1\127\2\0\1\130\1\0\1\75\12\0\16\5\1\204"+
    "\21\5\1\0\1\5\1\0\1\5\13\0\6\5\1\205"+
    "\31\5\1\0\1\5\1\0\1\5\13\0\15\5\1\206"+
    "\1\207\10\5\1\46\10\5\1\0\1\5\1\0\1\5"+
    "\13\0\1\210\37\5\1\0\1\5\1\0\1\5\13\0"+
    "\10\5\1\211\27\5\1\0\1\5\1\0\1\5\13\0"+
    "\4\5\1\212\33\5\1\0\1\5\1\0\1\5\13\0"+
    "\3\5\1\213\34\5\1\0\1\5\1\0\1\5\13\0"+
    "\3\5\1\214\34\5\1\0\1\5\1\0\1\5\13\0"+
    "\13\5\1\107\24\5\1\0\1\5\1\0\1\5\15\0"+
    "\2\71\1\0\1\71\7\0\1\72\2\0\2\71\12\0"+
    "\1\72\5\0\1\143\1\0\1\75\53\0\1\145\32\0"+
    "\1\72\16\0\1\72\4\0\1\145\2\0\1\75\53\0"+
    "\1\215\17\0\2\216\1\0\1\216\2\0\1\53\7\0"+
    "\2\216\13\0\1\215\1\0\1\217\1\0\1\147\1\220"+
    "\31\0\1\72\16\0\1\72\4\0\1\150\1\221\1\0"+
    "\1\75\47\0\1\152\3\0\1\153\56\0\1\222\17\0"+
    "\2\223\1\0\1\223\12\0\2\223\13\0\1\222\1\0"+
    "\1\224\1\0\1\153\1\225\55\0\1\70\22\0\1\226"+
    "\53\0\1\226\5\0\1\226\106\0\1\161\11\0\2\161"+
    "\3\0\3\5\1\227\34\5\1\0\1\5\1\0\1\5"+
    "\13\0\15\5\1\230\22\5\1\0\1\5\1\0\1\5"+
    "\13\0\2\5\1\231\35\5\1\0\1\5\1\0\1\5"+
    "\13\0\2\5\1\232\35\5\1\0\1\5\1\0\1\5"+
    "\13\0\5\5\1\233\32\5\1\0\1\5\1\0\1\5"+
    "\13\0\1\234\37\5\1\0\1\5\1\0\1\5\13\0"+
    "\2\5\1\235\35\5\1\0\1\5\1\0\1\5\13\0"+
    "\25\5\1\46\12\5\1\0\1\5\1\0\1\5\13\0"+
    "\22\5\1\236\15\5\1\0\1\5\1\0\1\5\13\0"+
    "\4\5\1\237\33\5\1\0\1\5\1\0\1\5\13\0"+
    "\4\5\1\46\33\5\1\0\1\5\1\0\1\5\13\0"+
    "\1\240\37\5\1\0\1\5\1\0\1\5\13\0\2\5"+
    "\1\241\35\5\1\0\1\5\1\0\1\5\15\0\2\126"+
    "\1\0\1\126\2\0\1\53\4\0\1\72\2\0\2\126"+
    "\12\0\1\72\5\0\1\200\1\0\1\75\53\0\1\202"+
    "\25\0\1\53\4\0\1\72\16\0\1\72\4\0\1\202"+
    "\2\0\1\75\22\0\1\53\4\0\1\72\16\0\1\72"+
    "\4\0\1\203\1\242\1\0\1\75\12\0\14\5\1\46"+
    "\23\5\1\0\1\5\1\0\1\5\13\0\5\5\1\243"+
    "\32\5\1\0\1\5\1\0\1\5\13\0\3\5\1\244"+
    "\34\5\1\0\1\5\1\0\1\5\13\0\2\5\1\245"+
    "\35\5\1\0\1\5\1\0\1\5\13\0\20\5\1\246"+
    "\17\5\1\0\1\5\1\0\1\5\13\0\5\5\1\247"+
    "\32\5\1\0\1\5\1\0\1\5\13\0\7\5\1\250"+
    "\30\5\1\0\1\5\1\0\1\5\13\0\3\5\1\251"+
    "\34\5\1\0\1\5\1\0\1\5\13\0\10\5\1\252"+
    "\27\5\1\0\1\5\1\0\1\5\15\0\2\216\1\0"+
    "\1\216\2\0\1\53\7\0\2\216\17\0\1\215\1\253"+
    "\31\0\1\254\16\0\1\254\4\0\1\255\56\0\1\256"+
    "\17\0\2\216\1\0\1\216\2\0\1\53\7\0\2\216"+
    "\13\0\1\253\1\0\1\217\2\0\1\220\31\0\1\72"+
    "\16\0\1\72\5\0\1\221\1\0\1\75\14\0\2\223"+
    "\1\0\1\223\12\0\2\223\17\0\1\222\1\257\31\0"+
    "\1\260\16\0\1\260\4\0\1\261\56\0\1\262\17\0"+
    "\2\223\1\0\1\223\12\0\2\223\13\0\1\257\1\0"+
    "\1\224\2\0\1\225\31\0\1\154\16\0\1\154\1\155"+
    "\3\0\1\26\15\0\3\5\1\46\34\5\1\0\1\5"+
    "\1\0\1\5\13\0\3\5\1\263\34\5\1\0\1\5"+
    "\1\0\1\5\13\0\15\5\1\252\22\5\1\0\1\5"+
    "\1\0\1\5\13\0\4\5\1\264\33\5\1\0\1\5"+
    "\1\0\1\5\13\0\15\5\1\265\22\5\1\0\1\5"+
    "\1\0\1\5\13\0\16\5\1\107\21\5\1\0\1\5"+
    "\1\0\1\5\13\0\15\5\1\266\22\5\1\0\1\5"+
    "\1\0\1\5\13\0\20\5\1\267\17\5\1\0\1\5"+
    "\1\0\1\5\13\0\2\5\1\270\35\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\5\1\271\36\5\1\0\1\5"+
    "\1\0\1\5\13\0\4\5\1\272\33\5\1\0\1\5"+
    "\1\0\1\5\23\0\1\53\4\0\1\72\16\0\1\72"+
    "\5\0\1\242\1\0\1\75\12\0\1\46\37\5\1\0"+
    "\1\5\1\0\1\5\13\0\25\5\1\273\12\5\1\0"+
    "\1\5\1\0\1\5\13\0\1\5\1\46\36\5\1\0"+
    "\1\5\1\0\1\5\13\0\15\5\1\274\22\5\1\0"+
    "\1\5\1\0\1\5\13\0\15\5\1\275\22\5\1\0"+
    "\1\5\1\0\1\5\13\0\15\5\1\206\22\5\1\0"+
    "\1\5\1\0\1\5\13\0\10\5\1\276\27\5\1\0"+
    "\1\5\1\0\1\5\13\0\31\5\1\277\6\5\1\0"+
    "\1\5\1\0\1\5\15\0\2\216\1\0\1\216\2\0"+
    "\1\53\7\0\2\216\20\0\1\253\55\0\1\255\25\0"+
    "\1\53\30\0\1\255\25\0\1\53\30\0\1\256\1\300"+
    "\16\0\2\223\1\0\1\223\12\0\2\223\20\0\1\257"+
    "\55\0\1\261\56\0\1\262\1\301\14\0\13\5\1\302"+
    "\24\5\1\0\1\5\1\0\1\5\13\0\1\5\1\107"+
    "\36\5\1\0\1\5\1\0\1\5\13\0\20\5\1\303"+
    "\17\5\1\0\1\5\1\0\1\5\13\0\10\5\1\304"+
    "\27\5\1\0\1\5\1\0\1\5\13\0\13\5\1\305"+
    "\24\5\1\0\1\5\1\0\1\5\13\0\15\5\1\306"+
    "\22\5\1\0\1\5\1\0\1\5\13\0\11\5\1\307"+
    "\26\5\1\0\1\5\1\0\1\5\13\0\30\5\1\310"+
    "\7\5\1\0\1\5\1\0\1\5\13\0\4\5\1\311"+
    "\33\5\1\0\1\5\1\0\1\5\13\0\5\5\1\312"+
    "\32\5\1\0\1\5\1\0\1\5\13\0\20\5\1\313"+
    "\17\5\1\0\1\5\1\0\1\5\13\0\7\5\1\314"+
    "\30\5\1\0\1\5\1\0\1\5\13\0\22\5\1\315"+
    "\15\5\1\0\1\5\1\0\1\5\23\0\1\53\31\0"+
    "\1\300\56\0\1\301\14\0\16\5\1\316\21\5\1\0"+
    "\1\5\1\0\1\5\13\0\1\57\37\5\1\0\1\5"+
    "\1\0\1\5\13\0\4\5\1\317\33\5\1\0\1\5"+
    "\1\0\1\5\13\0\15\5\1\320\22\5\1\0\1\5"+
    "\1\0\1\5\13\0\3\5\1\321\13\5\1\322\20\5"+
    "\1\0\1\5\1\0\1\5\13\0\1\323\37\5\1\0"+
    "\1\5\1\0\1\5\13\0\10\5\1\324\27\5\1\0"+
    "\1\5\1\0\1\5\13\0\13\5\1\325\24\5\1\0"+
    "\1\5\1\0\1\5\13\0\2\5\1\326\35\5\1\0"+
    "\1\5\1\0\1\5\13\0\2\5\1\122\35\5\1\0"+
    "\1\5\1\0\1\5\13\0\4\5\1\327\33\5\1\0"+
    "\1\5\1\0\1\5\13\0\14\5\1\141\23\5\1\0"+
    "\1\5\1\0\1\5\13\0\2\5\1\330\35\5\1\0"+
    "\1\5\1\0\1\5\13\0\13\5\1\331\24\5\1\0"+
    "\1\5\1\0\1\5\13\0\14\5\1\332\23\5\1\0"+
    "\1\5\1\0\1\5\13\0\13\5\1\333\11\5\1\273"+
    "\12\5\1\0\1\5\1\0\1\5\13\0\1\334\37\5"+
    "\1\0\1\5\1\0\1\5\13\0\7\5\1\107\30\5"+
    "\1\0\1\5\1\0\1\5\13\0\16\5\1\335\21\5"+
    "\1\0\1\5\1\0\1\5\13\0\1\336\37\5\1\0"+
    "\1\5\1\0\1\5\13\0\1\5\1\115\36\5\1\0"+
    "\1\5\1\0\1\5\13\0\2\5\1\337\35\5\1\0"+
    "\1\5\1\0\1\5\13\0\1\340\37\5\1\0\1\5"+
    "\1\0\1\5\13\0\2\5\1\341\35\5\1\0\1\5"+
    "\1\0\1\5\13\0\6\5\1\342\31\5\1\0\1\5"+
    "\1\0\1\5\13\0\16\5\1\343\21\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\5\1\131\36\5\1\0\1\5"+
    "\1\0\1\5\13\0\14\5\1\344\23\5\1\0\1\5"+
    "\1\0\1\5\13\0\26\5\1\46\11\5\1\0\1\5"+
    "\1\0\1\5\13\0\5\5\1\345\32\5\1\0\1\5"+
    "\1\0\1\5\13\0\17\5\1\46\20\5\1\0\1\5"+
    "\1\0\1\5\13\0\7\5\1\346\30\5\1\0\1\5"+
    "\1\0\1\5\13\0\23\5\1\347\14\5\1\0\1\5"+
    "\1\0\1\5\13\0\22\5\1\350\15\5\1\0\1\5"+
    "\1\0\1\5\13\0\4\5\1\351\33\5\1\0\1\5"+
    "\1\0\1\5\13\0\24\5\1\46\13\5\1\0\1\5"+
    "\1\0\1\5\13\0\16\5\1\352\21\5\1\0\1\5"+
    "\1\0\1\5\13\0\2\5\1\353\35\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\5\1\354\36\5\1\0\1\5"+
    "\1\0\1\5\13\0\17\5\1\355\20\5\1\0\1\5"+
    "\1\0\1\5\13\0\1\356\37\5\1\0\1\5\1\0"+
    "\1\5\13\0\1\5\1\357\36\5\1\0\1\5\1\0"+
    "\1\5\13\0\13\5\1\360\24\5\1\0\1\5\1\0"+
    "\1\5\13\0\2\5\1\361\35\5\1\0\1\5\1\0"+
    "\1\5\13\0\6\5\1\362\31\5\1\0\1\5\1\0"+
    "\1\5\13\0\13\5\1\345\24\5\1\0\1\5\1\0"+
    "\1\5\13\0\22\5\1\234\15\5\1\0\1\5\1\0"+
    "\1\5\13\0\4\5\1\122\33\5\1\0\1\5\1\0"+
    "\1\5\13\0\20\5\1\107\17\5\1\0\1\5\1\0"+
    "\1\5\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10622];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\25\1\1\11\1\1\3\11\16\1\1\11"+
    "\1\0\10\1\1\11\1\1\1\0\1\1\3\0\1\1"+
    "\3\0\1\11\1\0\1\11\1\0\1\11\21\1\2\0"+
    "\12\1\1\11\1\1\1\0\1\1\2\0\1\1\2\0"+
    "\1\1\4\0\1\11\1\1\1\11\16\1\1\0\13\1"+
    "\4\0\2\1\2\0\1\1\1\0\24\1\4\0\1\1"+
    "\1\0\17\1\1\0\62\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[242];
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
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.printf("UNIDENTIFIED SYM \t\t %s \n",yytext());
            } 
            // fall through
          case 17: break;
          case 2: 
            { System.out.printf("IDENTIFIER \t\t %s \n",yytext());
            } 
            // fall through
          case 18: break;
          case 3: 
            { System.out.printf("DOT \t\t %s \n",yytext());
            } 
            // fall through
          case 19: break;
          case 4: 
            { /* Skip Whitespace */
            } 
            // fall through
          case 20: break;
          case 5: 
            { System.out.printf("NUMBER \t\t\t %s \n",yytext());
            } 
            // fall through
          case 21: break;
          case 6: 
            { System.out.printf("QUOTATIONMARKS \t\t %s \n",yytext());
            } 
            // fall through
          case 22: break;
          case 7: 
            { System.out.printf("UNQUOTATIONMARKS \t\t %s \n",yytext());
            } 
            // fall through
          case 23: break;
          case 8: 
            { System.out.printf("OPENPAREN \t\t %s \n",yytext());
            } 
            // fall through
          case 24: break;
          case 9: 
            { System.out.printf("CLOSEPAREN \t\t %s \n",yytext());
            } 
            // fall through
          case 25: break;
          case 10: 
            { System.out.print(yytext());
            } 
            // fall through
          case 26: break;
          case 11: 
            { System.out.printf("RESERVED \t\t %s \n",yytext());
            } 
            // fall through
          case 27: break;
          case 12: 
            { System.out.printf("OPENVECTORPAREN \t\t %s \n",yytext());
            } 
            // fall through
          case 28: break;
          case 13: 
            { System.out.printf("BOOLEAN \t\t %s \n",yytext());
            } 
            // fall through
          case 29: break;
          case 14: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -1);
            { /* Skip Comment */
            } 
            // fall through
          case 30: break;
          case 15: 
            { System.out.printf("CHARACTER \t\t %s \n",yytext());
            } 
            // fall through
          case 31: break;
          case 16: 
            // lookahead expression with fixed lookahead length
            zzMarkedPos = Character.offsetByCodePoints
                (zzBufferL, zzStartRead, zzEndRead - zzStartRead, zzMarkedPos, -2);
            { /* Skip Comment */
            } 
            // fall through
          case 32: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Scanner [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Scanner scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Scanner(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}