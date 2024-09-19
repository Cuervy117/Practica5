package principal;
import datos.Archivo;
import java.io.IOException;
import java.util.Scanner;
import libreria.*;
import personas.*;
public class Principal{
    public static void main(String [] args)throws IOException, InterruptedException{
        Autor orwell = new Autor("George", "Orwell");
        Autor cortazar = new Autor ("Julio", "Cortazar");
        Libreria gandhi = new Libreria("Gandhi", "CDMX Coyoacan Coapa Acoxpa #3", "1234","08:00-14:00" );
        gandhi.agregarLibros(Archivo.leerBaseDeDatos(gandhi));
        System.out.println(gandhi.getHorario());
        Libro libro1 = new Libro("Rayuela", 1963, cortazar, 2000);
        gandhi.agregarLibro(libro1);
        Libro l2 = new Libro ("1984", 1945, orwell, 600);
        Libro l3 = new Libro ("Rebelion en la granja", 1970, orwell, 2000);
        Libro l4 = new Libro("Final del juego", 1956, cortazar, 200);
        Libro l5 = new Libro ("Homenaje a cataluña", 1938, orwell, 200);
        gandhi.agregarLibro(l2);
        gandhi.agregarLibro(l3);
        gandhi.agregarLibro(l4);
        gandhi.agregarLibro(l4);
        gandhi.agregarLibro(l5);
        gandhi.imprimirInfo();
        Archivo.guardarLibros(gandhi.getLibros(), gandhi);
        Scanner sc = new Scanner(System.in);

        Cliente cl = new Cliente("Juan", "Perez");
        cl.setLibro_comprado(l2); //el cliente compra un libro
        cl.getLibrosComprados().getFirst().mostrarLibro();
        gandhi.agregarCliente(cl); //se agrega el cliente a la base de datos de la libreria
        System.out.println(cl.getNombreCompleto());
        cl.getLibrosComprados().getFirst().mostrarLibro();
         //Menu.menu(sc);
        //gandhi.setClientes("Juan Perez");
    }
}