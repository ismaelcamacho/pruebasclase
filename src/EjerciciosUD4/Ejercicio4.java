package EjerciciosUD4;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num = sc.nextInt();
        if(num == 100){
            System.out.println("El número es "+num+" y 100+200="+(num+200));
        }if(num>100 && num<201){
            System.out.println("El número es "+num+" y el número multiplicado por 2 es="+num*2);
        }if (num<0){
            System.out.println("El número es "+num+" y el número absoluto es NEGATIVO");
        }
    }
}
