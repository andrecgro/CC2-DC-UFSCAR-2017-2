// Generated from CVL.g4 by ANTLR 4.7
package cc2t3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CVLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CVLParser#curriculo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurriculo(CVLParser.CurriculoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(CVLParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#especialidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecialidade(CVLParser.EspecialidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#contato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContato(CVLParser.ContatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#formacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormacoes(CVLParser.FormacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#formacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormacao(CVLParser.FormacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#idiomas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdiomas(CVLParser.IdiomasContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#email}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmail(CVLParser.EmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#tel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTel(CVLParser.TelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#redess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedess(CVLParser.RedessContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#linkedin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinkedin(CVLParser.LinkedinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#github}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGithub(CVLParser.GithubContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#lattes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLattes(CVLParser.LattesContext ctx);
}