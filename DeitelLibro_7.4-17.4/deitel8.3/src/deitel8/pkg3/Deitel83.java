// con este proogram solo se muestra el error, que se provoca al intentar 
//acceder a una variable de instancia de la clase Tiempo1 declarada como private 
package deitel8.pkg3;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel83 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tiempo1 tiempo = new Tiempo1();
        
        tiempo.hora = 7; // error: hora tiene acceso privado en Tiempo1
        tiempo.minuto = 15;  // error: minuto tiene acceso privado en Tiempo1
        tiempo.segundo = 30:  // error: segundo tiene acceso privado en Tiempo1
    }    
}
