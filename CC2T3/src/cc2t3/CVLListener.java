// Generated from CVL.g4 by ANTLR 4.7
package cc2t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CVLParser}.
 */
public interface CVLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CVLParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void enterCurriculo(CVLParser.CurriculoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#curriculo}.
	 * @param ctx the parse tree
	 */
	void exitCurriculo(CVLParser.CurriculoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(CVLParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(CVLParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#especialidade}.
	 * @param ctx the parse tree
	 */
	void enterEspecialidade(CVLParser.EspecialidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#especialidade}.
	 * @param ctx the parse tree
	 */
	void exitEspecialidade(CVLParser.EspecialidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#contato}.
	 * @param ctx the parse tree
	 */
	void enterContato(CVLParser.ContatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#contato}.
	 * @param ctx the parse tree
	 */
	void exitContato(CVLParser.ContatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#formacao}.
	 * @param ctx the parse tree
	 */
	void enterFormacao(CVLParser.FormacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#formacao}.
	 * @param ctx the parse tree
	 */
	void exitFormacao(CVLParser.FormacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void enterIdiomas(CVLParser.IdiomasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void exitIdiomas(CVLParser.IdiomasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(CVLParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(CVLParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#tel}.
	 * @param ctx the parse tree
	 */
	void enterTel(CVLParser.TelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#tel}.
	 * @param ctx the parse tree
	 */
	void exitTel(CVLParser.TelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#redess}.
	 * @param ctx the parse tree
	 */
	void enterRedess(CVLParser.RedessContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#redess}.
	 * @param ctx the parse tree
	 */
	void exitRedess(CVLParser.RedessContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#linkedin}.
	 * @param ctx the parse tree
	 */
	void enterLinkedin(CVLParser.LinkedinContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#linkedin}.
	 * @param ctx the parse tree
	 */
	void exitLinkedin(CVLParser.LinkedinContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#github}.
	 * @param ctx the parse tree
	 */
	void enterGithub(CVLParser.GithubContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#github}.
	 * @param ctx the parse tree
	 */
	void exitGithub(CVLParser.GithubContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#lattes}.
	 * @param ctx the parse tree
	 */
	void enterLattes(CVLParser.LattesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#lattes}.
	 * @param ctx the parse tree
	 */
	void exitLattes(CVLParser.LattesContext ctx);
}