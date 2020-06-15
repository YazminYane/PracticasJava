package JFlex_2P7;
import static JFlex_2P7.Tokens.*;
%%
%class Lexico
%public 
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
")" {return PARENTDER;}
"(" {return PARENTIZQ;}

. {return ERROR;}