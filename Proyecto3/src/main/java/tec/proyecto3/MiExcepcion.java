package tec.proyecto3;

/**
 *
 * @author allaj
 */
public class MiExcepcion extends Exception{
    private CODIGOS_ERROR codExcepcion ;

    public MiExcepcion(CODIGOS_ERROR codExcepcion) {
        this.codExcepcion = codExcepcion;
    }

    public CODIGOS_ERROR getCodExcepcion() {
        return codExcepcion;
    }

    @Override
    public String getMessage() {
        String mensaje="";
        switch (codExcepcion){
            case NOMBRE_VACIO : mensaje = "El nombre no puede estar vacío"; break;
            case APELLIDO_VACIO : mensaje = "El apellido no puede estar vacío"; break;
            case CORREO_VACIO : mensaje = "El correo no puede estar vacío"; break;
            case CORREO_REQUISITOS: mensaje = "El correo no cumple con el formato"; break;
            case CONTRA_VACIA : mensaje = "La contraseña no puede estar vacía"; break;
            case CONTRA_LONGITUD: mensaje = "Contraseña con longitud incorrecta (8 caracteres)"; break;
            case CONTRA_REQUISITOS: mensaje = "La contraseña debe tener al menos una mayúscula, un número y un caracter especial"; break;
            case RESIDUO_REQUISITOS: mensaje = "Ningún espacio puede estar vacío"; break;
        }
        return mensaje;
    }   
}
