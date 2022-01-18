public class LecturaDatos2 {
    public static void main(String[]args){
        String entrada1, entrada2;
        int edad;
        System.out.println("Introduce tu nombre");
        entrada1 = System.console().readLine();
        System.out.println("Introduce tu edad");
        entrada2 = System.console().readLine();
        edad = Integer.parseInt(entrada2);
        System.out.println("Tu nombre es " +entrada1+ " y tu edad es " +entrada2);
    }
}
