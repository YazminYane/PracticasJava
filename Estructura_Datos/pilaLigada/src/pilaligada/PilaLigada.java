/** Este programa muestra una pila ligada y funciona para una infinidad de datos
  ya que al crear un nodo este apunta al otro nodo que esta antes y, asi sucesivamente **/

package pilaligada;

/**
 *
 * @author Yazmin
 */
public class PilaLigada {

    public static void main(String[] args) {
        
        PilaLigV1 miPila= new PilaLigV1( );
  
        miPila.Push(1);
        miPila.Push(2);
        miPila.Push(3);
        miPila.Push(4);
        miPila.Push(7);
        miPila.Push(8);
        miPila.Push(9);
        miPila.Push(0);
        miPila.Pop();
        miPila.Pop();
        miPila.Pop();
        miPila.Pop();
        miPila.Pop();
        miPila.Pop();
        miPila.Push(1);
        miPila.Push(2);
        
         
    }   
}
