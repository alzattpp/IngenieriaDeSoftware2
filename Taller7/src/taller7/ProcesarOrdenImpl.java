package taller7;


public class ProcesarOrdenImpl implements IProcesarOrden{

   

    
    @Override
    public void enviarOrden(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("Hacia");
        System.out.println(orden.getLugarDestino()); 
    }

    
    
}
