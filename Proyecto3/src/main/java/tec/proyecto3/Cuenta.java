package tec.proyecto3;

/**
 *
 * @author allaj
 */
public class Cuenta {
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;

    public Cuenta(String nombre, String apellido, String correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contraseña=" + contraseña + '}';
    }
    
    
}
