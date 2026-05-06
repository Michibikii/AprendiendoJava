package poo.sanatorio;

public class Adulto extends Paciente {
    private String pa;
    private double altura;
    private double peso;

    public Adulto() {
        super();
    }

    public Adulto(String dni, String nombre, String obraSocial, String pa, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.pa = pa;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
