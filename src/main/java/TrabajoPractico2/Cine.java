/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico2;

/**
 *
 * @author Agustin Duarte
 */
import javax.swing.JOptionPane;

// Clase que maneja la sala de cine
class Cine {
    private Reserva[][] sala;

    public Cine() {
        sala = new Reserva[10][10]; // 10 filas x 10 asientos
    }

    // Mostrar mapa de la sala en un JOptionPane
    public void mostrarSala() {
        StringBuilder mapa = new StringBuilder("===== MAPA DE LA SALA =====\n");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                if (sala[i][j] == null) {
                    mapa.append("[ ] ");
                } else {
                    mapa.append("[X] ");
                }
            }
            mapa.append(" <- Fila " + (i + 1) + "\n");
        }
        mapa.append("\nLeyenda: [ ] = disponible, [X] = reservado");
        JOptionPane.showMessageDialog(null, mapa.toString());
    }

    // Hacer una reserva
    public void reservarAsiento(int fila, int columna, String nombre, String telefono) {
        if (sala[fila][columna] == null) {
            sala[fila][columna] = new Reserva(nombre, telefono);
            JOptionPane.showMessageDialog(null, "Reserva realizada con éxito para " + nombre);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Asiento ocupado. Lo tiene reservado: " + sala[fila][columna]);
        }
    }

    // Eliminar una reserva
    public void eliminarReserva(int fila, int columna) {
        if (sala[fila][columna] != null) {
            JOptionPane.showMessageDialog(null,
                    "Reserva de " + sala[fila][columna].getNombre() + " eliminada.");
            sala[fila][columna] = null; // liberar asiento
        } else {
            JOptionPane.showMessageDialog(null, "El asiento ya estaba libre.");
        }
    }
}
