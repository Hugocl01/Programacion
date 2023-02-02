/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

/**
 *
 * @author DAW102
 */
public class EnPromocion extends Articulo {

    private int descuento;

    public EnPromocion() {
    }

    public EnPromocion(int descuento, String codigo, String descripcion, double precio) {
        super(codigo, descripcion, precio);
        this.descuento = descuento;
        this.precio = this.precio - this.precio * descuento / 100;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
}
