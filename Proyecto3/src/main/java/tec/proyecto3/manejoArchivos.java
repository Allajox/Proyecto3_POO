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
     * @param autor
     * @param apellido
     * @param nombre
     * @param descripcion
     * @param informacion
     * @param tiempoDescomposicion
     */
    public static void guardarArchivo(String autor, String apellido, String nombre, String descripcion, String informacion, String tiempoDescomposicion) {
        // no es necesario usar .close() por Try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {
            writer.write(nombre + "\n\n");
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
     * @param categoria
     */
    public static void cargarArchivo(Categoria categoria) throws MiExcepcion {
        // no es necesario usar .close() por Try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            String autor = "", apellidoAutor = "", nombre = "", descripcion = "", informacion = "", tiempoDescomposicion = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim(); // trim() elimina espacios en blanco
                if (line.startsWith("Aporte por:")) {
                    // substring() hace que se ignore el texto hasta cierto punto, hasta 11 en este caso
                    String[] partes = line.substring(11).split(" "); // split separa el string original en 2 cuando se encuentra un espacio
                    autor = partes[0]; // elige qué parte del split se va a usar
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

                // si todas las casillas tienen texto, se añade la subcategoría
                if (!autor.isEmpty() && !apellidoAutor.isEmpty() && !nombre.isEmpty() && 
                    !descripcion.isEmpty() && !informacion.isEmpty() && !tiempoDescomposicion.isEmpty()) {
                    categoria.agregarSubcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);

                    // Reinicia las variables para la próxima subcategoría
                    autor = "";
                    apellidoAutor = "";
                    nombre = "";
                    descripcion = "";
                    informacion = "";
                    tiempoDescomposicion = "";
                } else {
                    throw new MiExcepcion(CODIGOS_ERROR.SUBCATEGORIA_REQUISITOS);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
        }
    }
}
