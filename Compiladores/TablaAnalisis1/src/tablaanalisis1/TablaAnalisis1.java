/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaanalisis1;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class TablaAnalisis1 {

 private String cadena = "";
    private int indice = 0;
    private char token;
    private boolean error = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TablaAnalisis1 app = new TablaAnalisis1();
        app.cadena = JOptionPane.showInputDialog("Cadena: ");
        
        if(!app.cadena.isEmpty()) { 
            app.metodoS();
            
            if(!app.error) {
                System.out.println("Wujuuu");
            } else {
                System.out.println("Chale");
            }
        }
    }
    
    private char siguienteCaracter() {
        char c = ' ';
        
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        
        return c;
    }
    
    private void metodoS() {
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
    
    private void metodoA() {
        if(token == 'a') {
            token = siguienteCaracter();
        } else if(token != 'a' && token != 'b') {
            error = true;
        }
    }
    
    private void metodoB() {
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
    
    private void metodoC() {
        if(token == 'c') {
            token = siguienteCaracter();
        } else if(token != 'c' && token != 'd') {
            error = true;
        }
    }
    
}
