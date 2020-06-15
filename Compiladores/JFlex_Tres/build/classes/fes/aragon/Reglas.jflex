package fes.aragon;
import static fes.aragon.Tokens.*;
%%
%class Lexico
%type Tokens
I = [a-zA-Z_]
N =[0-9]
WHITE = [ \t\r\n]  
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}

"+" {return SUMA;}
"-" {return RESTA;}
";" {return PCOMA;}
"=" {return IGUAL;}
{I}({I}|{N})* {lexema=yytext();
return ID;}
. {return ERROR;}