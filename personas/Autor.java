/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edgar
 */

package personas;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Autor {
    private String nombre;
    private String apellido;
    private String lugar_nacimiento;
    private int edad;
    private static Hashtable<String, Autor> autoresExistentes;


    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        lugar_nacimiento = "Sin-informacion";
        edad = 0;
    }

    public Autor(String nombre, String apellido, String lugar_nacimiento, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edad = edad;
    }

    public static Autor crearAutor(Scanner sc){
        System.out.println("1   --- Crear autor solo con nombre");
        System.out.println("2   --- Crear autor con datos completos");
        int opcion = sc.nextInt();
        if(opcion == 1){
            System.out.println("Ingresa su nombre completo");
            String[] nom = sc.nextLine().split(" ");
            Autor a = new Autor(nom[0], nom[1]);
            autoresExistentes.put(a.getNombreCompleto(), a);
            return a;
        }else{
            System.out.println("Ingresa su nombre completo, su lugar de nacimiento y por ultimo su edad (Da Enter en cada dato que ingreses)");
            String[] nom = sc.nextLine().split(" ");
            Autor a = new Autor(nom[0], nom[1], sc.nextLine(), sc.nextInt());
            autoresExistentes.put(a.getNombreCompleto(), a);
            return a;
        }

    }

    public static Autor getAutor(Scanner sc){
        System.out.println(autoresExistentes.toString());
        System.out.println("Ingrese el nombre del autor, si no desea elegir ninguno de los mostrados de Enter");
        String opcion = sc.nextLine();
        if(!opcion.equals("\n")){
            return autoresExistentes.get(opcion);
        }else{
            return Autor.crearAutor(sc);
        }
    }

    public String getInformacion(){
        return  "Nombre completo: " + nombre + " " + apellido + "\n" + (lugar_nacimiento != null ? " Nacido en: " + lugar_nacimiento : "Sin información sobre su nacionalidad") + "\n" + (edad != 0 ? "Edad: " + edad : "Sin informacion sobre su edad");
    }
    // Getters
    public String getInfo(){
        return nombre + " " + apellido + " " + lugar_nacimiento + " " + edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad(){
        return edad;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getLugar_nacimiento(){
        return lugar_nacimiento;
    }

    // Setters
    public void setLugar_nacimiento(String lugar_nacimiento){
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

