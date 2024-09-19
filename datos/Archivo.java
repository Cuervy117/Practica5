package datos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import libreria.*;
import personas.Autor;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * La clase Archivo proporciona métodos para la escritura de datos en archivos de texto
 */
public class Archivo {
    /**
     * Guarda en un archivo de texto los libros de una libreria
     * @param datos La lista de libros de la libreria
     * @throws URISyntaxException Para el manejo de errores en la obtención del directorio
     */
    public static void guardarLibros(ArrayList<Libro> datos, Libreria libreria){// Función que guarda los datos de una matriz en un archivo .txt
        try {
            Path packageActual = Paths.get(Archivo.class.getResource("Archivo.class").toURI()).getParent(); // Obtenemos el directorio del package
            Path directorio = packageActual.resolve("libros"); // Creamos la carpeta en caso de que no existe
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
            }
            Path ruta = directorio.resolve(libreria.getNombre() + ".txt"); // Agregamos al directorio creado anteriormente el nombre del archivo
            BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta.toFile(), false));
            for(Libro libros : datos){
                escritor.write(libros.getTitulo() + "\t" + libros.getAñoPublicacion()  + "\t" + libros.getAutor().getInfo()  + "\t" + libros.getPrecio());
                escritor.newLine();
            }
            System.out.println("Base de datos de libreria " + libreria.getNombre() + "actualizada");
            escritor.close();
        } catch (IOException | URISyntaxException e) {
            System.out.println("Error al actualizar la base de datos" + e.getMessage());
        }  
    }

    public static ArrayList<Libro> leerBaseDeDatos(Libreria libreria){
        ArrayList<Libro> l = new ArrayList<Libro>();
        try{
            Path packageActual = Paths.get(Archivo.class.getResource("Archivo.class").toURI()).getParent(); // Obtenemos el directorio del package
            Path directorio = packageActual.resolve("libros"); 
            if (!Files.exists(directorio)) {
                Files.createDirectories(directorio);
            }
            Path ruta = directorio.resolve(libreria.getNombre() + ".txt"); // Agregamos al directorio creado anteriormente el nombre del archivo
            String linea;
            Scanner arch = new Scanner(ruta);
            while(arch.hasNextLine()){
                linea = arch.nextLine();
                String[] separaciones = linea.split("\t");
                System.out.println(Arrays.toString(separaciones[2].split(" ")));
                l.add(new Libro(separaciones[0], Integer.parseInt(separaciones[1]) , new Autor(separaciones[2].split(" ")[0], separaciones[2].split(" ")[1], separaciones[2].split(" ")[2], Integer.parseInt(separaciones[2].split(" ")[3])), Double.parseDouble(separaciones[3])));
            }
            arch.close();
            return l;

        } catch (IOException | URISyntaxException e){
            e.printStackTrace();
        }
        return l;
    }
}


