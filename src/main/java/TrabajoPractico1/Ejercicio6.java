/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 12;

        int[] vehiculo = new int[n];
        double[] tiempo = new double[n];
        double mejorTiempo = Double.MAX_VALUE;
        int mejorVehiculo = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("Número de vehículo: ");
            vehiculo[i] = sc.nextInt();
            System.out.print("Tiempo (segundos): ");
            tiempo[i] = sc.nextDouble();

            if (tiempo[i] < mejorTiempo) {
                mejorTiempo = tiempo[i];
                mejorVehiculo = vehiculo[i];
            }
        }

        System.out.println("Mejor tiempo: " + mejorTiempo + " seg. Vehículo: " + mejorVehiculo);
    }
}

