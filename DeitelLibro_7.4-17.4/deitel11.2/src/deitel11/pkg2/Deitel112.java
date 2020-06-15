//division entre diferentes numeros sin manejo de excepciones

package deitel11.pkg2;

import java.util.Scanner;

/**
 *
 * @author Yazmin
 */

public class Deitel112 {

    public static float cosiente( float numerador, float denominador ){
    
        return numerador / denominador;
    }
     public static int cosiente( int numerador, int denominador ){
    
        return numerador / denominador;
    }
     
    public static void main(String[] args) {
    
        Scanner explorador = new Scanner( System.in);
        
        System.out.print("Introduzca un numero entero: ");
        float numerador = explorador.nextInt();
        
        System.out.print("Introduzca un denominador entero: ");
        float denominador = explorador.nextInt();
        
        float resultado = numerador/denominador; //operacion con numeros flotantes:
        // si se divide 100/0 se ontiene un infinity
        //si se divide 0/0 es un Nan
        System.out.printf("Resultado: %f /%f = %f \n", numerador, denominador, resultado );
        
        System.out.print("Introduzca un numero entero: ");
        int numerador2 = explorador.nextInt();
        
        System.out.print("Introduzca un denominador entero: ");
        int denominador2 = explorador.nextInt();
        
        int resultado2 = numerador2/denominador2; //operacion con numeros  enteros 
        // si se divide 100/0 no se puede realizar en numeros enteros
        System.out.printf("Resultado: %d /%d = %d \n", numerador2, denominador2, resultado2 );
    
    }
    
}
