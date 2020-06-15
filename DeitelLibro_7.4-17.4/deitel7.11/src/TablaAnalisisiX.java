
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yazmin Yane
 */

//S = ABC ; 
//A = c | b | L
//B = abC | L
//C = d 

public class TablaAnalisisiX {
    
    private String cadena = "";
    private int indice = 0;
    private char token;
    private boolean error = false;
    
    public char siguienteCaracter() {
        char c = ' ';
        
        if (indice < cadena.length()) {
            c = cadena.charAt(indice);
            indice++;
        }
        
        return c;
    }
    
    public void metodo_S(){
        
        token = siguienteCaracter();
        metodo_A();
        metodo_B();
        metodo_C();
        
        token = siguienteCaracter();
        
        if( token != ';' )
            error = true;
            
        
    }
    public void metodo_A(){
        
        if ( token == 'c' || token == 'b'  || token == 'a' ){
            
            token = siguienteCaracter();
            return;
        }
        else if( token != 'd' )
                error = true;
        
    }
    
    public void metodo_B(){
        
        if ( token == 'a' ){
            
            token = siguienteCaracter();
            
            if( token == 'b'){
                
                token = siguienteCaracter();
                metodo_C();
            }
            
        }else{
            
            if( token != 'd')
               error = true;
                   
        } 
    
    }
    
    public void metodo_C(){
    
        if ( token != 'd' )
            error = true;
    }
 
    
     public static void main(String[] args) {
        TablaAnalisisiX app = new TablaAnalisisiX();
        app.cadena = JOptionPane.showInputDialog("Cadena: ");
        
        if(!app.cadena.isEmpty()) { 
            app.metodo_S();
            
            if(!app.error) {
                System.out.println("Wujuuu");
            } else {
                System.out.println("Chale");
            }
        }
    }



    
}
