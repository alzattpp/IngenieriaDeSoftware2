package PatronesTaller15.factoryMethod;

public class TarjetaMetodoFactory extends MetodoFactory{
    @Override
    public MetodoPago crearMetodo(){
        return new TarjetaMetodo();
    }
}
