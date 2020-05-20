grammar Chocopy;

//GRAMATICA DE PRUEBA
start: 'hello' ID;
ID:[a-z]+;
WS: [ \t\r\n]+ -> skip;


//TOKENS

