import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un numero y le diré cuantos dígitos tiene: ");
        int n1= s.nextInt();
        int numerodigitos=1;
        int n=n1;
        while(n>10){
        n=n/10;
        numerodigitos++;
        }
        System.out.println(n1+" tiene "+numerodigitos+" dígito/s");
    }
}