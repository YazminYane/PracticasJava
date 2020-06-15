//clase que guarda el nombre e identificador de un token

package fes.aragon;

/**
 *
 * @author Yazmin Yane
 */
public class Tabla {
    
    private String nombre;
    private int id;

    public Tabla() {
    }

    public Tabla(String nombre, int id) {
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
