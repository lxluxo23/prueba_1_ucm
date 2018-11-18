
package modelo;

public class datos_set {
    
    private String rut;
    private String nombre;
    private int edad;
    
    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public datos_set(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
     
    }
    
}
