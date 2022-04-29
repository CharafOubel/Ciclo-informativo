
/**
 * Clase de tarea
 *
 * @author alumno
 */
public class Tarea {

    private Object descripcion;
    private Object calificacion;

    public Tarea(Object descripcion, Object calificacion) {
        this.descripcion = descripcion;
        this.calificacion = calificacion;
    }

    public Object getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    public Object getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Object calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * calificarTarea : Metodo que genera la calificacion de cada tarea
     */
    public void calificarTarea() {
    }

}
