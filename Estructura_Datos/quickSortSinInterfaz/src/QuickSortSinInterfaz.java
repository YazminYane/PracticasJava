/** Metodo de Quick sort, funciona para n datos a ordenar  y da el tiempo que tarda
 el metodo en ordenar los datos **/

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class QuickSortSinInterfaz {
    
    public static void main(String[] args) {
        
      Scanner tecla = new Scanner( System.in );
      int x;

      System.out.print("Total de numeros a ordenar: ");
      x = tecla.nextInt();

      QuickSort pruebaOrdenaRapido = new QuickSort( x );
      pruebaOrdenaRapido.GenerarAleatorios();
      
      Cronometro miCronometro = new Cronometro();
      pruebaOrdenaRapido.MetodoQickSort();
      miCronometro.elapsedTime();
      
      System.out.println( "tiempo total: " + miCronometro.elapsedTime() );
      System.out.println("");   
      pruebaOrdenaRapido.EscribeNumeros();
    
    }
}
