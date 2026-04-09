/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradatos.trabajopractico3;

/**
 *
 * @author Agustin Duarte
 */
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.Scanner; 

public class EjemploHashArray { 
public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); 
    // hashmap ponemos la estructura: letra inicial -> (Arraylist) lista de nombres 
    HashMap<Character, ArrayList<String>> nombresMap = new HashMap<>(); 
    System.out.print("Cuantos nombres quieres ingresar? "); 
    int cantidad = scanner.nextInt(); 
            scanner.nextLine(); // limpiar buffer 

            // Cargar nombres  
            for (int i = 0; i < cantidad; i++) { 
                System.out.print("Ingrese el nombre " + (i+1) + ": "); 
                String nombre = scanner.nextLine(); 

              // obtener la letra inicial 
                char inicial = Character.toUpperCase(nombre.charAt(0)); 

                // si no existe la clave, la creo 
                nombresMap.putIfAbsent(inicial, new ArrayList<>()); 

              // agrego el nombre a la lista de esa letra 
                nombresMap.get(inicial).add(nombre); 
            } 

            // Consultar por letra 
            System.out.print("\nIngrese una letra para mostrar los nombres: "); 
            char letra = Character.toUpperCase(scanner.next().charAt(0)); 

            if (nombresMap.containsKey(letra)) { 
                System.out.println("Nombres que empiezan con '" + letra + "': " + nombresMap.get(letra)); 
            } else { 
                System.out.println("No hay nombres que empiecen con la letra '" + letra + "'."); 
            } 
        } 
}
