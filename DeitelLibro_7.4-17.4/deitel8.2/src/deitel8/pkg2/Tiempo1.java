/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel8.pkg2;

/**
 *
 * @author Yazmin Yane
 */
public class Tiempo1 {
    
    private int hora;
    private int minuto;
    private int segundo;
    
    public void establecerTiempo( int h, int m, int s ){
    
        if( ( h >= 0 && h < 24) && ( m >= 0 && m < 60 ) && ( s >= 0 && s < 60) ){
        
            hora = h;
            minuto = m;
            segundo = s;
        }
        else
            throw new IllegalArgumentException( "hora, minuto y/o segundo estaban fuera de rango" );    
    }
    
    public String aStringUniversal(){
    
        return String.format("%02d : %02d : %02d", hora, minuto, segundo);
    }
    
    public String toString(){
    
        return String.format( "%d : %02d : %02d %s", ( ( hora == 0 || hora == 12 ) ? 12 : hora % 12 ),
                minuto, segundo, ( hora < 12 ? "AM" : "PM" ) );
          
    }
}
