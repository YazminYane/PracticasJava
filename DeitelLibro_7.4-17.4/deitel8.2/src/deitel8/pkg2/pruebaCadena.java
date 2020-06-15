//Esta clase no esta en el libro, muestra la funcion del metodo toString en una clase

package deitel8.pkg2;

/**
 *
 * @author Yazmin Yane
 */
public class pruebaCadena {

  int x;
  int y;
  
  public pruebaCadena( int a, int b){
    
      x = a;
      y = b;

  }
  
  public String regresaCadena(){
      
      //format le da formato a la salida de una cadena 
      return String.format( "La suma es: %d ", x + y );
  }
  
  public String toString (){
  
      return String.format( "Una multiplicación y su resultado es: %d ", x * y );
  }

}

