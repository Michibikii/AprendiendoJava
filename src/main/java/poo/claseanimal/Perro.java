package poo.claseanimal;

public class Perro extends Mascota {
    
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hablar() {
        return "woof woof";
    }
    
    @Override
    public String hacerTruco() {
        return "traer la pelota";
    }
}