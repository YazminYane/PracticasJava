/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaparentesis;

import java.util.ArrayList;

/**
 *
 * @author Yazmin Yane
 */
public class PilaParentesis {

    public static void main(String[] args) {
        
        ArrayList< String > lista = new ArrayList< String >();
        
       
        lista.add( "azul" ); //0 1
        lista.add( "rojo" ); //1 2
        lista.add( "dorado" ); //2 3
        lista.add( "verde" ); //3 4
        lista.add( "azul" ); //4 5
        lista.add( "amarillo" ); //5 6 
        lista.add( "naranja" ); //6 7
        lista.add( "blanco" ); //7 8
        
        for( int i = 0 ; i < lista.size() ; i ++){
            System.out.printf( "%s", lista.get(i));
            System.out.println("");
        }
            
        
        lista.remove( "azul" );
        
        System.out.println("");
        
        for( int i = 0 ; i < lista.size() ; i ++){
            System.out.printf( "%s", lista.get(i));
            System.out.println("");
        }
        
        
    }
    
}
