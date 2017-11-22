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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMERO=7, DDD=8, TELEFONE=9, 
		MAIL=10, COMENTARIO=11, CADEIA=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DIGITO", "NUMERO", "DDD", 
		"CARACTERE", "TELEFONE", "MAIL", "COMENTARIO", "CADEIA", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'curriculo:'", "'nome:'", "'especialidade:'", "'contato:'", "'email:'", 
		"'tel:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUMERO", "DDD", "TELEFONE", 
		"MAIL", "COMENTARIO", "CADEIA", "WS"
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
		case 12:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\6\ro\n\r\r\r\16\rp\3\r\3\r\6\ru\n\r\r\r\16\rv\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\7\16\u0080\n\16\f\16\16\16\u0083\13\16\3\16\3\16"+
		"\3\16\3\17\3\17\7\17\u008a\n\17\f\17\16\17\u008d\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25\2\27\13\31"+
		"\f\33\r\35\16\37\17\3\2\6\4\2C\\c|\4\2\f\f\17\17\3\2\f\f\5\2\13\f\17\17"+
		"\"\"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5,\3\2\2\2\7\62\3\2\2"+
		"\2\tA\3\2\2\2\13J\3\2\2\2\rQ\3\2\2\2\17V\3\2\2\2\21X\3\2\2\2\23c\3\2\2"+
		"\2\25h\3\2\2\2\27j\3\2\2\2\31n\3\2\2\2\33}\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u0090\3\2\2\2!\"\7e\2\2\"#\7w\2\2#$\7t\2\2$%\7t\2\2%&\7k\2\2&\'\7e\2"+
		"\2\'(\7w\2\2()\7n\2\2)*\7q\2\2*+\7<\2\2+\4\3\2\2\2,-\7p\2\2-.\7q\2\2."+
		"/\7o\2\2/\60\7g\2\2\60\61\7<\2\2\61\6\3\2\2\2\62\63\7g\2\2\63\64\7u\2"+
		"\2\64\65\7r\2\2\65\66\7g\2\2\66\67\7e\2\2\678\7k\2\289\7c\2\29:\7n\2\2"+
		":;\7k\2\2;<\7f\2\2<=\7c\2\2=>\7f\2\2>?\7g\2\2?@\7<\2\2@\b\3\2\2\2AB\7"+
		"e\2\2BC\7q\2\2CD\7p\2\2DE\7v\2\2EF\7c\2\2FG\7v\2\2GH\7q\2\2HI\7<\2\2I"+
		"\n\3\2\2\2JK\7g\2\2KL\7o\2\2LM\7c\2\2MN\7k\2\2NO\7n\2\2OP\7<\2\2P\f\3"+
		"\2\2\2QR\7v\2\2RS\7g\2\2ST\7n\2\2TU\7<\2\2U\16\3\2\2\2VW\4\62;\2W\20\3"+
		"\2\2\2XY\5\17\b\2YZ\5\17\b\2Z[\5\17\b\2[\\\5\17\b\2\\]\5\17\b\2]^\7/\2"+
		"\2^_\5\17\b\2_`\5\17\b\2`a\5\17\b\2ab\5\17\b\2b\22\3\2\2\2cd\7*\2\2de"+
		"\4\62;\2ef\4\62;\2fg\7+\2\2g\24\3\2\2\2hi\t\2\2\2i\26\3\2\2\2jk\5\23\n"+
		"\2kl\5\21\t\2l\30\3\2\2\2mo\5\25\13\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq"+
		"\3\2\2\2qr\3\2\2\2rt\7B\2\2su\5\25\13\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wx\3\2\2\2xy\7\60\2\2yz\5\25\13\2z{\5\25\13\2{|\5\25\13\2|\32"+
		"\3\2\2\2}\u0081\7%\2\2~\u0080\n\3\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2"+
		"\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0085\t\3\2\2\u0085\u0086\b\16\2\2\u0086\34\3\2\2\2\u0087"+
		"\u008b\7$\2\2\u0088\u008a\n\4\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7$\2\2\u008f\36\3\2\2\2\u0090\u0091\t\5\2\2"+
		"\u0091\u0092\b\20\3\2\u0092 \3\2\2\2\7\2pv\u0081\u008b\4\3\16\2\3\20\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}