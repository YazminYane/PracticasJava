package Diagrama_P13;
import static Diagrama_P13.Tokens.*;
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
"=" {return IGUAL;}
"+" {return MAS;}
"-" {return MENOS;}
";" {return PUNTOYCOMA;}
"<" {return ME;}
"<=" {return MEI;}
"!=" {return DIST;}
">=" {return MAI;}
">" {return MA;}
"or" {return OR;}
"OR" {return OR;}
"*" {return POR;}
"/" {return DIV;}
"div" {return DIV_ENT;}
"DIV" {return DIV_ENT;}
"MOD" {return MOD;}
"mod" {return MOD;}
"AND" {return AND;}
"and" {return AND;}
"NOT" {return NOT;}
"not" {return NOT;}
"(" {return AB_PARID;}
")" {return CE_PAR;}
{L}({L}|{D})* {lexema=yytext();
                return ID;}
("(-"{D}+")")|{D}+ {lexema=yytext(); return NUM;}
. {return ERROR;}