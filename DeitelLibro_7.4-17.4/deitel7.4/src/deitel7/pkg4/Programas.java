
package deitel7.pkg4;

import java.util.Random;

public class Programas {

   void gaficoEstrellas(){ 
       
       int [] arreglo = {0,0,0,0,0,0,1,2,4,2,1};
       
       System.out.println("Distribucion de calificaciones");
       for ( int contador = 0 ; contador < arreglo.length ; contador ++ ){
            
        if( contador == 10 )
            System.out.printf( "%5d:", 100 );
        else
            System.out.printf( "%02d-%02d:", contador*10, contador*10+9);
            
        for ( int estrellas = 0; estrellas < arreglo[contador]; estrellas ++ )
            System.out.print("*");
            
        System.out.println("");  
        }
    }//fin del metodo graficoEstrellas
   
   
    void tirarDado( ){
       
       Random numerosAleatorios = new Random();
       int[] frecuencia = new int[ 7 ];
       
       //tira 6000000 de veces el dado, de acuerdo al resultado lo 
       //almacenara en una posiscion del arreglo
       for( int tiro = 1; tiro <= 6000000; tiro ++ )
           ++frecuencia[ 1 + numerosAleatorios.nextInt( 6 )];
       
       System.out.printf( "%s%15s\n", "Cara", "Frecuencia" );
       
       for( int cara = 1; cara < frecuencia.length ; cara++ )
           System.out.printf( "%4d %14d\n", cara, frecuencia[ cara ] );
    
    }//fin del metodo tirar dados
    
    
    void encuestaEstudiante(){
        
        int[] respuestas = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14 };
        int[] frecuencia = new int[6];
        
        for( int respuesta = 0; respuesta < respuestas.length; respuesta ++ ){
        
            try{
                ++frecuencia[ respuestas[ respuesta ] ];
            }catch( ArrayIndexOutOfBoundsException e ){
                
                System.out.println( e );
                System.out.printf( "   respuestas[%d] = %d\n\n", respuesta, respuestas[ respuesta ] );
            }  
        }
        
        System.out.printf( "%s %10s\n", "Calificcion", "Frecuencia" );
            
            for( int calificacion = 1; calificacion < frecuencia.length; calificacion ++ )
                System.out.printf( "%6d %10d\n", calificacion, frecuencia[ calificacion ] ); 
        
    }//fin del metodo Encuesta estudiante

}//fin de la clase programas