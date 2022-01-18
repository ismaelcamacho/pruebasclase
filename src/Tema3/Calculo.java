package Tema3;

import java.util.Scanner;

public class Calculo {
    public static int suma(int x, int y){
        return x+y;
    }
    public static int producto(int x, int y){
        return x*y;
    }
    public static int resta(int x, int y){
        return x-y;
    }
    public static int media(int x, int y){
        return (x*y)/2;
    }
    public static int resto(int x, int y){
        return x%y;
    }
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduce un numero");
        num1 = s.nextInt();
        System.out.println("Introduce otro numero");
        num2 = s.nextInt();
        System.out.println("La suma del primer y segundo numero es: "+suma(num1,num2));
        System.out.println("El producto del primer y segundo numero es: "+producto(num1,num2));
        System.out.println("La resta del primer y segundo numero es: "+resta(num1,num2));
        System.out.println("La media del primer y segundo numero es: "+media(num1,num2));
        System.out.println("El resto de la division del primer y segundo numero es: "+resto(num1,num2));
    }
    //methods that return a random value
    public static int random(){
        return (int)(Math.random()*100);
    }
    //main method that uses the random method
    public static void main2 (String [] args) {
        System.out.println("El numero random es: "+random());
    }

}
