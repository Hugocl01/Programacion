/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja08.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Array matriz1= new Array();
        matriz1.introducir();
        matriz1.mostrar();
        System.out.println("La media es: " + matriz1.media());
        matriz1.modificar(2, 6);
        matriz1.rotarIzquierda();
        matriz1.mostrar();
        matriz1.rotarDerecha();
        matriz1.mostrar();
        int a[]={1,2,3,4,5,6,7,8,9,0};
        matriz1.comparar(a);
        matriz1.sumaPares();
        matriz1.multiplos(3);
        matriz1.mostrar();
    }
}
