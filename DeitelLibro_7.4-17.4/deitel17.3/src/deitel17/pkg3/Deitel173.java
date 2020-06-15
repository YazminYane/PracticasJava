/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel17.pkg3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel173 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner( System.in );
        
        System.out.print( "escriba aqui el nombre del archivo o directorio: " );
        analizarRuta( entrada.nextLine() );//lee una linea de texto
    }//fin del main
    
    public static void analizarRuta( String ruta ){
    
        File nombre = new File( ruta );
        
        if( nombre.exists() ){ // si existe el nombre, muestra informacion sobre él
        
            //muestra informacion del archivo ( o directorio )
            System.out.printf( "%s%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                                nombre.getName(), " existe ", //devuelve un Strig con el nombre del archivo o directorio
                                ( nombre.isFile() ? "es un archivo" : "no es un archivo" ),
                                ( nombre.isDirectory() ? "Es un directoio" : "no es un directorio" ),
                                ( nombre.isAbsolute() ? "Es una ruta absoluta" : "no es una ruta absoluta" ), 
                                "Ultima Modificacion", nombre.lastModified(),
                                "Tamanio: ", nombre.length(),
                                "Ruta: ", nombre.getPath(),
                                "Ruta absoluta: ", nombre.getAbsolutePath(),
                                "Padre: ", nombre.getParent());
            
            if( nombre.isDirectory() ) { //muestra el listado del directorio
            
                String[] directorio = nombre.list();
                System.out.println( "\n\nContenido del directorio:\n" );
                
                for( String nombreDirectorio : directorio )
                    System.out.printf( "%s\n", nombreDirectorio );
                         
            }//fin de if
        }//fin de if exterior
        else{
        
            System.out.printf( "%s %s", ruta, "no existe." );
        } //fin de else
    }// fin del metodo analizarRutina
}//fin de la clase deitel17.3
