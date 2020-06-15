//uso implicito y explicito de this para hacer referencia a los miembros de un objeto

package deitel8.pkg4;

public class Deitel84 {  //esta clase publica puede ser usada por el paquete 

    public static void main(String[] args) {
 
        TiempoSimple tiempo = new TiempoSimple( 15, 30, 19 );
        System.out.println( tiempo.crearString() );
    } //fin del main   
}//fin de la clse deitel84

class TiempoSimple{  //esta no puede ser usada por el paquete, solo por 
                        //la clase Deitel84 no debe ser publica o marcara error
    
        private int hora;
        private int minuto;
        private int segundo;
        
        // si el constructor utiliza nombres de parametros identicos a 
        // los nombres de las variables de instancia, se requiere la
        //la referencia "this" para diferenciar unos nombres de otros 
        public TiempoSimple( int hora, int minuto, int segundo ){
        
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;   
        }
        
        //usa la referencia "This" explicita e implica para llamar aStringUniversal
        public String crearString( ){
        
            return String.format( "%24s: %s\n%24s: %s",
                                  "this.aStringUniversal()", this.aStringUniversal(),
                                  "aStringUniversal()", aStringUniversal() );
        }
        
        public String aStringUniversal(){
        
            //"this" no se requiere aqui para acceder a las variables de instancia
            //ya que el metodo no tiene variables locales con los mismos
            //nombres que las variables de instancia
            return String.format( "%02d:%02d:%02d", this.hora, this.minuto, this.segundo );
        }
    }

