package poo.sanatorio;

public abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente() {
    }

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    public String resumenPaciente() {
        return nombre + " (DNI " + dni + ") - Obra Social: " + obraSocial;
    }
}
