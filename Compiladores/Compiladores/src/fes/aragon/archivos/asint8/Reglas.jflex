package fes.aragon.archivos.asint8;
import static fes.aragon.archivos.asint8.Tokens.*;
%%
%public
%class Lexico
%type Tokens
WHITE = [ \t\r\n]
L = [a-zA-Z_]
D = [0-9]
%%
{WHITE} {/*Ignore*/}
"a" {return A;}
"b" {return B;}
"c" {return C;}
"d" {return D;}
";" {return PYC;}
{L}* {return ERROR;}
{D}* {return ERROR;}
. {return ERROR;}