package taller61;

public class DVD implements Libreria {

    @Override
    public void prestar() {
        System.out.println("El DVD ha sido prestado.");
    }

    @Override
    public void devolver() {
        System.out.println("El DVD ha sido devuelto.");
    }

    @Override
    public void renovarPortada() {
        // No Aplica para DVD
    }

    @Override
    public void mantenimientoHojas() {
        // No Aplica para DVD
    }

    @Override
    public void solicitarNuevaVersion() {
        // No Aplica para DVD
    }
}
