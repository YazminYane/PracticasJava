
import java.util.Random;

/**
 *
 * @author Yazmin
 */
public class menores {
    
    int[] arr;

    public menores( int n ) {
        
        arr = new int[ n ];
    
    }
    
    public void generaAleatorios( ){
    
        Random aleatorios = new Random();
        int numero;
                
        for( int i = 0 ; i < arr.length ; i ++ ){
        
            numero = aleatorios.nextInt();
            arr[ i ] = numero;
        }
    }
    
    public void escribeNumeros( ){
    
        for ( int i = 0 ; i < arr.length ; i ++ )
            System.out.printf("%d\n", arr[ i ]);
        
        System.out.println(" ");
    }
    
    public void ordenaMenores( ) {
    
        int pasada;
        int actual;
        int menor;
        
        for ( pasada = 0 ; pasada < arr.length - 1 ; pasada ++ ){
      
            menor = pasada;
            
            for( actual = pasada + 1 ; actual < arr.length ; actual ++ ){
            
                if( arr[ menor ] > arr [ actual ] )
                    menor = actual;
            }
            
            intercambia( arr, menor, pasada );
        }    
    }
    
    public void intercambia( int[] arr, int menor , int pasada){
    
        int temp = arr [ menor ]; 
        arr[ menor ] = arr [ pasada ];
        arr[ pasada ] = temp;
        
        
    }
    
    
    
    
    
    
    
    
}
