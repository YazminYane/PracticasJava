/**
 *
 * @author Yazmin
 */

public class PilaArreglos {
 
    private String[] s;
    private int tope;

    public PilaArreglos( int capacidad ) {
    
        s = new String [ capacidad ]; 
    }
    
    public boolean isEmpty(){
    
        return tope == 0;
    }
    
    public void push( String item ){
    
        s[ tope ++ ] = item;
    }
    
    public String pop(){
    
        return s[ -- tope ];
    }
}