package poo.claseanimal;

public class Perro implements Animal {
    
    private String nombre;
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String hablar() {
        return "woof woof";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}