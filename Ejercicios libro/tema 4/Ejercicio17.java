import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número entero= ");
        int n=s.nextInt();
        System.out.println("El último dígito del numero introducido es= "+(n % 10));
    }
}