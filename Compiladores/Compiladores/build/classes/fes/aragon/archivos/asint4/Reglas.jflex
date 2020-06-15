package fes.aragon.archivos.asint4;
import static fes.aragon.archivos.asint4.Tokens.*;
%%
%public
%class Lexico
%type Tokens
WHITE = [ \t\r\n]
L = [a-zA-Z_]
D = [0-9]
%%
{WHITE} {/*Ignore*/}
"true" {return TRUE;}
"false" {return FALSE;}
"and" {return AND;}
";" {return PYC;}
{L}* {return ERROR;}
{D}* {return ERROR;}
. {return ERROR;}