public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        libreria.añadirLibro(new Libro("El libro de Rafael", "Rafael", 25000, 1999));
        libreria.añadirLibro(new Libro("El libro de Isabela0", "Isabela", 30000, 2000));

        

        Orden orden = new Orden();
        orden.agregarLibro(new Libro("El Libro de Samuel", "Samuel", 20000, 2001));
        orden.procesarOrden();

        orden.cancelarOrden();
    }
}
