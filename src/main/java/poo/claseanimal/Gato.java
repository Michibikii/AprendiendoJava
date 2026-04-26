package poo.claseanimal;

public class Gato implements Animal {
    
    private String nombre;
    
    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hablar() {
        return "miau";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}