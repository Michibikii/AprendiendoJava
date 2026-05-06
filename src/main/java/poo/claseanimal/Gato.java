package poo.claseanimal;

public class Gato extends Mascota {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hablar() {
        return "miau";
    }
    
    @Override
    public String hacerTruco() {
        return "arañar el sofá";
    }
}