/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnaSintactico_P12;

/**
 *
 * @author Yazmin Yane
 */
public class Token {
 
    private String nombre;

    public Token() {
    }
    
    public Token(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
