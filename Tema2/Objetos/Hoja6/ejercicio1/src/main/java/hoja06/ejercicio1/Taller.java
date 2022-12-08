/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Taller {
    //Atributos
    private double aceite;
    private int ruedas;
    private int contadorCambiosCompletos;
    private int contadorCambiosParciales;
    
    //Constructor
    public Taller(int bidonesAceite, int ruedas) {
        this.aceite = bidonesAceite * 5;
        this.ruedas = ruedas;
    }
    
    //Constructor copia
    public Taller(Taller taller) {
        this.aceite = taller.aceite;
        this.ruedas = taller.ruedas;
    }
    
    public void addAceite(int bidonesAceite) {
        this.aceite += bidonesAceite * 5;
    }

    public void addRuedas(int ruedas) {
        this.ruedas += ruedas;
    }

    public int getCambiosCompletos() {
        if (this.aceite / 3 >= this.ruedas / 4) {
            return this.ruedas / 4;
        } else {
            return (int) this.aceite / 3;
        }
    }

    public int getCambiosParcial() {
        if (this.aceite / 3 >= this.ruedas / 2) {
            return this.ruedas / 2;
        } else {
            return (int) this.aceite / 3;
        }
    }

    public void cambioCompleto() {
        if(aceite>3 && ruedas>4){
            this.aceite -= 3;
            this.ruedas -= 4;
            contadorCambiosCompletos++;
        }else{
            System.out.println("No se puede realizar el cambio por falta de existencias");
        }
    }

    public void cambioParcial() {
        if(aceite>3 && ruedas>2){
        this.aceite -= 3;
        this.ruedas -= 2;
        contadorCambiosParciales++;
        }else{
            System.out.println("No se puede realizar el cambio por falta de existencias");
        }
    }

    public double getAceite() {
        return aceite;
    }

    public int getRuedas() {
        return ruedas;
    }

    @Override
    public String toString() {
        double ingresos = contadorCambiosParciales * ((5 * 3) + (60 * 2))
                + contadorCambiosCompletos * ((4.5 * 3) + (50 * 4));
        String cadena = String.format("TALLER\nEXITENCIAS:\n\tRuedas: %d unidades.\n"
                + "\tAceite: %,.2f litros.\nINGRESOS: Total: %,.2f €",
                 this.ruedas, this.aceite, ingresos);
        return cadena;
    }
}
