package poo.sistemadealumnos;

public class Alumno {
    private String nombre;
    private int edad;
    private String dni;

    public Alumno (){}

    public Alumno(String dni, String nom, int ed){
        this.dni = dni;
        this.nombre = nom;
        this.edad = ed;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setDni(String dni) {this.dni = dni;}

    public void getInfo(){
        System.out.println("El alumno ingresado es: ");
        System.out.println("Nombre: " + getNombre());
        System.out.println("DNI: " + getDni());
        System.out.println("Edad: " + getEdad());
    }
}
