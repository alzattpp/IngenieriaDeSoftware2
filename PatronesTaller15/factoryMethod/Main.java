package PatronesTaller15.factoryMethod;

public class Main {
    public static void main(String[] args) {
        MetodoFactory factory = new PaypalMetodoFactory();
        MetodoPago metodo = factory.crearMetodo();
        metodo.procesarPago(500000);
    }
}
