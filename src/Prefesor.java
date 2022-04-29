
/**
 * Clase del profesor
 *
 * @author alumno
 */
public class Prefesor extends Persona {

    private Object nombre;

    private Object direcion;

    private Object telefono;

    private Object email;

    private Object nrp;

    private Modulo[] docencia;

    public Prefesor(Object nrp, Modulo[] docencia, Object nombre, Object direcion, Object telefono, Object email) {
        super(nombre, direcion, telefono, email);
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.email = email;
        this.nrp = nrp;
        this.docencia = docencia;
    }

    public Object getNombre() {
        return nombre;
    }

    public void setNombre(Object nombre) {
        this.nombre = nombre;
    }

    public Object getDirecion() {
        return direcion;
    }

    public void setDirecion(Object direcion) {
        this.direcion = direcion;
    }

    public Object getTelefono() {
        return telefono;
    }

    public void setTelefono(Object telefono) {
        this.telefono = telefono;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getNrp() {
        return nrp;
    }

    public void setNrp(Object nrp) {
        this.nrp = nrp;
    }

    public Modulo[] getDocencia() {
        return docencia;
    }

    public void setDocencia(Modulo[] docencia) {
        this.docencia = docencia;
    }

    /**
     * anadirModulo : Metodo que añadi el modulo
     */
    public void anadirModulo() {
    }
}
