/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaligada;

/**
 *
 * @author Yazmin
 */
public class NodoPilaV1 {
    
    private int item; // se almacena el dato del nodo 
    private NodoPilaV1 ligaDer; //apunta a otro nodo 

    public NodoPilaV1() {
    
        item = 0;
        ligaDer = null;
    }

    public NodoPilaV1(int item, NodoPilaV1 ligaDer) {
        
        SetItem( item );
        SetLiga( ligaDer );
    }
    
    void SetItem( int item ){
    
        this.item = item;  /** this : Esta referencia se suele usar para pasar una referencia 
                              al objeto actual como un parámetro para otros métodos **/
    }
    
    void SetLiga( NodoPilaV1 nodo ){
    
        this.ligaDer = nodo;
    }
    
    int GetItem( ){
    
        return this.item;
    }
    
    NodoPilaV1 getLigaDer(){
    
        return this.ligaDer;
    } 
}

