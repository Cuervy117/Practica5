package principal.menu;

import datos.Archivo;
import java.io.IOException;
import java.util.Scanner;
import libreria.Libreria;
import libreria.Libro;
import personas.Cliente;
public class Menu {

    private static Libreria libreria = null;
    /**
     * Muestra el menu del administrador de librerias
     * @param sc El Scanner para leer los datos
     * @throws IOException Para manejar las excepciones de IOException
     * @throws InterruptedException Para manejar las excepciones de InterruptedException
     */
    public static void menu(Scanner sc) throws IOException, InterruptedException{
        int opcion;
        while (libreria == null) {
            libreria = Libreria.fundarLibreria(sc);
            System.out.println("Necesita crear una libreria");            
        }

        libreria.agregarLibros(Archivo.leerBaseDeDatos(libreria));

        do { 
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla

            opcion = mostrarMenu(sc);

            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//limpia pantalla

            switch (opcion) {
                case 1 -> { // Creación de libreria
                    libreria.imprimirInfo();
                    System.out.println("Presiona Enter para seguir");
                    sc.next();
                }

                case 2 -> { // 
                    libreria.agregarLibro(Libro.crearLibro(sc));
                }
                case 3 -> {
                    System.out.println("Libros disponibles");
                    System.out.println(libreria.mostrarLibros());
                }
                case 4 -> { 
                    System.out.println("Libros disponibles");
                    System.out.println(libreria.mostrarLibros());
                    System.out.println("Ingresa la posicion del libro que deseas eliminar");
                    libreria.eliminarLibro(libreria.getLibros().get(sc.nextInt() - 1));
                }

                case 5 -> {
                    libreria.agregarCliente(Cliente.crearCliente(sc));
                }

                case 6 -> {
                    //for(Cliente e : libreria.)
                }

                case 8 -> {
                    System.out.println("Hasta luego!");
                }
    
                default -> {
                    System.out.println("Ingresa una opcion válida");
                }
            }
        } while (opcion != 8);

    }
     /**
      * Muestra al usuario las opciones de la libreria disponibles
      * @param sc El scanner para la lectura de datos
      * @return Devuelve el valor que corresponde a la opcion deseada
      */
    private static int mostrarMenu(Scanner sc){
        System.out.println("1   --- Ver informacion de la libreria");
        System.out.println("2   --- Agregar libro");
        System.out.println("3   --- Ver libros");
        System.out.println("4   --- Eliminar libro");
        System.out.println("5   --- Agregar cliente");
        System.out.println("6   --- Eliminar clientes");
        System.out.println("7   --- Ver clientes");
        System.out.println("8   --- Salir");
        return sc.nextInt();
    }
    
}
