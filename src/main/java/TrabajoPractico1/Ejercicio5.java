/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.print("\nDNI del cliente: ");
            String dni = sc.next();
            System.out.print("Tipo de servicio (1=30mb, 2=50mb, 3=100mb): ");
            int tipo = sc.nextInt();
            double monto = 0;

            switch (tipo) {
                case 1 -> monto = 750;
                case 2 -> monto = 1100;
                case 3 -> monto = 1500 * 0.95; // 5% descuento
            }

            System.out.println("Cliente DNI: " + dni + " | Servicio: " + tipo + " | Monto: $" + monto);
        }
    }
}
