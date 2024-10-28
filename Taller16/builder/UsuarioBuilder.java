package Taller16.builder;

import java.util.Set;

public interface UsuarioBuilder {
    UsuarioBuilder setNombre(String nombre);
    UsuarioBuilder setEdad(int edad);
    UsuarioBuilder setCorreo(String correo);
    UsuarioBuilder setIntereses(Set<String> intereses);
    Usuario build();
}
