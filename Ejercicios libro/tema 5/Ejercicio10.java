import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double i=0;
        double suma=0;
        double n=0;
        while(n>=0){
        System.out.println("Introduce un numero (puede parar introduciendo un número negativo): ");
        n= s.nextDouble();
        i++;
        suma+=n;
        }
        System.out.println("La media de los números es: "+((suma-n)/(i-1)));
    }
}

