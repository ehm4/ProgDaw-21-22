import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n=s.nextInt();
        int n2;
        int n3;
        for (int i=n ; i<=n+5; i++){
            n2=i*i;
            n3=i*i*i;
            System.out.printf(""+i+"   "+n2+"   "+n3+"\n");
        }
    }
}
