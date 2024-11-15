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
    try {
        ValidarCredenciales.validarCorreo(correo);
        ValidarCredenciales.validarContraseña(contraseña);

        Cuenta cuenta1 = new Cuenta(nombre, apellido, correo, contraseña);
        cuentas.add(cuenta1);
        System.out.println("El cliente " + cuenta1.getNombre() + " fue registrado.");
        System.out.println(cuenta1.toString());
        
        return cuenta1;
    } catch (MiExcepcion e) {
        switch (e.getCodExcepcion()) {
            case NOMBRE_VACIO : System.out.println("Error: " + e.getMessage()); break;
            case APELLIDO_VACIO : System.out.println("Error: " + e.getMessage()); break;
            case CORREO_VACIO : System.out.println("Error: " + e.getMessage()); break;
            case CORREO_REQUISITOS : System.out.println("Error: " + e.getMessage()); break;
            case CONTRA_VACIA : System.out.println("Error: " + e.getMessage()); break;
            case CONTRA_LONGITUD : System.out.println("Error: " + e.getMessage()); break;
            case CONTRA_REQUISITOS : System.out.println("Error: " + e.getMessage()); break;
            default : System.out.println("Error desconocido: " + e.getMessage());
        }
    }
    return null;
    }

    
    public boolean iniciarSesion(String correo, String contraseña) throws Exception {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getCorreo().equals(correo) && cuenta.getContraseña().equals(contraseña)) {
                System.out.println("La sesión fue iniciada");
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
