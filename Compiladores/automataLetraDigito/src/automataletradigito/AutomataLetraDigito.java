//Automata 2, este ejercicio se dejo de tarea 
//este automata indica si una variables es declarada correctamente
// (a-z)*1-9*
//las variables pueden ser letras yas sean mayusculas o minusculas y numeros, no acepta solo números 
//programa terminado

package automataletradigito;
import javax.swing.JOptionPane;

public class AutomataLetraDigito {
    
    private String cadena;
    private boolean correcto = false;
    int indice = 0;
    private int estado = 0;

    private char getChar(){

        char letra = ' ';
       
        if( indice < cadena.length() ){
            letra = cadena.charAt( indice );
            indice++;
        }
        
        return letra;
    }
    
    private void clasifica(){
    
        char c = getChar();
          
        if( Character.isLetter( c ) ){
            estado = 1;
        }else{
            if( Character.isDigit( c ) )
                estado = 2;
            else{
                if( c == ' ')
                    estado = 3;
                else
                    estado = 4;
            }
        }        
    }//fin de la clase
    
    
    private boolean esLetra(){
        
        clasifica();
       
        switch( estado ){
            case 1: 
               return esLetra();
            case 2: 
                if ( indice > 1)
                    return esDigito();
                else
                    return correcto;
            case 3:
                return correcto = true;
            default:
               return correcto;
        }
    }
    
    private boolean esDigito(){
   
        clasifica();

        switch( estado ){
            case 1: 
                return esLetra();
            case 2: 
                return esDigito();
            case 3:
                return correcto = true;
            default:
               return correcto;
        }//fin del switch
    }

  
    public static void main(String[] args) {
       
        AutomataLetraDigito auto = new AutomataLetraDigito();
        
        auto.cadena = JOptionPane.showInputDialog( "Dame la cadena" );
        auto.esLetra(); //mandar a llamar el primer metodo, las variables no pueden empezar con numeros
        System.out.println( auto.correcto ? "Cadena Valida" : "Cadena invalida" );    
    }
}
