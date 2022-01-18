package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int edad;
        while (i < 3) {
            do {
                System.out.println("Introduce un nombre");
                String nombre = sc.nextLine();
                System.out.println("Introduce su edad");
                edad = sc.nextInt();
                i++;
            }while (edad < 13 || edad > 100);
                    System.out.println("Edad incorrecta");
        }
    }
}
