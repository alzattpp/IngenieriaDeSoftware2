package taller61;

public class LibreriaLibro {
    private Libro libro;

    public LibreriaLibro(Libro libro) {
        this.libro = libro;
    }

    public void realizarPrestamo() {
        libro.prestar();
    }

    public void devolverPrestamo() {
        libro.devolver();
    }

    public void renovarPortada() {
        libro.renovarPortada();
    }

    public void realizarMantenimiento() {
        libro.mantenimientoHojas();
    }

    public void solicitarNuevaVersion() {
        libro.solicitarNuevaVersion();
    }
}
