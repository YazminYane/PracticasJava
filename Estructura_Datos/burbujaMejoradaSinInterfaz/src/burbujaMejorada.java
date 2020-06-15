/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;
/**
 *
 * @author Yazmin
 */
public class burbujaMejorada {
    
    int[] arr;
  

    //inicio del constructor
    public burbujaMejorada( int n ) {
        
        int a;
        arr = new int[ n ];
        
    }
    //fin del constructor
    
    //inicio del metodo generaAleatorios
    public void generarAleatorios( ){
    
        Random aleatorios = new Random();
        
        for( int i = 0 ; i < arr.length ; i ++ ){
        
            int numero = aleatorios.nextInt();
            arr[ i ] = numero;
        }  
    }
    //fin del metodo generaAleatorios
    
    
    // inicio del metodo escribeNumero
    public void escribeNumeros( ){
    
        for( int i = 0 ; i < arr.length ; i ++ )
            System.out.printf( "%d\n" , arr[ i ] );
        
        System.out.println("");
    }
    //fin del metodo escribeNumeros
    
    
    //inicio de metodo ordena
    public void ordena (){
    
        int pasada;
        int actual;
        int numComparaciones;
        
        
        numComparaciones = 1;  // para que pueda entrar al for
        
        //se realizara una pasada de intercambios cuando comparaciones sea != 0
        for( pasada = 0 ; pasada < arr.length - 1 && numComparaciones != 0 ; pasada ++ ){
        
            numComparaciones = 0; // comparaciones se inicia en 0 en cada pasada 
            
            //por obviedad en cada pasada se ordena el ultimo dato, por lo tanto se puede evitar las ultimas comaraciones 
            for( actual = 0 ; actual < arr.length - 1 - pasada ; actual ++ ){
            
                if( arr[ actual ] > arr[ actual + 1 ] ){
                
                    int temp = arr[ actual ];
                    arr[ actual ] = arr[ actual + 1 ];
                    arr[ actual + 1 ] = temp;
                    numComparaciones ++; //aumenta el contador si hubo intercabios 
                }
            }
        }
    }
    // fin del metodo ordena

  
}
