/*Paquete e importaciones de bibliotecas*/
package fes.aragon.archivos;
import java_cup.runtime.*;

%%
%class LexicoKarel
%public
%line
%column
%cup
%unicode
%char
%{
private Symbol simbolo(int type){
    return new Symbol(type, yyline, yycolumn);
}
private Symbol simbolo(int type, String value){
    return new Symbol(type, yyline, yycolumn, value);
}

%}
L = [a-zA-Z_]
D = 0 | [1-9][0-9]*
ESPACIO=[ \t\r\n]
PALABRA = {L}({L}|{D})*
%%

"moverIzquierda" {return simbolo(sym.movIzq); }
"moverDerecha" {return simbolo(sym.movDer); }
"moverArriba" {return simbolo(sym.movArr); }
"moverAbajo" {return simbolo(sym.movAb); }
"comer" {return simbolo(sym.comer); }
"si" {return simbolo(sym.si); }
"repetir" {return simbolo(sym.rep); }
"mientras" {return simbolo(sym.mient); }
"ParedIzquierda" {return simbolo(sym.parIzq); }
"ParedDerecha" {return simbolo(sym.parDer); }
"ParedArriba" {return simbolo(sym.parArr); }
"ParedAbajo" {return simbolo(sym.parAb); }
"NoParedIzquierda" {return simbolo(sym.NoParIzq); }
"NoParedDerecha" {return simbolo(sym.NoParDer); }
"NoParedArriba" {return simbolo(sym.NoParArr); }
"NoParedAbajo" {return simbolo(sym.NoParAb); }
"INICIOPROGRAMA" {return simbolo(sym.inicio); }
"FINPROGRAMA" {return simbolo(sym.fin); }
";" {return simbolo(sym.pyc); }
"{" {return simbolo(sym.llaveIzq); }
"}" {return simbolo(sym.llaveDer); }
"(" {return simbolo(sym.pareIzq); }
")" {return simbolo(sym.pareDer); }
    
{D} {return simbolo(sym.num, new String (yytext()));}
{ESPACIO} {/*Ignore*/}

.  {System.out.println("Identificador no reconocido."); return simbolo(sym.error, new String (yytext()));}


    