// se empezo en clase de tarea terminarlo 
// analizador sintactico de la expresion:
// S:= E;
// E:= (E)X | numX | (E) | num
// X:= *EX | +EX | *E | +E
// cada que envoca un getToken verifica si es un parentesis cerrado para afirmar la bandera 
// es un programa de prueba terminado  de AnalizadorSintactico3


// ; correcto
// ( ) ; / ( )error
// num + num ;  / num * num ;  correcto
// ( num + num ) ;  /  ( num * num ) ;  correcto
// ( num + num )  /  ( num * num )  error
// el ; en cualquier posicion que no sea el final   error
// ( num + num ) * ( num * num ) + ( num + num ) ; con cualquier cantidad de sumando o multiplicandos  correcto 
// ( num + num ) * ( num * num ) + ( num + num )  error
// ( num + num ) * ) ) ; / ( ( ( (  num + num ) * ; / ( (  * ( (  num + num ) ;  errror
// ) ) ) ) ) ;  /  error
// ) ;   error
// (  ) * ( num * num ) + ( num + num ) ; error
// ( num + num ) * (  ) + ( num + num ) ; error
// ( num + num ) * ( num * num ) + (  ) ; error
// ( num + num ) * ( num * num ) * ( num + num ) * (  ) ;  error
// ( num + num ) * ( num * num ) * (  ) * ( num + num ) ; error
// num * num * num + num ;   correcto
// ( num + num ) * ( num * num ) * ( num + num ) * num * num  ;  // correcto
// num + num ( * ) num * num ( + ) num + num ; // error
// ( num + num ) * ) ) ;  error
// ( ( ( ( ;  error
// ( ;  error
// ( num + num ) * num * num ) ) ) ) * ( num + num ) * num * num ;   error
// num + num  / num * num   error
// ( ( num + num ) * ( num * num ) ) ;  correcto
// ( ( num * num ) ) ;  correcto  

package verificar;

import java.util.ArrayList;

/**
 *
 * @author Yazmin Yane
 */
public class Verificar {
    
    private ArrayList< String > lista = new ArrayList< String >();
    private String cadena = "( ( num + num ) * ( num * num ) ) ;";
    private String token;
    private int indice = 0;
    private int longitud = 0;
    private boolean correcto = false;
    private boolean parentVacio = false;
   
    private String getToken(){
        
        longitud = cadena.split(" ").length ;
        
        token = null;
        if( indice < cadena.split(" ").length )
            token = cadena.split(" ")[ indice ++ ];
        
        return token;
    
    }
    
    private void metodo_S(){
        
        metodo_E();
        if( token != null && token.equals( ";" ) && ( indice == longitud ) && 
                parentVacio != true && lista.size() == 0 ){
            correcto = true;
        }
        else{
            return;
        }
    }

    private void metodo_E(){
    
        if( token != null && token.equals( "(" ) && !token.equals( ";" )  ){
            lista.add( "(" );
 
            if ( token != null && !token.equals( ")" ) ){
                token = getToken();
                metodo_E();
                
                if (token != null && token.equals( ")" ) ){
                    token = getToken();

                    lista.remove( "(" );
                    metodo_X();
                }
            }
        }
        else {
        
            if( token != null && token.equals( "num" ) ){
                token = getToken();
            
                if( token.equals( ")" ) )
                    lista.remove( "(" );
                
                if( token != null &&  !token.equals( ";" ) )
                    metodo_X();
                
            }else {
                
                if ( token.equals( ";" ) ){

                    return;
                }
                else{
                    
                    parentVacio = true ;
                    return;
                }   
            }
        } // fin del else del if mas esterno
    }// fin de la clase metodo_E();

    private void metodo_X(){
        
        if( token != null && token.equals( "*" ) ){
            token = getToken();
            metodo_E();
            
            if( token != null && !token.equals( ";" ) ){
                token = getToken();
                metodo_X();
                
            }
        }else if( token != null && token.equals( "+" ) ){
            token = getToken();
            metodo_E();
            
            if( token != null && !token.equals( ";" ) ){
                token = getToken();
                metodo_X();
                
            }
        }
    }//fin del metodo_X

    public static void main(String[] args) {
        
        Verificar  app = new Verificar();
        app.token = app.getToken();
        app.metodo_S();
        
        System.out.println( app.correcto ? "Correcto" : "Error" );
        
     } // fin del main
}// fin de la clase verifica 
