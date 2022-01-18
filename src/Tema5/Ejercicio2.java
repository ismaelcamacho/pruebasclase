package Tema5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vector = {8, 33, 54, 68, 100};
        System.out.println("Que posicion del vector quieres conocer");
        int posicion = sc.nextInt();
        if (posicion>=0 && posicion<=vector.length) {
            System.out.println("El valor de la posicion " + posicion + " es " + vector[posicion]);
        }else{
            System.out.println("La posicion no existe");
        }
    }
}
