package colacircular;

/**
 *
 * @author Yazmin
 */
public class Queu {
    
    int[] arr;
    private int inicio;
    private int fin;
    int capacidad;

    public Queu( int capacidad ) {
        
        inicio = fin = 0;
        arr = new int [ capacidad ];
        this.capacidad = capacidad;  
    }
    
    public int Siguiente( int i ){
    
        int ir;
        if( i >= capacidad )
            ir = 0;
        else
            ir = i + 1;
        
        return ir;
    }
    
    public boolean isEmpty(){
    
        return inicio == fin;
    }
    
    public boolean isFull(){
    
        return Siguiente ( fin ) == inicio;
    }
    
    public void push( int item ){
    
        if( !isFull() ){
        
            arr[ fin ] = item;
            fin = Siguiente( fin );
        }
    }
    public int pop(){
    
        int res = 0;
        if( !isEmpty() ){
        
            res = arr[ inicio ];
            inicio = Siguiente( inicio );
        }
        return res;
    }
}
