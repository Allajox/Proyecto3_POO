package tec.proyecto3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author allaj
 */
public class manejoArchivos {
    /**
     * Guarda el archivo de texto
     * 
     * @param tipoCategoria
     * @param autor
     * @param apellido
     * @param nombre
     * @param descripcion
     * @param informacion
     * @param tiempoDescomposicion
     */
    public static void guardarArchivo(String tipoCategoria, String autor, String apellido, String nombre, String descripcion, String informacion, String tiempoDescomposicion) {
        // no es necesario usar .close() por Try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write("Categoría: " + tipoCategoria + "\n\n");
            writer.write("Nombre: " + nombre + "\n\n");
            writer.write("Aporte por: " + autor + " " + apellido + "\n\n");
            writer.write("Descripción: " + descripcion + "\n\n");
            writer.write("Información de tratamiento: " + informacion + "\n\n");
            writer.write("Tiempo de descomposición: " + tiempoDescomposicion + "\n\n");
        } catch (IOException e) {
            System.out.println(e);
        } // catch
    }
    
    /**
     * 
     * @param reciclable
     * @param noReciclable
     */
    public static void cargarArchivo(Categoria reciclable, Categoria noReciclable) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            String tipoCategoria = "";
            String autor = "", apellidoAutor = "", nombre = "", descripcion = "", informacion = "", tiempoDescomposicion = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("Categoría:")) {
                tipoCategoria = line.substring(10).trim();
                } else if (line.startsWith("Nombre:")) {
                   nombre = line.substring(7).trim();
                } else if (line.startsWith("Aporte por:")) {
                    String[] partes = line.substring(12).split(" ");
                    autor = partes[0];
                    apellidoAutor = partes[1];
                } else if (line.startsWith("Descripción:")) {
                    descripcion = line.substring(12).trim();
                } else if (line.startsWith("Información de tratamiento:")) {
                    informacion = line.substring(26).trim();
                } else if (line.startsWith("Tiempo de descomposición:")) {
                    tiempoDescomposicion = line.substring(26).trim();
                } else if (!line.isEmpty()) {
                    nombre = line;
                }
                
                if (!nombre.isEmpty() && !autor.isEmpty() && !apellidoAutor.isEmpty() && 
                    !descripcion.isEmpty() && !informacion.isEmpty() && !tiempoDescomposicion.isEmpty()) {

                    if (tipoCategoria.equals("Reciclable")) {
                    reciclable.agregarSubcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
                    } else if (tipoCategoria.equals("No reciclable")) {
                    noReciclable.agregarSubcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
                    }
                    // Reinicia las variables para la próxima subcategoría
                    tipoCategoria = "";
                    autor = "";
                    apellidoAutor = "";
                    nombre = "";
                    descripcion = "";
                    informacion = "";
                    tiempoDescomposicion = "";
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}
