package poo.claseanimal;

public abstract class Mascota implements Trucos {

    protected String nombre;
    
    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public abstract String hablar();
    
}
