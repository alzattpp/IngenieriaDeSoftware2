package PatronesTaller15.abstractFactory;

public class Main {
    public static void main(String[] args) {
        ISilla isilla;
        IMueble imueble;
        isilla = new SillaFactory();
        imueble = new MuebleFactory();

        Silla silla1 = isilla.crearClasica();
        silla1.crear();

        Mueble mueble1 = imueble.crearModerno();
        mueble1.crear();
    }
}
