/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Almacen {
    
    private Articulo[] articulos;

    public Almacen(int num) {
        this.articulos =new Articulo[num];
    }
    
    public void llenar() {
        for (int i = 0; i < articulos.length; i++) {
            articulos[i] = new Articulo();
        }
    }
    
    public void pedidos() {
        for (int i = 0; i < articulos.length; i++) {
            if(articulos[i].getExistencias()<10){
                System.out.println("****DATOS****");
                System.out.println("Codigo: " + articulos[i].getCodigo());
                System.out.println("Descripcion: " + articulos[i].getDescripcion());
                System.out.println("Existencias: " + articulos[i].getExistencias());
            }
        }
    }
}
