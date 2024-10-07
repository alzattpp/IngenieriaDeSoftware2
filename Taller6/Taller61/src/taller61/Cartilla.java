package taller61;

public class Cartilla implements Libreria {

    @Override
    public void prestar() {
        System.out.println("La cartilla ha sido prestada.");
    }

    @Override
    public void devolver() {
        System.out.println("La cartilla ha sido devuelta.");
    }

    @Override
    public void renovarPortada() {
        System.out.println("Renovando la portada de la cartilla.");
    }

    @Override
    public void mantenimientoHojas() {
        // No Aplica  para la cartilla
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("Solicitando nueva version de la cartilla.");
    }
}
