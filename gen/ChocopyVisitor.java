// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChocopyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChocopyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChocopyParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ChocopyParser.StartContext ctx);
}