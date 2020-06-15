/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiprogramas;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class AutoTablaEstaticaP3 {
    
    private int transiciones[][] = { {1, 2, 3}, {1, 2, 4}, {1, 2, 3},
                                    {1, 2, 3}, {1, 2, 4}};
     private int actual;
    private String cadena;
    private int indice;

    public AutoTablaEstaticaP3( String cadenaa) {
        this.actual = 0;
        this.cadena = cadenaa;
        this.indice = 0;
    }

    public char siguienteCaracter(){
        char c = ' ';
        
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        
        return c;
    }
    
    public int analizarCadena() {
        int respuesta = 0;
        int error = 0;
        
        char cActual = siguienteCaracter();
        
        while (cActual != ' ' && error == 0) {
            switch (actual) {
                case 0:
                case 2:
                case 3:
                    
                    switch (cActual) {
                        case 'a':
                            actual = 1;
                            respuesta = 1;
                            break;
                        case 'b':
                            actual = 2;
                            break;
                        case 'c':
                            actual = 3;
                            break;
                        default:
                            error = 1;
                            respuesta = 0;
                    }
                    break;
                    
                case 1:
                case 4:
                    
                    switch (cActual) {
                        case 'a':
                            actual = 1;
                            respuesta = 1;
                            break;
                        case 'b':
                            actual = 2;
                            respuesta = 0;
                            break;
                        case 'c':
                            actual = 4 ;
                            respuesta = 1;
                            break;
                        default:
                            error = 1;
                            respuesta = 0;
                    }
                    break;   
            }
            
            cActual = siguienteCaracter();
        }
        
        return respuesta;
    }
    
//   
//    public static void main(String[] args) {
//        Lexico3 app = new Lexico3();
//        
//        app.cadena = JOptionPane.showInputDialog("Cadena:");
//        int respuesta = app.analizarCadena();
//        
//        if (respuesta == 1) {
//            JOptionPane.showMessageDialog(null, "Cadena Valida");
//        } else {
//            JOptionPane.showMessageDialog(null, "Cadena Invalida");
//        }
//    }
}
