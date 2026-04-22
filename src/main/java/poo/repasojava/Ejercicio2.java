
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantas notas vas a ingresar?: ");
        int n = teclado.nextInt();
        
        double[] notas = new double[n];
        
        int aprobados = 0;
        int desaprobados = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            
            if (notas[i] >= 6) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        
        teclado.close();
    }
}