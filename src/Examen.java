
/**
 * Clase de Examen
 *
 * @author alumno
 */
public class Examen {

    private Object descripcion;
    private Object preguntas;

    public void calificarExamen() {
    }

    public Examen(Object descripcion, Object preguntas) {
        this.descripcion = descripcion;
        this.preguntas = preguntas;
    }

    public Object getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    public Object getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Object preguntas) {
        this.preguntas = preguntas;
    }

    /**
     *
     * @param notaMedia : Metodo para calcular la nota media
     * @return Devuelve la nota media
     */
    public double calcularNOtaMedia(double notaMedia) {

        return notaMedia;
    }

    /**
     * Metodo para generar las preguntas
     */
    public void generarPregunta() {
    }

    /**
     * Metodo para ordenar las preguntas
     */
    public void ordenarPregunta() {
    }

    /**
     * Metodo que geera el examen
     */
    public void generaExamen() {
    }

}
