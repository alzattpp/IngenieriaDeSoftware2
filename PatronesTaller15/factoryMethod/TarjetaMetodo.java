package PatronesTaller15.factoryMethod;

public class TarjetaMetodo implements MetodoPago{
    @Override
    public void procesarPago(double Cantidad){
        System.out.println("Pago con tarjeta exitoso");
    }
}
