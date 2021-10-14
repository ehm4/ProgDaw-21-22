import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("1 - Programador junior");
        System.out.println("2 - Programador senior");
        System.out.println("3 - Jefe de proyecto");
        System.out.println("Introduzca el cargo del empleado (1-3)= ");
        int n= s.nextInt();
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
        int d=s.nextInt();
        System.out.println("Introduzca su estado civil (1-Soltero, 2-Casado)= ");
        int e= s.nextInt();
        int sueldo=0;
        int dietas=0;
        int sueldobruto;
        double retencion=0;
        double sueldoneto=0;
        switch (n){
            case 1:
            sueldo=950;
            break;
            case 2:
            sueldo=1200;
            break;
            case 3:
            sueldo=1600;
            break;
            default:
            System.out.println("Caracteres no válidos en el campo de cargo del empleado");
        }
        dietas=30*d;
        sueldobruto=dietas+sueldo;
        switch (e){
            case 1:
            retencion=sueldobruto*0.25;
            e=25;
            break;
            case 2:
            retencion=sueldobruto*0.2;
            e=20;
            break;
            default:
            System.out.println("Caracteres inválidos en el campo de estado civil");
        }
        sueldoneto=sueldobruto-retencion;
        System.out.println("┌------------------------------------┐");
        System.out.printf("|Sueldo base=                   %d€|\n", sueldo);
        System.out.printf("|Dietas (%d viajes)=              %d€|\n", d, dietas);
        System.out.println("├------------------------------------┤");
        System.out.printf("|Sueldo bruto=                  %d€|\n", sueldobruto);
        System.out.printf("|Retención IRPF (%2d%%)=        %.2f€|\n", e, retencion);
        System.out.println("├------------------------------------┤");
        System.out.printf("|Sueldo neto=                %.2f€|\n", sueldoneto);
        System.out.println("└------------------------------------┘");
    }
}




