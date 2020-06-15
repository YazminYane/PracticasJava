/**pila con escepciones en try/catch, trhow y trows en esta pila se manda una excepcion 
al tratar de introducir: uktimo dato + 1 y primer dato - 1 **/

import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;
/**
 *
 * @author Yazmin
 */
public class PilaConExcepciones2 {

    public static void main(String[] args) {
        
        PilaArreglos miPilaArreglos = new PilaArreglos( 4 );
       
        while ( !StdIn.isEmpty() ){ // verifica si la pila esta vacia, cuando tope sea igual 0 deja de introducir datos 
                                      // si es diferente de 0 continua recibiendo datos.
            
            String s = StdIn.readString(); // recibe datos del teclado 
            
            try{
                if( s.equals ( "-" ) )  // si lo que recibe es igual a "-"
                    StdOut.print( miPilaArreglos.pop() ); // imprime el ultimo dato insertado 
                else // de lo contario 
                    miPilaArreglos.push( s ); // guarda el dato en el arreglo 
            }
            catch( BufferOverflowException e ){
            
                System.out.println("El ultimo dato no pudo ser introducido (PILA LLENA)");
            }
            catch( NoSuchElementException e ){
            
                System.out.println( e.getMessage()); //trae el mensaje lanzado del throw en el pop 
            }            
        }     
    }
}
