//burbuja mejorada en donde se toma en cuenta que en cada pasada se ordena un numero 
// calcula el tiempo que tarda el ordenamineto 

import java.util.Scanner;
/**
 *
 * @author Yazmin
 */
public class BurbujaMejoradaSinInterfaz {
    
    public static void main(String[] args) {
    
        Scanner tecla = new Scanner(System.in);
        int x;
        
        System.out.printf("Total de Numeros a ordenar: ");
        x = tecla.nextInt();
        
        burbujaMejorada miburbujaMejorada = new burbujaMejorada( x );
        
        miburbujaMejorada.generarAleatorios();
        Cronometro miCronometro = new Cronometro(); //inicio en el comienza a correr el cronometro 
        miburbujaMejorada.ordena();
        System.out.printf("tiempo: " + miCronometro.elapsedTime()); // elapsedtime detiene el tiempo que trancurrio desde que fue declarado
        System.out.println("");
        System.out.println("");
        miburbujaMejorada.escribeNumeros(); // escribe el arreglo de numeros 
 
    }    
}
