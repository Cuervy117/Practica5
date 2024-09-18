package libreria;
import personas.*;
public class Libro {
    private String titulo;
    private int añoPublicacion;
    private Autor autor;
    private double precio; 

    public Libro(String titulo, int añoPublicacion, Autor autor, double precio) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
