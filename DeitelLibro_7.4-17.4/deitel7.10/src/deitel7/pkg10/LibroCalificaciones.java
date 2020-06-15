
package deitel7.pkg10;

/**
 *
 * @author Torre I
 */
public class LibroCalificaciones {
  
    private String nombreDelCurso;
    private int[][] calificaciones;
    
    public LibroCalificaciones( String nombre, int[][] arregloCalif ){
    
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
        
        System.out.printf( "\n%s %d\n%s %d\n\n",
                "La calificacion mas baja en el libro de calificaciones es", obtenerMinima(), 
                "La calificacion mas alta en el libro de calificaciones es", obtenerMaxima() );
        
        imprimirGraficoBarras();
    }
    public int obtenerMinima(){
    
        int califBaja = calificaciones [ 0 ][ 0 ];
        
        //itera atraves de la fila del arreglo 
        for ( int [] califEstudiantes : calificaciones ){
        
            //itera a traves de las columnas de la fila actual
            for ( int calificacion: califEstudiantes ){
            
                if( calificacion < califBaja )
                    califBaja = calificacion;
            }
        }
        return califBaja;
    }
    
    public int obtenerMaxima(){
    
        int califAlta = calificaciones [ 0 ][ 0 ];
        
        for( int [] califEstudiantes : calificaciones){
        
            for( int calificacion : califEstudiantes ){
            
                if ( calificacion > califAlta)
                    califAlta = calificacion;
            }      
        }
        return califAlta;
    }
    
    public double obtenerPromedio( int[] conjuntoDeCalif ){
    
        int total = 0; 
        
        for( int calificacion : conjuntoDeCalif)
            total += calificacion;
        
        return ( double )total/conjuntoDeCalif.length;    
    }
    
    public void imprimirGraficoBarras(){
    
        System.out.println( "Distribucion de calificaciones en general:" );
        
        int[] frecuencia = new int[11];
        
        for ( int[] califEstudiantes : calificaciones ){
        
            for ( int calificacion : califEstudiantes )
                ++frecuencia[ calificacion / 10 ]; 
        }//fin del 1er for
        
        for( int cuenta = 0; cuenta < calificaciones.length; cuenta++ ){
            
            if( cuenta == 10 )
                System.out.printf( "%5d: ", cuenta );
            else
                System.out.printf( "%02d-%02d: ", cuenta * 10, cuenta * 10 + 9 );
        
            for( int estrellas = 0; estrellas < frecuencia[ cuenta ]; estrellas ++ )
                   System.out.print("*");
            
            System.out.println("");      
        }//fin del 2do for 
    }//fin del metodo imprimirGraficoBaras
    
    public void imprimirCalificaciones(){
        
        System.out.println("Las califcaciones son:\n");
        System.out.print("               "); //alinea encabezados de columnas
        
        //este for itera en la fila 0 y .length obtine su longitud  
        for( int prueba = 0; prueba < calificaciones[ 0 ].length; prueba ++ )
            System.out.printf( "prueba %d  ", prueba + 1 );
        
        System.out.println("Promedio");
        
        for( int estudiante = 0; estudiante < calificaciones.length; estudiante ++ ){
        
            System.out.printf("Estudiante %2d", estudiante + 1 );
            
            for( int prueba : calificaciones[ estudiante ] )
                System.out.printf( "%10d", prueba );
            
            double promedio = obtenerPromedio( calificaciones[ estudiante ] );
            System.out.printf( "%10.2f\n", promedio );
        } 
    
        
    }
}
