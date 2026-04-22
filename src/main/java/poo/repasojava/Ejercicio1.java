
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Cuantas notas vas a ingresar?: ");
        int n = teclado.nextInt();
        
        double[] notas = new double[n];
        
        double suma = 0;
        double notaMasAlta = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la nota " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
            
            suma = suma + notas[i];
            
            if (notas[i] > notaMasAlta) {
                notaMasAlta = notas[i];
            }
        }
        
        double promedio = suma / n;
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("La nota mas alta fue: " + notaMasAlta);
        System.out.println("El promedio del alumno es: " + promedio);
        
        teclado.close();
    }
}