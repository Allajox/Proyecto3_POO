/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tec.proyecto3;

/**
 *
 * @author draga
 */
public class Estado {
    // Variable estática para almacenar el valor
    private static boolean valor;

    // Método estático para obtener el valor
    public static boolean getValue() {
        return valor;
    }

    // Método estático para establecer el valor
    public static void setValue(boolean e) {
        valor = e;
    }
}