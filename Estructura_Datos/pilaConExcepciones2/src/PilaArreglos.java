
import java.nio.BufferOverflowException;
import java.util.NoSuchElementException;

/**
 *
 * @author Yazmin
 */
public class PilaArreglos {
    
    public String[] s;
    private int tope;

    public PilaArreglos( int capacidad ) {
    
        s = new String [ capacidad ]; 
    }
    
    public boolean isEmpty(){
    
        return tope == 0;
    }
    
    //inicio del metodo push
    public void push( String item ) 
           // throws BufferOverflowException
    {  
        try{   
            s[ tope ] = item;
            ++tope;  
        }
        catch( ArrayIndexOutOfBoundsException e ){    
            throw new BufferOverflowException();
        }
    }
    //finaliza el metodo push
    
    
    
    // inicio del metodo pop
    public String pop( ) 
            //throws NoSuchElementException
    {
        String item;
        
        try{
            -- tope;
            item = s [ tope ];
        }
        catch( ArrayIndexOutOfBoundsException e ){
            
            tope ++;
            throw new NoSuchElementException( "Pila Vacia" );

        }
        return item;
    } 
}
