package poo.claseanimal;

public class Main {
    public static void main(String[] args) {
        Mascota[] miZoologico = new Mascota[2];

        miZoologico[0] = new Perro("Boby");
        miZoologico[1] = new Gato("Kit");
        
        for (Mascota m : miZoologico) {
            System.out.println(m.getNombre() + " hace: " + m.hablar());
            System.out.println(m.getNombre() + " truco: " + m.hacerTruco());
        }
    }
}