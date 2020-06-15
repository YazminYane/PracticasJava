// pila con arreglos, sin manejo de excepciones 

public class PilaConArreglos {

    public static void main(String[] args) {
       
        PilaArreglos miPilaArreglos = new PilaArreglos( 4 );
       
        while ( !StdIn.isEmpty() ){ // verifica si la pila esta vacia, cuando topa sea igual 0 deja de introducir datos 
                                      // si es diferente de 0 continua recibiendo datos.
            
            String s = StdIn.readString(); // recibe datos del teclado 
            if( s.equals ( "-" ) )  // si lo que recibe es igual a "-"
                StdOut.print( miPilaArreglos.pop() ); // imprime el ultimo dato insertado 
            else // de lo contario 
                miPilaArreglos.push( s ); // guarda el dato en el arreglo 
        }
    }    
}
