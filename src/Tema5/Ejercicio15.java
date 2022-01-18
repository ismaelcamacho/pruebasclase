package Tema5;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[]args){
        int [] vector = leerVector(4);
        System.out.println("El vector introducido es: ");
        mostrarVector(vector);
        int ultimo = vector[vector.length-1];
        for(int i = vector.length-1; i>0; i--){
            vector[i] = vector[i-1];
        }
        vector[0] = ultimo;
        System.out.println("El vector ordenado es: ");
        mostrarVector(vector);

    }
    public static int[] leerVector(int n){
        Scanner s = new Scanner(System.in);
        int [] vector = new int[n];
        for (int i = 0; i <vector.length; i++) {
            System.out.println("Introduce el valor del elemento " + (i+1) + " del vector");
            vector[i] = s.nextInt();
        }
        return vector;
    }
    public static void mostrarVector(int [] vector){
        System.out.print("{");
        for (int i = 0; i <vector.length-1; i++) {
            System.out.print(vector[i] + ",");
            System.out.print(vector[vector.length-1] + "}");
        }
    }
}
