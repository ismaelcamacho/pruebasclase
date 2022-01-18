package Tema3;

public class Principal {
    public static void main (String [] args){
        Point punto1 = new Point(3,3);
        Point punto2 = new Point (10,10);
        Point centro = new Point (0,0);
        Circle circulo = new Circle (centro,10);
        System.out.println(circulo);
        System.out.println(circulo.isInside(punto1));
        System.out.println(circulo.isInside(punto2));
    }
}
