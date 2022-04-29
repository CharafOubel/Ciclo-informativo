
/**
 * CLase de competencia
 *
 * @author alumno
 */
public class Competencia {

    private Object descripcion;

    public Competencia(Object descripcion, Object modulos) {
        this.descripcion = descripcion;
        this.modulos = modulos;
    }

    public Object getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    public Object getModulos() {
        return modulos;
    }

    public void setModulos(Object modulos) {
        this.modulos = modulos;
    }

    private Object modulos;
}
