package Taller16.builder;

import java.util.Set;

public class UsuarioBuilderImpl implements UsuarioBuilder{
    private Usuario usuario = new Usuario();
    @Override
    public UsuarioBuilder setNombre(String nombre){
        usuario.nombre = nombre;
        return this;
    }
    @Override
    public UsuarioBuilder setEdad(int edad){
        usuario.edad = edad;
        return this;
    }
    @Override
    public UsuarioBuilder setCorreo(String correo){
        usuario.correo = correo;
        return this;
    }
    @Override
    public UsuarioBuilder setIntereses(Set<String> intereses){
        usuario.intereses = intereses;
        return this;
    }
    @Override
    public Usuario build() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'build'");
    }
}
