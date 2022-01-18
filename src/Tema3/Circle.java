package Tema3;

public class Circle {
    private Point centro;
    private double radio;

    public Circle(Point centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    public double area(){
        double area;
        area = Math.PI*radio*radio;
        return area;
    }
    public boolean isInside(Point p){
        return (this.centro.distance(p) < this.radio);
    }
    public String toString(){
        return "Circulo con rario "+radio+" y centro en "+centro;
    }
}
