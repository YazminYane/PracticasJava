// este automata corresponde a la expresion 2 de tarea

package analizadortablaestatco; 

/**
 *
 * @author Yazmin Yane
 */
public class Automata {
    
    int estadoActual;
    char caracter;  
    int[][] MT = { { 1, 2, 3 }, { 1, 2, 4 }, { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 4} }; //Tabla de transicion 
    
    public Automata(){
    
        estadoActual = 0;
    }
    
    public int clasificaCaracter( char caracter ){
    
        int resultado = 0;
        
        switch( caracter ){
            
            case 'a': 
                resultado = 0;
                break;
            case 'b':
                resultado = 1;
                break;
            case 'c':
                resultado = 2;
                break;
            default: 
                resultado = 4;
                break;
        }
        return resultado;
    }
    
    public void evalua( char caracter ){
        
        estadoActual = MT[ estadoActual ][ clasificaCaracter( caracter ) ];
    
    }
    
    public void Aceptado( ){
        
       if( estadoActual == '' )
           
           
    }
    
   
    
    
}
