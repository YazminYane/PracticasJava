/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel7.pkg5;

/**
 *
 * @author Torre I
 */
public class Deitel75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PaqueteCartas miPaqueteCartas = new PaqueteCartas();
        
        miPaqueteCartas.barajar();
        
        for( int i = 1; i <= 52; i++ ){
            
            //texto justificado a la izquierda(-) es un campo de 21caracteres
            System.out.printf( "%-21s", miPaqueteCartas.repartirCarta() );
            
            if( i % 4 == 0 ) // cada 4 cartas da un salto de linea
                System.out.println("");
        }  //fin del for  
    }// fin del main
}
