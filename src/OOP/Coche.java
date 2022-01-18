package OOP;
//Implementa una clase coche con los atributos color, velocidad y altura, la clase tiene 4 métodos(comentados) adaptar(), parar(), girarIzq(), girarDer() y un constructor que inicialice los tres atributos.
//Crea tres objetos de la clase coche miCoche(verde, 80, 3.2), tuCoche(rojo, 120, 4,1), suCoche(amarillo, 100, 3,4
public class Coche {
    private String color;
    private int velocidad;
    private double altura;

    public Coche(String color, int velocidad, double altura) {
        this.color = color;
        this.velocidad = velocidad;
        this.altura = altura;
    }
    public static void main(String[]args){
        Coche miCoche = new Coche("verde",90, 3.3 );
    }
}

