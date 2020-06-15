/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel8.pkg6;

/**
 *
 * @author Yazmin Yane
 */
public class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    
    public Empleado ( String nombre, String apellido, Fecha fechaDeNacimiento,
            Fecha fechaDeContratacion ){
    
        primerNombre = nombre;
        apellidoPaterno = apellido;
        
        // las siguientes dos lineas demuestran que una clase puede tener com ovariables de instancia 
        // referencias a objetos de otras clases.
        
        fechaNacimiento = fechaDeNacimiento;
        fechaContratacion = fechaDeContratacion;
    }// fin del contructor de empleado
    
    public String toString(){
    
        return String.format( "%s, %s Contratado: %s cumpleanios: %s",
                apellidoPaterno, primerNombre, fechaContratacion, fechaNacimiento );    
    } // fin del metodo toString 
}
