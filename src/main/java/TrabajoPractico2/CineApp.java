/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Agustin Duarte
 */

import java.util.Scanner;

public class CineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cine cine = new Cine(); // creamos la sala de cine

        int opcion;
        do {
            System.out.println("\n===== MENÚ DEL CINE =====");
            System.out.println("1. Mostrar sala");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Eliminar reserva");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cine.mostrarSala();
                    break;
                case 2:
                    System.out.print("Ingrese fila (1-10): ");
                    int fila = sc.nextInt() - 1;
                    System.out.print("Ingrese columna (1-10): ");
                    int col = sc.nextInt() - 1;
                    sc.nextLine(); // limpiar buffer
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono del cliente: ");
                    String tel = sc.nextLine();
                    cine.reservarAsiento(fila, col, nombre, tel);
                    break;
                case 3:
                    System.out.print("Ingrese fila (1-10): ");
                    int f = sc.nextInt() - 1;
                    System.out.print("Ingrese columna (1-10): ");
                    int c = sc.nextInt() - 1;
                    cine.eliminarReserva(f, c);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}


