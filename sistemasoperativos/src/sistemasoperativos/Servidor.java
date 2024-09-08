package sistemasoperativos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        int puerto = 12345; // Puerto en el que el servidor escuchará

        try (ServerSocket serverSocket = new ServerSocket(puerto)) {
            System.out.println("Servidor iniciado y escuchando en el puerto " + puerto);

            while (true) {
                // Esperar a aceptar una conexión del cliente
                Socket clienteSocket = serverSocket.accept();
                System.out.println("Cliente conectado desde " + clienteSocket.getRemoteSocketAddress());

                // Crear flujos de entrada y salida
                BufferedReader entrada = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
                PrintWriter salida = new PrintWriter(clienteSocket.getOutputStream(), true);

                // Leer mensaje del cliente
                String mensajeCliente = entrada.readLine();
                System.out.println("Mensaje del cliente: " + mensajeCliente);

                // Enviar respuesta al cliente
                String respuesta = "Hola desde el servidor!";
                salida.println(respuesta);
                System.out.println("Respuesta enviada al cliente: " + respuesta);

                // Cerrar la conexión con el cliente
                clienteSocket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
