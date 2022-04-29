
/**
 * La clase Persona
 *
 * @author alumno
 */
public class Persona {

    private Object nombre;

    private Object direcion;

    private Object telefono;

    public Persona(Object nombre, Object direcion, Object telefono, Object email) {
        this.nombre = nombre;
        this.direcion = direcion;
        this.telefono = telefono;
        this.email = email;
    }

    private Object email;

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

}
