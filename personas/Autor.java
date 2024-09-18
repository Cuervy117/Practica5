/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edgar
 */

package personas;

public class Autor {
    private String nombre;
    private String apellido;
    private String lugar_nacimiento;
    private int edad;

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getInformacion(){
        return  "Nombre completo: " + nombre + " " + apellido + "\n" + (lugar_nacimiento != null ? " Nacido en: " + lugar_nacimiento : "Sin información sobre su nacionalidad") + "\n" + (edad != 0 ? "Edad: " + edad : "Sin informacion sobre su edad");
    }
    // Getters
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

