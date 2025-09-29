/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3;
import java.util.ArrayList;
import java.util.Scanner; 
/**
 *
 * @author Agustin Duarte
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Estudiantes> arrayestudiantes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("0. Salir");
            System.out.println("1. Cargar Estudiante");
            System.out.println("2. Mostrar Todos los Estudiantes");
            System.out.println("3. Mostrar Estudiantes con nota mayor a 7");
            System.out.println("4. Eliminar Estudiantes con nota menor a 4");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese la nota del estudiante: ");
                    int nota = sc.nextInt();
                    System.out.print("Ingrese la edad del estudiante: ");
                    int edad = sc.nextInt();
                    Estudiantes estudiante = new Estudiantes(nombre, nota, edad);
                    arrayestudiantes.add(estudiante);
                    break;

                case 2:
                    for (Estudiantes e : arrayestudiantes) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    for (Estudiantes e : arrayestudiantes) {
                        if (e.getNota() > 7) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 4:
                     boolean eliminado = arrayestudiantes.removeIf(e -> e.getNota() < 4);
                     if (eliminado) {
                        System.out.println("Se eliminaron todos los estudiantes con nota menor a 4.");
                     } else {
                        System.out.println("No había estudiantes con nota menor a 4.");
                     }
                    break;
                case 0:
                    break;
                    
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}
