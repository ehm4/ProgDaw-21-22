import java.util.Scanner;
public class Ejercicio22{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Con este programa calcularemos cúanto queda para el fin de semana(Viernes a las 15h)");
        System.out.println("Introduce un día de la semana (lunes-viernes) en minúscula= ");
        String dia= s.nextLine();
        System.out.println("Introduce la hora= ");
        int hora= s.nextInt();
        System.out.println("Introduce los minutos= ");
        int minutos = s.nextInt();
        int min;
        int fin;
        switch (dia){
            case ("lunes"):
                hora=hora*60;
                min=hora+minutos;
                fin=6660-min;
                System.out.printf("Quedan= "+fin);
        break;
            case ("martes"):
            hora=hora*60;
            min=hora+minutos;
            fin=5220-min;
            System.out.printf("Quedan= "+fin);
        break;
            case ("miercoles"):
            hora=hora*60;
            min=hora+minutos;
            fin=3780-min;
            System.out.printf("Quedan= "+fin);
        break;
        case ("jueves"):
        hora=hora*60;
        min=hora+minutos;
        fin=2340-min;
        System.out.printf("Quedan= "+fin);
    break;
        case ("viernes"):
        hora=hora*60;
        min=hora+minutos;
        fin=900-min;
        System.out.printf("Quedan= "+fin);
    break;
    default:
    System.out.println("Día de la semana no válido");
            }
        }
    }
