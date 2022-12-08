/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Primer objeto
        Taller taller1 = new Taller(7,26);
        System.out.printf("El aceite del taller es: %,.2f litros\n" , taller1.getAceite());
        System.out.println("Las ruedas del taller son: " + taller1.getRuedas());
        taller1.addAceite(3);
        System.out.println("Añadimos 3 bidones de aceite");
        taller1.addRuedas(9);
        System.out.println("Añadimos 9 ruedas");
        System.out.printf("El aceite del taller es: %,.2f litros\n" , taller1.getAceite());
        System.out.println("Las ruedas del taller son: " + taller1.getRuedas());
        System.out.println("Cambios completos que puedo hacer: " + taller1.getCambiosCompletos());
        System.out.println("Cambios parciales que puedo hacer: " + taller1.getCambiosParcial());
        taller1.cambioCompleto();
        taller1.cambioParcial();
        System.out.println("Hacemos un cambio completo y otro parcial");
        System.out.println("Cambios completos que puedo hacer: " + taller1.getCambiosCompletos());
        System.out.println("Cambios parciales que puedo hacer: " + taller1.getCambiosParcial());
        System.out.println(taller1);    //Si esta definido el metodo toString() java saca por pantalla todo el toString() 
        
        //Segundo objeto (creado con el constructor copia)
        Taller taller2 = new Taller(taller1);
        System.out.printf("El aceite del taller es: %,.2f litros\n" , taller2.getAceite());
        System.out.println("Las ruedas del taller son: " + taller2.getRuedas());
        taller2.addAceite(3);
        System.out.println("Añadimos 3 bidones de aceite");
        taller2.addRuedas(9);
        System.out.println("Añadimos 9 ruedas");
        System.out.printf("El aceite del taller es: %,.2f litros\n" , taller2.getAceite());
        System.out.println("Las ruedas del taller son: " + taller2.getRuedas());
        System.out.println("Cambios completos que puedo hacer: " + taller2.getCambiosCompletos());
        System.out.println("Cambios parciales que puedo hacer: " + taller2.getCambiosParcial());
        taller2.cambioCompleto();
        taller2.cambioParcial();
        System.out.println("Hacemos un cambio completo y otro parcial");
        System.out.println("Cambios completos que puedo hacer: " + taller2.getCambiosCompletos());
        System.out.println("Cambios parciales que puedo hacer: " + taller2.getCambiosParcial());
        System.out.println(taller2);
    }
}
