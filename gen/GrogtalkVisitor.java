// Generated from C:/Users/User/Desktop/Lenguajes Interprete/chocopyInterprete/chocopyInterprete/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrogtalkParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrogtalkVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrogtalkParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#walking_speed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWalking_speed(GrogtalkParser.Walking_speedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed_obj(GrogtalkParser.Speed_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed_expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed_expr1(GrogtalkParser.Speed_expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrogtalkParser#speed_aux_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpeed_aux_expr(GrogtalkParser.Speed_aux_exprContext ctx);
}