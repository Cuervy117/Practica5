package principal;
import libreria.*;
import personas.*;
import informacion.*;

public class Principal{
    public static void main(String [] args){
        Autor orwell = new Autor("George", "Orwell");
        Autor cortazar = new Autor ("Julio", "Cortazar");
        Direccion dir = new Direccion ("CDMX Coyoacan Coapa Acoxpa #3" );

        Libreria gandhi = new Libreria("Gandhi", "CDMX Coyoacan Coapa Acoxpa #3", "1234","08:00-14:00" );
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
        gandhi.imprimirInfo();
        gandhi.setClientes("Juan Perez");
    }
}