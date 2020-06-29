// Generated from C:/Users/User/Desktop/Lenguajes Interprete/chocopyInterprete/chocopyInterprete/grammar\Grogtalk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrogtalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, L_BRACKET=8, R_BRACKET=9, 
		L_SPAR=10, R_SPAR=11, L_PAR=12, R_PAR=13, COMMA=14, COLON=15, PLUS=16, 
		MINUS=17, MODIFIER=18, STRING=19, K_NAME=20, K_SIZE=21, K_TAGS=22, K_ALIGNMENT=23, 
		K_ARMORCLASS=24, K_HITPOINTS=25, K_SPEED=26, WS=27, INT=28;
	public static final int
		RULE_creature = 0, RULE_creature_body = 1, RULE_statistic = 2, RULE_name = 3, 
		RULE_size = 4, RULE_tags = 5, RULE_alignment = 6, RULE_armor_class = 7, 
		RULE_hitpoints = 8, RULE_speed = 9, RULE_abilities = 10, RULE_taglist = 11, 
		RULE_ability_expr = 12, RULE_dice_expr = 13, RULE_armor_class_expr = 14, 
		RULE_hit_points_expr = 15, RULE_speed_expr = 16, RULE_walking_speed = 17, 
		RULE_speed_obj = 18, RULE_speed_expr1 = 19, RULE_speed_aux_expr = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"creature", "creature_body", "statistic", "name", "size", "tags", "alignment", 
			"armor_class", "hitpoints", "speed", "abilities", "taglist", "ability_expr", 
			"dice_expr", "armor_class_expr", "hit_points_expr", "speed_expr", "walking_speed", 
			"speed_obj", "speed_expr1", "speed_aux_expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'d'", "'D'", "'ft.'", "'burrow'", "'fly'", "'(hover)'", "'climb'", 
			"'{'", "'}'", "'['", "']'", "'('", "')'", "','", "':'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "L_BRACKET", "R_BRACKET", 
			"L_SPAR", "R_SPAR", "L_PAR", "R_PAR", "COMMA", "COLON", "PLUS", "MINUS", 
			"MODIFIER", "STRING", "K_NAME", "K_SIZE", "K_TAGS", "K_ALIGNMENT", "K_ARMORCLASS", 
			"K_HITPOINTS", "K_SPEED", "WS", "INT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grogtalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    int abilityCount;

	public GrogtalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CreatureContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GrogtalkParser.L_BRACKET, 0); }
		public Creature_bodyContext creature_body() {
			return getRuleContext(Creature_bodyContext.class,0);
		}
		public TerminalNode R_BRACKET() { return getToken(GrogtalkParser.R_BRACKET, 0); }
		public CreatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCreature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCreature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCreature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatureContext creature() throws RecognitionException {
		CreatureContext _localctx = new CreatureContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_creature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(L_BRACKET);
			setState(43);
			creature_body();
			setState(44);
			match(R_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Creature_bodyContext extends ParserRuleContext {
		public List<StatisticContext> statistic() {
			return getRuleContexts(StatisticContext.class);
		}
		public StatisticContext statistic(int i) {
			return getRuleContext(StatisticContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public Creature_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creature_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterCreature_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitCreature_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitCreature_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Creature_bodyContext creature_body() throws RecognitionException {
		Creature_bodyContext _localctx = new Creature_bodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_creature_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			statistic();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				statistic();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatisticContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AbilitiesContext abilities() {
			return getRuleContext(AbilitiesContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public AlignmentContext alignment() {
			return getRuleContext(AlignmentContext.class,0);
		}
		public Armor_classContext armor_class() {
			return getRuleContext(Armor_classContext.class,0);
		}
		public HitpointsContext hitpoints() {
			return getRuleContext(HitpointsContext.class,0);
		}
		public StatisticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterStatistic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitStatistic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitStatistic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticContext statistic() throws RecognitionException {
		StatisticContext _localctx = new StatisticContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statistic);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				name();
				}
				break;
			case L_SPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				abilities();
				}
				break;
			case K_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				size();
				}
				break;
			case K_TAGS:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				tags();
				}
				break;
			case K_ALIGNMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				alignment();
				}
				break;
			case K_ARMORCLASS:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				armor_class();
				}
				break;
			case K_HITPOINTS:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				hitpoints();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode K_NAME() { return getToken(GrogtalkParser.K_NAME, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(K_NAME);
			setState(64);
			match(COLON);
			setState(65);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode K_SIZE() { return getToken(GrogtalkParser.K_SIZE, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(K_SIZE);
			setState(68);
			match(COLON);
			setState(69);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagsContext extends ParserRuleContext {
		public TerminalNode K_TAGS() { return getToken(GrogtalkParser.K_TAGS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TaglistContext taglist() {
			return getRuleContext(TaglistContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitTags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitTags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(K_TAGS);
			setState(72);
			match(COLON);
			setState(73);
			taglist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentContext extends ParserRuleContext {
		public TerminalNode K_ALIGNMENT() { return getToken(GrogtalkParser.K_ALIGNMENT, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public AlignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAlignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAlignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAlignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentContext alignment() throws RecognitionException {
		AlignmentContext _localctx = new AlignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(K_ALIGNMENT);
			setState(76);
			match(COLON);
			setState(77);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Armor_classContext extends ParserRuleContext {
		public TerminalNode K_ARMORCLASS() { return getToken(GrogtalkParser.K_ARMORCLASS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Armor_class_exprContext armor_class_expr() {
			return getRuleContext(Armor_class_exprContext.class,0);
		}
		public Armor_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_armor_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterArmor_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitArmor_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitArmor_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Armor_classContext armor_class() throws RecognitionException {
		Armor_classContext _localctx = new Armor_classContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_armor_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(K_ARMORCLASS);
			setState(80);
			match(COLON);
			setState(81);
			armor_class_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HitpointsContext extends ParserRuleContext {
		public TerminalNode K_HITPOINTS() { return getToken(GrogtalkParser.K_HITPOINTS, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Hit_points_exprContext hit_points_expr() {
			return getRuleContext(Hit_points_exprContext.class,0);
		}
		public HitpointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hitpoints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterHitpoints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitHitpoints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitHitpoints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HitpointsContext hitpoints() throws RecognitionException {
		HitpointsContext _localctx = new HitpointsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hitpoints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(K_HITPOINTS);
			setState(84);
			match(COLON);
			setState(85);
			hit_points_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpeedContext extends ParserRuleContext {
		public TerminalNode K_SPEED() { return getToken(GrogtalkParser.K_SPEED, 0); }
		public TerminalNode COLON() { return getToken(GrogtalkParser.COLON, 0); }
		public Speed_exprContext speed_expr() {
			return getRuleContext(Speed_exprContext.class,0);
		}
		public SpeedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedContext speed() throws RecognitionException {
		SpeedContext _localctx = new SpeedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_speed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(K_SPEED);
			setState(88);
			match(COLON);
			setState(89);
			speed_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbilitiesContext extends ParserRuleContext {
		public TerminalNode L_SPAR() { return getToken(GrogtalkParser.L_SPAR, 0); }
		public List<Ability_exprContext> ability_expr() {
			return getRuleContexts(Ability_exprContext.class);
		}
		public Ability_exprContext ability_expr(int i) {
			return getRuleContext(Ability_exprContext.class,i);
		}
		public TerminalNode R_SPAR() { return getToken(GrogtalkParser.R_SPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public AbilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAbilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAbilities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAbilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbilitiesContext abilities() throws RecognitionException {
		AbilitiesContext _localctx = new AbilitiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_abilities);
		 abilityCount = 0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(L_SPAR);
			setState(92);
			ability_expr();
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				ability_expr();
				 abilityCount++; 
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(101);
			match(R_SPAR);
			setState(102);
			if (!( abilityCount == 5 )) throw new FailedPredicateException(this, " abilityCount == 5 ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaglistContext extends ParserRuleContext {
		public TerminalNode L_SPAR() { return getToken(GrogtalkParser.L_SPAR, 0); }
		public List<TerminalNode> STRING() { return getTokens(GrogtalkParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(GrogtalkParser.STRING, i);
		}
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrogtalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrogtalkParser.COMMA, i);
		}
		public TaglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_taglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterTaglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitTaglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitTaglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TaglistContext taglist() throws RecognitionException {
		TaglistContext _localctx = new TaglistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_taglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(L_SPAR);
			setState(105);
			match(STRING);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(106);
				match(COMMA);
				setState(107);
				match(STRING);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(R_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ability_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public TerminalNode MODIFIER() { return getToken(GrogtalkParser.MODIFIER, 0); }
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Ability_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ability_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterAbility_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitAbility_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitAbility_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ability_exprContext ability_expr() throws RecognitionException {
		Ability_exprContext _localctx = new Ability_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ability_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(INT);
			setState(116);
			match(L_PAR);
			setState(117);
			match(MODIFIER);
			setState(118);
			match(R_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dice_exprContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GrogtalkParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GrogtalkParser.INT, i);
		}
		public TerminalNode MODIFIER() { return getToken(GrogtalkParser.MODIFIER, 0); }
		public Dice_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dice_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterDice_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitDice_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitDice_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dice_exprContext dice_expr() throws RecognitionException {
		Dice_exprContext _localctx = new Dice_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dice_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(INT);
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(122);
			match(INT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODIFIER) {
				{
				setState(123);
				match(MODIFIER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Armor_class_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public TerminalNode STRING() { return getToken(GrogtalkParser.STRING, 0); }
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Armor_class_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_armor_class_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterArmor_class_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitArmor_class_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitArmor_class_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Armor_class_exprContext armor_class_expr() throws RecognitionException {
		Armor_class_exprContext _localctx = new Armor_class_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_armor_class_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(INT);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PAR) {
				{
				setState(127);
				match(L_PAR);
				setState(128);
				match(STRING);
				setState(129);
				match(R_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hit_points_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public TerminalNode L_PAR() { return getToken(GrogtalkParser.L_PAR, 0); }
		public Dice_exprContext dice_expr() {
			return getRuleContext(Dice_exprContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(GrogtalkParser.R_PAR, 0); }
		public Hit_points_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hit_points_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterHit_points_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitHit_points_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitHit_points_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hit_points_exprContext hit_points_expr() throws RecognitionException {
		Hit_points_exprContext _localctx = new Hit_points_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hit_points_expr);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(132);
				match(INT);
				setState(133);
				match(L_PAR);
				setState(134);
				dice_expr();
				setState(135);
				match(R_PAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				dice_expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Speed_exprContext extends ParserRuleContext {
		public Walking_speedContext walking_speed() {
			return getRuleContext(Walking_speedContext.class,0);
		}
		public Speed_objContext speed_obj() {
			return getRuleContext(Speed_objContext.class,0);
		}
		public Speed_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Speed_exprContext speed_expr() throws RecognitionException {
		Speed_exprContext _localctx = new Speed_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_speed_expr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				walking_speed();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				speed_obj();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Walking_speedContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public Walking_speedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_walking_speed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterWalking_speed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitWalking_speed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitWalking_speed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Walking_speedContext walking_speed() throws RecognitionException {
		Walking_speedContext _localctx = new Walking_speedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_walking_speed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(INT);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(145);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Speed_objContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(GrogtalkParser.L_BRACKET, 0); }
		public Speed_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Speed_objContext speed_obj() throws RecognitionException {
		Speed_objContext _localctx = new Speed_objContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_speed_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(L_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Speed_expr1Context extends ParserRuleContext {
		public Speed_aux_exprContext speed_aux_expr() {
			return getRuleContext(Speed_aux_exprContext.class,0);
		}
		public Speed_expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed_expr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed_expr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed_expr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Speed_expr1Context speed_expr1() throws RecognitionException {
		Speed_expr1Context _localctx = new Speed_expr1Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_speed_expr1);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(T__3);
				setState(151);
				speed_aux_expr();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__4);
				setState(153);
				speed_aux_expr();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(154);
					match(T__5);
					}
				}

				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__6);
				setState(158);
				speed_aux_expr();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Speed_aux_exprContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrogtalkParser.INT, 0); }
		public Speed_aux_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speed_aux_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).enterSpeed_aux_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrogtalkListener ) ((GrogtalkListener)listener).exitSpeed_aux_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrogtalkVisitor ) return ((GrogtalkVisitor<? extends T>)visitor).visitSpeed_aux_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Speed_aux_exprContext speed_aux_expr() throws RecognitionException {
		Speed_aux_exprContext _localctx = new Speed_aux_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_speed_aux_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(INT);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(163);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return abilities_sempred((AbilitiesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean abilities_sempred(AbilitiesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  abilityCount == 5 ;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\6\fd"+
		"\n\f\r\f\16\fe\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\ro\n\r\f\r\16\rr\13\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\177\n\17\3\20\3"+
		"\20\3\20\3\20\5\20\u0085\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008d"+
		"\n\21\3\22\3\22\5\22\u0091\n\22\3\23\3\23\5\23\u0095\n\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u009e\n\25\3\25\3\25\3\25\5\25\u00a3\n\25"+
		"\3\26\3\26\5\26\u00a7\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*\2\3\3\2\3\4\2\u00a6\2,\3\2\2\2\4\60\3\2\2\2\6?\3\2\2\2\b"+
		"A\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20Q\3\2\2\2\22U\3\2\2\2\24"+
		"Y\3\2\2\2\26]\3\2\2\2\30j\3\2\2\2\32u\3\2\2\2\34z\3\2\2\2\36\u0080\3\2"+
		"\2\2 \u008c\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u0096\3\2\2\2(\u00a2"+
		"\3\2\2\2*\u00a4\3\2\2\2,-\7\n\2\2-.\5\4\3\2./\7\13\2\2/\3\3\2\2\2\60\65"+
		"\5\6\4\2\61\62\7\20\2\2\62\64\5\6\4\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\28@\5\b\5\29@\5\26\f\2"+
		":@\5\n\6\2;@\5\f\7\2<@\5\16\b\2=@\5\20\t\2>@\5\22\n\2?8\3\2\2\2?9\3\2"+
		"\2\2?:\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\7\3\2\2\2AB\7"+
		"\26\2\2BC\7\21\2\2CD\7\25\2\2D\t\3\2\2\2EF\7\27\2\2FG\7\21\2\2GH\7\25"+
		"\2\2H\13\3\2\2\2IJ\7\30\2\2JK\7\21\2\2KL\5\30\r\2L\r\3\2\2\2MN\7\31\2"+
		"\2NO\7\21\2\2OP\7\25\2\2P\17\3\2\2\2QR\7\32\2\2RS\7\21\2\2ST\5\36\20\2"+
		"T\21\3\2\2\2UV\7\33\2\2VW\7\21\2\2WX\5 \21\2X\23\3\2\2\2YZ\7\34\2\2Z["+
		"\7\21\2\2[\\\5\"\22\2\\\25\3\2\2\2]^\7\f\2\2^c\5\32\16\2_`\7\20\2\2`a"+
		"\5\32\16\2ab\b\f\1\2bd\3\2\2\2c_\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2"+
		"fg\3\2\2\2gh\7\r\2\2hi\6\f\2\2i\27\3\2\2\2jk\7\f\2\2kp\7\25\2\2lm\7\20"+
		"\2\2mo\7\25\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3"+
		"\2\2\2st\7\17\2\2t\31\3\2\2\2uv\7\36\2\2vw\7\16\2\2wx\7\24\2\2xy\7\17"+
		"\2\2y\33\3\2\2\2z{\7\36\2\2{|\t\2\2\2|~\7\36\2\2}\177\7\24\2\2~}\3\2\2"+
		"\2~\177\3\2\2\2\177\35\3\2\2\2\u0080\u0084\7\36\2\2\u0081\u0082\7\16\2"+
		"\2\u0082\u0083\7\25\2\2\u0083\u0085\7\17\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\37\3\2\2\2\u0086\u0087\7\36\2\2\u0087\u0088\7\16"+
		"\2\2\u0088\u0089\5\34\17\2\u0089\u008a\7\17\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u008d\5\34\17\2\u008c\u0086\3\2\2\2\u008c\u008b\3\2\2\2\u008d!\3\2\2"+
		"\2\u008e\u0091\5$\23\2\u008f\u0091\5&\24\2\u0090\u008e\3\2\2\2\u0090\u008f"+
		"\3\2\2\2\u0091#\3\2\2\2\u0092\u0094\7\36\2\2\u0093\u0095\7\5\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095%\3\2\2\2\u0096\u0097\7\n\2\2"+
		"\u0097\'\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u00a3\5*\26\2\u009a\u009b\7"+
		"\7\2\2\u009b\u009d\5*\26\2\u009c\u009e\7\b\2\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a3\3\2\2\2\u009f\u00a0\7\t\2\2\u00a0\u00a3\5*"+
		"\26\2\u00a1\u00a3\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u009f\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3)\3\2\2\2\u00a4\u00a6\7\36\2\2"+
		"\u00a5\u00a7\7\5\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7+\3"+
		"\2\2\2\16\65?ep~\u0084\u008c\u0090\u0094\u009d\u00a2\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}