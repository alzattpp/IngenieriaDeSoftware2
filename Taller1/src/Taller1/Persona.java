package taller1;
/**
 *
 * @author alzat
 */
public class Persona {
    public String nombre;
    public String correo;

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}
