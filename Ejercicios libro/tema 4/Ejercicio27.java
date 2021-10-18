import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
        String sabor= System.console().readLine();
        double preciotarta=0;
        double precionata=0;
        double precionombre=0;
        double total=0;
        switch (sabor){
            case "manzana":
            preciotarta= 18;
            break;
            case "fresa":
            preciotarta=16;
            break;
            case "chocolate":
            System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String chocolate= System.console().readLine();
            if (chocolate.equals("negro")){
                preciotarta=14;
                sabor= "chocolate negro";
            }
            else if (chocolate.equals("blanco")){
                preciotarta=15;
                sabor= "chocolate blanco";
            }
            break;
            default:
            System.out.println("No es correcto el sabor");
        }
        System.out.println("¿Quiere nata? (si o no)");
        String nata= System.console().readLine();
        System.out.println("¿Quiere ponerle un nombre? (si o no)");
        String nombre= System.console().readLine();
        System.out.printf("Tarta de "+sabor+": %.2f€\n", preciotarta);
        if(nata.equals("si")){
            precionata= 2.50;
            System.out.println("Con nata: 2,50€");
        }
        if(nombre.equals("si")){
            precionombre=2.75;
            System.out.println("Con nombre: 2,75€");
        }
        total= preciotarta+precionata+precionombre;
        System.out.printf("Total: %.2f", total);
    }
}
        