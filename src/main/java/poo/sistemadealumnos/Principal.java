package poo.sistemadealumnos;

public class Principal {
    public static void main (String[] args){
        Alumno edd = new Alumno("40.198.748", "Agustin", 27);
        edd.getInfo();
        edd.setNombre("Manuel");
        edd.getInfo();
    }
}
