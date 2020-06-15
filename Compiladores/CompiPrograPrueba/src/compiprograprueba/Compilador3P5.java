//Automata que corresonde a la expresión (a|b|c)*ac*
//AFD no reducido
//Es el tercer programa de tarea  
//programa termiado 

package compiprograprueba;
import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class Compilador3P5 {
    
    private String cadena ;
    private int aceptar;
    private int error;
    private int indice;

    public Compilador3P5( String cadenaa){
    
        cadena = cadenaa;
        aceptar = 1;
        error = -1;
        indice = 0;
    
    }
    public char siguienteCaracter() {
        char c = ' ';
        if ( indice < cadena.length() ) {
            c = cadena.charAt( indice );
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
                
            case 'c':
                return estado_D();
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
                return estado_C();
            
            case 'c':
                return estado_E();
                
            case ' ':// este caso lo posee el estado B y E por que ambos son estados finales
                return 1;
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
                
            case 'c':
                return estado_D();
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
                return estado_C();
                
            case 'c':
                return estado_D();
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
            
            case 'c':
                return estado_E();
                
            case ' ':
                return 1;
            default:
                return error;

        }
    }
    
//    public static void main(String[] args) {
//        
//        Compilador3 obj = new Compilador3();
//        obj.cadena = JOptionPane.showInputDialog("Dame la cadena");
//        if(obj.aceptar==obj.estado_A()){
//           JOptionPane.showMessageDialog(null,"Valida");
//        }else{
//            JOptionPane.showMessageDialog(null,"Invalida");
//        }
//    }
}
