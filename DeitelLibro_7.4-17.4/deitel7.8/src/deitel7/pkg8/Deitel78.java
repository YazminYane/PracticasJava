/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel7.pkg8;

/**
 *
 * @author Torre I
 */
public class Deitel78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones( 
                "CS101 Introduccion a la programascion en Java" ,arregloCalif );
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
        
    }
    
}
