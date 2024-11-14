package tec.proyecto3;


/**
 *
 * @author allaj
 */
public class ValidarCredenciales {
    /**
     * Valida si la contraseña tiene al menos 8 caracteres,
     * una letra mayúscula, un número y un carácter especial
     * 
     * @param contraseña String a ser validado
     * @return true si la contraseña cumple los requisitos
     */
    public static boolean validarContraseña(String contraseña) {
        String regexContraseña = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+-_/=¡!¿?'<>:;]).{8,}$";
        return contraseña.matches(regexContraseña);
        }
    /**
     * Valida si el formato del correo es correcto, o sea, si tiene un @ en medio
     * 
     * @param correo String a ser validado
     * @return true si el correo cumple los requisitos
     */
    public static boolean validarCorreo(String correo) { 
        String regexCorreo = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return correo.matches(regexCorreo);
    }
    
    }
