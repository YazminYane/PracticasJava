/**
 *
 * @author Yazmin
 */

public class PilaArreglos {
    
    public String[] s;
    private int tope;
    
    private void Redimensiona( int nuevaCapacidad ){
    
        String[] copia = new String [ nuevaCapacidad ];
        
        for ( int i = 0 ; i < tope ; i ++ )
            copia[ i ] = s[ i ];
            
        s = copia;
    }

    public PilaArreglos <Tipo> (  ) {
    
        s = new Tipo [ capacidad ]; 
    }
    
    public boolean isEmpty(){
    
        return tope == 0;
    }
    
    //inicio del metodo push
    public void push( String item ) {    
       
        if( tope == s.length )
            Redimensiona( 2 * s.length );
        
        s[ tope ] = item;
           tope ++;  
       
    }
    //finaliza el metodo push
   
    // inicio del metodo pop
    public String pop( ) {
        String item;
        
        if( tope == s.length/4 )
            Redimensiona ( s.length / 2 );
        
        item = s [ -- tope ];
       
        return item;
    }    
    
}
