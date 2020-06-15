// ejempplo tomado del capitulo 8.8 de ditel 
// Composicion: cunado una clase puede tener refrencias a otros objetos de otras clases como miembros  
package deitel8.pkg6;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        
        Fecha nacimiento = new Fecha( 7, 24, 1949);
        Fecha contratacion = new Fecha( 3, 12, 1988);
        Empleado empleado = new Empleado( "Bob", "Blue", nacimiento, contratacion );
        
        System.out.println( empleado );
    }
    
}
