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

public class CineApp {
    public static void main(String[] args) {
        Cine cine = new Cine();
        int opcion;

        do {
            String menu = "===== MENÚ DEL CINE =====\n"
                        + "1. Mostrar sala\n"
                        + "2. Reservar asiento\n"
                        + "3. Eliminar reserva\n"
                        + "4. Salir\n\n"
                        + "Seleccione una opción:";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    cine.mostrarSala();
                    break;
                case 2:
                    int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila (1-10):")) - 1;
                    int col = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna (1-10):")) - 1;
                    String nombre = JOptionPane.showInputDialog("Nombre del cliente:");
                    String tel = JOptionPane.showInputDialog("Teléfono del cliente:");
                    cine.reservarAsiento(fila, col, nombre, tel);
                    break;
                case 3:
                    int f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila (1-10):")) - 1;
                    int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna (1-10):")) - 1;
                    cine.eliminarReserva(f, c);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcion != 4);
    }
}
