/**
 * @author Samuel Cruz 
 */
package personas;
import java.util.ArrayList;
import libreria.Libro;

public class Cliente{
    // Atributos
    private String nombre, apellido;
    private ArrayList<Libro> libros_comprados;

    /**
     * Constructor de la clase Cliente
     * @param nombre El nombre del cliente
     * @param apellido El apellido del cliente
     */
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        libros_comprados = new ArrayList<Libro>();
    }
    // Getters
    // Considere que en una libreria rara vez nos pediran nuestros apellidos o nombres individualmente
    /**
     * Devuelve el nombre del cliente
     * @return El nombre del clietne
     */
    private String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el apellido del cliente
     * @return El apellido del cliente 
     */
    private String getApellido() {
        return apellido;
    }
    /**
     * Devuelve el nombre completo del cliente
     * @return El nombre completo del cliente
     */
    public String getNombreCompleto() {
        return this.getNombre() + " " + this.getApellido();
    }
    // Setters
    /**
     * Cambia el nombre del cliente
     * @param nombre El nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Cambia el apellido del cliente
     * @param apellido El nuevo apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Agrega un libro a la lista de los libros que ha comprado el cliente
     * @param libro Libro que el cliente ha comprado
     */
    public void setLibro_comprado(Libro libro){
        libros_comprados.add(libro);
    }
    
}