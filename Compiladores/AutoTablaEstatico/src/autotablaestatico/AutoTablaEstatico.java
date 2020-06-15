// progarma de tarea, la  tabla de transicion corresponde aun autoamata que recibe:
// letras y digitos
package autotablaestatico;

/**
 *
 * @author Yazmin Yane
 */
public class AutoTablaEstatico {

    int estado = 0;
    String cadena = " ";
    char c = ' ';
    int error = 0;
    int indice = 0 ; 
        
    private char siguienteCaracter(){
        char c=' ';
        if(indice<cadena.length()){
            c=cadena.charAt(indice);
            indice++;
        }
        return c;
    }
    
    private boolean esLetra(char c) {
        int ascii = (int) c;
        if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean esDigito(char c) {
        int ascii = (int) c;
        if (ascii >= 48 && ascii <= 57) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        
        int estado = 1;
        
        
        
        
        
    }
    
}
