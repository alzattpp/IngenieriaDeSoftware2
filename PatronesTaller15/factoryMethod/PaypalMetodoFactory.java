package PatronesTaller15.factoryMethod;

public class PaypalMetodoFactory extends MetodoFactory{
    @Override
    public MetodoPago crearMetodo(){
        return new PaypalMetodo();
    }
}
