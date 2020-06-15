//metodo de ordenamiento de menores  y calcula el tiempo que tarda en ordenar cierta cantidad de datos
import java.util.Scanner;

/**
 *
 * @author Yazmin
 */
public class MenoresSinInterfaz {

    public static void main(String[] args) {
       
        Scanner tecla = new Scanner( System.in );
        int totNum;
        
        System.out.print( "Numero total de numeros a ordenar : " );
        totNum = tecla.nextInt();

        menores miMetodo = new menores ( totNum );
        
        miMetodo.generaAleatorios();
        
        Cronometro miCronometro = new Cronometro();
        miMetodo.ordenaMenores();
        miCronometro.elapsedTime();
        
        System.out.println( "tiempo total: " + miCronometro.elapsedTime() );
        System.out.println("");
        miMetodo.escribeNumeros();
    }    
}
