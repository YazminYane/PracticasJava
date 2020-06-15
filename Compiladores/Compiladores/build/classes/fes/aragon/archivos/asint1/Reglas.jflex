package fes.aragon.archivos.asint1;
import static fes.aragon.archivos.asint1.Tokens.*;
%%
%public
%class Lexico
%type Tokens
L = [a-zA-Z_]
D = [0-9]
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"=" {return ASSIGN;}
"+" {return SUMA;}
"-" {return RESTA;}
";" {return PYC;}
{L}({L}|{D})* {lexema=yytext();
                return ID;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}