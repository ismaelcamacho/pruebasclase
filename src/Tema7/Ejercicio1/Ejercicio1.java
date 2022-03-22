package Tema7.Ejercicio1;

import java.util.*;

public class Ejercicio1 {
    public static void main (String[] args) {
        List <Integer> lista = new ArrayList<Integer>();
        int suma, maximo, minimo;
        suma = 0;
        maximo = 0;
        minimo = 0;
        int longitud = (int) (Math.random() * 11 + 10);
        int numero;
        for (int i = 1; i <= longitud; i++) {
            numero = (int) (Math.random() * 101);
            lista.add(numero);
        }
        for (int n : lista) {
            suma = suma + n;
            if (n > maximo) {
                maximo = n;
            }
            if (n < minimo) {
                minimo = n;
            }
        }
        System.out.println("Suma: " + suma + ", la media: " + (suma / longitud) + ", el maximo: " + maximo + ", el minimo: " + minimo);
    }
}
