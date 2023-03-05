package hoja10.teclado;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author DAW102 Clase con metodos estaticos para introcucir por teclado
 * distintos tipos de datos
 */
public class Teclado {

    public static int introEntero() {
        /*
         Imports necesarios para este metodo:
            java.util.Scanner;
            java.util.InputMismatchException;
        */
        int entero = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce un numero entero:");
            try {
                entero = new Scanner(System.in).nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero no es entero");
            }
        } while (!salir);
        return entero;
    }

    public static double introDouble() {
        /*
         Imports necesarios para este metodo:
            java.util.Scanner;
            java.util.InputMismatchException;
        */
        double entero = 0;
        boolean salir = false;
        do {
            System.out.println("Introduce un numero decimal:");
            try {
                entero = new Scanner(System.in).nextDouble();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("El numero no es decimal");
            }
        } while (!salir);
        return entero;
    }

    public static String introNombre() {
        /*
         Imports necesarios para este metodo:
            java.util.Scanner;
            java.util.regex.Pattern;
        */
        String nombre = "";
        boolean salir = false;
        do {
            System.out.println("Introduce un nombre:");
            nombre = new Scanner(System.in).nextLine();
            if (Pattern.matches("[A-Z][a-z]*", nombre)) {
                salir = true;
            } else {
                System.out.println("El formato del nombre no es correcto");
            }
        } while (!salir);
        return nombre;
    }

    public static boolean introBoolean() {
        /*
         Imports necesarios para este metodo:
            java.util.Scanner;
            java.util.regex.Pattern;
        */
        boolean aux = false;
        boolean salir = false;
        do {
            System.out.println("Introduce una opcion:");
            System.out.println("- Si");
            System.out.println("- No");
            String opc = new Scanner(System.in).next();
            if (Pattern.matches("[S|s|SI|Si|sI|si]*", opc)) {
                aux = true;
                salir = true;
            } else if (Pattern.matches("N|n|NO|No|nO|no*", opc)) {
                aux = false;
                salir = true;
            } else {
                System.out.println("El formato del nombre no es correcto");
            }
        } while (!salir);
        return aux;
    }

    public static LocalDate introFecha() {
        /*
         Imports necesarios para este metodo:
            java.util.Scanner;
            java.time.format.DateTimeFormatter;
            java.time.format.DateTimeParseException;
        */
        LocalDate fecha = LocalDate.now();
        boolean salir = false;
        do {
            System.out.println("Introduce la fecha con formato dd-MM-yyyy:");
            try {
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                fecha = LocalDate.parse(new Scanner(System.in).nextLine(), formato);
                salir = true;
            } catch (DateTimeParseException dtpe) {
                System.out.println("Error no has intoducido la fecha en el "
                        + "formato correcto \nRepitelo de nuevo ->");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!salir);
        return fecha;
    }

    public static void main(String[] args) {
        System.out.println(introFecha());
    }
}
