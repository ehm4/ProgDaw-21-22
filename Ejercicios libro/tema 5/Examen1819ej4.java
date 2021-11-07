import java.util.Scanner;
public class Examen1819ej4{
    public static void main(String[]args){
        // Suponiendo interés compuesto
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la cantidad inicial: ");
        double cantidadinicial=s.nextDouble();
        System.out.println("Introduzca la rentabilidad (el porcentaje sin '%'): ");
        double rentabilidad=s.nextDouble()/100;
        System.out.println("Introduzca la cantidad que quiere alcanzar: ");
        double cantidadfinal=s.nextDouble();
        s.close();
        int contadormeses=0;
        do{
            cantidadinicial=cantidadinicial+(cantidadinicial*rentabilidad);
            contadormeses++;
        }
            while(cantidadinicial<cantidadfinal);
        System.out.printf("Se necesitarían %d meses para conseguir %.2f €", contadormeses, cantidadfinal);
    }
}