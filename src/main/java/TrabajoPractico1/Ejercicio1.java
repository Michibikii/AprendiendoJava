/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

/**
 *
 * @author Agustin Duarte
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de notas: ");
        int n = sc.nextInt();
        int[] notas = new int[n];
        int suma = 0, max = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            suma += notas[i];
            if (notas[i] > max) max = notas[i];
        }

        double promedio = (double) suma / n;
        System.out.println("Nota más alta: " + max);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}