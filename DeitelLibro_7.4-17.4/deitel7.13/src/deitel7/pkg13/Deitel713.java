
package deitel7.pkg13;
import java.util.Arrays;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel713 {

    public static void main(String[] args) {
        
        // ordena arregloDouble en forma ascendente 
        double[] arregloDouble = { 8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort( arregloDouble );
        System.out.printf( "\narregloDouble: " );
        
        for( double valor : arregloDouble )
            System.out.printf( "\n%.1f", valor );
        
        System.out.println("");
        
        //llena el arreglo de 10 elementos con 7
        int[] arregloIntLleno = new int[ 10 ];
        Arrays.fill( arregloIntLleno, 7 );
        mostrarArreglo( arregloIntLleno, "arregloIntLleno" );
        
        //copia el arreglo arregloInt en el arreglo copiaArregloInt
        int[] arregloInt = { 1, 2, 3, 4, 5, 6 };
        int[] copiaArregloInt = new int[ arregloInt.length ];
        System.arraycopy( arregloInt, 0, copiaArregloInt, 0, arregloInt.length);
        mostrarArreglo( arregloInt, "arregloInt" );
        mostrarArreglo( copiaArregloInt, "copiaArregloInt");
        
        //compara si arregloInt y copiaArregloInt son iguales
        boolean b = Arrays.equals( arregloInt, copiaArregloInt );
        System.out.printf( "\n\narregloInt %s copiaArregloInt\n", ( b ? "==" : "!=" ) );
        
        //compara si arregloInt y arregloIntLleno son iguales 
        b = Arrays.equals( arregloInt, arregloIntLleno );
        System.out.printf( "\n\narregloInt %s arregloIntLleno\n", ( b ? "==" : "=1" ) );
        
        //busca en arregloInt el valor 5 y obtiene su ubicacion 
        int ubicacion = Arrays.binarySearch( arregloInt, 5);
        if( ubicacion >= 0 )
            System.out.printf( "se encontro 5 en el elemnto %d de arregloInt\n", ubicacion);
        else
            System.out.println( "No se enncontro el 5 en arregloInt" );
        
        //busca en arregloInt el valor 8763
       ubicacion = Arrays.binarySearch( arregloInt, 8763 );
       if( ubicacion >= 0 )
           System.out.printf( "se encontro 5 en el elemnto %d de arregloInt\n", ubicacion);
        else
            System.out.println( "No se enncontro el 5 en arregloInt" );   
    }
    
    public static void mostrarArreglo( int[] arreglo, String descripcion){
    
        System.out.printf( "\n%s: ", descripcion );
        
        for( int numero : arreglo )
            System.out.printf( "%d", numero );
    }
    
}
