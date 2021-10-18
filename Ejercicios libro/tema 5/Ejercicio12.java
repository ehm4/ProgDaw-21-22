import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa va a decir n numeros de la serie de Fibonacci.");
        System.out.println("Introduce n: ");
        int n=s.nextInt();
        switch(n){
            case 1: 
            System.out.println("0");
            break;
            case 2:
            System.out.println("1");
            break;
            default:
            System.out.print("0 1");
            int f2=1;
            int aux;
            int f1=0;
            while(n>2){
                aux=f1;
                f1=f2;
                f2=f2+aux;
                System.out.print(" "+f2);
                n--;
            }
        }
    }
}
        