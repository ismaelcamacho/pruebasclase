package Tema5;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas filas tendra la matriz?");
        int filas = sc.nextInt();
        System.out.println("Cuantas columnas tendra la matriz?");
        int columnas = sc.nextInt();
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Introduzca el valor de la posicion " + i + "," + j);
                matriz[i][j] = sc.nextInt();
            }
        }
        mostrarmatriz(matriz);
    }
    public static void mostrarmatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
