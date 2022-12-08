/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ejemplos.ejem7;

import java.util.Scanner;

/**
 *
 * @author hugoc
 */
public class Ejem7 {

    public static void main(String[] args) {
        /*
        boolean llover;
        boolean tareas;
        boolean biblio;
        boolean permiso;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esta lloviendo?");
        llover = teclado.nextBoolean();
        System.out.println("Has finalizado las tareas?");
        tareas = teclado.nextBoolean();
        System.out.println("Necesitas ir a la biblioteca?");
        biblio = teclado.nextBoolean();
        if(biblio == false){
            if(llover == false){
                if(tareas == true){
                    permiso= true;
                    System.out.println("Tienes permiso para salir a la calle");
                }else{
                    permiso= false;
                    System.out.println("No tienes permiso para salir a la calle");
                }
            }else{
                permiso= false;
                System.out.println("No tienes permiso para salir a la calle");
            }
        }else{
            permiso= true;
            System.out.println("Tienes permiso para salir a la calle");
        }
         */
        
        boolean llover = true; //true si llueve
        boolean tareas = true;  //true si las tareas estan acabadas
        boolean biblio = false; //true si quiere ir a la biblioteca
        boolean permiso = (!llover && tareas) || biblio;
        System.out.println(permiso);

    }
}
