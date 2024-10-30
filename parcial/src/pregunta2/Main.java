package pregunta2;

public class Main {
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion();
        Tarea tarea = new Tarea("Completar el proyecto ");
        Sistema sistema = new Sistema(notificacion, tarea);

        sistema.procesarTarea();
    }
}
