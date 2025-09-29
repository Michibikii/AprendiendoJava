/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3;

/**
 *
 * @author Agustin Duarte
 */
public class Estudiantes {
    public String nombre;
    public int nota;
    public int edad;
    
    public Estudiantes(String nombre, int nota, int edad) {
        this.nombre = nombre;
        this.nota = nota;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }
    
    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nota: " + nota + ", Edad: " + edad;
    }
}
