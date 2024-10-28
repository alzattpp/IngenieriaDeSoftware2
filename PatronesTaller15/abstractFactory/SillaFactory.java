package PatronesTaller15.abstractFactory;

public class SillaFactory implements ISilla{
    @Override
    public Silla crearClasica(){
        return new SillaClasica();
    }

    @Override
    public Silla crearModerna(){
        return new SillaModerna();
    }
}
