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
		IDIOMA=18, USUARIO=19, NUMERO=20, DDD=21, TELEFONE=22, MAIL=23, COMENTARIO=24, 
		CADEIA=25, ANO=26, WS=27;
	public static final int
		RULE_curriculo = 0, RULE_nome = 1, RULE_especialidade = 2, RULE_contato = 3, 
		RULE_formacoes = 4, RULE_formacao = 5, RULE_idiomas = 6, RULE_email = 7, 
		RULE_tel = 8, RULE_redess = 9, RULE_linkedin = 10, RULE_github = 11, RULE_lattes = 12;
	public static final String[] ruleNames = {
		"curriculo", "nome", "especialidade", "contato", "formacoes", "formacao", 
		"idiomas", "email", "tel", "redess", "linkedin", "github", "lattes"
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
		public FormacoesContext formacoes() {
			return getRuleContext(FormacoesContext.class,0);
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
			setState(26);
			match(T__0);
			setState(27);
			nome();
			setState(28);
			especialidade();
			setState(29);
			contato();
			setState(30);
			formacoes();
			setState(31);
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
			setState(33);
			match(T__1);
			setState(34);
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
			setState(36);
			match(T__2);
			setState(37);
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
			setState(39);
			match(T__3);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(40);
					tel();
					}
					break;
				case T__8:
					{
					setState(41);
					email();
					}
					break;
				case T__10:
					{
					setState(42);
					redess();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45); 
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

	public static class FormacoesContext extends ParserRuleContext {
		public List<FormacaoContext> formacao() {
			return getRuleContexts(FormacaoContext.class);
		}
		public FormacaoContext formacao(int i) {
			return getRuleContext(FormacaoContext.class,i);
		}
		public FormacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).enterFormacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CVLListener ) ((CVLListener)listener).exitFormacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CVLVisitor ) return ((CVLVisitor<? extends T>)visitor).visitFormacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormacoesContext formacoes() throws RecognitionException {
		FormacoesContext _localctx = new FormacoesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formacoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				formacao();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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
		public Token curso;
		public Token universidade;
		public Token inicio;
		public Token atual;
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
		enterRule(_localctx, 10, RULE_formacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((FormacaoContext)_localctx).curso = match(CADEIA);
			setState(54);
			((FormacaoContext)_localctx).universidade = match(CADEIA);
			setState(55);
			((FormacaoContext)_localctx).inicio = match(ANO);
			setState(56);
			match(T__5);
			setState(57);
			((FormacaoContext)_localctx).atual = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==ANO) ) {
				((FormacaoContext)_localctx).atual = (Token)_errHandler.recoverInline(this);
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
		public Token IDIOMA;
		public List<Token> idioma = new ArrayList<Token>();
		public List<TerminalNode> IDIOMA() { return getTokens(CVLParser.IDIOMA); }
		public TerminalNode IDIOMA(int i) {
			return getToken(CVLParser.IDIOMA, i);
		}
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
		enterRule(_localctx, 12, RULE_idiomas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__7);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				((IdiomasContext)_localctx).IDIOMA = match(IDIOMA);
				((IdiomasContext)_localctx).idioma.add(((IdiomasContext)_localctx).IDIOMA);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDIOMA );
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
		enterRule(_localctx, 14, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
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
		enterRule(_localctx, 16, RULE_tel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__9);
			setState(69);
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
		enterRule(_localctx, 18, RULE_redess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__10);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(72);
					linkedin();
					}
					break;
				case 2:
					{
					setState(73);
					github();
					}
					break;
				case 3:
					{
					setState(74);
					lattes();
					}
					break;
				}
				}
				setState(77); 
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
		public Token linkedinU;
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
		enterRule(_localctx, 20, RULE_linkedin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(79);
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

			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(82);
				match(T__13);
				}
			}

			setState(85);
			match(T__14);
			setState(86);
			((LinkedinContext)_localctx).linkedinU = match(USUARIO);
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
		public Token githubU;
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
		enterRule(_localctx, 22, RULE_github);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(88);
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

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(91);
				match(T__13);
				}
			}

			setState(94);
			match(T__15);
			setState(95);
			((GithubContext)_localctx).githubU = match(USUARIO);
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
		public Token lattesU;
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
		enterRule(_localctx, 24, RULE_lattes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11 || _la==T__12) {
				{
				setState(97);
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

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(100);
				match(T__13);
				}
			}

			setState(103);
			match(T__16);
			setState(104);
			((LattesContext)_localctx).lattesU = match(USUARIO);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\6\5.\n\5\r\5\16\5/\3\6\3\6\6\6\64\n\6\r\6\16\6"+
		"\65\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b@\n\b\r\b\16\bA\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\6\13N\n\13\r\13\16\13O\3\f\5\fS\n\f\3\f\5"+
		"\fV\n\f\3\f\3\f\3\f\3\r\5\r\\\n\r\3\r\5\r_\n\r\3\r\3\r\3\r\3\16\5\16e"+
		"\n\16\3\16\5\16h\n\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\4\4\2\t\t\34\34\3\2\16\17\2m\2\34\3\2\2\2\4#\3\2\2\2\6"+
		"&\3\2\2\2\b)\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2\2\16=\3\2\2\2\20C\3\2\2\2"+
		"\22F\3\2\2\2\24I\3\2\2\2\26R\3\2\2\2\30[\3\2\2\2\32d\3\2\2\2\34\35\7\3"+
		"\2\2\35\36\5\4\3\2\36\37\5\6\4\2\37 \5\b\5\2 !\5\n\6\2!\"\5\16\b\2\"\3"+
		"\3\2\2\2#$\7\4\2\2$%\7\33\2\2%\5\3\2\2\2&\'\7\5\2\2\'(\7\33\2\2(\7\3\2"+
		"\2\2)-\7\6\2\2*.\5\22\n\2+.\5\20\t\2,.\5\24\13\2-*\3\2\2\2-+\3\2\2\2-"+
		",\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61\63\7\7\2\2\62"+
		"\64\5\f\7\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\13\3\2\2\2\678\7\33\2\289\7\33\2\29:\7\34\2\2:;\7\b\2\2;<\t\2\2\2<\r"+
		"\3\2\2\2=?\7\n\2\2>@\7\24\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"B\17\3\2\2\2CD\7\13\2\2DE\7\31\2\2E\21\3\2\2\2FG\7\f\2\2GH\7\30\2\2H\23"+
		"\3\2\2\2IM\7\r\2\2JN\5\26\f\2KN\5\30\r\2LN\5\32\16\2MJ\3\2\2\2MK\3\2\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\25\3\2\2\2QS\t\3\2\2RQ\3\2"+
		"\2\2RS\3\2\2\2SU\3\2\2\2TV\7\20\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7"+
		"\21\2\2XY\7\25\2\2Y\27\3\2\2\2Z\\\t\3\2\2[Z\3\2\2\2[\\\3\2\2\2\\^\3\2"+
		"\2\2]_\7\20\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\22\2\2ab\7\25\2\2b\31"+
		"\3\2\2\2ce\t\3\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\7\20\2\2gf\3\2\2\2"+
		"gh\3\2\2\2hi\3\2\2\2ij\7\23\2\2jk\7\25\2\2k\33\3\2\2\2\16-/\65AMORU[^"+
		"dg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}