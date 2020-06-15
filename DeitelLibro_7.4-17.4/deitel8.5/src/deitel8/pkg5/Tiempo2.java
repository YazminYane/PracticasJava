/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel8.pkg5;

/**
 *
 * @author Yazmin Yane
 */
public class Tiempo2 {
    
    private int hora;       //0-23
    private int minuto;     //0-59
    private int segundo;    //0-59
    
   //inicializa cada variable de instancia en 0 
   public Tiempo2(){
   
       this( 0, 0, 0 );
   }
   
   public Tiempo2( int h ){
   
        this( h, 0, 0 ); 
   }
   
   public Tiempo2( int h, int m ){
   
        this( h, m, 0 ); 
   }
   
   public Tiempo2( int h, int m, int s){
   
       establecerTiempo( h, m, s );
   }
   
   //se manda a inicializar un objeto de esta clase, con otro objeto de la misma clase  
    public Tiempo2( Tiempo2 tiempo ){
   
        this( tiempo.obtenerHora(), tiempo.obtenerMinuto(), tiempo.obtenerSegundo() ); 
   }
    
   public void establecerTiempo ( int h, int m, int s ){
   
       establecerHora( h );
       establecerMinuto( m );
       establecerSegundo( h );
   }
   
   //valida y establece la hr.
   public void establecerHora( int h ){
   
       if( h >= 0 && h < 24 )
           hora = h;
       else
           throw new IllegalArgumentException( "Hora debe ser de 0 a 23" );
   }
   
   public void establecerMinuto( int m ){
   
       if( m >= 0 && m <= 60 )
           minuto = m;
       else 
           throw new IllegalArgumentException( "Minutos deben ser de 0 a 59" ); 
   }
   
   public void establecerSegundo( int s ){
   
       if( s >= 0 && s <= 60 )
           segundo = s;
       else
           throw new IllegalArgumentException( "Segundo debe ser de 0 a 60" );
   }

    //metodos "obtener"
    //Obtiene el valor de la hora 
   public int obtenerHora(){
   
        return hora;
   }
   
   public int obtenerMinuto(){
   
       return minuto; 
   }
   
   public int obtenerSegundo(){
       
       return segundo;
   }
   
   public String aStringUnuversal(){
   
       return String.format( "%02d:%02d:%02d", obtenerHora(), obtenerMinuto(), obtenerSegundo() );
   }
   
   public String toString (){
   
       return String.format( "%d:%02d:%02d %s", 
               ( ( obtenerHora() == 0 || obtenerHora() == 12) ? 12 :obtenerHora() % 12 ),
               obtenerMinuto(), obtenerSegundo(), ( obtenerHora() < 12 ? "AM" : "PM" ) );
   } 
}
