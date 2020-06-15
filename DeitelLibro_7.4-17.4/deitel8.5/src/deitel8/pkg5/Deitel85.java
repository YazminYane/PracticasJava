//Ejercicio tomado del capitulo 8.5 del libro de Deitel 

package deitel8.pkg5;

/**
 *
 * @author Yazmin Yane
 */
public class Deitel85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Tiempo2 t1 = new Tiempo2();     //00:00:00
        Tiempo2 t2 = new Tiempo2( 2 );  //02:00:00
        Tiempo2 t3 = new Tiempo2( 21, 34 ); //21:34:00
        Tiempo2 t4 = new Tiempo2( 12, 25, 42 ); //12:25:42
        Tiempo2 t5 = new Tiempo2( t4 ); //12:25:42
        
        System.out.println( "Se construyo con:" );
        System.out.println( "t1: todos los argumentos predeterminados" );
        System.out.printf( "   %s\n", t1.aStringUnuversal() );
        System.out.printf( "   %s\n", t1.toString() );
        
        System.out.println( "t2: se especifico hora; minuto y segundo predeterminados" );
        System.out.printf( "    %s\n", t2.aStringUnuversal() );
        System.out.printf( "    %s\n", t2.toString() );
        
        System.out.println( "t3: se especifico hora y minuto; segundo predeterminados" );
        System.out.printf( "    %s\n", t3.aStringUnuversal() );
        System.out.printf( "    %s\n", t3.toString() );
        
        System.out.println( "t4: se especifico hora, minuto y segundo" );
        System.out.printf( "    %s\n", t4.aStringUnuversal() );
        System.out.printf( "    %s\n", t4.toString() );
        
        System.out.println( "t5: se especifico el objeto Tiempo2 llamado t4" );
        System.out.printf( "    %s\n", t5.aStringUnuversal() );
        System.out.printf( "    %s\n", t5.toString() );
        
        //intento de iniciar t6 con valores inválidos
        
        try{
            Tiempo2 t6 = new Tiempo2( 27, 74, 99 );
        }
        catch ( IllegalArgumentException  e ){
            System.out.printf( "\nException al inicializar t6: %s\n", e.getMessage() );
        }
    }
    
}
