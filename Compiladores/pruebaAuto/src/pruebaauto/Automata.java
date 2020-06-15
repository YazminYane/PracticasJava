/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaauto;

/**
 *
 * @author Torre I
 */
public class Automata {
    
    int estadoActual;
char c;
int[][] MT={{0,0,1,2}, {2,2,2,3}, {2,2,2,2}, {2,2,2,2}};// Tabla de transicion

public Automata() {
 
    estadoActual = 0;
}
    
    
int clasifica (char c){
    int resultado = 0;
    switch(c){
        case 'a':
            resultado = 0;
            break;
        case 'b':
            resultado = 1;
            break;
        case '0':
            resultado = 2;
            break;
        case '1':
            resultado = 3;
            break;
        default:
            resultado = 4;
            break;
    }
    return resultado;
}


boolean evalua (char c){
    int clasificacion = clasifica(c);
    if(clasificacion >= 0 && clasificacion <= 3) {
        estadoActual = MT[estadoActual] [clasifica(c)];
        return true;
    }
    else {
        return false;
    }
}

boolean aceptado (){
    if (estadoActual == 3){
        return true;
    }
    else{
        return false;
    }       
}


boolean autonomo(String cadena){
    for (int i = 0; i < cadena.length(); i++) {
        if(!evalua(cadena.charAt(i))) {
            break;
        } 
    }
    return aceptado(); 
}
  
}
