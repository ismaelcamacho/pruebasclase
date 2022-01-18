package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero = 0;
        int i = 0;
        while (i < 5) {
            System.out.println("Introduce un numero");
            numero = sc.nextInt();
            suma = suma + numero;
            i++;
        }
        System.out.println("La suma es " + suma);
    }
}
