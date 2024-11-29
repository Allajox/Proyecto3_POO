package tec.proyecto3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author allaj
 */
public class ManejoArchivos {
    private static ManejoArchivos instancia;
    
    public ManejoArchivos() {
        
    }
    
    public static ManejoArchivos getInstancia() {
        if (instancia == null) {
            instancia = new ManejoArchivos();
        }
        return instancia;
    }
    
    /**
     * Guarda el archivo de texto
     * 
     * @param tipoCategoria String
     * @param autor String
     * @param apellido String
     * @param nombre String
     * @param descripcion String
     * @param informacion String
     * @param tiempoDescomposicion String
     */
    public static void guardarArchivo(String tipoCategoria, String autor, String apellido, 
            String nombre, String descripcion, String informacion, String tiempoDescomposicion) throws MiExcepcion {
        // valida si el todos los valores son correctos
        if (nombre == null || nombre.isEmpty() || descripcion == null || descripcion.isEmpty() ||
        informacion == null || informacion.isEmpty() || tiempoDescomposicion == null || tiempoDescomposicion.isEmpty()) {
            throw new MiExcepcion(CODIGOS_ERROR.RESIDUO_REQUISITOS);
        }
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
        }
    }
    
    public static List<Subcategoria> cargarResiduos() {
        List<Subcategoria> residuos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            String tipoCategoria = "", autor = "", apellidoAutor = "", nombre = "", descripcion = "", informacion = "", tiempoDescomposicion = "";

            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Elimina espacios en blanco al inicio y final
                if (line.startsWith("Categoría:")) {
                    tipoCategoria = line.substring(10).trim();
                } else if (line.startsWith("Nombre:")) {
                    nombre = line.substring(7).trim();
                } else if (line.startsWith("Aporte por:")) {
                    String[] partes = line.substring(12).split(" ");
                    autor = partes.length > 0 ? partes[0] : "";
                    apellidoAutor = partes.length > 1 ? partes[1] : "";
                } else if (line.startsWith("Descripción:")) {
                    descripcion = line.substring(12).trim();
                } else if (line.startsWith("Información de tratamiento:")) {
                    informacion = line.substring(27).trim();
                } else if (line.startsWith("Tiempo de descomposición:")) {
                    tiempoDescomposicion = line.substring(25).trim();
                }

                // si todas las casillas están llenas, crea una nueva subcategoría
                if (!tipoCategoria.isEmpty() && !nombre.isEmpty() && !autor.isEmpty() &&
                    !apellidoAutor.isEmpty() && !descripcion.isEmpty() &&
                    !informacion.isEmpty() && !tiempoDescomposicion.isEmpty()) {

                    Subcategoria residuo = new Subcategoria(tipoCategoria, autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
                    residuos.add(residuo);

                    // Reiniciar las variables para el próximo residuo
                    tipoCategoria = "";
                    autor = "";
                    apellidoAutor = "";
                    nombre = "";
                    descripcion = "";
                    informacion = "";
                    tiempoDescomposicion = "";
                } 
            }
        }  catch (IOException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());   
        }
        return residuos;
    }

    
    /**
     * Carga el archivo de texto. Crea nuevos objetos de tipo subcategoría
     * con la información del archivo
     * 
     * @param reciclable objeto tipo Reciclable
     * @param noReciclable objeto tipo NoReciclable
     */
//    public static void cargarArchivo(Categoria reciclable, Categoria noReciclable) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
//            String line;
//            String tipoCategoria = "", autor = "", apellidoAutor = "", nombre = "", descripcion = "", informacion = "", tiempoDescomposicion = "";
//
//            while ((line = reader.readLine()) != null) {
//                line = line.trim(); // .trim() quita los espacios en blanco
//                if (line.startsWith("Categoría:")) {
//                    tipoCategoria = line.substring(10).trim(); // substring() es para ignorar los caracteres antes de los 2 puntos
//                    
//                    } else if (line.startsWith("Nombre:")) {
//                       nombre = line.substring(7).trim();
//                       
//                    } else if (line.startsWith("Aporte por:")) {
//                        // se hace una lista, se divide en 2 con .split(), y a autor y apellido se le asignan las 2 partes
//                        String[] partes = line.substring(12).split(" ");
//                        autor = partes[0];
//                        apellidoAutor = partes[1];
//                        
//                    } else if (line.startsWith("Descripción:")) {
//                        descripcion = line.substring(12).trim();
//                        
//                    } else if (line.startsWith("Información de tratamiento:")) {
//                        informacion = line.substring(26).trim();
//                        
//                    } else if (line.startsWith("Tiempo de descomposición:")) {
//                        tiempoDescomposicion = line.substring(26).trim();
//                        
//                    } else if (!line.isEmpty()) {
//                        nombre = line;
//                    }
//                
//                // si todas las casillas están llenas, crea una nueva categoría
//                if (!nombre.isEmpty() && !autor.isEmpty() && !apellidoAutor.isEmpty() && 
//                    !descripcion.isEmpty() && !informacion.isEmpty() && !tiempoDescomposicion.isEmpty()) {
//                    
//                    // dependiendo de la categoría, añade la subcategoría
//                    if (tipoCategoria.equals("Reciclable")) {
//                    reciclable.agregarSubcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
//                    } else if (tipoCategoria.equals("No reciclable")) {
//                    noReciclable.agregarSubcategoria(autor, apellidoAutor, nombre, descripcion, informacion, tiempoDescomposicion);
//                    }
//                    // Reinicia las variables para la próxima subcategoría
//                    tipoCategoria = "";
//                    autor = "";
//                    apellidoAutor = "";
//                    nombre = "";
//                    descripcion = "";
//                    informacion = "";
//                    tiempoDescomposicion = "";
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error al cargar el archivo: " + e.getMessage());
//        }
//    }
}
