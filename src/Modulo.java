
/**
 * Clase de modulo
 *
 * @author alumno
 */
public class Modulo {

    private Object nombre;

    private Object horas;

    private Object contenido;

    private Alumno[] alumnado;

    public Modulo(Object nombre, Object horas, Object contenido, Alumno[] alumnado) {
        this.nombre = nombre;
        this.horas = horas;
        this.contenido = contenido;
        this.alumnado = alumnado;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getHoras() {
        return horas;
    }

    public void setHoras(Object horas) {
        this.horas = horas;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public Alumno[] getAlumnado() {
        return alumnado;
    }

    public void setAlumnado(Alumno[] alumnado) {
        this.alumnado = alumnado;
    }

    /**
     * matricula : Metodo que genera la matricula
     */
    public void matricula() {
    }

    /**
     * asignaDuracion : Metodo que gerena la asignaDuracion
     */
    public void asignaDuracion() {
    }

}
