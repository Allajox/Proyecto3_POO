package tec.proyecto3;

/**
 *
 * @author allaj
 */
public class Subcategoria {
    private String autor;
    private String apellidoAutor;
    private String nombre;
    private String descripcion;
    private String informacion;
    private String tiempoDescomposicion;

    public Subcategoria(String autor, String apellidoAutor, String nombre, String descripcion, String informacion, String tiempoDescomposicion) {
        this.autor = autor;
        this.apellidoAutor = apellidoAutor;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.informacion = informacion;
        this.tiempoDescomposicion = tiempoDescomposicion;
    }

    public String getAutor() {
        return autor;
    }

    public String getApellidoAutor() {
        return apellidoAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInformacion() {
        return informacion;
    }

    public String getTiempoDescomposicion() {
        return tiempoDescomposicion;
    }

    @Override
    public String toString() {
        String resultado = "Nombre: " + nombre + "\n\n";
        resultado += "Aporte por: " + autor + " " + apellidoAutor + "\n\n";
        resultado += "Descripción: " + descripcion + "\n\n";
        resultado += "Información de tratamiento: " + informacion + "\n\n";
        resultado += "Tiempo de descomposición: " + tiempoDescomposicion;
        return resultado;
    }
    
    
}
