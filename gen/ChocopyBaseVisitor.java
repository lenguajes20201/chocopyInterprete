// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\Chocopy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ChocopyVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class ChocopyBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ChocopyVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(ChocopyParser.StartContext ctx) { return visitChildren(ctx); }
}