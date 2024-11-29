package tec.proyecto3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allaj
 */

public class SistemaIniciarSesion {
    private static SistemaIniciarSesion instancia;
    private Cuenta cuentaActiva;
    private List<Cuenta> cuentas;

    /**
     * Constructor que inicializa las cuentas cargándolas desde el archivo.
     */
    public SistemaIniciarSesion() {
        this.cuentaActiva = null;
        this.cuentas = new ArrayList<>();
        cargarCuentas();
    }

    /**
     * Obtiene la instancia única del sistema.
     * 
     * @return Instancia del sistema.
     */
    public static SistemaIniciarSesion getInstancia() {
        if (instancia == null) {
            instancia = new SistemaIniciarSesion();
        }
        return instancia;
    }

    /**
     * Registra una nueva cuenta si los datos son válidos.
     * 
     * @param nombre      Nombre del usuario.
     * @param apellido    Apellido del usuario.
     * @param correo      Correo del usuario.
     * @param contraseña  Contraseña del usuario.
     * @return Cuenta creada o null si ocurre un error.
     */
    public Cuenta registrarCuenta(String nombre, String apellido, String correo, String contraseña) {
        try {
            ValidarCredenciales.validarNombre(nombre);
            ValidarCredenciales.validarApellido(apellido);
            ValidarCredenciales.validarCorreo(correo);
            ValidarCredenciales.validarContraseña(contraseña);

            Cuenta nuevaCuenta = new Cuenta(nombre, apellido, correo, contraseña);
            cuentas.add(nuevaCuenta);
            guardarUsuario(nuevaCuenta);
            System.out.println("El usuario " + nuevaCuenta.getNombre() + " " + nuevaCuenta.getApellido() + " fue registrado.");
            return nuevaCuenta;
        } catch (MiExcepcion e) {
            System.out.println("Error al registrar la cuenta: " + e.getMessage());
            return null;
        }
    }

    /**
     * Guarda automáticamente los datos de una cuenta en un archivo en una nueva línea.
     * 
     * @param cuenta Instancia de la cuenta a guardar.
     */
    private void guardarUsuario(Cuenta cuenta) {
        String archivo = "usuarios.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.newLine();
            writer.write(cuenta.getNombre() + "," + cuenta.getApellido() + "," + cuenta.getCorreo() + "," + cuenta.getContraseña());
            writer.newLine();
            System.out.println("Usuario guardado en archivo: " + cuenta.getCorreo());
        } catch (IOException e) {
            System.err.println("Error al guardar el usuario: " + e.getMessage());
        }
    }

    /**
     * Inicia sesión verificando si el correo y contraseña existen.
     * 
     * @param correo      Correo del usuario.
     * @param contraseña  Contraseña del usuario.
     * @return true si se inició sesión correctamente, false de lo contrario.
     */
    public boolean iniciarSesion(String correo, String contraseña) {
        // Verificar en memoria
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getCorreo().equals(correo) && cuenta.getContraseña().equals(contraseña)) {
                this.cuentaActiva = cuenta;
                System.out.println("La sesión fue iniciada por " + cuenta.getNombre());
                return true;
            }
        }

        System.out.println("La cuenta no está registrada o las credenciales son incorrectas.");
        return false;
    }

    /**
     * Cierra la sesión actual.
     */
    public void cerrarSesion() {
        if (cuentaActiva != null) {
            System.out.println(cuentaActiva.getNombre() + " cerró sesión.");
            this.cuentaActiva = null;
        } else {
            System.out.println("No hay ninguna sesión activa.");
        }
    }

    /**
     * Carga las cuentas desde el archivo.
     */
    private void cargarCuentas() {
        this.cuentas = ManejoArchivos.cargarUsuarios();
        System.out.println("Cuentas cargadas desde el archivo.");
    }

    public Cuenta getCuentaActiva() {
        return cuentaActiva;
    }
    
    public void setCuentaActiva(Cuenta cuenta) {
    this.cuentaActiva = cuenta;
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
