package tec.proyecto3;


/**
 *
 * @author allaj
 */
public class ValidarCredenciales {
    
    public static boolean validarContraseña(String contraseña) {
        // Expresión regular que valida si la contraseña tiene al menos:
        // - Una letra mayúscula: (?=.*[A-Z])
        // - Un número: (?=.*\\d)
        // - Un carácter especial: (?=.*[@#$%^&+=])
        String regexContraseña = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+-=¡!¿?'<>:;]).{8,}$";
        
        return contraseña.matches(regexContraseña);
        }
    public static boolean validarCorreo(String correo) {
        
        String regexCorreo = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return correo.matches(regexCorreo);
    }
    
    }
