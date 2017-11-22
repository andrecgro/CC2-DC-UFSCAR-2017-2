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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMERO=7, DDD=8, TELEFONE=9, 
		MAIL=10, COMENTARIO=11, CADEIA=12, WS=13;
	public static final int
		RULE_curriculo = 0, RULE_nome = 1, RULE_especialidade = 2, RULE_contato = 3, 
		RULE_email = 4, RULE_tel = 5;
	public static final String[] ruleNames = {
		"curriculo", "nome", "especialidade", "contato", "email", "tel"
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

	@Override
	public String getGrammarFileName() { return "CVL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CVLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CurriculoContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public EspecialidadeContext especialidade() {
			return getRuleContext(EspecialidadeContext.class,0);
		}
		public ContatoContext contato() {
			return getRuleContext(ContatoContext.class,0);
		}
		public CurriculoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curriculo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterCurriculo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitCurriculo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitCurriculo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurriculoContext curriculo() throws RecognitionException {
		CurriculoContext _localctx = new CurriculoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_curriculo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			nome();
			setState(14);
			especialidade();
			setState(15);
			contato();
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

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CVLParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__1);
			setState(18);
			match(CADEIA);
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

	public static class EspecialidadeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(CVLParser.CADEIA, 0); }
		public EspecialidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especialidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterEspecialidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitEspecialidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitEspecialidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecialidadeContext especialidade() throws RecognitionException {
		EspecialidadeContext _localctx = new EspecialidadeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_especialidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__2);
			setState(21);
			match(CADEIA);
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

	public static class ContatoContext extends ParserRuleContext {
		public List<TelContext> tel() {
			return getRuleContexts(TelContext.class);
		}
		public TelContext tel(int i) {
			return getRuleContext(TelContext.class,i);
		}
		public List<EmailContext> email() {
			return getRuleContexts(EmailContext.class);
		}
		public EmailContext email(int i) {
			return getRuleContext(EmailContext.class,i);
		}
		public ContatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterContato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitContato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitContato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContatoContext contato() throws RecognitionException {
		ContatoContext _localctx = new ContatoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contato);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__3);
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(24);
					tel();
					}
					break;
				case T__4:
					{
					setState(25);
					email();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 || _la==T__5 );
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

	public static class EmailContext extends ParserRuleContext {
		public TerminalNode MAIL() { return getToken(CVLParser.MAIL, 0); }
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__4);
			setState(31);
			match(MAIL);
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

	public static class TelContext extends ParserRuleContext {
		public TerminalNode TELEFONE() { return getToken(CVLParser.TELEFONE, 0); }
		public TelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterTel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitTel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitTel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TelContext tel() throws RecognitionException {
		TelContext _localctx = new TelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__5);
			setState(34);
			match(TELEFONE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\'\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\6\5\35\n\5\r\5\16\5\36\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\2\2\b\2\4\6\b\n\f\2\2\2\"\2\16\3\2\2\2\4\23\3\2\2\2\6\26\3\2\2\2"+
		"\b\31\3\2\2\2\n \3\2\2\2\f#\3\2\2\2\16\17\7\3\2\2\17\20\5\4\3\2\20\21"+
		"\5\6\4\2\21\22\5\b\5\2\22\3\3\2\2\2\23\24\7\4\2\2\24\25\7\16\2\2\25\5"+
		"\3\2\2\2\26\27\7\5\2\2\27\30\7\16\2\2\30\7\3\2\2\2\31\34\7\6\2\2\32\35"+
		"\5\f\7\2\33\35\5\n\6\2\34\32\3\2\2\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37\t\3\2\2\2 !\7\7\2\2!\"\7\f\2\2\"\13\3\2\2\2"+
		"#$\7\b\2\2$%\7\13\2\2%\r\3\2\2\2\4\34\36";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}