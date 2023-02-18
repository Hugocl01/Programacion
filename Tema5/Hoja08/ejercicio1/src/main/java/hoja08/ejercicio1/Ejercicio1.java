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
        Alumno[] alumnos = new Alumno[4];
        boolean salir = false;
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Datos del " + (i + 1) + "º alumno");
            alumnos[i] = new Alumno(Datos.numNotas());
        }
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i].mostar();
        }
        do {
            try {
                int pos = Datos.posicion();
                alumnos[pos - 1].mostar();
                salir = true;
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("Array recorrido no hay mas datos");
            }
        } while (!salir);
    }
}
