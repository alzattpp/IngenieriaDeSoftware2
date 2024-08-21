package taller1;

public class CorreoService {

    public void enviarCorreo(Persona persona, String mensaje) {
        System.out.println("Enviando correo a " + persona.getCorreo() + ": " + mensaje);
    }
}
