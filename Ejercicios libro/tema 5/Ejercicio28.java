import java.util.Scanner;
public class Ejercicio28{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número  entero: ");
        int n=s.nextInt();
        s.close();
        int total=n;
        int aux=n-1;
        for(int i=1; i<n; i++){
            total*=aux;
            aux--;
        }
        System.out.println(n+"! = "+total);
    }
}