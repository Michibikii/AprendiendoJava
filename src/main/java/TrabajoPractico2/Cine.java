/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Agustin Duarte
 */
// Clase que maneja la sala de cine
class Cine {
    // Matriz 10x10 donde cada asiento puede tener una Reserva o estar vacío (null)
    private Reserva[][] sala;

    // Constructor: inicializa la sala con 100 asientos libres
    public Cine() {
        sala = new Reserva[10][10]; 
    }

    // Mostrar mapa de la sala
    public void mostrarSala() {
        System.out.println("\n===== MAPA DE LA SALA =====");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == null) {
                    System.out.print("[ ] "); // disponible
                } else {
                    System.out.print("[X] "); // reservado
                }
            }
            System.out.println(" <- Fila " + (i + 1));
        }
        System.out.println("Leyenda: [ ] = disponible, [X] = reservado");
    }

    // Hacer una reserva
    public void reservarAsiento(int fila, int columna, String nombre, String telefono) {
        if (sala[fila][columna] == null) {
            sala[fila][columna] = new Reserva(nombre, telefono);
            System.out.println("Reserva realizada con éxito para " + nombre);
        } else {
            System.out.println("Asiento ocupado. Lo tiene reservado: " + sala[fila][columna]);
        }
    }

    // Eliminar una reserva
    public void eliminarReserva(int fila, int columna) {
        if (sala[fila][columna] != null) {
            System.out.println("Reserva de " + sala[fila][columna].getNombre() + " eliminada.");
            sala[fila][columna] = null; // liberar asiento
        } else {
            System.out.println("El asiento ya estaba libre.");
        }
    }
}
