// esta clase  crea el analizador lexico 
// esta es una clase creada como main
package fes.aragon;

import java.io.File;

/**
 *
 * @author PC2
 */
public class Creador {
    public static void main(String[] args) {
        
        //A QUI RUTA de donde se esta guardande el documento de Reglas 
        String ruta= System.getProperty( "user.dir" ) + "/src/fes/aragon/Reglas.jflex";
        
        Creador app = new Creador(); //objeto de tipo creador
        app.Crear(ruta);
        
    }
    private void Crear(String ruta){
        
            File f = new File(ruta);
            jflex.Main.generate(f);
            
        }
    
}
