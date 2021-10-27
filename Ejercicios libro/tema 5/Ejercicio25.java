import java.util.Scanner;
public class Ejercicio25{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int n=s.nextInt();
        s.close();
        int c;
        int m=10;
        c=n%10;
        System.out.print(""+c);
        do{
            c=0;
            c=((n/m)%10);
            System.out.print(""+c);
            m=m*10;
        }
        while((m/n)<1);
    }
}