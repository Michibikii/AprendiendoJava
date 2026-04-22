
package poo.repasojava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int competidores = 12;
        
        int vehiculoGanador = 0;
        double menorTiempo = 999999; 
        
        System.out.println("CARRERA AUTOMOVILISTICA");
        
        for (int i = 0; i < competidores; i++) {
            System.out.println("\nParticipante " + (i + 1));
            System.out.print("Numero del vehiculo: ");
            int numeroAuto = teclado.nextInt();
            
            System.out.print("Tiempo en segundos: ");
            double tiempo = teclado.nextDouble();
            
            if (tiempo < menorTiempo) {
                menorTiempo = tiempo;
                vehiculoGanador = numeroAuto;
            }
        }
        
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("El ganador es el vehiculo numero: " + vehiculoGanador);
        System.out.println("Con un tiempo record de: " + menorTiempo + " segundos");
        
        teclado.close();
    }
}