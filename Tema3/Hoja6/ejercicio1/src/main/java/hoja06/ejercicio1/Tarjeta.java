/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja06.ejercicio1;

/**
 *
 * @author DAW102
 */
public class Tarjeta {

    private String nombre;
    private String numCuenta;
    private int pin;
    private Estado estado;
    private double saldo;

    public Tarjeta(String nombre, String numCuenta, double saldo) {
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.pin = (int) Math.floor(Math.random() * 9999) + 1000;
        this.estado = Estado.BLOQUEADA;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void desbloquea(int pinUsuario) {
        if (this.pin == pinUsuario) {
            estado = estado.HABILITADA;
        } else {
            estado = estado.BLOQUEADA;
        }
    }

    public void pagar(double importe, int pinUsuario, String descripcion, boolean propina) {
        if (this.estado == Estado.HABILITADA) {
            if (this.pin == pinUsuario) {
                if (propina) {
                    if (this.saldo >= importe * 1.05) {
                        this.saldo -= importe * 1.05;
                        //System.out.printf("Pago aceptado de: %2,.f€\n" , (importe * 1.05));
                        imprimirTicket(importe, descripcion, propina);
                    } else {
                        System.out.println("No hay saldo suficiente");
                    }
                } else {
                    if (this.saldo >= importe) {
                        this.saldo -= importe;
                        //System.out.printf("Pago aceptado de: %2,.f€\n" , importe);
                        imprimirTicket(importe, descripcion, propina);
                    } else {
                        System.out.println("No hay saldo suficiente");
                    }
                }
            } else {
                System.out.println("El pin no es correcto");
            }
        } else {
            System.out.println("La tarjeta esta bloqueada");
        }
    }

    private void imprimirTicket(double importe, String descripcion, boolean propina) {
        System.out.println("\t****Ticket de compra****");
        System.out.println("Nombre: " + nombre);
        System.out.print("Numero de cuenta: ");
        System.out.print("");
        for (int i = 0; i < numCuenta.length(); i++) {
            if (i < 4) {
                System.out.print(numCuenta.charAt(i));
            } else {
                System.out.print("*");
            }
        }
        System.out.println("");//salto de linea
        System.out.println("Descripcion: " + descripcion.substring(0, 8));
        System.out.printf("Valor de la compra: %,.2f€\n" , importe);
        if (propina) {
            System.out.printf("Cargos: %,.2f€\n" , (importe * 0.05));
            System.out.printf("Total del cargo: %,.2f€\n" , (importe * 1.05));
        } else {
            System.out.printf("Total del cargo: %,.2f€\n" , importe);
        }
    }

}
