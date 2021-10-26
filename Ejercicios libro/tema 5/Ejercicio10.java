import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double suma=0;
        double n=0;
        System.out.println("¿Cúantos números va a introducir?");
        int x= s.nextInt();
        for(int y=0; y<x; y++){
        do{
        System.out.println("Introduce un numero : ");
        n= s.nextDouble();
            }
        while(n<0);
        suma+=n;
        
        }
        System.out.println("La media es "+(suma/x));
    }
    }


