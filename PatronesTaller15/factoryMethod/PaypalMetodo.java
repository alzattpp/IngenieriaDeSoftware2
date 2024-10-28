package PatronesTaller15.factoryMethod;

public class PaypalMetodo implements MetodoPago{
    @Override
    public void procesarPago(double Cantidad){
        System.out.println("Pago Paypal exitoso");
    }   
}
