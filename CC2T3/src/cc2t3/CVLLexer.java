// Generated from CVL.g4 by ANTLR 4.7
package cc2t3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CVLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		IDIOMA=18, USUARIO=19, NUMERO=20, DDD=21, TELEFONE=22, MAIL=23, COMENTARIO=24, 
		CADEIA=25, ANO=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"DIGITO", "IDIOMA", "USUARIO", "NUMERO", "DDD", "CARACTERE", "TELEFONE", 
		"MAIL", "COMENTARIO", "CADEIA", "ANO", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'curriculo:'", "'nome:'", "'especialidade:'", "'contato:'", "'formacoes:'", 
		"' - '", "'Presente'", "'idiomas:'", "'email:'", "'tel:'", "'social:'", 
		"'http://'", "'https://'", "'www.'", "'linkedin.com/in/'", "'github.com/'", 
		"'lattes.cnpq.br/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "IDIOMA", "USUARIO", "NUMERO", "DDD", 
		"TELEFONE", "MAIL", "COMENTARIO", "CADEIA", "ANO", "WS"
	};
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


	public CVLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CVL.g4"; }

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
		case 25:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u015d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\7\24\u00e3\n\24\f\24\16\24\u00e6\13\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111\n\24\3\24"+
		"\3\24\3\25\3\25\7\25\u0117\n\25\f\25\16\25\u011a\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\6\32\u0134\n\32\r\32\16\32\u0135\3"+
		"\32\3\32\6\32\u013a\n\32\r\32\16\32\u013b\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\7\33\u0145\n\33\f\33\16\33\u0148\13\33\3\33\3\33\3\33\3\34\3\34"+
		"\7\34\u014f\n\34\f\34\16\34\u0152\13\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/\2\61\30\63"+
		"\31\65\32\67\339\34;\35\3\2\7\4\2\13\f\17\17\5\2\13\f\17\17\"\"\4\2C\\"+
		"c|\4\2\f\f\17\17\3\2\f\f\2\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\3=\3\2\2\2\5H\3\2\2\2\7N\3\2\2\2\t]\3\2\2\2\13f\3\2\2"+
		"\2\rq\3\2\2\2\17u\3\2\2\2\21~\3\2\2\2\23\u0087\3\2\2\2\25\u008e\3\2\2"+
		"\2\27\u0093\3\2\2\2\31\u009b\3\2\2\2\33\u00a3\3\2\2\2\35\u00ac\3\2\2\2"+
		"\37\u00b1\3\2\2\2!\u00c2\3\2\2\2#\u00ce\3\2\2\2%\u00de\3\2\2\2\'\u00e0"+
		"\3\2\2\2)\u0114\3\2\2\2+\u011d\3\2\2\2-\u0128\3\2\2\2/\u012d\3\2\2\2\61"+
		"\u012f\3\2\2\2\63\u0133\3\2\2\2\65\u0142\3\2\2\2\67\u014c\3\2\2\29\u0155"+
		"\3\2\2\2;\u015a\3\2\2\2=>\7e\2\2>?\7w\2\2?@\7t\2\2@A\7t\2\2AB\7k\2\2B"+
		"C\7e\2\2CD\7w\2\2DE\7n\2\2EF\7q\2\2FG\7<\2\2G\4\3\2\2\2HI\7p\2\2IJ\7q"+
		"\2\2JK\7o\2\2KL\7g\2\2LM\7<\2\2M\6\3\2\2\2NO\7g\2\2OP\7u\2\2PQ\7r\2\2"+
		"QR\7g\2\2RS\7e\2\2ST\7k\2\2TU\7c\2\2UV\7n\2\2VW\7k\2\2WX\7f\2\2XY\7c\2"+
		"\2YZ\7f\2\2Z[\7g\2\2[\\\7<\2\2\\\b\3\2\2\2]^\7e\2\2^_\7q\2\2_`\7p\2\2"+
		"`a\7v\2\2ab\7c\2\2bc\7v\2\2cd\7q\2\2de\7<\2\2e\n\3\2\2\2fg\7h\2\2gh\7"+
		"q\2\2hi\7t\2\2ij\7o\2\2jk\7c\2\2kl\7e\2\2lm\7q\2\2mn\7g\2\2no\7u\2\2o"+
		"p\7<\2\2p\f\3\2\2\2qr\7\"\2\2rs\7/\2\2st\7\"\2\2t\16\3\2\2\2uv\7R\2\2"+
		"vw\7t\2\2wx\7g\2\2xy\7u\2\2yz\7g\2\2z{\7p\2\2{|\7v\2\2|}\7g\2\2}\20\3"+
		"\2\2\2~\177\7k\2\2\177\u0080\7f\2\2\u0080\u0081\7k\2\2\u0081\u0082\7q"+
		"\2\2\u0082\u0083\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085\7u\2\2\u0085\u0086"+
		"\7<\2\2\u0086\22\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7o\2\2\u0089\u008a"+
		"\7c\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c\u008d\7<\2\2\u008d"+
		"\24\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091"+
		"\u0092\7<\2\2\u0092\26\3\2\2\2\u0093\u0094\7u\2\2\u0094\u0095\7q\2\2\u0095"+
		"\u0096\7e\2\2\u0096\u0097\7k\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7<\2\2\u009a\30\3\2\2\2\u009b\u009c\7j\2\2\u009c\u009d\7"+
		"v\2\2\u009d\u009e\7v\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7<\2\2\u00a0\u00a1"+
		"\7\61\2\2\u00a1\u00a2\7\61\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7j\2\2\u00a4"+
		"\u00a5\7v\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7u\2\2"+
		"\u00a8\u00a9\7<\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7\61\2\2\u00ab\34"+
		"\3\2\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7y\2\2\u00ae\u00af\7y\2\2\u00af"+
		"\u00b0\7\60\2\2\u00b0\36\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7k\2\2"+
		"\u00b3\u00b4\7p\2\2\u00b4\u00b5\7m\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7"+
		"\7f\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7\60\2\2\u00ba"+
		"\u00bb\7e\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7o\2\2\u00bd\u00be\7\61\2"+
		"\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7\61\2\2\u00c1 \3"+
		"\2\2\2\u00c2\u00c3\7i\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7j\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7\60\2"+
		"\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd"+
		"\7\61\2\2\u00cd\"\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7c\2\2\u00d0"+
		"\u00d1\7v\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7u\2\2"+
		"\u00d4\u00d5\7\60\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7r\2\2\u00d8\u00d9\7s\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7d\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7\61\2\2\u00dd$\3\2\2\2\u00de\u00df\4\62;\2"+
		"\u00df&\3\2\2\2\u00e0\u00e4\7$\2\2\u00e1\u00e3\n\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u0110\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\7P\2"+
		"\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7x\2\2\u00ed\u00ee\7q\2\2\u00ee\u0111\7+\2\2\u00ef\u00f0\7*\2\2\u00f0"+
		"\u00f1\7C\2\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2"+
		"\u00f4\u00f5\7\u00e9\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u0111\7+\2\2\u00f9\u00fa\7*\2\2\u00fa\u00fb\7K\2\2\u00fb"+
		"\u00fc\7p\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2"+
		"\u00ff\u0100\7o\2\2\u0100\u0101\7g\2\2\u0101\u0102\7f\2\2\u0102\u0103"+
		"\7k\2\2\u0103\u0104\7\u00e3\2\2\u0104\u0105\7t\2\2\u0105\u0106\7k\2\2"+
		"\u0106\u0107\7q\2\2\u0107\u0111\7+\2\2\u0108\u0109\7*\2\2\u0109\u010a"+
		"\7D\2\2\u010a\u010b\7\u00e3\2\2\u010b\u010c\7u\2\2\u010c\u010d\7k\2\2"+
		"\u010d\u010e\7e\2\2\u010e\u010f\7q\2\2\u010f\u0111\7+\2\2\u0110\u00e7"+
		"\3\2\2\2\u0110\u00ef\3\2\2\2\u0110\u00f9\3\2\2\2\u0110\u0108\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\7$\2\2\u0113(\3\2\2\2\u0114\u0118\7$\2\2\u0115"+
		"\u0117\n\3\2\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011c\7$\2\2\u011c*\3\2\2\2\u011d\u011e\5%\23\2\u011e\u011f\5%\23\2\u011f"+
		"\u0120\5%\23\2\u0120\u0121\5%\23\2\u0121\u0122\5%\23\2\u0122\u0123\7/"+
		"\2\2\u0123\u0124\5%\23\2\u0124\u0125\5%\23\2\u0125\u0126\5%\23\2\u0126"+
		"\u0127\5%\23\2\u0127,\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a\4\62;\2\u012a"+
		"\u012b\4\62;\2\u012b\u012c\7+\2\2\u012c.\3\2\2\2\u012d\u012e\t\4\2\2\u012e"+
		"\60\3\2\2\2\u012f\u0130\5-\27\2\u0130\u0131\5+\26\2\u0131\62\3\2\2\2\u0132"+
		"\u0134\5/\30\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7B\2\2\u0138"+
		"\u013a\5/\30\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\60\2\2\u013e"+
		"\u013f\5/\30\2\u013f\u0140\5/\30\2\u0140\u0141\5/\30\2\u0141\64\3\2\2"+
		"\2\u0142\u0146\7%\2\2\u0143\u0145\n\5\2\2\u0144\u0143\3\2\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014a\t\5\2\2\u014a\u014b\b\33\2\2\u014b\66\3\2\2"+
		"\2\u014c\u0150\7$\2\2\u014d\u014f\n\6\2\2\u014e\u014d\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\7$\2\2\u01548\3\2\2\2\u0155\u0156\5%\23\2\u0156"+
		"\u0157\5%\23\2\u0157\u0158\5%\23\2\u0158\u0159\5%\23\2\u0159:\3\2\2\2"+
		"\u015a\u015b\t\3\2\2\u015b\u015c\b\36\3\2\u015c<\3\2\2\2\n\2\u00e4\u0110"+
		"\u0118\u0135\u013b\u0146\u0150\4\3\33\2\3\36\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}