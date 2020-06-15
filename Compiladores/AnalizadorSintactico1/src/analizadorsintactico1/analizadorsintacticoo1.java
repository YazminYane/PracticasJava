//Ejercicio que se realizo en clase
//crear el analizador sintactico que revise si la linea de codigo es correcto
//se realiza de acuerdo a las reglas de produccion 
//Gramatica: S := aAb ; A := c
//programa termindo 

package analizadorsintactico1;

/**
 *
 * @author Yazmin Yane
 */
public class analizadorsintacticoo1 {

    private String cadena =  "a c b;"; // cadena que se evaluara en la gramatica 
    private int indice = 0;
    private char token; //cadena que contiene un caracter
    private boolean error = false;

    
    public char getToken(){
        char c = ' ';
        if( indice < cadena.length() ){
            c = cadena.charAt( indice );
            indice ++;
        }
        return c;
    }
    
    private void metodo_A(){
        
        //si el arreglo no esta vacio  y token es igual a C (A:=c)
        if( token != ' ' && token == 'c' ){
            token = getToken(); // token contiene al siguiente token
            return; 
        }else{ // si no es c
            token = getToken(); // toma el siguiente token del arreglo token
            error = true; // error se vulve verdadero 
        }
    }
    
    //metodo que corresponde a la regla de producion aAb
    private void metodo_S(){ 
    
        if( token != ' ' && token == 'a' ){
            token = getToken(); //toma el siguiente token 
            metodo_A(); // se manda a llamar por que el siguiente el siguiente token es un no termial
            
            if( token != ' '  && token == 'b' ){
                token = getToken(); // toma el siguiente Token 
                
                if( token != ' '  && token == ';'  ){ 
                    return; //retorna falso si  el siguiente token es ;
                }else{
                    error = true; // si el siguiente token es diferente de ;
                }// fin del else
            }else{
                error = true;
            }// fin del 2do if el interno
            
        } else {
            error = true;
        } //fin del 1er if 
    }// fin del metodo_S()
    
    
    public static void main(String[] args) {
      
        analizadorsintacticoo1 app = new analizadorsintacticoo1();
        app.token = app.getToken(); //
        app.metodo_S(); // se manda a llamar primero por ser el axioma 
        
        if( app.error )
            System.out.println( "Error de sintaxis" );
        else
            System.out.println( "Correcto" );
    }//fin del main

    
}
