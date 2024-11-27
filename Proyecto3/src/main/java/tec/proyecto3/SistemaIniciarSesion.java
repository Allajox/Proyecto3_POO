package tec.proyecto3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allaj
 */
public class SistemaIniciarSesion {
    private Cuenta cuentaActiva;
    private List<Cuenta> cuentas;

    public SistemaIniciarSesion() {
        this.cuentaActiva = null;
        this.cuentas = new ArrayList<>();
    }
    
    /**
     * Recibe los datos de la cuenta, y la crea si están correctos
     * 
     * @param nombre String
     * @param apellido String
     * @param correo String
     * @param contraseña String
     * @return 
     */
    public Cuenta registrarCuenta(String nombre, String apellido, String correo, String contraseña) {
    try {
        // valida las credenciales
        ValidarCredenciales.validarNombre(nombre);
        ValidarCredenciales.validarApellido(apellido);
        ValidarCredenciales.validarCorreo(correo);
        ValidarCredenciales.validarContraseña(contraseña);
        // crea la cuenta y la añade a la lista de cuentas
        Cuenta cuenta1 = new Cuenta(nombre, apellido, correo, contraseña);
        cuentas.add(cuenta1);
        System.out.println("El usuario " + cuenta1.getNombre() + " " + cuenta1.getApellido() + " fue registrado.");
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
        } // switch
    } // catch
    return null;
    
    
    
    
    }

    /**
     * Inicia sesión si el correo y contraseña están registrados
     * y son válidos
     * 
     * @param correo String
     * @param contraseña String
     * @return
     * @throws Exception 
     */
    public boolean iniciarSesion(String correo, String contraseña) throws Exception {
        for (Cuenta cuenta : cuentas) {
            // si el correo y la contraseña son válidos, inicia sesión
            if (cuenta.getCorreo().equals(correo) && cuenta.getContraseña().equals(contraseña)) {
                System.out.println("La sesión fue iniciada por " + cuenta.getNombre());
                this.cuentaActiva = cuenta; // asigna la cuenta ingresada como la activa
                return true;
            } // if
        } // for
    System.out.println("La cuenta no está registrada o las credenciales son incorrectas.");
    return false;
    }
    
    /**
     * Cierra la sesión de la cuenta, quitando la cuenta activa
     */
    public void cerrarSesion() {
        System.out.println(cuentaActiva + " cerró sesión.");
        this.cuentaActiva = null;
        
    }
    
    public Cuenta getCuentaActiva() {
        return cuentaActiva;
    }

    public String getAutor() {
        if (cuentaActiva != null) {
            return cuentaActiva.getNombre() + " " + cuentaActiva.getApellido();
        }
        return "Ningún usuario activo";
    }
    
    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    @Override
    public String toString() {
        return "SistemaIniciarSesion{" + "cuentaActiva=" + cuentaActiva + ", cuentas=" + cuentas + '}';
    }
    
}
