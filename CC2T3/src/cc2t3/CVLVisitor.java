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
	 * Visit a parse tree produced by {@link CVLParser#documento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocumento(CVLParser.DocumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#campo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampo(CVLParser.CampoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CVLParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(CVLParser.ValorContext ctx);
}