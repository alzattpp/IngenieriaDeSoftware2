package Taller16.builder;

import java.util.Set;

public class Usuario {
    private String nombre; 
    private int edad;
    private String correo;
    private Set<String> intereses;
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public Set<String> getIntereses() {
        return intereses;
    }

    private Usuario(String nombre, int edad, String correo, Set<String> intereses) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.intereses = intereses;
    }

    
}
