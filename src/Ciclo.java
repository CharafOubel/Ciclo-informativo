
/**
 * CLase del ciclo
 *
 * @author alumno
 */
public class Ciclo {

    private Object nombre;

    private Object descripcion;

    private Object hora;

    private Object anios;

    public Ciclo(Object nombre, Object descripcion, Object hora, Object anios) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora = hora;
        this.anios = anios;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    public Object getHora() {
        return hora;
    }

    public void setHora(Object hora) {
        this.hora = hora;
    }

    public Object getAnios() {
        return anios;
    }

    public void setAnios(Object anios) {
        this.anios = anios;
    }

}
