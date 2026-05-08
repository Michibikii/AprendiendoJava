package poo.sanatorio;

public class Internado extends Paciente implements DeptAdministracion, DeptNutricion, DeptClinica {
    private String habitacion;
    private String pa;
    private String rh;

    public Internado() {}

    public Internado(String dni, String nombre, String obraSocial, String habitacion, String pa, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.pa = pa;
        this.rh = rh;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    @Override
    public String obtenerCobertura() {
        return this.obraSocial;
    }

    @Override
    public double obtenerDescuento() {
        return 0.20; 
    }

    @Override
    public String obtenerVademecum() {
        return "Vademecum para internación";
    }

    @Override
    public String obtenerTipoDieta() {
        return "Dieta terapéutica especial";
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
