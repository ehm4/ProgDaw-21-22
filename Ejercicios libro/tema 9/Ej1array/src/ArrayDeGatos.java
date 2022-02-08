import paquetes.Gato;

public class ArrayDeGatos {
    public static void main(String[] args) {
        Gato[] gato = new Gato[4];
            gato[0] = new Gato("Garfield", "naranja", "mestizo");
            gato[1] = new Gato("Pepe", "gris", "angora");
            gato[2] = new Gato("Mauri", "blanco", "manx");
            gato[3] = new Gato("Ulises", "marrón", "persa");
            System.out.println("\nDatos de los gatos.");
            for (int i = 0; i < 4; i++) {
            System.out.println("\nGato nº" + (i + 1));
            System.out.println("Nombre: " + gato[i].obtenerNombre());
            System.out.println("Color: " + gato[i].obtenerColor());
            System.out.println("Raza: " + gato[i].obtenerRaza());
}

        }
    }

