
/* metodo de ordenamiento de la burbuja y calcula el tiempo en que este metodo
tarda en ser ejecutado, numero de comparaciones e intercambios al ordenar */

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class BurbujasSinINterfaz {
    
    public static void main(String[] args) {

        Scanner tecla = new Scanner( System.in );
        
        System.out.print("escribe el total de numeros a ordenar: ");
        int x = tecla.nextInt();
        
        burbuja miBurbuja = new burbuja( x );
        miBurbuja.generarAleatorios();

        Cronometro miCronometro = new Cronometro();
        miBurbuja.ordena();
        System.out.println("tiempo: " + miCronometro.elapsedTime() );
        System.out.println("Total de intercambios: " + miBurbuja.getIntercambios() );
        System.out.println("Total de comparaciones: " + miBurbuja.getComparaciones() );
        System.out.println("");
        System.out.println("");
        miBurbuja.escribeNumeros();  
    }   
}
