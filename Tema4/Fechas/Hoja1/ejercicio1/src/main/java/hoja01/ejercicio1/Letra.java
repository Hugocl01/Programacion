/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja01.ejercicio1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author DAW102
 */
public class Letra {

    private int numLetra;
    private String titular;
    private double importe;
    private LocalDate fechaVencimiento;

    public Letra() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de letra:");
        this.numLetra = teclado.nextInt();
        System.out.println("Intoduce el titular:");
        this.titular = new Scanner(System.in).nextLine();
        System.out.println("Introduce el importe:");
        this.importe = teclado.nextDouble();
        System.out.println("Introduce la fecha con formato dd-mm-yyyy:");
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fecha=LocalDate.parse(teclado.nextLine(), formato);
    }
    
    public boolean vencida(){
        boolean isBefore = fechaVencimiento.isBefore(LocalDate.now());
        return isBefore;
    }
    
    public void demora(int dias) {
        fechaVencimiento =  fechaVencimiento.plusDays(dias);
        System.out.println("La fecha de vencimiento es: " + fechaVencimiento.toString());
    }
    
    public long diasFaltan() {
        LocalDate hoy = LocalDate.now();
        long difDias = ChronoUnit.DAYS.between(fechaVencimiento, hoy);
        return difDias;
    }

    public String mostrar() {
        return "Letra{" + "numLetra=" + numLetra + ", titular=" + titular 
                + ", importe=" + importe + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
    public int DevuelveMes() {
        int mes = fechaVencimiento.getMonthValue();
        return mes;
    }
}
