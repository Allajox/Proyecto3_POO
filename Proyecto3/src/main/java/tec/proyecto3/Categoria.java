package tec.proyecto3;

/**
 *
 * @author allaj
 */
public abstract class Categoria {
    private String tipo; // Reciclable o no reciclable
    private String descripcion;

    public Categoria(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void agregarSubcategoria(String categoria, String autor, String apellidoAutor, String nombre, String descripcion, String informacion, String tiempoDescomposicion);
    
    public abstract void mostrarSubcategorias();

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nDescripción: " + descripcion;
    }
}
