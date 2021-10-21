import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n1=s.nextInt();
        System.out.println("Introduce otro número: ");
        int n2=s.nextInt();
        int aux=0;
        int i=0;
        if(n1==n2){
            System.out.println("Los números no pueden ser iguales.");
        }
        else{
            if(n1>n2){
            aux=n2;
            n2=n1;
            n1=aux;
            }
            i=n1;
            while(i<(n2-7)){
                i+=7;
                System.out.print(i+" ");
            }
        }
        }
    }
