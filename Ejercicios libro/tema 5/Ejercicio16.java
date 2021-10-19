import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n= s.nextInt();
        int i=2;
        int contador=1;
        while(i<=n){
            if(n%i==0){
            contador++;
            }
            i++;
        }
        if(contador==2){
            System.out.println("El número es primo");
        }
        else{
            System.out.println("El número no es primo");
        }

    }
}
