/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0, hombres = 0, mujeres = 0, hombres16a65 = 0;
        int edadMayor = -1;
        String dniMayor = "", sexoMayor = "";

        while (true) {
            System.out.print("\nNúmero de documento (0 para terminar): ");
            String dni = sc.next();
            if (dni.equals("0")) break;

            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Sexo (F/M): ");
            String sexo = sc.next();

            total++;
            if (sexo.equalsIgnoreCase("M")) {
                hombres++;
                if (edad >= 16 && edad <= 65) hombres16a65++;
            } else if (sexo.equalsIgnoreCase("F")) {
                mujeres++;
            }

            if (edad > edadMayor) {
                edadMayor = edad;
                dniMayor = dni;
                sexoMayor = sexo;
            }
        }

        System.out.println("\n--- RESULTADOS CENSO ---");
        System.out.println("Total personas: " + total);
        System.out.println("Varones: " + hombres);
        System.out.println("Mujeres: " + mujeres);
        if (hombres > 0) {
            double porcentaje = (hombres16a65 * 100.0) / hombres;
            System.out.println("Porcentaje de varones 16-65 años: " + porcentaje + "%");
        }
        System.out.println("Persona de mayor edad: DNI " + dniMayor + ", Sexo " + sexoMayor + ", Edad " + edadMayor);
    }
}
