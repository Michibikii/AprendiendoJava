/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3;
/**
 *
 * @author Agustin Duarte
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Tareas> arraytareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== GESTOR DE TAREAS =====");
            System.out.println("0. Salir");
            System.out.println("1. Agregar una tarea en la última posición");
            System.out.println("2. Agregar una tarea en una posición específica");
            System.out.println("3. Eliminar una tarea indicando su nombre");
            System.out.println("4. Mostrar las tareas pendientes ordenadas alfabéticamente");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombreTarea = sc.nextLine();
                    arraytareas.add(new Tareas(nombreTarea));
                    System.out.println("Tarea agregada correctamente.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombreInsertar = sc.nextLine();
                    System.out.print("Ingrese la posición donde desea insertarla (0 a " + arraytareas.size() + "): ");
                    int posicion = sc.nextInt();
                    sc.nextLine(); 

                    if (posicion < 0 || posicion > arraytareas.size()) {
                        System.out.println("Posición inválida. No se agregó la tarea.");
                    } else {
                        arraytareas.add(posicion, new Tareas(nombreInsertar));
                        System.out.println("Tarea insertada correctamente.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la tarea a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    boolean encontrada = false;

                    for (int i = 0; i < arraytareas.size(); i++) {
                        if (arraytareas.get(i).getnombreTarea().equalsIgnoreCase(nombreEliminar)) {
                            arraytareas.remove(i);
                            encontrada = true;
                            System.out.println("Tarea eliminada correctamente.");
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("No se encontró ninguna tarea con ese nombre.");
                    }
                    break;

                case 4:
                    if (arraytareas.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        ArrayList<String> nombresOrdenados = new ArrayList<>();
                        for (Tareas t : arraytareas) {
                            nombresOrdenados.add(t.getnombreTarea());
                        }
                        Collections.sort(nombresOrdenados);

                        System.out.println("\nTareas ordenadas alfabéticamente:");
                        for (String t : nombresOrdenados) {
                            System.out.println("- " + t);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 0);
    }
}


