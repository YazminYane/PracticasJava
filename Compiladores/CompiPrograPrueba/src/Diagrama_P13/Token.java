/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diagrama_P13;

/**
 *
 * @author Yazmin Yane
 */
public class Token {
    
    private int tipo; //1 = ID; 2 = Numero; 3 = puntoycoma; 4 = IGUAL; 5 = ME; 6= MEI; 7=DIST; 8=MAI; 9=MA;
    // 10=MAS; 11= MENOS; 12= OR; 13=POR; 14 = DIV; DIV_ENT=15; MOD=16; AND=17; NOT=18; AB_PARID=19; CE_PAR=20;
    private String nombre;
    private int id;

    public Token() {
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public Token(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
