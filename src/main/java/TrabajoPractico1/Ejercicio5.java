/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nCliente " + (i + 1));
            System.out.print("Ingrese DNI: ");
            String dni = sc.next();

            int tipoServicio;
            while (true) {
                System.out.print("Ingrese tipo de servicio (1=30mb, 2=50mb, 3=100mb): ");
                tipoServicio = sc.nextInt();

                if (tipoServicio >= 1 && tipoServicio <= 3) {
                    break; 
                } else {
                    System.out.println("Error: debe ingresar un número del 1 al 3.");
                }
            }

            double monto = 0;
            switch (tipoServicio) {
                case 1 -> monto = 750;
                case 2 -> monto = 1100;
                case 3 -> monto = 1500 * 0.95; // aplica 5% descuento
            }

            System.out.println("DNI: " + dni + " | Servicio N°" + tipoServicio + " | Monto a pagar: $" + monto);
        }

        sc.close();
    }
}
