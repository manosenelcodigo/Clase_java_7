
package modelo;

public class Persona 
{
    private String nombre,correo,telefono;
    private int id;

    public Persona() {
    }

    public Persona(String nombre, String correo, String telefono, int id) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.id = id;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
