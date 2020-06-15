//Este programa se empezo en clase y de tarea terminarlo 
//corresponde a la Gramatica: ( no se la expresion)
//acepta las combinaciones:
//true and true/ false ; y false and true/false ;
//marca error si no se tiene ; al final o alguna palabra fuera de la gramatica
//terminado 

package compiprograprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Yazmin Yane
 */
public class AnalizadorSintactico2P11 {
    
    private String cadena;
    private int indice;
    private boolean correcto = false;
    private String token = "";
    
    
    public AnalizadorSintactico2P11( String cadenaa ){
        
        cadena = cadenaa;
        indice = 0;
        token = "";
    }
    
    public void setCorrecto( boolean correctoo ){ //establecer
    
        correcto = correctoo;
    }
    
    public boolean getCorrecto(){ //obtener
    
        return correcto;
    }
    
    public String getToken() {

        if (indice < cadena.split(" ").length) 
            token = cadena.split(" ")[indice++];
   
        return token;
    }
    
    public void metodo_S(){
        
        metodo_T();
        if( token != null && token.equals( "and" ) ){
            token = getToken();
            metodo_S();
        }else if( token != null && token.equals( ";" ) ){
            correcto = true ;
        }else{
            return;
        }
        
    }
    
    public void metodo_T(){
    
        if( token != null && ( token.equals( "true" ) || token.equals( "false" ) ) ){
            token = getToken();
        }else{
            return;  // solo retorna al metodo que lo llamo, correcto se mantiene en falso  
        }
    }

//    public static void main(String[] args) {
//        
//        AnalizadorSintactico2 app = new AnalizadorSintactico2();
//        app.cadena = JOptionPane.showInputDialog("Cadena:");
//        app.token = app.getToken();
//        app.metodo_S();
//        
//        System.out.println( app.correcto ? "correcto" : "Error de sintaxis" );
//
//    }// fin del metodo main
}
