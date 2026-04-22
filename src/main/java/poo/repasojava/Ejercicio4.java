package poo.repasojava;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int cantidadCamiones = 30; 
        
        String[] patentes = new String[cantidadCamiones];
        String[] choferes = new String[cantidadCamiones];
        String[] cargas = new String[cantidadCamiones];
        String[] horas = new String[cantidadCamiones];
        
        int contadorTe = 0;
        
        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("\n--- Ingreso Camion " + (i + 1) + " ---");
            
            System.out.print("Patente: ");
            patentes[i] = teclado.nextLine();
            
            System.out.print("Nombre y apellido del chofer: ");
            choferes[i] = teclado.nextLine();
            
            System.out.print("Tipo de carga (madera, yerba o te): ");
            cargas[i] = teclado.nextLine();
            
            if (cargas[i].equalsIgnoreCase("te") || cargas[i].equalsIgnoreCase("té")) {
                contadorTe++;
            }
            
            System.out.print("Hora de egreso: ");
            horas[i] = teclado.nextLine();
        }
        
        System.out.println("\n=====================================");
        System.out.println("REPORTE DE EGRESOS DE LA PLANTA");
        System.out.println("=====================================");
        
        for (int i = 0; i < cantidadCamiones; i++) {
            System.out.println("Patente: " + patentes[i] + " | Chofer: " + choferes[i] + 
                               " | Carga: " + cargas[i] + " | Hora: " + horas[i]);
        }
        
        System.out.println("\nTotal de camiones que cargaron te: " + contadorTe);
        
        teclado.close();
    }
}