
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int clientes = 5;
        
        System.out.println("SISTEMA DE FACTURACION DE INTERNET");
        
        for (int i = 0; i < clientes; i++) {
            System.out.println("\n--- Cliente " + (i + 1) + " ---");
            System.out.print("Ingrese DNI del cliente: ");
            String dni = teclado.nextLine();
            
            System.out.println("Tipos de servicio:");
            System.out.println("1. Internet 30 megas");
            System.out.println("2. Internet 50 megas");
            System.out.println("3. Internet 100 megas");
            System.out.print("Ingrese el numero de servicio (1, 2 o 3): ");
            int servicio = teclado.nextInt();
            teclado.nextLine(); 
            
            double montoPagar = 0;
            
            if (servicio == 1) {
                montoPagar = 750;
            } else if (servicio == 2) {
                montoPagar = 1100;
            } else if (servicio == 3) {
                montoPagar = 1500 - (1500 * 0.05); 
            } else {
                System.out.println("Servicio invalido.");
                continue; 
            }
            
            System.out.println("-> DNI: " + dni + " | Servicio Nro: " + servicio + " | Total a pagar: $" + montoPagar);
        }
        
        teclado.close();
    }
}