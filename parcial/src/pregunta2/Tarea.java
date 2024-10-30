package pregunta2;

public class Tarea {
    private String descripcion;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void guardarEnBaseDeDatos() {
        System.out.println("Guardando tarea en base de datos: " + descripcion);
    }
}
