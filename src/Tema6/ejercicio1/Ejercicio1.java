package Tema6.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Alumno arrayAlumnos[] = new Alumno[5];
        for (int i=0; i<arrayAlumnos.length; i++){
            System.out.println("Introduce el nombre del alumno");
            String nombre = sc.nextLine();
            System.out.println("Introduce la nota media del alumno");
            double notaMedia = sc.nextDouble();
            arrayAlumnos[i] = new Alumno(nombre, notaMedia);
        }
        for (int i=0; i<arrayAlumnos.length; i++){
            System.out.println(arrayAlumnos);
        }
    }
}
