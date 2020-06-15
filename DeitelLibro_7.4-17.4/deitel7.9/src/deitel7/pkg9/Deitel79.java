//iniciaslizacion de arreglos bidimensionales

package deitel7.pkg9;

/**
 *
 * @author Torre I
 */
public class Deitel79 {

    public static void main(String[] args) {
        
        int[][] arreglo1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] arreglo2 = { { 1, 2}, { 3 }, { 4, 5, 6 } };
        
        System.out.println( "los valores en arreglo1 por filas son" );
        imprimirArreglo( arreglo1 );
        
        System.out.println("\nLos valores en arrglo2 por filas son ");
        imprimirArreglo( arreglo2 );
    }
    
    public static void imprimirArreglo( int[][] arreglo ){
    
        for ( int fila = 0; fila < arreglo.length; fila++ ){
        
            for ( int columna = 0; columna <arreglo[ fila ].length; columna++ )
                    System.out.printf("%d  ", arreglo[ fila ][ columna ] );
            
            System.out.println("");
        }
    }
}
