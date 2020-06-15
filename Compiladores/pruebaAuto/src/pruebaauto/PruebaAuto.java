/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaauto;

/**
 *
 * @author Torre I
 */
public class PruebaAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String cadena = "djha01";
        Automata auto = new Automata();
        if (auto.autonomo(cadena)){
            System.out.print("La cadena se encuentra dentro del lenguaje");
        }else{
            System.out.print( "La cadena no forma parte del lenguaje");
        }
        
        
        
        
    }
    
}
