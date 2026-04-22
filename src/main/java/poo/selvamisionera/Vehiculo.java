package poo.selvamisionera;

import java.util.ArrayList;

public class Vehiculo {
    private String patente;
    private String descripcion;
    private String[] conductores;
    private ArrayList<Destino> destinos;

    public Vehiculo() {
        this.conductores = new String[3];
        this.destinos = new ArrayList<>();
    }

    public Vehiculo(String patente, String descripcion) {
        this.patente = patente;
        this.descripcion = descripcion;
        this.conductores = new String[3];
        this.destinos = new ArrayList<>();
    }

    public void setConductores(String[] nuevosConductores) {this.conductores = nuevosConductores;}

    public void registrarDestino(Destino d) {this.destinos.add(d);}

    public void generarReporte() {
        double totalPlata = 0;
        for (Destino d : destinos) {
            totalPlata += d.getValorCarga();
        }

        System.out.println("-------------------------------------");
        System.out.println("REPORTE DEL CAMION: " + patente);
        System.out.print("Choferes: ");
        for (String chofer : conductores) {
            if (chofer != null) {
                System.out.print("[" + chofer + "] ");
            }
        }
        System.out.println("\nViajes hechos: " + destinos.size());
        System.out.println("Plata total: $" + totalPlata);
        System.out.println("-------------------------------------");
    }
    
    public String[] getConductores() { return conductores;}
    
    public String getPatente() { return patente;}
    
    public void setPatente(String patente) { this.patente = patente;}
}