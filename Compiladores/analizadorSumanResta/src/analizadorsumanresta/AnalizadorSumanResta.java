/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//DUDA ; donde se deben validar 
package analizadorsumanresta;

/**
 *
 * @author Yazmin Yane
 */
public class AnalizadorSumanResta {
    
    private String cadena = "num + num ;";
    private String token;
    private int indice = 0;
    private int longitud;
    private boolean correcto = false;
    
     private String getToken(){
        
        longitud = cadena.split(" ").length ;
        
        token = null;
        if( indice < cadena.split(" ").length )
            token = cadena.split(" ")[ indice ++ ];
        
        return token; 
    }
     
    private void metodo_S(){
    
        metodo_E();
        if( token != null && token.equals( ";" ) && longitud == cadena.length() )
            correcto = true;
        else
            return;
    }
    
    private void metodo_E(){
         
        if ( token != null && token.equals( "num" )&& !token.equals( ";" ) ){
            token = getToken();
            metodo_X();
            
        }else
            return;
    
    }
    
    private void metodo_X(){
    
        if( token != null && !token.equals( "+" ) ){
            token = getToken();
            metodo_E();
            
            if ( token != null && !token.equals( ";" ) ){
                token = getToken();
                metodo_X();
            }
        
        }else{
            if( token != null && !token.equals( "-" ) && !token.equals( ";" ) ){
                token = getToken();
                metodo_X();
                
                if( token != null && !token.equals( ";" ) ){
                    token = getToken();
                    metodo_X();
                    
                }       
            }
        } 
    }
    
  
    public static void main(String[] args) {
        AnalizadorSumanResta  app = new AnalizadorSumanResta();
        app.token = app.getToken();
        app.metodo_S();
        
        System.out.println( app.correcto ? "Correcto" : "Error de Sintaxis" );
    }
    
}
