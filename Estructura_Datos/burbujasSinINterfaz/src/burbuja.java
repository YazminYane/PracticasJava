
import java.util.Random;

/**
 *
 * @author Yazmin
 */
public class burbuja {
    
    private int[] arr;
    private int numIntercambios = 0;
    private int numComparaciones = 0;
            
    
    //inicio del constructor
    public burbuja( int n ) {
    
        arr = new int[ n ]; // crea un arreglo de n numeros
        
    } //fin del constructor
     
    
    
    // inicio del metodo generarAleatorios
    public void generarAleatorios ( ){
    
        Random aleatorios = new Random();
       
        //llena el arreglo de numeros aleatorios 
       for ( int i = 0 ; i < arr.length  ; i ++ )
            {
                int numero = aleatorios.nextInt();
                arr[ i ] = numero;
            }

    } //fin del metodo generarAleatorios
    
    
    
    //inicio del metodo ordena
    public void ordena () {
        
        int pasada;
        int actual;
        
        for( pasada = 0 ; pasada < arr.length - 1 ; pasada ++ )
            for ( actual = 0 ; actual < arr.length - 1 ; actual ++ )
            {
                if( arr[ actual ] > arr[ actual + 1 ] )
                {
                    int temp;
                    temp = arr[ actual ];
                    arr[ actual ] = arr[ actual + 1];
                    arr[ actual + 1 ] = temp;
                    numIntercambios ++;
                }
                numComparaciones ++;
            }
        
    }  //fin del metodo ordena
    
    //trae el total de intercambios en el metodo ordena
    public int getIntercambios( )
    {
        return numIntercambios;
    }
    
    //establece el total de comparaciones en el metodo ordena
    public int getComparaciones( )
    {
        return numComparaciones;
    }
   
    //inicio del metodo escribeNumeros
    public void escribeNumeros()
    {
        //imprime los numeros que contiene el arreglo 
        for ( int i = 0 ; i < arr.length ; i ++ )
             System.out.printf( "%d\n", arr[ i ] );
        
        System.out.println("");
       
    }
    // fin del metodo escribeNumeros 
    

}
