package EjerciciosUD4;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte su nota");
        float nota = sc.nextFloat();
        if (nota >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Suspenso");
        }
    }
}
