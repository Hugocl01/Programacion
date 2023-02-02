/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package hoja02.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author DAW102
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Articulo[] articulos = new Articulo[10];
        for (int i = 0; i < 5; i++) {
            articulos[i] = new Perecedero(1, 2020+i, "Codigo","Descipcion",5.10);
        }
        for (int i = 5; i < articulos.length; i++) {
            articulos[i] = new EnPromocion(20,"Codigo", "Descripcion", 3.40);
        }

        System.out.println("Visualizar los datos de los articulos en promocion:");
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] instanceof EnPromocion) {
                System.out.println(articulos[i].toString());
            }
        }

        System.out.println("Visualizar los datos de los articulos perecederos:");
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] instanceof Perecedero) {
                System.out.println(articulos[i].toString());
            }
        }

        System.out.println("Visualizar los datos de los articulos caducados:");
        LocalDate fhoy = LocalDate.now();
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] instanceof Perecedero) {
                Perecedero pereAux = (Perecedero) articulos[i];
                if (pereAux.getAnio() < fhoy.getYear()) {
                    System.out.println("Ha caducado");
                } else if ((pereAux.getMes() <= fhoy.getMonthValue())
                        && (pereAux.getAnio() == fhoy.getYear())) {
                    System.out.println("El producto caduco este año: "
                            + pereAux.getAnio() + " y este mes: " + pereAux.getMes());
                }
            }
        }
        
        System.out.println("Articulo con el maximo descuento:");
        int max = Integer.MIN_VALUE, pos = -1;
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] instanceof EnPromocion promoAux) {
                if (max < promoAux.getDescuento()) {
                    max = promoAux.getDescuento();
                    pos = i;
                }
            }
        }
        System.out.println(articulos[pos].toString());
    }
}
