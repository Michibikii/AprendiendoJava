/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos.sistematurnos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Agustin Duarte
 */
public class Clase {

    public ArrayList<Paciente> listaPacientes = new ArrayList<>();
     
    public ArrayList<Paciente> getListaPacientes(){
        return listaPacientes;
    }

    public void agregarPaciente(Paciente paciente) {
        listaPacientes.add(paciente);
    }

    public void eliminarPaciente(int index) {
        if (index >= 0 && index < listaPacientes.size()) {
            listaPacientes.remove(index);
        }
    }

    public Paciente obtenerPaciente(int index) {
        if (index >= 0 && index < listaPacientes.size()) {
            return listaPacientes.get(index);
        }
        return null;
    }

    public int totalPacientes() {
        return listaPacientes.size();
    }

    public boolean hayPacientes() {
        return !listaPacientes.isEmpty();
    }
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

}
