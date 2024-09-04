package taller61;

public class Libro implements Libreria {

    @Override
    public void prestar() {
        System.out.println("El libro ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("El libro ha sido devuelto.");
    }

    @Override
    public void renovarPortada() {
        System.out.println("Renovando la portada del libro.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Realizando mantenimiento a las hojas del libro.");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Solicitando nueva versio del libro.");
    }
}
