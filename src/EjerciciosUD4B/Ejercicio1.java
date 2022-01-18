package EjerciciosUD4B;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int clave = 1234;
        System.out.println("Escribe la clave");
        int claveIntroducida = sc.nextInt();
        if (clave == claveIntroducida && contador<4){
            System.out.println("Clave correcta");
        }else{
            System.out.println("Clave incorrecta");
            contador++;
        }

    }
}
