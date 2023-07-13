package JAVA;

public class Ejercicio8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Ema");
        persona.setEdad(20);
        persona.setNumero(4194364);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumero());

    }
}

class Persona {
    private String nombre;
    private int edad;
    private long numero;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumero() {
        return numero;
    }

}
