package tec.proyecto3;

/**
 *
 * @author allaj
 */
public class Subcategoria {
    private String autor;
    private String apellidoAutor;
    private String nombre;
    private String texto;
    
    
    public Subcategoria(String autor, String apellidoAutor, String nombre, String texto) {
        this.autor = autor;
        this.apellidoAutor = apellidoAutor;
        this.nombre = nombre;
        this.texto = texto;
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
    
    public String getTexto() {
        return texto;
    }
    
    @Override
    public String toString() {
        String resultado = nombre + "\n\n";
        resultado += "Aporte por: " + autor + " " + apellidoAutor + "\n\n";
        resultado += texto;
        return resultado;
    }
    
    
}
