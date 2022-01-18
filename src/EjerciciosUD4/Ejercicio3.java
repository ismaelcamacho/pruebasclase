package EjerciciosUD4;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();
        if (edad >= 18){
            System.out.println("Tu nombre es "+nombre+" y eres mayor de edad");
        }else{
            System.out.println("Tu nombre es "+nombre+" y eres menor de edad");
        }
    }
}
