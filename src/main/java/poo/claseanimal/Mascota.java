package poo.claseanimal;

public abstract class Mascota implements Animal {
    
    // Guardamos el dato común acá (protected para que lo vean las hijas)
    protected String nombre;
    
    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    // Programamos el getNombre una sola vez para todos
    @Override
    public String getNombre() {
        return nombre;
    }
}