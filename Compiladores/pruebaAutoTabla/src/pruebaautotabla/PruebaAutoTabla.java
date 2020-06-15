
package pruebaautotabla;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class PruebaAutoTabla {
    
    int estadoActual;
    char c;
    int[][] MT={ { 1,2,3 }, { 1,2,4 }, { 1,2,3 }, { 1,2,3 }, { 1,2,4 } };// Tabla de transicion

    public PruebaAutoTabla(){
        
        estadoActual = 0;

    }
    
    int clasifica ( char c ){
        
        int resultado = 0;
        switch(c){
            case 'a':
                resultado = 0;
                break;
            case 'b':
                resultado = 1;
                break;
            case 'c':
                resultado = 2;
                break;
            default:
                resultado = 3;
                break;
        }
        return resultado;
    }
    
    boolean evalua (char c){
        int clasificacion = clasifica( c );
        if( clasificacion >= 0 && clasificacion < 3 ) {
            estadoActual = MT[ estadoActual ] [ clasificacion ];
            return true;
        }
        else {
            return false;
        }
    }
    
    boolean aceptado (){
        if ( estadoActual == 1 || estadoActual == 4 ){
            return true;
        }
        else{
            return false;
        }       
    }
    
    boolean autonomo( String cadena ){
        for ( int i = 0; i < cadena.length(); i++ ) {
            if( !evalua ( cadena.charAt( i ) ) ) {
                break;
            } 
        }
        return aceptado(); 
    }
    
    
    public static void main(String[] args) {
        
        String cadena = "aaaaaaaac";
        PruebaAutoTabla auto = new PruebaAutoTabla();
        if ( auto.autonomo( cadena ) ){
            System.out.println( "La cadena se encuentra dentro del lenguaje" );
        }else{
            System.out.println( "La cadena no forma parte del lenguaje" );
        }
    }
    
}
