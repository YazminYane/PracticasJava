//Para la clase ArrayList no se puden utilizar tipos de datos primitivos pero si algun tipo de objeto
// de cierta clase, para usar. Para utilizarlo con tipos de datos primitivos se debe usar sus clases envolventes
//Integer o String

package deitel7.pkg14;
import java.util.ArrayList;

public class Deitel714 {
  
    public static void main(String[] args) {

        //crea un nuevo arraylist 
         ArrayList< String > elementos = new ArrayList< String >();
         
         elementos.add( "Rojo" ); //adjuntar un elemento a la lista 
         elementos.add( 0, "Amarillo" ); //inserta un valor en un indice determinado
         
         System.out.printf( "Mostrar contentenid de lista con ciclo controlado por contador:"  );
         
         //Muestra los coles en la lista
         for( int i = 0; i < elementos.size(); i++ ) //.size devuelve el numero de elementos almacenado en el array
             System.out.printf( " %s", elementos.get( i ) ); //.get 
         
       
         //muestra los colores utilizando foreach en el metodo mostrar
         mostrar( elementos, "\nMostrar contenido de lista con intruccion for mejorada:" );
         elementos.add( "Verde" );
         elementos.add( "Amarillo" );
         mostrar( elementos, "Lista con dos nuevos elementos:" );
         
         elementos.remove( "Amarillo" ); //elimina el primer amarillo
         mostrar( elementos, "Eliminar primera instancia de amarillo:"  );
         
         elementos.remove( 1 );
         mostrar( elementos, "Elimina el segundo elemento de la lista( verde ):" );
         
         //verifica si hay algun valor en la lista 
         System.out.printf( "\"rojo\" %sesta en la lista\n", elementos.contains("rojo") ? "" : "no" ); 
         
         //muetsra el numero de elemntos en la lista
         System.out.printf( "Tamanio:%s\n", elementos.size() );
         
         
//        //ejemplo: ( no aparece en el libro este ejercicio )
//        ArrayList< Integer > numeros = new ArrayList < Integer >();
//        
//        numeros.add(10);
//        numeros.add(11);
//        numeros.add(12);
//        numeros.add(13);
//        numeros.add(14);
//        numeros.add(13);
//        numeros.add(15);
//        
//        for( int numero : numeros )
//            System.out.printf( "%d\n", numero ); 
//        
//        System.out.printf( "El numero 10 %s\n", numeros.contains(10)? "si exite" :"no existe" );
//        
//        System.out.printf( "ArrayList continene %d elementos\n", numeros.size() );
//        System.out.printf( "%d, %d, %d\n", numeros.get(0), numeros.get(1), numeros.get(6));
//        
//        System.out.printf( "La 1ra. poscion en donde se repite el numero 13 es %d\n", numeros.indexOf(13));
//        
//        numeros.remove( 3 );
//        System.out.printf( "ArrayList continene %d elementos\n", numeros.size() );
//        System.out.println( "Lista de los elemetos despues de eliminar el elemnto 3" );
//        for( int numero : numeros )
//            System.out.printf( "%d\n", numero );
//        
//        numeros.clear();
//        System.out.println( "Elemetos despues de limpiar la lista:" );
//         for( int numero : numeros )
//            System.out.printf( "%d\n", numero );
     
    }
    
    public static void mostrar( ArrayList<String>elementos, String encabezado ){
    
        System.out.print( encabezado );
        
        for( String elemento: elementos )
            System.out.printf( " %s", elemento );
        System.out.println("");
    }
}
