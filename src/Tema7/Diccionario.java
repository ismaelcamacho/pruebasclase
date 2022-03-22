package Tema7;

import java.util.Map;
import java.util.HashMap;

public class Diccionario {
    Map<String, String> map = new HashMap<>();

    public Diccionario() {
        map.put("hola", "hello");
        map.put("adios", "bye");
        map.put("noche", "night");
    }
    public void traducir (String palabra) {
        System.out.println(map.getOrDefault(palabra, "no se encuentra la palabra"));
    }

    public static void main (String [] args) {
        Diccionario diccionario = new Diccionario();
        diccionario.traducir("hola");
        diccionario.traducir("adios");
    }
}


