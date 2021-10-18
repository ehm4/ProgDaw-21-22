import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        String comida= System.console().readLine();
        double preciocomida=0;
        double preciobebida=0;
        double total=0;
        switch (comida){
            case "palmera":
            preciocomida=1.40;
            comida= "Palmera";
            break;
            case "donut":
            preciocomida=1;
            comida= "Donut";
            break;
            case "pitufo":
                System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla)");
                String aux= System.console().readLine();
                if(aux.equals("aceite")){
                    preciocomida=1.20;
                    comida= "Pitufo con aceite";
                }
                else if(aux.equals("tortilla")){
                    preciocomida=1.60;
                    comida= "Pitufo con tortilla";
                }
                else{
                    System.out.println("Acompañamiento de pitufo no marcado correctamente");
                }
                break;
                default:
                System.out.println("Comida del desayuno no marcada correctamente");
            }
        System.out.println("¿Qué ha tomado de beber? (zumo o cafe): ");
        String bebida= System.console().readLine();
        switch (bebida) {
            case "zumo":
                preciobebida=1.50;
                bebida= "Zumo";
                break;
            case "cafe":
            preciobebida=1.20;
                bebida= "Café";
            break;
        
            default:
            System.out.println("Datos de la bebida no marcados correctamente");
                break;
        }
        System.out.printf(""+comida+": %.2f€\n", preciocomida);
        System.out.printf(""+bebida+": %.2f€\n", preciobebida);
        total= preciobebida+preciocomida;
        System.out.printf("Total desayuno: %.2f€\n", total);
    }
}