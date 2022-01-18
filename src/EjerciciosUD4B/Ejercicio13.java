package EjerciciosUD4B;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número entero");
        int numero = sc.nextInt();
        for(int i=0; i<numero; i++){
            System.out.println(i+"! = "+factorial(i));
        }
    }
    public static int factorial(int numero){
        if(numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
}
