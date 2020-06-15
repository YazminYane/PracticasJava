
import java.util.Random;

/**
 *
 * @author Yazmin
 */
public class Insercion {

    int arr[];
    
    public Insercion( int n ) {
        
        arr = new int[ n ];
        
    }
    
    public void generarAleatorios ( ){
    
       Random aleatorios = new Random();

       for ( int i = 0 ; i < arr.length  ; i ++ )
            {
                int numero = aleatorios.nextInt();
                arr[ i ] = numero;
            }
    } 
    
    public void escribeNumeros( ){

        for ( int i = 0 ; i < arr.length ; i ++ )
             System.out.printf( "%d\n", arr[ i ] );
        
        System.out.println("");  
    }
   
     public void intercambia( int[] arr, int menor , int pasada){
    
        int temp = arr [ menor ]; 
        arr[ menor ] = arr [ pasada ];
        arr[ pasada ] = temp;
          
    }
    
    public void MetodoInsercion ( ){
    
        for( int i = 0 ; i < arr.length - 1 ; i++ ){ // for que controla el numero de pasadas
        
            boolean intercambio = true; // entra al for
            
            int j = 0;
            for( j = i + 1 ; j > 0 && intercambio ; j -- ){  // for controla las comparaciones actuales si es falso sale del for
           
               int numComp = 0;
               int numInter = 0; 
                       
               numComp ++;  //incrementa el contador de comparaciones
                
                if( arr[ j ] < arr[ j - 1 ] ){  //si el numero en j en menor que el numero j-1
                    
                    int temp;
                    temp = arr[ j ];
                    arr[ j] = arr [ j - 1 ];
                    arr[ j - 1 ] = temp;
                    
                    //intercambia( arr , j , j - 1);
                    numInter ++;  //incrementa el contador de intercambios
                }
                else{
                
                    intercambio = false; // indica que no hubo intercambio
                }
            }
        }
    }   
}
