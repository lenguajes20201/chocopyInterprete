// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\ChocoPyParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChocoPyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChocoPyParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ChocoPyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(ChocoPyParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(ChocoPyParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(ChocoPyParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(ChocoPyParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#typed_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_var(ChocoPyParser.Typed_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ChocoPyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#global_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_decl(ChocoPyParser.Global_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_decl(ChocoPyParser.Nonlocal_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(ChocoPyParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(ChocoPyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(ChocoPyParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ChocoPyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ChocoPyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ChocoPyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(ChocoPyParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(ChocoPyParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChocoPyParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(ChocoPyParser.TargetContext ctx);
}