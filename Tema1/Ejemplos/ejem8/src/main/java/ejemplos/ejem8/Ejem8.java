/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejem8;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejem8 {

    public static void main(String[] args) {
        /*
        int kilosmanz;
        int kilosperas;
        float manzanas = 2.35F;
        float peras = 1.95F;
        float importe;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ventas de las manzanas en kilos");
        kilosmanz = teclado.nextInt();
        System.out.println("Ventas de las peras en kilos");
        kilosperas = teclado.nextInt();
        importe = (kilosmanz * manzanas) + (kilosperas * peras);
        System.out.println("Los beneficios anuales serian: " + importe*2 + "€");
        */
        
        int kilosmanz1 = 24;
        int kilosperas1 = 19;
        int kilosmanz2= 22;
        int kilosperas2 = 23;
        final float PRECIOMANZ = 2.35F;
        final float PRECIOPERAS = 1.95F;
        float semestre1 = (float)(kilosmanz1 * PRECIOMANZ) + (kilosperas1 * PRECIOPERAS);
        float semestre2 = (float)(kilosmanz2 * PRECIOMANZ) + (kilosperas2 * PRECIOPERAS);
        System.out.println("El importe 1º semestre= " + semestre1);
        System.out.println("El importe 2º semestre= " +semestre2);
        System.out.println("El importe total es= " + (semestre1 + semestre2));
    }
}
