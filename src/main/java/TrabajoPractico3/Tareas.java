/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3;

/**
 *
 * @author Agustin Duarte
 */
public class Tareas {
    public String nombreTarea;

    public Tareas(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
    
    public String getnombreTarea() {
            return nombreTarea;
    }
   
    @Override
    public String toString() {
        return "Nombre de la Tarea: " + nombreTarea;
    }
}