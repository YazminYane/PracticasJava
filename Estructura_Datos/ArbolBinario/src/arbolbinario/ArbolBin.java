package arbolbinario;

/**
 *
 * @author Yazmin
 */
public class ArbolBin {
    
    class NodoBin{
    
        int conta;
        int item;
        NodoBin izq;
        NodoBin der;
    
        NodoBin(){
        
            izq = der = null;
            item = 0;
            conta = 1;
        }
        
        NodoBin( int dato )
        {
            izq = der = null;
            item = dato;
            conta = 1;
        }
    }
    
    NodoBin raiz;
    ArbolBin(){
    
        raiz = null;
    }
    
    void insertar ( int dato ){
    
    insertar ( raiz, dato );
    
    }
}
