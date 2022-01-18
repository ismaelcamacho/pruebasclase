package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el número de un mes");
        int mes = sc.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero, la productividad es: "+(100+15));
                break;
            case 2:
                System.out.println("Febrero, la productividad es: "+(100+15));
                break;
            case 3:
                System.out.println("Marzo, la productividad es: "+(100+15));
                break;
            case 4:
                System.out.println("Abril, la productividad es: "+(100+17));
                break;
            case 5:
                System.out.println("Mayo, la productividad es: "+(100+17));
                break;
            case 6:
                System.out.println("Junio, la productividad es: "+(100+17));
                break;
            case 7:
                System.out.println("Julio, la productividad es: "+(100));
                break;
            case 8:
                System.out.println("Agosto, la productividad es: "+(100));
                break;
            case 9:
                System.out.println("Septiembre, la productividad es: "+(100+20));
                break;
            case 10:
                System.out.println("Octubre, la productividad es: "+(100+20));
                break;
            case 11:
                System.out.println("Noviembre, la productividad es: "+(100+20));
                break;
            case 12:
                System.out.println("Diciembre, la productividad es: "+(100+21));
                break;
        }
    }
}
