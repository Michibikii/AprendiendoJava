/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos.sistematurnos;

/**
 *
 * @author Agustin Duarte
 */
public class Paciente {
    private String dni, nombre, apellido, direccion, telefono, fechaNacimiento;

    public Paciente(String dni, String nombre, String apellido, String direccion, String telefono, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getFechaNacimiento() { return fechaNacimiento; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " - DNI: " + dni;
    }
}
