// Generated from CVL.g4 by ANTLR 4.7
package cc2t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CVLParser}.
 */
public interface CVLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CVLParser#documento}.
	 * @param ctx the parse tree
	 */
	void enterDocumento(CVLParser.DocumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#documento}.
	 * @param ctx the parse tree
	 */
	void exitDocumento(CVLParser.DocumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#campo}.
	 * @param ctx the parse tree
	 */
	void enterCampo(CVLParser.CampoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#campo}.
	 * @param ctx the parse tree
	 */
	void exitCampo(CVLParser.CampoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVLParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(CVLParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVLParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(CVLParser.ValorContext ctx);
}