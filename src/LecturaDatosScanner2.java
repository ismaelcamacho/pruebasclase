import java.util.Scanner;
public class LecturaDatosScanner2 {
    public static void main(String[]args){
        double num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres numeros separados por espacios");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        System.out.println("La media de los numeros introducidos es: " +((num1+num2+num3)/3));
    }
}
