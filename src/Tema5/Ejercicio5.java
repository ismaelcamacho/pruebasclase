package Tema5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] vector = new double[4];
        for (int i=0; i<vector.length; i++) {
            System.out.println("Introduce una nota");
            vector[i]=sc.nextDouble();
        }
        System.out.println("Tus notas son: "+vector[0]+", "+vector[1]+", "+vector[2]+", "+vector[3]+" y la media es: "+media(vector));
        }
    public static double media (double [] vector) {
        double media = 0;
        for (int i=0; i<vector.length; i++) {
            media+=vector[i];
        }
        return media/vector.length;
    }
}
