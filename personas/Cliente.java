package personas;
import java.util.ArrayList;
import java.util.Arrays;
import libreria.Libro;
public class Cliente{
    private String nombre;
    private String apellido;
    private ArrayList<Libro> libros_comprados;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public void setLibro_comprado(Libro libro){
        libros_comprados.add(libro);
    }
    
}