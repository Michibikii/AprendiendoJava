/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.claseanimal;

public class Main {
    public static void main(String[] args) {
        Animal[] miZoologico = new Animal[2];

        miZoologico[0] = new Perro("Boby");
        miZoologico[1] = new Gato("Kit");
        
        for (Animal a : miZoologico) {
            System.out.println(a.getNombre() + " hace: " + a.hablar());
        }
    }
}