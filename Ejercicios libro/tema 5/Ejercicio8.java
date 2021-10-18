import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int n= s.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(n+"x"+i+" = "+n*i);
        }
    }
}