//Automata que corresonde a la expresión (a|b|c)*ac*
//AFD no reducido
//Es el tercer programa de tarea  
//programa termiado 

package compilador3;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class Compilador3 {

    private String cadena = "";
    private int aceptar = 1;
    private int error = -1;
    private int indice = 0;

    private char siguienteCaracter() {
        char c = ' ';
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        return c;
    }

    private int estado_A() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
                
            case 'c':
                return estado_D();
            default:
                return error;

        }
    }
    
    private int estado_B() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
            
            case 'c':
                return estado_E();
                
            case ' ':// este caso lo posee el estado B y E por que ambos son estados finales
                return 1;
            default:
                return error;

        }
    }

    private int estado_C() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
                
            case 'c':
                return estado_D();
            default:
                return error;

        }
    }

    private int estado_D() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();

            case 'b':
                return estado_C();
                
            case 'c':
                return estado_D();
            default:
                return error;

        }
    }
    
    private int estado_E() {
        char c = siguienteCaracter();
        switch (c) {
            case 'a':
                return estado_B();
                
            case 'b':
                return estado_C();
            
            case 'c':
                return estado_E();
                
            case ' ':
                return 1;
            default:
                return error;

        }
    }
    
    public static void main(String[] args) {
        
        Compilador3 obj = new Compilador3();
        obj.cadena = JOptionPane.showInputDialog("Dame la cadena");
        if(obj.aceptar==obj.estado_A()){
           JOptionPane.showMessageDialog(null,"Valida");
        }else{
            JOptionPane.showMessageDialog(null,"Invalida");
        }
    } 
    
}
