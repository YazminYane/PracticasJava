//Este proyecto es un automata que corresponde a la expresion  (a|b)*abb
//El AFD no esta reducido 
//Este programa es el primero que se realizo en clase, como tarea terminarlo
//programa terminado

package compiprograprueba;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class AutomataLexico1P1 {
 
    private String cadena ; //a qui se guardara la palabra escrita 
    private int aceptar ; // la funcion devuelve 1 si la cadena llega al estado final 
    private int error ; // la funcion devuelve -1 si el caracter siguiente no es a o b 
    private int indice ;

    public AutomataLexico1P1( String cadenaa ){ // recibe como parametro la cadena escrita en la interfaz
    
        cadena = cadenaa;  
        aceptar = 1;  
        error = -1;  
        indice = 0;
        
    }
    
    public char siguienteCaracter( ) {
        char c = ' ';  // a qui se guardara el caracter leido
        if ( indice < cadena.length() ) { // si indice < la longitud de la palabra 
            c = cadena.charAt( indice );  // c toma el valor del caracter de la palabra en indice
            indice++;
        }
        return c;
    }
   
    public int estado_A() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
            default:
                return error;

        }
    }

    public int estado_B() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_D();
            default:
                return error;

        }
    }

    public int estado_C() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
            default:
                return error;

        }
    }

    public int estado_D() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_E();
            default:
                return error;

        }
    }

    public int estado_E() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
                
            case ' ': //se agrega este caso en este estado por que es estado final
                return 1;
            default:
                return error;

        }
    }
    
//    public static void main(String[] args) {
//    
//        AutomataLexico1 Auto = new AutomataLexico1();
//        
//        Auto.cadena = JOptionPane.showInputDialog( "Dame la cadena" );
    
//        if( Auto.aceptar == Auto.estado_A() ){ //pregunta si la variable aceptar(1) 
//
//            JOptionPane.showMessageDialog( null,"Valida" );
//        
//        }else{
//            
//            JOptionPane.showMessageDialog( null,"Invalida" );
//        }
//    }
//  
    
}
