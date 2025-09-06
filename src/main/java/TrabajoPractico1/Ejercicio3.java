/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de productos: ");
        int n = sc.nextInt();
        int[] cantidades = new int[n];
        int[] costos = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
            System.out.print("Costo unitario del producto " + (i + 1) + ": ");
            costos[i] = sc.nextInt();
            int subtotal = cantidades[i] * costos[i];
            total += subtotal;
            if (subtotal > 1000) {
                System.out.println("Producto " + (i + 1) + " supera los $1000 (Subtotal: $" + subtotal + ")");
            }
        }

        System.out.println("Precio total: $" + total);

        sc.close();
    }
}
