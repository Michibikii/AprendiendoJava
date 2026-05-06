package poo.sanatorio;

public class Internado extends Paciente {
    private String habitacion;
    private String pa;
    private String rh;
    private String dieta;

    public Internado() {
        super();
    }

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

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
