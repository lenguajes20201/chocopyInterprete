// Generated from C:/Users/User/Desktop/Lenguajes Interprete/chocopyInterprete/chocopyInterprete/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrogtalkParser}.
 */
public interface GrogtalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 */
	void enterCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#creature}.
	 * @param ctx the parse tree
	 */
	void exitCreature(GrogtalkParser.CreatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 */
	void enterCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#creature_body}.
	 * @param ctx the parse tree
	 */
	void exitCreature_body(GrogtalkParser.Creature_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 */
	void enterStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#statistic}.
	 * @param ctx the parse tree
	 */
	void exitStatistic(GrogtalkParser.StatisticContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrogtalkParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrogtalkParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(GrogtalkParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(GrogtalkParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 */
	void enterAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#alignment}.
	 * @param ctx the parse tree
	 */
	void exitAlignment(GrogtalkParser.AlignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 */
	void enterArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#armor_class}.
	 * @param ctx the parse tree
	 */
	void exitArmor_class(GrogtalkParser.Armor_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 */
	void enterHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#hitpoints}.
	 * @param ctx the parse tree
	 */
	void exitHitpoints(GrogtalkParser.HitpointsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(GrogtalkParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 */
	void enterAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#abilities}.
	 * @param ctx the parse tree
	 */
	void exitAbilities(GrogtalkParser.AbilitiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 */
	void enterTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#taglist}.
	 * @param ctx the parse tree
	 */
	void exitTaglist(GrogtalkParser.TaglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 */
	void enterAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#ability_expr}.
	 * @param ctx the parse tree
	 */
	void exitAbility_expr(GrogtalkParser.Ability_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 */
	void enterDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#dice_expr}.
	 * @param ctx the parse tree
	 */
	void exitDice_expr(GrogtalkParser.Dice_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 */
	void enterArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#armor_class_expr}.
	 * @param ctx the parse tree
	 */
	void exitArmor_class_expr(GrogtalkParser.Armor_class_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 */
	void enterHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#hit_points_expr}.
	 * @param ctx the parse tree
	 */
	void exitHit_points_expr(GrogtalkParser.Hit_points_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 */
	void enterSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed_expr}.
	 * @param ctx the parse tree
	 */
	void exitSpeed_expr(GrogtalkParser.Speed_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#walking_speed}.
	 * @param ctx the parse tree
	 */
	void enterWalking_speed(GrogtalkParser.Walking_speedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#walking_speed}.
	 * @param ctx the parse tree
	 */
	void exitWalking_speed(GrogtalkParser.Walking_speedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed_obj}.
	 * @param ctx the parse tree
	 */
	void enterSpeed_obj(GrogtalkParser.Speed_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed_obj}.
	 * @param ctx the parse tree
	 */
	void exitSpeed_obj(GrogtalkParser.Speed_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed_expr1}.
	 * @param ctx the parse tree
	 */
	void enterSpeed_expr1(GrogtalkParser.Speed_expr1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed_expr1}.
	 * @param ctx the parse tree
	 */
	void exitSpeed_expr1(GrogtalkParser.Speed_expr1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrogtalkParser#speed_aux_expr}.
	 * @param ctx the parse tree
	 */
	void enterSpeed_aux_expr(GrogtalkParser.Speed_aux_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrogtalkParser#speed_aux_expr}.
	 * @param ctx the parse tree
	 */
	void exitSpeed_aux_expr(GrogtalkParser.Speed_aux_exprContext ctx);
}