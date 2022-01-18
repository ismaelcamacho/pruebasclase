import java.util.Scanner;
public class LecturaDatosScanner1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String nombre, entradaEdad;
        int edad;
        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce tu edad");
        entradaEdad = sc.nextLine();
        edad = Integer.parseInt(entradaEdad);
        System.out.println("Tu nombre es "+nombre+" y tu edad es "+edad+ " años");
    }
}
