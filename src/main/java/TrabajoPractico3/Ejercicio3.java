/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3;

/**
 *
 * @author Agustin Duarte
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingrese números enteros (ingrese un número negativo para finalizar):");

        // 1. Agregar números hasta que se ingrese un número negativo
        do {
            numero = sc.nextInt();
            if (numero >= 0) {
                numeros.add(numero);
            }
        } while (numero >= 0);

        // Verificar si la lista está vacía
        if (numeros.isEmpty()) {
            System.out.println("No se ingresaron números válidos.");
            return;
        }

        // 2. Calcular mayor, menor y promedio
        int mayor = Collections.max(numeros);
        int menor = Collections.min(numeros);
        double suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        double promedio = suma / numeros.size();

        System.out.println("\nResultados:");
        System.out.println("Mayor número: " + mayor);
        System.out.println("Menor número: " + menor);
        System.out.println("Promedio: " + promedio);

        // 3. Eliminar números repetidos
        Set<Integer> sinDuplicados = new HashSet<>(numeros);
        numeros.clear();
        numeros.addAll(sinDuplicados);

        System.out.println("\nLista final sin números repetidos:");
        for (int n : numeros) {
            System.out.println(n);
        }

        sc.close();
    }
}

