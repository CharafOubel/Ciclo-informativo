
/**
 * Claese alumno
 *
 * @author alumno
 */
public class Alumno extends Persona {

    private Object nombre;

    private Object direcion;

    private Object telefono;

    private Object email;

    private Modulo[] ModuloMatriculado;

    public Alumno(Modulo[] ModuloMatriculado, Object nombre, Object direcion, Object telefono, Object email) {
        super(nombre, direcion, telefono, email);
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.email = email;
        this.ModuloMatriculado = ModuloMatriculado;
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

    public Modulo[] getModuloMatriculado() {
        return ModuloMatriculado;
    }

    public void setModuloMatriculado(Modulo[] ModuloMatriculado) {
        this.ModuloMatriculado = ModuloMatriculado;
    }

    /**
     * emitirCertificado : Metodod que genera la emicion de certificado
     */
    public void emitirCertificado() {
    }

    /**
     * calcularNOtaMedia() : Un methodo para calcular la nota media de cada
     * alumno
     *
     * @return
     */
    public double calcularNOtaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
