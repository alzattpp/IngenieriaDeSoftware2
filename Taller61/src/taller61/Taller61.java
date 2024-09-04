package taller61;

public class Taller61 {
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        DVD dvd = new DVD();
        Cartilla cartilla = new Cartilla();

        //librería
        LibreriaLibro libreriaLibro = new LibreriaLibro(libro);
        LibreriaDVD libreriaDVD = new LibreriaDVD(dvd);
        LibreriaCartilla libreriaCartilla = new LibreriaCartilla(cartilla);

        // libro
        System.out.println("Libro:");
        libreriaLibro.realizarPrestamo();
        libreriaLibro.renovarPortada();
        libreriaLibro.realizarMantenimiento();
        libreriaLibro.solicitarNuevaVersion();
        libreriaLibro.devolverPrestamo();
        
        System.out.println("\n");

        // DVD
        System.out.println("DVD:");
        libreriaDVD.realizarPrestamo();
        libreriaDVD.devolverPrestamo();
        
        System.out.println("\n");

        //cartilla
        System.out.println("Cartilla:");
        libreriaCartilla.realizarPrestamo();
        libreriaCartilla.renovarPortada();
        libreriaCartilla.solicitarNuevaVersion();
        libreriaCartilla.devolverPrestamo();
    }
}
