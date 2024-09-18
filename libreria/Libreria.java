package libreria;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import informacion.Direccion;
import personas.Cliente;
public class Libreria {
    private String nombre;
    private String telefono;
    private String horario;
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;
    private Direccion direccion;
    public static int ventas;

    public Libreria(String nombre, String direccion, String telefono, String horario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
        this.direccion = new Direccion(direccion);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void imprimirInfo(){
        System.out.println(nombre);
        System.out.println(direccion.getDireccion());
        System.out.println(horario);
        System.out.println(telefono);
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void ventaLibro(Cliente comprador, Libro libro){

        clientes.add(comprador); 
        comprador.setLibro_comprado(libro);
        libros.remove(libro);

    }

    /*public void negociacion(){
         if(libros.isEmpty()){
            System.out.println("Ya no hay libros :'v");
        }
        else{

            System.out.println("Que libro quieres comprar");
            System.out.println(libros.toString());
            venta = sc.nextLine();
            clientes.add(comprador); 
            comprador.setLibro_comprado(libro);
            libros.remove(libro);
        }
    }*/
}
