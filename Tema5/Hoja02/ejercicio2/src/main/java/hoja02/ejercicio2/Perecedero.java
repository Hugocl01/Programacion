/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja02.ejercicio2;

/**
 *
 * @author DAW102
 */
public class Perecedero extends Articulo{
    private int mes;
    private int anio;

    public Perecedero() {
        super();
    }

    public Perecedero(int mes, int anio, String codigo, String descripcion, 
            double precio) {
        super(codigo, descripcion, precio);
        this.mes = mes;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return super.toString() + " Perecedero{" + "mes=" + mes + ", anio=" + anio + '}';
    }
    
    
    
    
    
}
