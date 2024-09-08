package sistemasoperativos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        String direccionServidor = "localhost"; // Dirección del servidor (localhost para pruebas locales)
        int puerto = 12345; // Puerto al que el cliente se conectará

        try (Socket socket = new Socket(direccionServidor, puerto)) {
            // Crear flujos de entrada y salida
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);

            // Enviar mensaje al servidor
            String mensaje = "Hola desde el cliente!";
            salida.println(mensaje);
            System.out.println("Mensaje enviado al servidor: " + mensaje);

            // Leer respuesta del servidor
            String respuestaServidor = entrada.readLine();
            System.out.println("Respuesta del servidor: " + respuestaServidor);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
