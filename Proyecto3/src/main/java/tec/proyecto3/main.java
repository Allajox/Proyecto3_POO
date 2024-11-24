package tec.proyecto3;

import java.util.Scanner;

/**
 *
 * @author allaj
 */
public class main {
    
    public static void main(String[] args) throws Exception{
        
        SistemaIniciarSesion sistema = new SistemaIniciarSesion();
        
//        Scanner nombre1 = new Scanner(System.in);
//        Scanner apellido1 = new Scanner(System.in);
//        Scanner contraRegistro = new Scanner(System.in);
//        Scanner correoRegistro = new Scanner(System.in);
//        Scanner contraIniciar = new Scanner(System.in);
//        Scanner correoIniciar = new Scanner(System.in);
//
//        System.out.print("Ingrese su nombre: ");
//        String nombre = nombre1.nextLine();
//        
//        System.out.print("Ingrese su apellido: ");
//        String apellido = apellido1.nextLine();
//
//        System.out.print("Ingrese su correo: ");
//        String correo = correoRegistro.nextLine();
//
//        System.out.print("Ingrese su contraseña: ");
//        String contraseña = contraRegistro.nextLine();
//
//        sistema.registrarCuenta(nombre, apellido, correo, contraseña);
//        
//        System.out.print("Ingrese su correo: ");
//        String correoI = correoIniciar.nextLine();
//        System.out.print("Ingrese su contraseña: ");
//        String contraseñaI = contraIniciar.nextLine();
//        
//        sistema.iniciarSesion(correoI, contraseñaI);
//        System.out.println(sistema.getAutor());

        Reciclable reciclable = new Reciclable("Residuos que pueden ser reutilizados.");
        NoReciclable noReciclable = new NoReciclable("Residuos que no pueden ser reciclados.");

        // Crear subcategorías
        reciclable.agregarSubcategoria("Allan","Jiménez", "Vidrio", "Material reutilizable para fabricar nuevos productos.", "Se recomienda guardarlo.", "Indefinido");
        reciclable.agregarSubcategoria("Pedro", "Pérez","Papel", "Material reutilizable para hacer más papel.", "Se recomienda guardarlo", "2-6 meses");
        noReciclable.agregarSubcategoria("Flint", "Loco", "Orgánicos", "Material que no se puede reciclar.", "Botar", "1-6 meses");

        // Mostrar subcategorías según tipo
        reciclable.mostrarSubcategorias();
        noReciclable.mostrarSubcategorias();
        reciclable.mostrarDetallesSubcategorias();
        noReciclable.mostrarDetallesSubcategorias();
        
        // guarda las subcategorias
        for (Subcategoria sub : reciclable.getSubcategorias()) {
            manejoArchivos.guardarArchivo(sub.getAutor(), sub.getApellidoAutor(), sub.getNombre(), 
                                          sub.getDescripcion(), sub.getInformacion(), sub.getTiempoDescomposicion());
        }
        for (Subcategoria sub : noReciclable.getSubcategorias()) {
            manejoArchivos.guardarArchivo(sub.getAutor(), sub.getApellidoAutor(), sub.getNombre(), 
                                          sub.getDescripcion(), sub.getInformacion(), sub.getTiempoDescomposicion());
        }
    
        // carga las subcategorias
        manejoArchivos.cargarArchivo(reciclable);
        manejoArchivos.cargarArchivo(noReciclable);
    }
}
