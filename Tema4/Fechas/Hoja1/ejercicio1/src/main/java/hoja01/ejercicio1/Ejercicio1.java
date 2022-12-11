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
        Letra arrayLetras[] = new Letra[3];
        //Creamos un objeto en cada posicion
        System.out.println("Datos de la 1º letra");
        arrayLetras[0] = new Letra();
        System.out.println("Datos de la 2º letra");
        arrayLetras[1] = new Letra();
        System.out.println("Datos de la 3º letra");
        arrayLetras[2] = new Letra();

        for (int i = 0; i < arrayLetras.length; i++) {
            if (arrayLetras[i].vencida()) {  //En caso de que la letra este vencida
                System.out.println(arrayLetras[i].mostrar());   //Saca los datos de la letra
                if (arrayLetras[i].DevuelveMes() == 1) { //En caso de que la letra vencio en enero
                    arrayLetras[i].demora(15); //Demora 15 dias
                }
            } else {    //En caso de que la letra no este vencida
                System.out.println("El titular es: " + arrayLetras[i].getTitular());    //Saca el titular 
                System.out.println("Los dias que faltan son: " + arrayLetras[i].diasFaltan());    //Saca el nº de dias que faltan
            }
        }
    }
}
