package tec.proyecto3;

/**
 *
 * @author allaj
 */
public class ValidarCredenciales {
    /**
     * Valida si el nombre no es vacío
     * 
     * @param nombre
     * @return true si no está vacío
     * @throws MiExcepcion 
     */
    public static boolean validarNombre(String nombre) throws MiExcepcion {
        if (nombre.isEmpty())
            throw new MiExcepcion(CODIGOS_ERROR.NOMBRE_VACIO);
        else
            return true;
    }
    
    /**
     * Valida si el apellido no es vacío
     * 
     * @param apellido
     * @return true si no está vacío
     * @throws MiExcepcion 
     */
    public static boolean validarApellido(String apellido) throws MiExcepcion {
        if (apellido.isEmpty())
            throw new MiExcepcion(CODIGOS_ERROR.APELLIDO_VACIO);
        else
            return true;
    }
    
    /**
     * Valida si la contraseña está vacía, o si tiene al menos 8 caracteres,
     * una letra mayúscula, un número y un carácter especial
     * 
     * @param contraseña String a ser validado
     * @return true si la contraseña cumple los requisitos
     * @throws tec.proyecto3.MiExcepcion
     */
    public static boolean validarContraseña(String contraseña) throws MiExcepcion{
        String regexContraseña = "^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$";
    
        if (contraseña.isEmpty()) 
            throw new MiExcepcion(CODIGOS_ERROR.CONTRA_VACIA);
        
        if (contraseña.length() < 8) 
            throw new MiExcepcion(CODIGOS_ERROR.CONTRA_LONGITUD);
        
        if (!contraseña.matches(regexContraseña))
            throw new MiExcepcion(CODIGOS_ERROR.CONTRA_REQUISITOS);
        return true;
    }

    /**
     * Valida si el correo está vacío, o si el formato del correo es correcto, 
     * o sea, si tiene un @ en medio
     * 
     * @param correo String a ser validado
     * @return true si el correo cumple los requisitos
     * @throws tec.proyecto3.MiExcepcion
     */
    public static boolean validarCorreo(String correo) throws MiExcepcion { 
        String regexCorreo = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (correo.isEmpty())
            throw new MiExcepcion(CODIGOS_ERROR.CORREO_VACIO);
        if (!correo.matches(regexCorreo))
            throw new MiExcepcion(CODIGOS_ERROR.CORREO_REQUISITOS);
        return true;
    }
}
