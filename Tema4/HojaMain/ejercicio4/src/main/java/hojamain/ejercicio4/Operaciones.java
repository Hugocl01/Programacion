/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hojamain.ejercicio4;

/**
 *
 * @author hugoc
 */
public class Operaciones {

    private int a;
    private int b;

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void suma() {
        int suma = a + b;
        System.out.println("La suma es: " + suma);
    }

    public void resta() {
        int resta = a - b;
        System.out.println("La suma es: " + resta);
    }

    public void multiplicacion() {
        int multi = a * b;
        System.out.println("La suma es: " + multi);
    }

    public void division() {
        int divi = a / b;
        System.out.println("La suma es: " + divi);
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        Operaciones op = new Operaciones(a, b);
        op.suma();
        op.resta();
        op.multiplicacion();
        op.division();
    }
}
