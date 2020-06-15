
package deitel7.pkg5;

import java.util.Random;

/**
 *
 * @author Torre I
 */
public class PaqueteCartas {
    
    private Carta[] paquete; //arreglo de objetos cartas
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final Random numAleatorios = new Random();
    
    public PaqueteCartas(){
    
        String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
                            "Ocho", "Nueve", "Diez", "Joto", "Quina", "Rey" };
       
        String[] palos = { "Corazones", "Diamantes", "Treboles", "Espadas" };
        
        paquete = new Carta[ NUMERO_DE_CARTAS ]; // paquete es un arreglo de longitud 52
        cartaActual = 0;
        
        for ( int cuenta = 0; cuenta < paquete.length; cuenta++ )
            //guarda en  paquete las 52 cartas ordenadas, 13 cartas para cada palo
             paquete[ cuenta ] = new Carta ( caras[ cuenta % 13], palos[ cuenta / 13 ] );
    }// fin del constructor
    
    public void barajar(){
    
        cartaActual = 0;
        
        for( int primera = 0; primera < paquete.length; primera++ ){
            //genera un numero aleatorio del 1-52 que corresponde a cada carta(cara y palo)
            int segunda = numAleatorios.nextInt( NUMERO_DE_CARTAS );
            
            // intercambia las cartas en la posicion del numero aleatorio y la posicion del contador primera
            Carta temp = paquete[ primera ];
            paquete[ primera ] = paquete [ segunda ];
            paquete[ segunda ] = temp;
        }
    }//fin del metodo barajar 
    
    public Carta repartirCarta(){
    
        if( cartaActual < paquete.length )//pregunta si cartaActual es menor a 52
            return paquete[ cartaActual++ ];
        else
            return null;
    }//fin metodo repartiCarta
}
