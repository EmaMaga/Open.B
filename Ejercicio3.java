package JAVA;

public class Ejercicio3 {
    public static void main(String[] args) {
        // funcion sumar
        suma(2, 4);
        // agregar puertas
        Coche coupe = new Coche();
        System.out.println(coupe.puertas);
        coupe.MasPuertas();
        System.out.println(coupe.puertas);
    }

    public static void suma(int a, int b) {
        System.out.println(a + b);
    }
}

class Coche {
    public int puertas = 4;

    public void MasPuertas() {
        this.puertas++;
    }
}