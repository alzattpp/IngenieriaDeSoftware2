package taller9dry;

/**
 *
 * @author alzat
 */
public class Taller9DRY {

    private String[] emails = { "sergio@gmail.com", "alzategmail.com" };

    public void validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email no puede estar vacio o nulo.");
        } else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email invalido: " + email);
        } else {
            System.out.println("Email valido: " + email);
        }
    }
    
    public void checkEmails() {
        for (String email : emails) {
            validateEmail(email);
        }
    }
    
    public static void main(String[] args) {
        Taller9DRY taller = new Taller9DRY();
        taller.checkEmails();
    }
}
