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
    
    public Cuenta registrarCuenta(String nombre, String apellido, String correo, String contraseña) throws Exception {
        if (!ValidarCredenciales.validarCorreo(correo)) {
            throw new Exception("Error en el formato del correo.");
        }
        
        if (!ValidarCredenciales.validarContraseña(contraseña)) {
            throw new Exception("Error en el formato de la contraseña, se requiere que sea de al menos 8 caracteres, \n"
                    + "y que tenga al menos una mayúscula, un número y un caracter especial.");
        }
        
        Cuenta cuenta1 = new Cuenta(nombre, apellido, correo, contraseña);
        cuentas.add(cuenta1);
        System.out.println("El cliente " + cuenta1.getNombre() + " fue registrado.");
        System.out.println(cuenta1.toString());
        return cuenta1;
    }
    
    public boolean iniciarSesion(String correo, String contraseña) throws Exception {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getCorreo().equals(correo) && cuenta.getContraseña().equals(contraseña)) {
                System.out.println("Inició sesión");
                return true;
            } // if
        } // for
    System.out.println("La cuenta no está registrada");
    return false;
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
