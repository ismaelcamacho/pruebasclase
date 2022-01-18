package OOP;
//Implementa la clase bicicleta que tiene tres atributos (velocidadActual, platoActual, pinonActual) y tres métodos (acelerar(), frenar(), cambiarPlato(int plato), cambiarPinon(int pinon)
//donde el primero dobla la velocidad actual, el segundo reduce a la mitad la velocidad actual y el tercero y el cuarto ajustan el plato y el piñon actual respectivamente según los parámetros recibidos.
//La clase debe tener además un constructor que inicialice todos los atributos.
//Crea dos objetos de la clase bicicleta
public class Bicicleta {
    private float velocidadActual;
    private int platoActual;
    private int pinonActual;

    public Bicicleta(float velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }
    public void acelerar (){
        velocidadActual=velocidadActual*2;
    }
    public void frenar(){
        velocidadActual=velocidadActual/2;
    }
    public void cambiarPlato(int plato){
        platoActual=plato;
    }
    public void cambiarPinon(int pinon){
        pinonActual=pinon;
    }
    public static void main(String[]args){
        Bicicleta miBicicleta = new Bicicleta(40,2,1);
        Bicicleta tuBicicleta = new Bicicleta(50,1,3);
    }
}

