
package poo.abstraccion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Calculadora de Rectangulos");
        
        System.out.print("Ingrese posicion X: ");
        int posX = teclado.nextInt();
        
        System.out.print("Ingrese posicion Y: ");
        int posY = teclado.nextInt();
        
        System.out.print("Ingrese la base: ");
        double b = teclado.nextDouble();
        
        System.out.print("Ingrese la altura: ");
        double h = teclado.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(posX, posY, b, h);

        System.out.println("Area total: " + miRectangulo.calcularArea());

        teclado.close();
    }
}