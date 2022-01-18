package Tema5;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        System.out.println("Introduce un número entero: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] v = new int [n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        //print the vector
        for (int i = 0; i < n; i++) {
            System.out.print(v[i] + " ");
        }
    }
}
