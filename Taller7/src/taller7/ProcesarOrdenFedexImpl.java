package taller7;

public class ProcesarOrdenFedexImpl implements IProcesarOrdenFedex {

    @Override
    public void enviarOrden(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia");
        System.out.println(orden.getLugarDestino());
        System.out.println("CON LA OPERADORA FEDEX");
    }
}
