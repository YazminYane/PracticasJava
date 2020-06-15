package fes.aragon.archivos.jflex2;
import static fes.aragon.archivos.jflex2.Tokens.*;
%%
%public
%class Lexico
%type Tokens
WHITE = [ \t\r\n]
%{
public String lexema;
%}
%%
{WHITE} {/*Ignore*/}
"true" {return TRUE;}
"false" {return FALSE;}
"and" {return AND;}
"or" {return OR;}
"not" {return NOT;}
"sii" {return SII;}
"si" {return SI;}
"TRUE" {return TRUE;}
"FALSE" {return FALSE;}
"AND" {return AND;}
"OR" {return OR;}
"NOT" {return NOT;}
"SII" {return SII;}
"SI" {return SI;}
"(" {return PARAP;}
")" {return PARCI;}
. {return ERROR;}