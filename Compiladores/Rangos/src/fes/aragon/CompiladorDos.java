package fes.aragon;
import javax.swing.JOptionPane;

public class CompiladorDos{

	private String cadena="";
        private boolean aceptar = false;
	private int error=0;
	private int indice=0;
        private int estado=1;
        private char simbolo;
        
        //Inician métodos.
        
        private char siguienteCaracter(){
		char c=' ';
		if(indice<cadena.length()){
			c=cadena.charAt(indice);
			indice++;
		}
		return c;
	}
        //Fin métodos.
        //Inicio Principal.
	public static void main(String[] args){
		CompiladorDos obj=new CompiladorDos();
                Rangos rango=new Rangos();
		obj.cadena=JOptionPane.showInputDialog("Dame la cadena");
		obj.simbolo=obj.siguienteCaracter();
                while (obj.simbolo!= ' ' || obj.error !=0) {
                    switch (obj.estado){
                        case 1:
                            if (rango.rangosaz_AZ(obj.simbolo)){
                                obj.estado=3;
                            }else if (rango.rangos09(obj.simbolo)){
                                obj.estado=2;
                            }else {
                                obj.error=0;
                            }
                            break;
                        case 2:
                            obj.error=0;
                            break;
                        case 3:
                            if (rango.rangosaz_AZ(obj.simbolo)){
                                obj.estado=3;
                                obj.aceptar=true;
                            }else if(rango.rangos09(obj.simbolo)){
                                obj.estado=2;
                                obj.aceptar=true; 
                            }else{
                                obj.error=0;
                            }
                            break;
                    }
                    obj.simbolo=obj.siguienteCaracter();
                }
                 if (!obj.aceptar) {
                     JOptionPane.showMessageDialog(null, "Invalido");
                 }else{
                     JOptionPane.showMessageDialog(null, "Valido");
                 }

	}
        //Fin principal.

	
}
