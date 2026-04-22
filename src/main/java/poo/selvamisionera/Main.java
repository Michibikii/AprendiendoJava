package poo.selvamisionera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo[] estacionamiento = new Vehiculo[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDatos del Camion " + (i + 1));
            System.out.print("Patente: ");
            String pat = teclado.nextLine();
            System.out.print("Descripcion: ");
            String desc = teclado.nextLine();

            Vehiculo camion = new Vehiculo(pat, desc);

            String[] listaChoferes = new String[3];
            
            listaChoferes[0] = "Marcos Silva";
            listaChoferes[1] = "Roberto Gomez";
            listaChoferes[2] = "Hugo Benitez";

            camion.setConductores(listaChoferes);

            for (int j = 0; j < 2; j++) {
                System.out.print("  Ciudad: ");
                String lug = teclado.nextLine();
                System.out.print("  Carga: ");
                String tipo = teclado.nextLine();
                System.out.print("  Precio: ");
                double precio = teclado.nextDouble();
                teclado.nextLine(); 

                Destino viaje = new Destino(lug, tipo, precio);
                camion.registrarDestino(viaje);
            }
            estacionamiento[i] = camion;
        }

        for (Vehiculo v : estacionamiento) {
            v.generarReporte();
        }
        teclado.close();
    }
}