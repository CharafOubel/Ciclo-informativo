
/**
 * Clase de la pregunta
 *
 * @author alumno
 */
public class Pregunta {

    private Object Enunciado;

    private Object Respuesta;

    private Object respuestaValida;

    public Pregunta(Object Enunciado, Object Respuesta, Object respuestaValida) {
        this.Enunciado = Enunciado;
        this.Respuesta = Respuesta;
        this.respuestaValida = respuestaValida;
    }

    public Object getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(Object Enunciado) {
        this.Enunciado = Enunciado;
    }

    public Object getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(Object Respuesta) {
        this.Respuesta = Respuesta;
    }

    public Object getRespuestaValida() {
        return respuestaValida;
    }

    public void setRespuestaValida(Object respuestaValida) {
        this.respuestaValida = respuestaValida;
    }

}
