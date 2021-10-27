import java.util.Scanner;
public class Ejercicio27{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int n=s.nextInt();
        s.close();
        int suma=0;
        int contador=0;
        for(int i=1; i<=n; i++){
            if((i%3)==0){
            System.out.print(i+" ");
            contador++;
            suma+=i;
            }
        }
        System.out.println("");
        System.out.println("El número de múltiplos de 3 es: "+contador);
        System.out.println("La suma de los números múltiplos de 3 es: "+suma);
    }
}