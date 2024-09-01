package taller5;

public class Main {

    public static void main(String[] args) {
        
        Gestion gestion = new Gestion();
        
        Producto producto1 = new ProductoFisico("Chocolatina", 2000, 10, 0.5);
        Producto producto2 = new ProductoDigital("Libro", 30000, 3, 25);
        Producto producto3 = new ProductoMixto("Juego de mesa", 50000, 2, 1.0, 15);

        System.out.println("El precio total de " + producto1.getNombre() + ": " + gestion.HacerCalculo(producto1));
        System.out.println("El precio total de " + producto2.getNombre() + ": " + gestion.HacerCalculo(producto2));
        System.out.println("El precio total de " + producto3.getNombre() + ": " + gestion.HacerCalculo(producto3));

        ProductoFisico fisico1 = new ProductoFisico("Bolso", 100000, 1, 2.0);
        fisico1.enviarPorCorreo();

        ProductoMixto fisico2 = new ProductoMixto("Caja de Regalo", 70000, 3, 1.5, 30);
        fisico2.enviarPorCorreo();
    }
}
