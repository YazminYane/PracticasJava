//libro de calificaciones que utiliza un arreglo para almacenar las calificaciones de una prueba 
package deitel7.pkg8;

/**
 *
 * @author Torre I
 */
public class LibroCalificaciones {
 
    private String nombreDelCurso;
    private int[] calificaciones;
    
    public LibroCalificaciones( String nombre, int[] arregloCalif ){
    
        nombreDelCurso = nombre;
        calificaciones = arregloCalif;
    }
    
    public void establecerNombreDelCurso( String nombre ){
    
        nombreDelCurso = nombre;
    }
    
    public String obtenerNombreDelCurso(){
    
        return nombreDelCurso;
    }
    
    public void mostrarMensaje(){
    
        System.out.printf("Bienvenido al libro de calificiaciones para\n%s!\n\n", obtenerNombreDelCurso() );
    }
    
    public void procesarCalificaciones(){
    
        imprimirCalificaciones();
        
        System.out.printf( "\nEl rpomedio de la clase es %.2f\n", obtenerPromedio() );
        
        System.out.printf("La calificacion mas baja es: %d\nLa calificacion mas alta es: %d\n\n",
                obtenerMinima(), obtenerMaxima() );
        
        imprimirGraficoBarras();
    }
    
    public int obtenerMinima(){
    
        int califBaja = calificaciones [ 0 ];
        
        for( int calificacion : calificaciones ){
        
            if ( calificacion < califBaja)
                califBaja = calificacion;
        }
        return califBaja;
    }
    
    public int obtenerMaxima(){
    
        int califMaxima = calificaciones [ 0 ];
        
        for( int calificacion : calificaciones ){
        
            if ( calificacion > califMaxima)
                califMaxima = calificacion;
        }
        return califMaxima;
    }
    
    public double obtenerPromedio(){
    
        int total = 0;
        
        for( int calificacion: calificaciones )
            total += calificacion;
        
        return ( double )total / calificaciones.length;
    }
    
    public void imprimirGraficoBarras(){
    
        System.out.println("Distribucion de Calificciones:");
        
        int [] frecuencia = new int [ 11 ];
        
        //para cada calificacion, incremementa la frecuencia apropiada
        for( int calificacion: calificaciones )
            ++frecuencia[calificacion / 10];
        
        for( int cuenta = 0; cuenta < calificaciones.length; cuenta ++ ){
        
            if( cuenta == 10)
                System.out.printf( "%5d: ", 100 );
            else 
                System.out.printf( "%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);
            
            for( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas ++ )
                System.out.print("*");
            
            System.out.println("");
        }
    }
    
    public void imprimirCalificaciones(){
    
        System.out.println("Las calificaciones son: \n");
        
        for( int estudiante = 0; estudiante < calificaciones.length; estudiante ++ )
            System.out.printf("Estudiante %2d: %3d\n", estudiante + 1, calificaciones[ estudiante ] );
    }
}
