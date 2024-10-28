package Taller16.builder;

public class UsuarioDirector {
    public Usuario construct(UsuarioBuilder builder){
        builder.setNombre("Sergio")
                .setEdad(18)
                .setCorreo("Sergio@UAM")
                .setIntereses(null);
        return builder.build();
    }
}
