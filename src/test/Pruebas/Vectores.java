package com.mycompany.pruebas;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Agustin Duarte
 */
public class Vectores {
        public static void main(String[] args) {
        //Declaracion Vector
        int vector [] = new int [4];
        Scanner ingreso = new Scanner(System.in);
        
        //Asignacion
        for (int i=0; i<vector.length; i++) {
            System.out.println("Ingresa un numero entero:");
            vector[i] = ingreso.nextInt();
        }
        
        //Recorrido
        for (int i=0; i<vector.length; i++) {
            System.out.println("Estoy en la posicion " + i + " con el elemento " + vector[i]);
        }
    }
}
