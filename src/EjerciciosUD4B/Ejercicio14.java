package EjerciciosUD4B;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String [] args) {
        int entrada = 8;
        int pareja = 11;
        int dEspectador = 5;
        double precio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa");
        System.out.println("Introduzca el numero de entradas");
        int cantidad = sc.nextInt();
        System.out.println("Tiene tarjeta de socio?(s/n)");
        String socio = sc.next();
        System.out.println("Que dia de la semana quiere las entradas?");
        String dia = sc.next();
        if (dia != "jueves" && dia != "miercoles" && socio == "s") {
            precio = cantidad * entrada * 0.90;
        }if (dia != "jueves" && dia != "miercoles" && socio == "n") {
            precio = cantidad * entrada;
        }
        System.out.println("El precio total es: " + precio);
    }
}
