package Tema5;

import java.util.Scanner;

public class Ejercicio10 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.println("Introduce el tamaño del vector");
        int n = sc.nextInt();
        leerVector(n);
    }
    public static int[] leerVector(int n){
        int [] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce un valor para la posicion " + i);
            vector[i] = sc.nextInt();
        }
        return vector;
        }
}
