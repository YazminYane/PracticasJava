/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnaSintactico_P12;

import java.io.File;

/**
 *
 * @author Yazmin Yane
 */
public class Creador {

    public static void main(String[] args) {
        String ruta = System.getProperty("user.dir") + "/src/AnaSintactico_P12/Reglas.jflex";
        
        Creador app = new Creador();
        app.Crear(ruta);
    }
    
    private void Crear(String ruta) {
        File f = new File(ruta);
        jflex.Main.generate(f);
    }
}
