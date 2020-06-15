// esta clase  crea el analizador lexico 
// esta es una clase creada como main

package fes.aragon;

import java.io.File;

/**
 *
 * @author Yazmin Yane
 */
public class Creador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //AQUI RUTA
        String ruta = System.getProperty( "user.dir" ) + "/src/fes/aragon/Reglas.Jflex";
        
        Creador app = new Creador();
        app.Crear(ruta);
    }
    
    private void Crear(String ruta){
        
            File f = new File(ruta);
            jflex.Main.generate(f);

    }   
}
