package taller1;
/**
 *
 * @author alzat
 */
public class Taller1Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Sergio Andres Alzate Gomez", "sergioa.alzateg@autonoma.edu.co");
        VerificacionService verificacionService = new VerificacionService();
        CorreoService correoService = new CorreoService();
        CompensacionService compensacionService = new CompensacionService();
        PersonaDAO personaDAO = new PersonaDAO();

        boolean contrasenaValida = verificacionService.verificarContrasena("105575352");
        System.out.println("Contrasena valida: " + contrasenaValida);

        correoService.enviarCorreo(persona, "Bienvenido!");

        double compensacion = compensacionService.calcularCompensacion(46, 30000);
        System.out.println("Compensacion calculada: " + compensacion);
        
        System.out.println("El nombre de la persona es: "+persona.nombre);
        System.out.println("El nombre de la persona es: "+persona.correo );
        
        System.out.println("Porque se encarga de guardar tanto el nombre como el correo electronico.\n");

        System.out.println("""
                           Se separo ya que anteriormente no se cumple porque todo estaba agrupado en una sola Clase 
                           y la regla menciona que debea haber una por cada accion.""");
        
        
        personaDAO.guardarPersona(persona);
    }
}
