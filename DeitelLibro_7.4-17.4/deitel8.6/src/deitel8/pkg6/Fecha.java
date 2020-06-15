/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel8.pkg6;

/**
 *
 * @author Yazmin Yane
 */
public class Fecha {
    
    private int mes; //1-12
    private int dia; //1-31 con base en el mes
    private int anio; //cualquier año 
    
    //declaracion de un arreglo como constante 
    private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    //constructor: llama a comprobarMes para confirmar el valor apropiado para el mes 
    //llama a comprobarDia para confirmar el valor apropiado para el dia 
    public Fecha( int elMes, int elDia, int elAnio ){
   
        mes = comprobarMes( elMes );
        anio = elAnio;
        dia = comprobarDia( elDia );
               
        System.out.printf( "Construtor de objeto Fecha para la fecha %s\n", this );
    }// fin del constructor de fecha
    
    private int comprobarMes( int mesPrueba ){
    
        if( mesPrueba > 0 && mesPrueba <= 12 )
               return mesPrueba;
        else
            throw new IllegalArgumentException( "El mes dene ser de 1 a 12" );   
    }// fin del metodo comprobarMes
    
    private int comprobarDia( int diaPrueba){
    
        if( diaPrueba > 0 && diaPrueba <= diasPorMes[ mes ] )
            return diaPrueba;
        
        if( mes == 2 && diaPrueba == 29 && ( anio % 400 == 0 || ( anio % 4 == 0 && anio % 100 != 0 ) ) )
            return diaPrueba; 
        
        throw new IllegalArgumentException("Dia fuera de rango pera el mes y año especificado");
    }// fin del metodo comprobarDia
    
    // Devuelve un objeto String de la forma mes/dia/anio 
    public String toString(){
    
        return String.format( "%d/%d/%d", mes, dia, anio );
    }// fin del metodo toString 
}// fin de la clase fecha 

