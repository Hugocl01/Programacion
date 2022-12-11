/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja01.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Creamos un array de la clase Letra
        Letra arrayLetras[] = new Letra [3];
        //Creamos un objeto en cada posicion
        arrayLetras[0] = new Letra();
        arrayLetras[1] = new Letra();
        arrayLetras[2] = new Letra();
        
        for (int i = 0; i < arrayLetras.length; i++) {
            if(arrayLetras[i].vencida()) {
                arrayLetras[i].mostrar();
            }
        }
    }
}
