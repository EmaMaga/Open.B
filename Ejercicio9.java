package JAVA;

public class Ejercicio9 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador jose = new Trabajador();

        cliente.setNombre("Julian");
        cliente.setEdad(32);
        cliente.setNumero(234232);
        cliente.setCredito(2003);

        System.out.println("Su nombre es " + cliente.getNombre());
        System.out.println("Tiene " + cliente.getEdad());
        System.out.println("Su numero es " + cliente.getNumero());
        System.out.println("Su credito es $" + cliente.getCredito());
        System.out.println("Jose gana $" + jose.salario);
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

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    int salario = 3000;
}