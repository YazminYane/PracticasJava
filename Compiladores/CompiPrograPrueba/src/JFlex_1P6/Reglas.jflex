package JFlex_1P6;
import static JFlex_1P6.Tokens.*;
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
"=" {return ASSIGN;}
"+" {return SUMA;}
"*" {return MULT;}
"-" {return RESTA;}
"/" {return DIV;}
{L}({L}|{D})* {lexema=yytext(); 
                return ID;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return INT;}
. {return ERROR;}