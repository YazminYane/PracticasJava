//Ejercicio que se realizo en clase
//crear el analizador sintactico que revise si la linea de codigo es correcto
//se realiza de acuerdo a las reglas de produccion 
//Gramatica: S := aAb ; A := c
//programa termindo 

package compiprograprueba;

/**
 *
 * @author Yazmin Yane
 */
public class AnalizadorSintacticoP10 {
    
    private String cadena; // cadena que se evaluara en la gramatica 
    private int indice;
    private String token; //cadena que contiene un caracter
    private boolean error;
   
    
    public AnalizadorSintacticoP10( String cadenaa ){ //inicio del constructor
        
        cadena = cadenaa;
        indice = 0;   
    }
    
    public void setError( boolean errorr ){ //establecer
    
        error = errorr;
    }
    
    public boolean getError(){ //obtener
    
        return error;
    }
    
    public String getToken(){ //metodo que divide cadena y lo guarda en un arreglo 
    
        token = null;
        if( indice < cadena.split( " " ).length ) //la cadena se divide por caracter y se mide su longitud
            token = cadena.split( " " )[ indice++ ]; //token es una cadena que va a contener los caracteres  
    
        return token;
    }
    
    public void metodo_A(){
        
        //si el arreglo no esta vacio  y token es igual a C (A:=c)
        if( token != null && token.equals( "c" ) ){
            token = getToken(); // token contiene al siguiente token
            return; 
        }else{ // si no es c
            token = getToken(); // toma el siguiente token del arreglo token
            error = true; // error se vulve verdadero 
        }
    }
    
    public void metodo_S(){ 
    
        if( token != null && token.equals( "a" ) ){
            token = getToken(); //toma el siguiente token 
            metodo_A(); // se manda a llamar por que el siguiente el siguiente token es un no termial
            
            if( token != null && token.equals( "b" ) ){
                token = getToken(); // toma el siguiente Token 
                
                if( token != null && token.equals( ";" ) ){ 
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
    
//    public static void main(String[] args) {
//      
//        AnalizadorSintactico1 app = new AnalizadorSintactico1();
//        app.token = app.getToken(); //
//        app.metodo_S(); // se manda a llamar primero por ser el axioma 
//        
//        if( app.error )
//            System.out.println( "Error de sintaxis" );
//        else
//            System.out.println( "Correcto" );
//    }//fin del main
    
   
}
