package poo.sanatorio;

public class Pediatrico extends Paciente implements DeptAdministracion, DeptNutricion {
    private double peso;
    private String celular;
    private String tutor;

    public Pediatrico() {}

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String obtenerCobertura() {
        return this.obraSocial;
    }

    @Override
    public double obtenerDescuento() {
        return 0.15; 
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum pediátrico";
    }

    @Override
    public String obtenerTipoDieta() {
        return "Dieta balanceada pediátrica";
    }
}
