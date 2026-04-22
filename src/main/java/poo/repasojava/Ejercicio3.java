
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantos productos vas a ingresar?: ");
        int n = teclado.nextInt();
        
        int[] cantidades = new int[n];
        double[] costos = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nProducto " + (i + 1));
            System.out.print("Cantidad: ");
            cantidades[i] = teclado.nextInt();
            
            System.out.print("Costo por unidad: $");
            costos[i] = teclado.nextDouble();
        }
        
        System.out.println("\n--- PRODUCTOS QUE SUPERAN LOS $1000 ---");
        for (int i = 0; i < n; i++) {
            double precioTotal = cantidades[i] * costos[i];
            
            if (precioTotal > 1000) {
                System.out.println("Producto " + (i + 1) + " | Total: $" + precioTotal);
            }
        }
        
        teclado.close();
    }
}