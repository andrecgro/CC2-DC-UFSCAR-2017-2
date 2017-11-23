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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		USUARIO=18, NUMERO=19, DDD=20, TELEFONE=21, MAIL=22, COMENTARIO=23, CADEIA=24, 
		IDIOMA=25, ANO=26, WS=27;
	public static final int
		RULE_curriculo = 0, RULE_nome = 1, RULE_especialidade = 2, RULE_contato = 3, 
		RULE_formacao = 4, RULE_idiomas = 5, RULE_email = 6, RULE_tel = 7, RULE_redess = 8, 
		RULE_linkedin = 9, RULE_github = 10, RULE_lattes = 11;
	public static final String[] ruleNames = {
		"curriculo", "nome", "especialidade", "contato", "formacao", "idiomas", 
		"email", "tel", "redess", "linkedin", "github", "lattes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'curriculo:'", "'nome:'", "'especialidade:'", "'contato:'", "'formacao:'", 
		"' - '", "'Presente'", "'idiomas:'", "'email:'", "'tel:'", "'social:'", 
		"'http://'", "'https://'", "'www.'", "'linkedin.com/in/'", "'github.com/'", 
		"'lattes.cnpq.br/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "USUARIO", "NUMERO", "DDD", "TELEFONE", 
		"MAIL", "COMENTARIO", "CADEIA", "IDIOMA", "ANO", "WS"
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
		public FormacaoContext formacao() {
			return getRuleContext(FormacaoContext.class,0);
		}
		public IdiomasContext idiomas() {
			return getRuleContext(IdiomasContext.class,0);
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
			setState(24);
			match(T__0);
			setState(25);
			nome();
			setState(26);
			especialidade();
			setState(27);
			contato();
			setState(28);
			formacao();
			setState(29);
			idiomas();
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
			setState(31);
			match(T__1);
			setState(32);
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
			setState(34);
			match(T__2);
			setState(35);
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
		public List<RedessContext> redess() {
			return getRuleContexts(RedessContext.class);
		}
		public RedessContext redess(int i) {
			return getRuleContext(RedessContext.class,i);
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
			setState(37);
			match(T__3);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(38);
					tel();
					}
					break;
				case T__8:
					{
					setState(39);
					email();
					}
					break;
				case T__10:
					{
					setState(40);
					redess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0) );
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

	public static class FormacaoContext extends ParserRuleContext {
		public List<TerminalNode> CADEIA() { return getTokens(CVLParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(CVLParser.CADEIA, i);
		}
		public List<TerminalNode> ANO() { return getTokens(CVLParser.ANO); }
		public TerminalNode ANO(int i) {
			return getToken(CVLParser.ANO, i);
		}
		public FormacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterFormacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitFormacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitFormacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormacaoContext formacao() throws RecognitionException {
		FormacaoContext _localctx = new FormacaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__4);
			setState(46);
			match(CADEIA);
			setState(47);
			match(CADEIA);
			setState(48);
			match(ANO);
			setState(49);
			match(T__5);
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==ANO) ) {
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

	public static class IdiomasContext extends ParserRuleContext {
		public TerminalNode IDIOMA() { return getToken(CVLParser.IDIOMA, 0); }
		public IdiomasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idiomas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterIdiomas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitIdiomas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitIdiomas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdiomasContext idiomas() throws RecognitionException {
		IdiomasContext _localctx = new IdiomasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_idiomas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__7);
			setState(53);
			match(IDIOMA);
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
		enterRule(_localctx, 12, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__8);
			setState(56);
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
		enterRule(_localctx, 14, RULE_tel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__9);
			setState(59);
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

	public static class RedessContext extends ParserRuleContext {
		public List<LinkedinContext> linkedin() {
			return getRuleContexts(LinkedinContext.class);
		}
		public LinkedinContext linkedin(int i) {
			return getRuleContext(LinkedinContext.class,i);
		}
		public List<GithubContext> github() {
			return getRuleContexts(GithubContext.class);
		}
		public GithubContext github(int i) {
			return getRuleContext(GithubContext.class,i);
		}
		public List<LattesContext> lattes() {
			return getRuleContexts(LattesContext.class);
		}
		public LattesContext lattes(int i) {
			return getRuleContext(LattesContext.class,i);
		}
		public RedessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterRedess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitRedess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitRedess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RedessContext redess() throws RecognitionException {
		RedessContext _localctx = new RedessContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_redess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__10);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(62);
					linkedin();
					}
					break;
				case 2:
					{
					setState(63);
					github();
					}
					break;
				case 3:
					{
					setState(64);
					lattes();
					}
					break;
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) );
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

	public static class LinkedinContext extends ParserRuleContext {
		public TerminalNode USUARIO() { return getToken(CVLParser.USUARIO, 0); }
		public LinkedinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkedin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterLinkedin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitLinkedin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitLinkedin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkedinContext linkedin() throws RecognitionException {
		LinkedinContext _localctx = new LinkedinContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_linkedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(69);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(72);
				match(T__13);
				}
			}

			setState(75);
			match(T__14);
			setState(76);
			match(USUARIO);
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

	public static class GithubContext extends ParserRuleContext {
		public TerminalNode USUARIO() { return getToken(CVLParser.USUARIO, 0); }
		public GithubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_github; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterGithub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitGithub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitGithub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GithubContext github() throws RecognitionException {
		GithubContext _localctx = new GithubContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_github);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(78);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(81);
				match(T__13);
				}
			}

			setState(84);
			match(T__15);
			setState(85);
			match(USUARIO);
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

	public static class LattesContext extends ParserRuleContext {
		public TerminalNode USUARIO() { return getToken(CVLParser.USUARIO, 0); }
		public LattesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lattes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterLattes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitLattes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitLattes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LattesContext lattes() throws RecognitionException {
		LattesContext _localctx = new LattesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lattes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(87);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(90);
				match(T__13);
				}
			}

			setState(93);
			match(T__16);
			setState(94);
			match(USUARIO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\6\5,\n\5\r\5\16\5-\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\nD\n\n\r\n\16\nE\3\13\5\13"+
		"I\n\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\f\5\fR\n\f\3\f\5\fU\n\f\3\f\3"+
		"\f\3\f\3\r\5\r[\n\r\3\r\5\r^\n\r\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\4\4\2\t\t\34\34\3\2\16\17\2b\2\32\3\2\2\2\4!\3\2\2\2"+
		"\6$\3\2\2\2\b\'\3\2\2\2\n/\3\2\2\2\f\66\3\2\2\2\169\3\2\2\2\20<\3\2\2"+
		"\2\22?\3\2\2\2\24H\3\2\2\2\26Q\3\2\2\2\30Z\3\2\2\2\32\33\7\3\2\2\33\34"+
		"\5\4\3\2\34\35\5\6\4\2\35\36\5\b\5\2\36\37\5\n\6\2\37 \5\f\7\2 \3\3\2"+
		"\2\2!\"\7\4\2\2\"#\7\32\2\2#\5\3\2\2\2$%\7\5\2\2%&\7\32\2\2&\7\3\2\2\2"+
		"\'+\7\6\2\2(,\5\20\t\2),\5\16\b\2*,\5\22\n\2+(\3\2\2\2+)\3\2\2\2+*\3\2"+
		"\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2/\60\7\7\2\2\60\61\7\32\2"+
		"\2\61\62\7\32\2\2\62\63\7\34\2\2\63\64\7\b\2\2\64\65\t\2\2\2\65\13\3\2"+
		"\2\2\66\67\7\n\2\2\678\7\33\2\28\r\3\2\2\29:\7\13\2\2:;\7\30\2\2;\17\3"+
		"\2\2\2<=\7\f\2\2=>\7\27\2\2>\21\3\2\2\2?C\7\r\2\2@D\5\24\13\2AD\5\26\f"+
		"\2BD\5\30\r\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2F\23\3\2\2\2GI\t\3\2\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\7\20\2\2KJ"+
		"\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\21\2\2NO\7\24\2\2O\25\3\2\2\2PR\t\3\2"+
		"\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\7\20\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2VW\7\22\2\2WX\7\24\2\2X\27\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2Z[\3\2\2\2["+
		"]\3\2\2\2\\^\7\20\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\23\2\2`a\7\24"+
		"\2\2a\31\3\2\2\2\f+-CEHKQTZ]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}