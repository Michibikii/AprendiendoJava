/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 30;

        String[] patente = new String[n];
        String[] chofer = new String[n];
        String[] carga = new String[n];
        String[] hora = new String[n];
        int contadorTe = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nCamión " + (i + 1) + ":");
            System.out.print("Patente: ");
            patente[i] = sc.next();
            sc.nextLine(); // limpiar buffer
            System.out.print("Nombre y apellido del chofer: ");
            chofer[i] = sc.nextLine();
            System.out.print("Tipo de carga (madera/yerba/té): ");
            carga[i] = sc.next();
            System.out.print("Hora de egreso: ");
            hora[i] = sc.next();

            if (carga[i].equalsIgnoreCase("té")) contadorTe++;
        }

        System.out.println("\n--- DATOS DE CAMIONES ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Camión " + (i + 1) + ": " + patente[i] + " | " + chofer[i] + " | " + carga[i] + " | " + hora[i]);
        }
        System.out.println("Cantidad de camiones con carga de té: " + contadorTe);
    }
}

