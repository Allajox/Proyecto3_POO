package tec.proyecto3;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allaj
 */
public class SistemaIniciarSesion {
    private Cuenta cuenta;
    private List<Cuenta> cuentas;

    public SistemaIniciarSesion() {
        this.cuenta = null;
        this.cuentas = new ArrayList<>();
    }
    
    public Cuenta registrarCuenta(String nombre, String apellido, String correo, String contraseña) {
        if (!ValidarCredenciales.validarCorreo(correo) && ValidarCredenciales.validarContraseña(contraseña)) {
            System.out.println("Error en el correo o contraseña.");
            return null;
        }
        Cuenta cuenta1 = new Cuenta(nombre, apellido, correo, contraseña);
        cuentas.add(cuenta1);
        System.out.println("El cliente " + cuenta1.getNombre() + " fue registrado.");
        System.out.println(cuenta1.toString());
        return cuenta1;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "SistemaIniciarSesion{" + "cuenta=" + cuenta + ", cuentas=" + cuentas + '}';
    }
    
}
