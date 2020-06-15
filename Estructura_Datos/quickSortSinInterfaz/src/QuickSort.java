
import java.util.Random;

/**
 *
 * @author Yazmin
 */
public class QuickSort {
    
    int[] arr;
    
    QuickSort( int n ){
        
        arr = new int[ n ];
    }
    
     public void GenerarAleatorios ( ){
    
         Random aleatorios = new Random();

       for ( int i = 0 ; i < arr.length  ; i ++ )
            {
                int numero = aleatorios.nextInt();
                arr[ i ] = numero;
            }
    }
     
    public void EscribeNumeros( ){

        for ( int i = 0 ; i < arr.length ; i ++ )
             System.out.printf( "%d\n", arr[ i ] );
        
        System.out.println("");  
    }
     
    public void Intercambia( int[] arr, int menor , int pasada){
    
        int temp = arr [ menor ]; 
        arr[ menor ] = arr [ pasada ];
        arr[ pasada ] = temp;
          
    }
    
    public void MetodoQickSort(){
    
        MetodoQickSort( 0, 0, arr.length - 1);
    }
    
    public void MetodoQickSort( int limInf, int pivote, int limSup ){
        
        if( limSup > limInf ){
            
            pivote = Particion( limInf, pivote, limSup );
            MetodoQickSort ( limInf, limInf, pivote );
            MetodoQickSort( pivote + 1, pivote + 1 , limSup );
        }
    }
    
    int Particion ( int limInf, int pivote, int limSup){
    
        int superior = limSup;
        int inferior = limInf;
        int pivot = pivote;
        boolean haciaIzq = true;
        
        while( inferior < superior ){
        
            if( haciaIzq ){
                
                if( arr [ pivot ] <= arr [ superior ] ){
                    superior -- ;
                }
                else{
                    Intercambia ( arr, pivot, superior );
                    pivot = superior;
                    haciaIzq = false;
                    inferior ++;
                }
            }
            else{
                 if( arr[ pivot ] >= arr[ inferior ] ){
                     inferior ++;
                 }
                 else{
                     Intercambia( arr, pivot, inferior );
                     pivot = inferior;
                     haciaIzq = true;
                     superior --;
                             
                 }           
            }
        }
        return pivot;
    }
}
