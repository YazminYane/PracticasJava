package JFlex_4P9;
import static JFlex_4P9.Tokens.*;
%%
%class Lexico
%public 
%type Tokens
L = [a-zA-Z_]
D = [0-9]
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"String" {return STR;}
"int" {return INT;}
"double" {return DOUBLE;}
"boolean" {return BOOLEAN;}
"float" {return FLOAT; }
";" {return PCOMA;}
"," {return COMA;}

{L}({L}|{D})* {lexema=yytext(); 
                return ID;}
. {return ERROR;}