grammar MiniC;

program		: decl+;
decl		: var_decl
		| fun_decl;
var_decl	: type_spec IDENT  ';'
		| type_spec IDENT '[' ']' ';';
type_spec	: VOID
		| INT;
fun_decl	: type_spec IDENT '(' params ')' compound_stmt;
params		: param ('+' param)*
		| VOID;
param		: type_spec IDENT
		| type_spec IDENT '[' ']';
stmt		: expr_stmt
		| compound_stmt
		| if_stmt
		| while_stmt
		| return_stmt;
expr_stmt	: expr ';';
while_stmt	: WHILE '(' expr ')' stmt;
compound_stmt: '{' local_decl* stmt* '}';
local_decl	: type_spec IDENT ';'
		| type_spec IDENT '[' ']' ';';
if_stmt		: IF '(' expr ')' stmt
		| IF '(' expr ')' stmt ELSE stmt;
return_stmt	: RETURN ';'
		| RETURN expr ';';

expr	: IDENT '=' expr
	| IDENT '[' expr ']' '=' expr
	| expr OR expr
	| expr EQ expr
	| expr NE expr 
	| expr LE expr 
	| expr '<' expr 
	| expr GE expr 
	| expr '>' expr 
	| expr AND expr 
	| expr '+' expr 
	| expr '-' expr 
	| expr '*' expr 
	| expr '/' expr 
	| expr '%' expr 
	| '!' expr 
	| '-' expr 
	| '+' expr 
	| '(' expr ')' 
	| IDENT 
	| IDENT '[' expr ']' 
	| LITERAL;
args	: expr (',' expr)*
	|;

VOID: 'void';
INT: 'int';

WHILE: 'while';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
OR: 'or';
AND: 'and';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';

IDENT  : [a-zA-Z_]
        (   [a-zA-Z_]
        |  [0-9]
        )*;


LITERAL:   DecimalConstant     |   OctalConstant     |   HexadecimalConstant     ;


DecimalConstant
    :   [1-9] [0-9]*
    ;

OctalConstant
    :   '0'[0-7]*
    ;

HexadecimalConstant
    :   '0' [xX] [0-9a-fA-F] +
    ;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
	-> channel(HIDDEN)	 
    ;
