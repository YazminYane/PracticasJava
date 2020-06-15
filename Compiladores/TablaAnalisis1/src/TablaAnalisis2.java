/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yazmin Yane
 */
public class TablaAnalisis2 {
    
    private String cadena = "";
    private int indice = 0;
    private char token;
    private boolean error = false;
    
    private char siguienteCaracter() {
        char c = ' ';
        
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        
        return c;
    }
    
    public void metodo_S(){}
    public void metodo_A(){}
    public void metodo_B(){}
    public void metodo_C(){}
    
}
