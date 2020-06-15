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
    
    //inicio del metodo push
    public void push( String item ){
    
        if( tope < s.length )
            s[ tope ++ ] = item;
    }
    //finaliza el metodo push
    
    // inicio del metodo pop
    public String pop(){
    
        String buff = ""; // declaracion de una cadena
        if( tope > 0 )  // si los datos introducidos sobrepasa el tope
            buff = s[ -- tope ]; //guarda el dato en una subcadena para poder imprimirlo  
            
        return buff;
    }
        /** Formas de escrribir un String nulo : String str=""; / String str=new String();
	El String nulo es aquel que no tiene caracteres pero es un objeto de la clase String **/
    //finaliza metodo pop
    
}
