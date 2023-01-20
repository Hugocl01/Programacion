/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja08.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Multiplicar array1= new Multiplicar();
        array1.muestra();
        array1.multiplica();
        System.out.println("Multiplicamos ->");
        array1.muestra();
        System.out.println("Valores aspa");
        array1.valoresAspa();
        System.out.println("Tabla de multiplicar");
        int aux[] = array1.tablaMultiplicar(2);
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i]);
        }
    }
}
