// prueba la clse   libro calificaciones crea un objeto libro clificaciones, 
// usando un arreglo bidimencional

package deitel7.pkg10;

public class Deitel710 {

    public static void main(String[] args) {
        
        int[][] arregloCalif = { { 87, 96, 70 },
                                 { 68, 87, 90 },
                                 { 94, 100, 90 },
                                 { 100, 81, 82 },
                                 { 83, 65, 85 },
                                 { 78, 87, 65 },
                                 { 85, 75, 83 },
                                 { 91, 94, 100},
                                 { 76, 72, 84 }, 
                                 { 87, 93, 73,} };
        
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones( 
                "CS101 Introduccion a la programacion en Java", arregloCalif );
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.procesarCalificaciones();
        
        
        
    }
    
}
