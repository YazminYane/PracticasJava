//Automata 2, este ejercicio se dejo de tarea 
//este automata indica si una variables es declarada correctamente
// (a-z)*1-9*
//las variables pueden ser letras yas sean mayusculas o minusculas y numeros, no acepta solo números 
//programa terminado

package automataletradigito;

import javax.swing.JOptionPane;


public class automataLetraDigito2 {

    private int estado;
    private String cadena;
    private int error;
    private int indice ;
    
    public automataLetraDigito2(){
        estado = 1;
        indice = 0;
        cadena = "";
        error = 1;
    }
        
    private char siguienteCaracter(){
        char c=' ';
        if( indice < cadena.length() ){
            c = cadena.charAt( indice );
            indice ++;
        }
        return c;
    }
    
    private boolean esLetra( char c ) {
        int ascii = ( int ) c;
        if ( ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean esDigito(char c) {
        int ascii = ( int ) c;
        if ( ascii >= 48 && ascii <= 57 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
   
        automataLetraDigito2 auto = new automataLetraDigito2();
        char c ;
        
        auto.cadena = JOptionPane.showInputDialog( "Dame la cadena" );
        c = auto.siguienteCaracter();
        
        while ( c != ' ' && auto.error == 1 ) {
            
            switch( auto.estado ){
                case 1:
                    if( auto.esLetra( c ) ){
                        auto.estado = 3;
                    }else if( auto.esDigito( c ) ){
                        auto.estado = 2;
                    }else{
                        auto.error = -1;
                    }
                    break;
                case 2:
                    auto.error = -1;
                    break;
                case 3:
                    if( Character.isLetter( c ) ){
                        auto.estado = 3;
                    }else if( Character.isDigit( c ) ){
                        auto.estado = 3;
                    }else{
                        auto.error = -1;

                    }
                    break;
            }//fin del switch

        c = auto.siguienteCaracter();
        
        }//fin del while 
        
        if ( auto.estado == 3 && auto.error == 1 )
            JOptionPane.showMessageDialog(null, "Cadena Valida");
        else 
            JOptionPane.showMessageDialog(null, "Cadena Invalida");
    }
    
}
