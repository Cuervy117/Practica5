/**
 * @author David Diaz  
 * @author Samuel Cruz
 */
package informacion;
public class Direccion{

    // Atributos
    private String calle, numero, colonia, municipio, estado;

    // Constructor
    public Direccion(String direccion){
        String[] atributos = direccion.split(" ");
        estado = atributos[0];
        municipio = atributos[1];
        colonia = atributos[2];
        calle = atributos[3];
        numero = atributos[4];
    }

    // Setters
    public void setCalle(String calle){
        this.calle = calle;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public void setColonia(String colonia){
        this.colonia = colonia;
    }

    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    // Getters
    public String getDireccion(){
        String direccion = estado + " - " + municipio + " - " + colonia + " - " + calle + " - " + numero;
        return direccion;
    }

    public String getEstado(){
        return estado;
    }

    public String getMunicipio(){
        return municipio;
    }

    public String getColonia(){
        return colonia;
    }

    public String getCalle(){
        return calle;
    }

    public String getNumero(){
        return numero;
    }
}