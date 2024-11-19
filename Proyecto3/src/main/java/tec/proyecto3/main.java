package tec.proyecto3;

import java.util.Scanner;

/**
 *
 * @author allaj
 */
public class main {
    
    public static void main(String[] args) throws Exception{
        
        SistemaIniciarSesion sistema = new SistemaIniciarSesion();
        
        Scanner nombre1 = new Scanner(System.in);
        Scanner apellido1 = new Scanner(System.in);
        Scanner contraRegistro = new Scanner(System.in);
        Scanner correoRegistro = new Scanner(System.in);
        Scanner contraIniciar = new Scanner(System.in);
        Scanner correoIniciar = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = nombre1.nextLine();
        
        System.out.print("Ingrese su apellido: ");
        String apellido = apellido1.nextLine();

        System.out.print("Ingrese su correo: ");
        String correo = correoRegistro.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contraseña = contraRegistro.nextLine();

        sistema.registrarCuenta(nombre, apellido, correo, contraseña);
        
        System.out.print("Ingrese su correo: ");
        String correoI = correoIniciar.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contraseñaI = contraIniciar.nextLine();
        
        sistema.iniciarSesion(correoI, contraseñaI);
        System.out.println(sistema.getAutor());

        Subcategoria sub = new Subcategoria(nombre, apellido, "Basura orgánica", "*Muro de texto*");
        
        System.out.println(sub.toString());
    }
}
