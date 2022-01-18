package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del empleado");
        String nombre = sc.nextLine();
        System.out.println("Saladio del empleado");
        double salario = sc.nextDouble();
        System.out.println("Numero de departamento");
        int departamento = sc.nextInt();

        if(departamento == 10){
            salario=salario+100;
        } else if(departamento == 20){
            salario=salario*1.05;
        } else if (departamento == 30){
            salario=salario*1.04;
        }else{
            salario=salario+75;
        }
        System.out.println("El empleado se lama "+nombre+", trabaja en el departament "+departamento+" y su salario es "+salario);
    }
}
