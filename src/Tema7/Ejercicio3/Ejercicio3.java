package Tema7.Ejercicio3;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        List <Integer> lista = new ArrayList<Integer>();
        for (int i =1; i<=10; i++){
            System.out.println("Introduce el numero " + i);
            num = s.nextInt();
            lista.add(num);
        }
        System.out.println("La lista sin rodenar");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("La lista ordenada");
        System.out.println(lista);
    }
}
