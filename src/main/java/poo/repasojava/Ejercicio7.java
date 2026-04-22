
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int totalPersonas = 0;
        int totalVarones = 0;
        int totalMujeres = 0;
        int varonesEntre16y65 = 0;
        
        int mayorEdad = -1;
        String dniMayorEdad = "";
        
        System.out.println("SISTEMA DE CENSO PROVINCIAL");
        System.out.println("(Ingrese 0 en el DNI para terminar)");
        System.out.println("-----------------------------------");
        
        while (true) {
            System.out.print("\nIngrese numero de documento: ");
            String dni = teclado.nextLine();
            
            if (dni.equals("0")) {
                break;
            }
            
            System.out.print("Ingrese edad: ");
            int edad = teclado.nextInt();
            teclado.nextLine(); 
            
            System.out.print("Ingrese sexo (F o M): ");
            String sexo = teclado.nextLine().toUpperCase();
            
            totalPersonas++;
            
            if (sexo.equals("M")) {
                totalVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo.equals("F")) {
                totalMujeres++;
            }
            
            if (edad > mayorEdad) {
                mayorEdad = edad;
                dniMayorEdad = dni;
            }
        }
        
        System.out.println("\n========== RESULTADOS DEL CENSO ==========");
        
        if (totalPersonas > 0) {
            System.out.println("Total de personas censadas: " + totalPersonas);
            System.out.println("Total de mujeres: " + totalMujeres);
            System.out.println("Total de varones: " + totalVarones);
            
            if (totalVarones > 0) {
                double porcentajeVarones = ((double) varonesEntre16y65 / totalVarones) * 100;
                System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentajeVarones + "%");
            }
            
            System.out.println("\n--- Datos de la persona de mayor edad ---");
            System.out.println("DNI: " + dniMayorEdad);
            System.out.println("Edad: " + mayorEdad + " años");
            
        } else {
            System.out.println("No se ingresaron datos para procesar.");
        }
        
        teclado.close();
    }
}