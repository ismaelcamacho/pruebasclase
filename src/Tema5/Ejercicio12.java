package Tema5;

public class Ejercicio12 {
    public static void main (String[]args){
        int [] vector = {5,24,33,45,55,317,85,29,20};
        System.out.println("El número mayor es: "+max(vector));
        System.out.println("El número menor es: "+min(vector));
        System.out.println("La media es: "+media(vector));
        System.out.println("La suma es: "+suma(vector));
    }
    public static int max(int [] vector){
        int mayor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] > mayor){
                mayor = vector[i];
            }
        }
        return mayor;
    }
    public static int min(int [] vector){
        int menor = vector[0];
        for(int i = 0; i < vector.length; i++){
            if(vector[i] < menor){
                menor = vector[i];
            }
        }
        return menor;
    }
    public static int media (int [] vector) {
        int media = 0;
        for (int i=0; i<vector.length; i++) {
            media+=vector[i];
        }
        return media/vector.length;
    }
    //suma de los elementos del vector
    public static int suma(int [] vector) {
        int suma = 0;
        for (int i=0; i<vector.length; i++) {
            suma+=vector[i];
        }
        return suma;
    }
}
