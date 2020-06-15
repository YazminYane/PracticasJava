//caso de estudio de la clase Tiempo1 (parte del libro)
//se usa la clase pruebaCadena para comprender el uso de las clases y los metodos toString 

package deitel8.pkg2;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tiempo1 tiempo = new Tiempo1();
        
        System.out.print( "La hora universal inicial es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar iniciar es: " );
        System.out.println( tiempo.toString() );
        System.out.println( );
        
        tiempo.establecerTiempo( 13, 27, 6 );
        System.out.print( "La hora unversal despues de pedir el tieempo es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar despues de establecer tiempo es: " );
        System.out.println( tiempo.toString() );
        System.out.println("");
        
        try{
        
            tiempo.establecerTiempo(99, 99, 99);
            
        }catch( IllegalArgumentException e ){
        
            System.out.printf( "Excepcion: %s\n\n", e.getMessage() );
        }
        
        System.out.println( "Despues de intentar ajustes invalidos: ");
        System.out.print( "Hora Universal: ");
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "Hora Estandar: " );
        System.out.println( tiempo.toString() );
        
        
//        //Esta parte del programa prueba solo los metodos toString 
//        //Es importante observar que al llamar el metodo en un println se imprime solo la cadena
//        //con el formato que regresa el metodo, sin embargo si la cadena que se regresa en el metodo
//        //necesita tomar otro formato, se manda a llamar solo con el nombre del objeto 
//        
//        pruebaCadena miPruebaCadena = new pruebaCadena( 10, 5 );
//        
//        //solo se manda a llamar al metodo(explicitamente) que regresa una cadena
//        System.out.println( miPruebaCadena.regresaCadena() );
//        
//        //se manda a llamar a metodo toString de forma explicita 
//        System.out.println( miPruebaCadena.toString() );
//        
//        //el metodo se manada a llamar de forma implicita a ToString, solo se llama a la clase
//        System.out.printf( "¿Qué operación se realizó? %s ", miPruebaCadena );
//        System.out.println("");
        
    }   
}
