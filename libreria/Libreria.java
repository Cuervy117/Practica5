package libreria;
import java.util.ArrayList;
// import java.util.Hashtable;
import java.util.Scanner;
import informacion.Direccion;
import personas.Cliente;
public class Libreria {
    
    public static int ventas; 
    private String nombre;
    private String telefono;
    private String horario;
    private Direccion direccion;
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;

    // Constructor 
    public Libreria(String nombre, String direccion, String telefono, String horario) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.horario = horario;
        this.libros = new ArrayList<>();
        this.direccion = new Direccion(direccion);
    }

    // Métodos
    public static Libreria fundarLibreria(Scanner sc){
        String opcion, nom, dir, tel, hor;
        do{
            System.out.println("Ingresa el nombre de tu libreria");
            nom = sc.nextLine();
            System.out.println("Ingresa la dirección de tu libreria\n Formato \" Estado Municipio Colonia Calle Numero \" (todo separado por espacios)");
            dir= sc.nextLine();
            System.out.println("Ingresa el numero telefonico de tu libreria");
            tel = sc.nextLine();
            System.out.println("Ingresa el horario de apertura de tu libreria");
            hor = sc.nextLine();
            System.out.println("¿Seguro que quieres aperturar tu libreria?");
            System.out.println("[S / N]");
            opcion = sc.next();
        }while(!opcion.equals("S"));
        return new Libreria(nom, dir, tel, hor);
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


    public void setClientes(String nombre){
        Cliente c =  new Cliente(nombre.split(" ")[0], nombre.split(" ")[1] );
        this.clientes.add(c);
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
