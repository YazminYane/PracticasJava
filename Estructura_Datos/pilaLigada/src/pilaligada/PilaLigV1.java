package pilaligada;
import java.nio.BufferUnderflowException;

/**
 *
 * @author Yazmin
 */
public class PilaLigV1 {
    
    private NodoPilaV1 tope;
    
    public PilaLigV1() {
    
        tope = null;
    }
    
    void Push ( int item ){
    
        NodoPilaV1 aux = new NodoPilaV1( item, tope );
        tope = aux;
        
    }
    
    int Pop(){
    
        int item;
        
        try{
            item = tope.GetItem();
            tope = tope.getLigaDer();
        }
        catch( NullPointerException e){
            System.out.println("FALLO: underflow");
            throw new BufferUnderflowException();
        }
        return item;
    }  
}
