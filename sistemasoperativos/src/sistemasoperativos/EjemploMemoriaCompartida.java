package sistemasoperativos;

public class EjemploMemoriaCompartida {
    public static void main(String[] args) {
        // Crear una instancia de Contador compartida
        Contador contador = new Contador();

        // Crear varios hilos que usan el mismo contador
        HiloContador hilo1 = new HiloContador(contador);
        HiloContador hilo2 = new HiloContador(contador);
        HiloContador hilo3 = new HiloContador(contador);

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        // Esperar a que todos los hilos terminen
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimir el resultado final
        System.out.println("Conteo final: " + contador.obtenerConteo());
    }
}
