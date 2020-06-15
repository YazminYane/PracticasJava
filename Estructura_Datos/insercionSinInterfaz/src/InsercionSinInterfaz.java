//metodo de ordenamiento de insercion obtiene el tiempo en que tarda el metodo

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class InsercionSinInterfaz {

    public static void main(String[] args) {
        
      Scanner tecla = new Scanner( System.in );
      int x;

      System.out.print("Total de numeros a ordenar: ");
      x = tecla.nextInt();

      Insercion pruebaInsercion = new Insercion( x );
      pruebaInsercion.generarAleatorios();
    
      Cronometro miCronometro = new Cronometro();
      pruebaInsercion.MetodoInsercion();
      System.out.printf("Tiempo " + miCronometro.elapsedTime() );
      System.out.println("");
      System.out.println("");
      pruebaInsercion.escribeNumeros();
      
    }
    
}
