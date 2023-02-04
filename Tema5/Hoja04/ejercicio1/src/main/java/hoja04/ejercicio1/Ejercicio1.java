/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja04.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //Creacion del array
        System.out.println("Cuantas publicaciones deseas crear:");
        int num = new Scanner(System.in).nextInt();
        Publicacion publicaciones[] = new Publicacion[num];
        boolean salir = false;
        int opc = 0;
        int cont = 0;
        //Inicializacion del array
        for (int i = 0; i < publicaciones.length && !salir; i++) {
            //Menu repetitivo
            do {
                System.out.println("****Que tipo de publicacion quieres introducir****");
                System.out.println("\t1.-Libro");
                System.out.println("\t2.-Disco");
                System.out.println("\t3.-Salir");
                System.out.println("Introduce una opcion:");
                opc = new Scanner(System.in).nextInt();
                if (opc == 3) {
                    salir = true;
                }
            } while (opc != 1 && opc != 2 && opc != 3);
            if (!salir) {
                System.out.println("Introduce el titulo:");
                String titulo = new Scanner(System.in).nextLine();
                System.out.println("Introduce el autor:");
                String autor = new Scanner(System.in).nextLine();
                System.out.println("Introduce el la fecha de publicacion");
                System.out.println("Introduce el dia:");
                int dia = new Scanner(System.in).nextInt();
                System.out.println("Introduce el mes:");
                int mes = new Scanner(System.in).nextInt();
                System.out.println("Introduce el año:");
                int anio = new Scanner(System.in).nextInt();
                switch (opc) {
                    case 1 -> {
                        System.out.println("Introduce el numero de paginas del libro:");
                        int numPaginas = new Scanner(System.in).nextInt();
                        publicaciones[i] = new Libro(numPaginas, titulo, autor, anio, mes, dia);
                        cont++;
                    }
                    case 2 -> {
                        System.out.println("Introduce la diracion del disco:");
                        int duracionMinutos = new Scanner(System.in).nextInt();
                        publicaciones[i] = new Disco(duracionMinutos, titulo, autor, anio, mes, dia);
                        cont++;
                    }
                    default ->
                        System.out.println("Error al crear la publicacion");
                }
            } else {
                System.out.println("Has salido del menu");
            }
        }

        //Mostrar todos los datos del array
        for (int i = 0; i < cont; i++) {
            System.out.println(publicaciones[i].toString());
        }
        
        //Visualizar las 3 primeras letras del disco con mas minutos
        for (int i = 0; i < cont; i++) {
            if (publicaciones[i] instanceof Disco) {
                publicaciones[i]
            }
        }
        
        /*
        Visualizar el titulo y el autor del los libros editados en este mes y
        que tenga mas de 1000 paginas */
        for (int i = 0; i < cont; i++) {
            if (publicaciones[i] instanceof Libro) {
                
            }
        }
        
        //Visualizar titulo y autor de los discos editados los ultimos 2 años
        for (int i = 0; i < cont; i++) {
            if (publicaciones[i] instanceof Disco) {
                
            }
        }
        
    }
}
