package tec.proyecto3;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author allaj
 */
public class Reciclable extends Categoria {
    private List<Subcategoria> subcategorias;

    public Reciclable(String descripcion) {
        super("Reciclable", descripcion);
        this.subcategorias = new ArrayList<>();
    }

    @Override
    public void agregarSubcategoria(String autor, String apellidoAutor, String nombre, String descripcion, String informacion, String tiempoDescomposicion) {
        Subcategoria sub = new Subcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
        subcategorias.add(sub);
    }

    public void mostrarDetallesSubcategorias() {
    for (Subcategoria subcategoria : subcategorias) {
        System.out.println(subcategoria.toString());
        System.out.println("-----------");
        }
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    @Override
    public void mostrarSubcategorias() {
        System.out.println("Subcategorías reciclables:");
        for (Subcategoria subcategoria : subcategorias) {
            System.out.println("- " + subcategoria.getNombre());
        }
    }
}
