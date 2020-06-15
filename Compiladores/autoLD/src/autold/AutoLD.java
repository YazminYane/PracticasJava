
//acepta:
//letras
//letra/digito 
//letra/digito/letra
//no acepta:
//digitos 
//digito/letra

package autold;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class AutoLD {

    private int estado = 1; //
    private String cadena = ""; //
//    private char c = ' ';
    private boolean correcto = false;//
    private int indice = 0 ; //
        
    
    private char siguienteCaracter(){
        char c = ' ';

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
    
    private boolean esDigito( char c ) {
        int ascii = ( int ) c;
        if ( ascii >= 48 && ascii <= 57 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main( String[] args ) {
   
        AutoLD auto = new AutoLD();
        
        auto.cadena = JOptionPane.showInputDialog( "Dame la cadena: " );
     
        char caracter = auto.siguienteCaracter();
        
        while (  caracter != ' ' && auto.correcto != true ) {
                
//               auto.c = auto.cadena.charAt( i );
                
                switch( auto.estado ){
                    case 1:
                        if( Character.isLetter( caracter ) ){
                            auto.estado = 3;
                        }else if( Character.isDigit( caracter ) ){
                            auto.estado = 2;
                        }else{
                            auto.correcto = false;
                        }
                        break;
                        
                    case 2:
                        auto.correcto = false;
                        break;
                       
                    case 3:
                        if( auto.esDigito( caracter ) || auto.esLetra( caracter ) ){
                            auto.estado = 3;
                            auto.correcto = true;
//                        } else
//                            auto.correcto = false;
                        }     
                       
                        break;

                }//fin del switch
        
            
            auto.siguienteCaracter();        
        
     
         }//fin del while 
        
        if ( auto.estado == 3 && auto.correcto == true ){
            System.out.println( "Cadena valida" );}
        else{
            System.out.println( "Cadena no valida" );
        }
    }//fin del main
}//fin de la clase
