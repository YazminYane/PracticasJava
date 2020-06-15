/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFlex_1P6;
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
        String ruta = System.getProperty( "user.dir" ) + "/src/JFlex_1P6/Reglas.jflex";
        
        Creador app = new Creador();
        app.Crear(ruta);

    }
    
    private void Crear(String ruta){
        
         File f = new File(ruta);
         jflex.Main.generate(f);

    }
    
}
