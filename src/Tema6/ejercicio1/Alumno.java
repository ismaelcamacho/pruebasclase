package Tema6.ejercicio1;

public class Alumno {
    String nombre;
    double notaMedia;

    // Constructor
    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }
    // copy constructor
    public Alumno(Alumno a) {
        this.nombre = a.nombre;
        this.notaMedia = a.notaMedia;
    }
    //toString
    public String toString() {
        return "Nombre: " + nombre + " Nota media: " + notaMedia;
    }
}
