package fes.aragon.archivos.asint5;
import static fes.aragon.archivos.asint5.Tokens.*;
%%
%public
%class Lexico
%type Tokens
WHITE = [ \t\r\n]
L = [a-zA-Z_]
D = [0-9]
%%
{WHITE} {/*Ignore*/}
"num" {return NUM;}
"+" {return SUM;}
"*" {return MULT;}
"(" {return PARI;}
")" {return PARD;}
";" {return PYC;}
{L}* {return ERROR;}
{D}* {return ERROR;}
. {return ERROR;}