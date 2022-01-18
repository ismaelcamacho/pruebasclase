package Tema3;

public class Contacto {
    private String nombre;
    private String email;

    public Contacto(String nombre){
        this.nombre=nombre;
    }
    public Contacto(String nombre, String email){
        this.nombre=nombre;
        this.email=email;
    }
    public Contacto(Contacto otro){
        this.nombre=otro.nombre;
        this.email=otro.email;
    }
}
