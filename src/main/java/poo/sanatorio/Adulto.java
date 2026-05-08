package poo.sanatorio;

public class Adulto extends Paciente implements DeptAdministracion, DeptClinica {
    private String pa;
    private double altura;
    private double peso;

    public Adulto() {}

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

    @Override
    public String obtenerCobertura() {
        return this.obraSocial;
    }

    @Override
    public double obtenerDescuento() {
        return 0.10; 
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum estándar";
    }

    @Override
    public String recetarRx() {
        return "Radiografía de tórax";
    }

    @Override
    public String recetarSangre() {
        return "Análisis de sangre completo";
    }
}
