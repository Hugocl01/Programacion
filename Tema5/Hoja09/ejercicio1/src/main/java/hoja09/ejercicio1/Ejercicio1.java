/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja09.ejercicio1;

import javax.security.auth.kerberos.EncryptionKey;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        try {
            Exception ex = new Exception("Error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Paso por aqui");   
        }
    }
}
