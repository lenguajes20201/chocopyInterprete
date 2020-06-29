grammar Grogtalk;

@members{
    int abilityCount;
}

creature: L_BRACKET creature_body R_BRACKET;
creature_body: statistic (COMMA statistic)*;
statistic
            : name 
            | abilities
            | size
            | tags
            | alignment
            | armor_class
            | hitpoints
            ;
// stats grammar rules
name: K_NAME COLON STRING;
size: K_SIZE COLON STRING;
tags: K_TAGS COLON taglist;
alignment: K_ALIGNMENT COLON STRING;
armor_class: K_ARMORCLASS COLON armor_class_expr;
hitpoints: K_HITPOINTS COLON hit_points_expr;
speed: K_SPEED COLON speed_expr;

abilities
@init{ abilityCount = 0; }
: L_SPAR ability_expr (COMMA ability_expr { abilityCount++; } )+ R_SPAR { abilityCount == 5 }?;

// auxilliary stat grammar rules
taglist: L_SPAR STRING (COMMA STRING)* R_PAR;
ability_expr: INT L_PAR MODIFIER R_PAR;
dice_expr : INT ('d'|'D') INT (MODIFIER)?;
armor_class_expr: INT (L_PAR STRING R_PAR)?;
hit_points_expr: (INT  L_PAR dice_expr R_PAR) | dice_expr;

speed_expr: walking_speed | speed_obj;
walking_speed: INT ('ft.')?;
speed_obj: L_BRACKET ;
speed_expr1:'burrow' speed_aux_expr | 'fly' speed_aux_expr ('(hover)')? | 'climb' speed_aux_expr | ;
speed_aux_expr: INT ('ft.')?;
// tokens
L_BRACKET: '{';
R_BRACKET: '}';
L_SPAR: '[';
R_SPAR: ']';
L_PAR: '(';
R_PAR: ')';
COMMA: ',';
COLON: ':';
PLUS: '+';
MINUS: '-';
MODIFIER: (PLUS | MINUS) INT;
STRING: '"' ( ~["] )* '"';


K_NAME: N A M E;
K_SIZE: S I Z E;
K_TAGS: ((T A G S) | (T A G));
K_ALIGNMENT: A L I N G M E N T;
K_ARMORCLASS: ((A R M O R C L A S S) | (A C));
K_HITPOINTS: ((H I T P O I N T S) | (H P));
K_SPEED: S P E E D;


WS: [ \t\n\r] + -> skip;


INT: '0' | [1-9] [0-9]*;  

// these rules make the language case insensitive
fragment A : [aA]; // match either an 'a' or 'A'
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];