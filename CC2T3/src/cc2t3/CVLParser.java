// Generated from CVL.g4 by ANTLR 4.7
package cc2t3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CVLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ID=4, COMENTARIO=5, STRING=6, WS=7, ERROR=8;
	public static final int
		RULE_documento = 0, RULE_campo = 1, RULE_valor = 2;
	public static final String[] ruleNames = {
		"documento", "campo", "valor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ID", "COMENTARIO", "STRING", "WS", "ERROR"
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

	@Override
	public String getGrammarFileName() { return "CVL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	        private void stop(String string) {
	            throw new ParseCancellationException(string);
	        }

	public CVLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentoContext extends ParserRuleContext {
		public CampoContext campo;
		public List<CampoContext> listaCampos = new ArrayList<CampoContext>();
		public List<CampoContext> campo() {
			return getRuleContexts(CampoContext.class);
		}
		public CampoContext campo(int i) {
			return getRuleContext(CampoContext.class,i);
		}
		public DocumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_documento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterDocumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitDocumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitDocumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentoContext documento() throws RecognitionException {
		DocumentoContext _localctx = new DocumentoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_documento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				((DocumentoContext)_localctx).campo = campo();
				((DocumentoContext)_localctx).listaCampos.add(((DocumentoContext)_localctx).campo);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class CampoContext extends ParserRuleContext {
		public Token nomeCampo;
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode ID() { return getToken(CVLParser.ID, 0); }
		public CampoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterCampo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitCampo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitCampo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampoContext campo() throws RecognitionException {
		CampoContext _localctx = new CampoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_campo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			((CampoContext)_localctx).nomeCampo = match(ID);
			setState(12);
			match(T__0);
			setState(13);
			valor();
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CVLParser.STRING, 0); }
		public DocumentoContext documento() {
			return getRuleContext(DocumentoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valor);
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(STRING);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__1);
				setState(17);
				documento();
				setState(18);
				match(T__2);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\31\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\27\n\4\3\4\2\2\5\2\4\6\2\2\2\27\2\t\3\2\2\2\4\r\3\2\2\2\6\26"+
		"\3\2\2\2\b\n\5\4\3\2\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2"+
		"\2\f\3\3\2\2\2\r\16\7\6\2\2\16\17\7\3\2\2\17\20\5\6\4\2\20\5\3\2\2\2\21"+
		"\27\7\b\2\2\22\23\7\4\2\2\23\24\5\2\2\2\24\25\7\5\2\2\25\27\3\2\2\2\26"+
		"\21\3\2\2\2\26\22\3\2\2\2\27\7\3\2\2\2\4\13\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}