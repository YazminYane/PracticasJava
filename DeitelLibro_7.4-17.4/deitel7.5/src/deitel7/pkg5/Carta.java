
package deitel7.pkg5;

public class Carta {
    
    private String cara;
    private String palo;
    
    public Carta( String caraCarta, String paloCarta){
    
        cara = caraCarta; 
        palo = paloCarta;        
    }
    
    //devuelve la representacion string de carta
    public String toString(){
    
        return cara + " de " + palo;
    }
    
}
