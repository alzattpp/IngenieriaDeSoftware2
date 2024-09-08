package sistemasoperativos;

class Contador{
    private int conteo = 0;
    
    public synchronized void incrementar(){
        conteo++;
    }
    
    public int obtenerConteo(){
        return conteo;
    }
}