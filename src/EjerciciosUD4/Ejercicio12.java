package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora");
        int hora = sc.nextInt();

        if(hora>=6 && hora<=12){
            System.out.println("Buenos días");
        } else if(hora>=13 && hora<=20){
            System.out.println("Buenas tardes");
        } else if(hora>=21 && hora<=5){
            System.out.println("Buenas noches");
        }
    }
}
