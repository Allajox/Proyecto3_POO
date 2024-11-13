package tec.proyecto3;

import java.util.Scanner;

/**
 *
 * @author allaj
 */
public class main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Ingrese su correo: ");
        String correo = scanner2.nextLine();
        
        if (ValidarCredenciales.validarCorreo(correo)) {
            System.out.println("Correo registrado correctamente.");
        } else {
            System.out.println("Formato de correo incorrecto.");
        }
        
        System.out.print("Ingrese su contraseña: ");
        String contraseña = scanner.nextLine();
        
        if (ValidarCredenciales.validarContraseña(contraseña)) {
            System.out.println("Contraseña registrada correctamente.");
        } else {
            System.out.println("La contraseña debe tener al menos una letra mayúscula, un número y un carácter especial.");
        }
        
        
        
        
    }
}
