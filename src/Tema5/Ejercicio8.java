package Tema5;

public class Ejercicio8 {
    public static void main (String[] args) {
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mostrarVector(vector);
    }
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
    }
}
