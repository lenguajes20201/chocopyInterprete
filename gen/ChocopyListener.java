// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChocopyParser}.
 */
public interface ChocopyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChocopyParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ChocopyParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocopyParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ChocopyParser.StartContext ctx);
}