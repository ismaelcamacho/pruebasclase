package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String [] args){
        int counter = 0;
        int suma=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce un número");
            int num = sc.nextInt();
            suma=suma+num;
            counter++;
        }while(counter < 5);
        System.out.println("La suma total es: "+suma);
    }
}
