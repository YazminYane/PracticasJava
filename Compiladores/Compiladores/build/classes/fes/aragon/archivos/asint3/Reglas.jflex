package fes.aragon.archivos.asint2;
import static fes.aragon.archivos.asint2.Tokens.*;
%%
%public
%class Lexico
%type Tokens
WHITE = [ \t\r\n]
%%
{WHITE} {/*Ignore*/}
"a" {return A;}
"b" {return B;}
"c" {return C;}
";" {return PYC;}
. {return ERROR;}