import java.util.Scanner;
public class Ejercicio25{
    public static void main(String[]args){
        Scanner q = new Scanner(System.in);
        System.out.println("Introduzca la altura de la bandera en cm= ");
        int h= q.nextInt();
        System.out.println("Ahora introduzca la anchura en cm= ");
        int a= q.nextInt();
        System.out.println("¿Quiere escudo bordado? (s/n)");
        string e= q.next();
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        double cm2= (double)h*a;
        double bandera=cm2/100;
        double total=0;
            if (e.equals("n")){
            System.out.printf("Bandera de %d cm2= %.2f€\n", cm2, bandera);
            System.out.println("Sin escudo=  0€");
            System.out.println("Gastos de envío=   3,25€");
            total= bandera+3.25;
            System.out.printf("Total=  %.2f\n");
            }
            else if (e.equals("s")){
            System.out.printf("Bandera de %d cm2= %.2f€\n", cm2, bandera);
            System.out.println("Con escudo=  2,50€");
            System.out.println("Gastos de envío=   3,25€");
            total= bandera+3.25+2.50;
            System.out.printf("Total=  %.2f\n");
            }
            else{
            System.out.println("Caracteres inválidos");
        }
    }
}