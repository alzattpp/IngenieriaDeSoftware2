package taller61;


public class LibreriaCartilla {
    private Cartilla cartilla;

    public LibreriaCartilla(Cartilla cartilla) {
        this.cartilla = cartilla;
    }

    public void realizarPrestamo() {
        cartilla.prestar();
    }

    public void devolverPrestamo() {
        cartilla.devolver();
    }

    public void renovarPortada() {
        cartilla.renovarPortada();
    }

    public void solicitarNuevaVersion() {
        cartilla.solicitarNuevaVersion();
    }
}
