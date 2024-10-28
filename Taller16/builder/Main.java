package Taller16.builder;

public class Main {
    public static void main(String[] args) {
        UsuarioDirector director = new UsuarioDirector();
        UsuarioBuilder builder = new UsuarioBuilderImpl();
        Usuario user = director.construct(builder);
        System.out.println(user.getNombre());
    }
}
