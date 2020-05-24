// Generated from D:/Documents/universidad/9 semestre/lenguajes/interprete/chocopyInterprete/grammar\ChocoPyParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChocoPyParser}.
 */
public interface ChocoPyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ChocoPyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ChocoPyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(ChocoPyParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(ChocoPyParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(ChocoPyParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(ChocoPyParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(ChocoPyParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(ChocoPyParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(ChocoPyParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(ChocoPyParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void enterTyped_var(ChocoPyParser.Typed_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void exitTyped_var(ChocoPyParser.Typed_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ChocoPyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ChocoPyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_decl(ChocoPyParser.Global_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_decl(ChocoPyParser.Global_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_decl(ChocoPyParser.Nonlocal_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_decl(ChocoPyParser.Nonlocal_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(ChocoPyParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(ChocoPyParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(ChocoPyParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(ChocoPyParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(ChocoPyParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(ChocoPyParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ChocoPyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ChocoPyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ChocoPyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ChocoPyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ChocoPyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ChocoPyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(ChocoPyParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(ChocoPyParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(ChocoPyParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(ChocoPyParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChocoPyParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(ChocoPyParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChocoPyParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(ChocoPyParser.TargetContext ctx);
}