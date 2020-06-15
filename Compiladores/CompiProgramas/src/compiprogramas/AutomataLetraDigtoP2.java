/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiprogramas;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class AutomataLetraDigtoP2 {

    public int estado;
    private String cadena;
    public int error;
    private int indice ;
    
    public AutomataLetraDigtoP2( String cadenaa ){
        estado = 1;
        indice = 0;
        cadena = cadenaa;
        error = 1;
    }
        
    public char siguienteCaracter(){
        char c=' ';
        if( indice < cadena.length() ){
            c = cadena.charAt( indice );
            indice ++;
        }
        return c;
    }
    
    public boolean esLetra( char c ) {
        int ascii = ( int ) c;
        if ( ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean esDigito(char c) {
        int ascii = ( int ) c;
        if ( ascii >= 48 && ascii <= 57 ) {
            return true;
        } else {
            return false;
        }
    }
    
//    public static void main(String[] args) {
//   
//        AutomataLetraDigtoP2 auto = new AutomataLetraDigtoP2();
//        char c ;
//        
//        auto.cadena = JOptionPane.showInputDialog( "Dame la cadena" );
//        c = auto.siguienteCaracter();
//        
//        while ( c != ' ' && auto.error == 1 ) {
//            
//            switch( auto.estado ){
//                case 1:
//                    if( auto.esLetra( c ) ){
//                        auto.estado = 3;
//                    }else if( auto.esDigito( c ) ){
//                        auto.estado = 2;
//                    }else{
//                        auto.error = -1;
//                    }
//                    break;
//                case 2:
//                    auto.error = -1;
//                    break;
//                case 3:
//                    if( Character.isLetter( c ) ){
//                        auto.estado = 3;
//                    }else if( Character.isDigit( c ) ){
//                        auto.estado = 3;
//                    }else{
//                        auto.error = -1;
//
//                    }
//                    break;
//            }//fin del switch
//
//        c = auto.siguienteCaracter();
//        
//        }//fin del while 
//        
//        if ( auto.estado == 3 && auto.error == 1 )
//            JOptionPane.showMessageDialog(null, "Cadena Valida");
//        else 
//            JOptionPane.showMessageDialog(null, "Cadena Invalida");
//    }
    
}
