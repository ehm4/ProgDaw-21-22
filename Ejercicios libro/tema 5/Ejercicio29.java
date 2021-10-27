import java.util.Scanner;
public class Ejercicio29{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número entero: ");
        int n=s.nextInt();
        System.out.println("Introduzca otro número: ");
        int n2=s.nextInt();
        s.close();

        for(int i=0;i<n;i++){
            if((i%n2)!=0){
                System.out.print(i+" ");
            }
        }
    }
}