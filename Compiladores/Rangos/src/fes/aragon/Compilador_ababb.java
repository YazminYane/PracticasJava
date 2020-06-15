package Fes.aragon;
import javax.swing.JOptionPane;

public class Compilador_ababb{

	private String cadena="";
	private int aceptar=1;
	private int error=0;
	private int indice=0;

	public static void main(String[] args){
		Compilador_ababb obj=new Compilador_ababb();
		obj.cadena=JOptionPane.showInputDialog("Dame la cadena");
		if(obj.aceptar==obj.estado_A()){
			JOptionPane.showInputDialog(null, "Valida");
		}else{
			JOptionPane.showInputDialog(null, "Invalida");
		}


	}

	private char siguienteCaracter(){
		char c=' ';
		if(indice<cadena.length()){
			c=cadena.charAt(indice);
			indice++;
		}
		return c;
	}

	private int estado_A(){
		char c=siguienteCaracter();
		switch(c){
			case 'a': return estado_B();
			case 'b': return estado_C();
				default: return error;

		}
	}
	private int estado_B(){
			char c=siguienteCaracter();
		switch(c){
			case 'a': return estado_D();
			case 'b': return estado_C();
				default: return error;
		}
	}
	private int estado_C(){
			char c=siguienteCaracter();
		switch(c){
			case 'a': return estado_B();
			case 'b': return estado_C();
				default: return error;
		}
	}

	private int estado_D(){
			char c=siguienteCaracter();
		switch(c){
			case 'a': return estado_B();
			case 'b': return estado_E();
				default: return error;
		}
	}

	private int estado_E(){
			char c=siguienteCaracter();
		switch(c){
			case 'a': return estado_B();
			case 'b': return estado_C();
			case ' ': return aceptar;
				default: return error;

	
	}
}
}

