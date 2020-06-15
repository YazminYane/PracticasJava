/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiprograprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class TablaAnalisis1P14 {
    
    public String cadena;
    private int indice;
    private char token;
    private boolean error;
    
    public TablaAnalisis1P14( String cadenaa ){

        cadena = cadenaa;
        indice = 0;
    }
    
    public void setError( boolean errorr ){ //establecer
    
        error = errorr;
    }
    
    public boolean getError(){ //obtener
    
        return error;
    }
    
    public void setCadena( String cadenaa ){ //establecer
    
        cadena = cadenaa;
    }
    
    public String getCadena(){ //obtener
    
        return cadena;
    }

    public char siguienteCaracter() {
        char c = ' ';
        
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        
        return c;
    }
    
    public void metodoS() {
        token = siguienteCaracter();
        if(token == 'b' || token == 'a') {
            metodoA();
            metodoB();
            if(token != ';') {
                error = true;
            }
        } else {
            error = true;
        }
    }
    
    public void metodoA() {
        if(token == 'a') {
            token = siguienteCaracter();
        } else if(token != 'a' && token != 'b') {
            error = true;
        }
    }
    
    public void metodoB() {
        if (token == 'b') {
            token = siguienteCaracter();
            metodoC();
            if (token != 'd') {
                error = true;
            } else {
                token = siguienteCaracter();
            }
        } else {
            error = true;
        }
    }
    
    public void metodoC() {
        if(token == 'c') {
            token = siguienteCaracter();
        } else if(token != 'c' && token != 'd') {
            error = true;
        }
    }
    
//    public static void main(String[] args) {
//        TablaAnalisis1 app = new TablaAnalisis1();
//        app.cadena = JOptionPane.showInputDialog("Cadena: ");
//        
//        if(!app.cadena.isEmpty()) { 
//            app.metodoS();
//            
//            if(!app.error) {
//                System.out.println("Wujuuu");
//            } else {
//                System.out.println("Chale");
//            }
//        }
//    }
}
