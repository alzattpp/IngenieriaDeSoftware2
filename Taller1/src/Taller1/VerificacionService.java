package taller1;
/**
 *
 * @author alzat
 */
public class VerificacionService {

    public boolean verificarContrasena(String contrasena) {
        return contrasena.length() >= 8;
    }
}