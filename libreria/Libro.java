/**
 * @author Samuel Cruz 
 */
package libreria;
import java.util.Scanner;
import personas.*;
public class Libro {
    // Atributos
    private String titulo;
    private int añoPublicacion;
    private Autor autor;
    private double precio; 

    /**
     * Constructor de la clase libro
     * @param titulo El titulo del libro
     * @param añoPublicacion El año en el cual se publicó el libro
     * @param autor El autor del libro
     * @param precio El precio del libro
     */
    public Libro(String titulo, int añoPublicacion, Autor autor, double precio) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.precio = precio;
    }

    public static Libro crearLibro(Scanner sc){
        System.out.println("Ingresa su titulo");
        String title = sc.nextLine();
        System.out.println("Ingresa su año de publicacion");
        int year = sc.nextInt();
        Autor a = Autor.getAutor(sc);
        System.out.println("Ingrese su precio");
        double price = sc.nextDouble();
        return new Libro(title, year, a, price);
    }
    // Getters
    /**
     * Devuelve el titulo del libro
     * @return El titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Devuelve el año en el que se publico el libro
     * @return El año de publicacion del libro
     */
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    /**
     * Devuelve el autor del libro
     * @return El autor del libro
     */
    public Autor getAutor() {
        return autor;
    }
    /**
     * Devuelve el precio del libro
     * @return El precio del libro 
     */
    public double getPrecio() {
        return precio;
    }
    // Setters
    // Pienso que es poco probable que un libro cambie su titulo o su autor, mientras lo voy a documentar
    /*public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }*/
    /**
     * Cambia el precio del libro 
     * @param precio El nuevo precio del libro 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void mostrarLibro(){
        System.out.println(titulo);
        System.out.println(añoPublicacion);
        System.out.println(autor);
        System.out.println(precio);
    }
}
