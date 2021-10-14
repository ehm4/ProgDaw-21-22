import java.util.Scanner;
public class Ejercicio23{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba la base imponible= ");
        double n1= s.nextDouble();
        System.out.println("Introduzca si desea aplicar un IVA general, reducido o superreducido= ");
        String iva1= System.console().readLine();
        System.out.println("Introduzca que tipo de código promocional desea aplicar (nopro, mitad, meno5 o 5porc)= ");
        String cod= System.console().readLine();
        double precioconiva;
        int iva2=0;
        double iva3;
        double codprom=0;
        double total;
        switch (iva1){
            case ("general"):
            iva2=21;
            break;
            case ("reducido"):
            iva2=10;
            break;
            case("superreducido"):
            iva2=4;
            break;
            default:
            System.out.println("IVA no válido");
        }
        iva3=n1*((double)iva2/100);
        precioconiva=n1+iva3;
        switch (cod){
            case ("nopro"):
            codprom=0;
            break;
            case ("mitad"):
            codprom=-(precioconiva/2);
            break;
            case ("meno5"):
            codprom=-5;
            break;
            case("5porc"):
            codprom=-(precioconiva*0.05);
            break;
            default:
            System.out.println("Código promocional no válido");
        }
        total=precioconiva+codprom;
        System.out.printf("Base imponible= %.2f \n", n1);
        System.out.printf("IVA(%2d%%)= %.2f \n", iva2, iva3);
        System.out.printf("Precio con IVA= %.2f \n", precioconiva);
        System.out.printf("Cód. promo. (%5s)= %.2f \n", cod, codprom);
        System.out.printf("Total= %.2f \n", total);
    }
}


