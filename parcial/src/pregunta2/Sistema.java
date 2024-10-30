package pregunta2;

public class Sistema {
    private Notificacion notificacion;
    private Tarea tarea;

    public Sistema(Notificacion notificacion, Tarea tarea) {
        this.notificacion = notificacion;
        this.tarea = tarea;
    }

    public void procesarTarea() {
        tarea.guardarEnBaseDeDatos();
        notificacion.enviarNotificacion("Tarea guardada: " + tarea.getDescripcion());
    }
}
