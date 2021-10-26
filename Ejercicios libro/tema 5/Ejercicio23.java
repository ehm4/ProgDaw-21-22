import java.util.Scanner;
public class Ejercicio23{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n;
        int suma=0;
        int contador=0;
        do{
            System.out.println("Introduzca un número: ");
            n=s.nextInt();
            suma+=n;
            contador++;
        }
        while(suma<=10000);
        System.out.println("El total acumulado es: "+suma);
        System.out.println("El contador es: "+contador);
        System.out.printf("La media es: %.2f",((double)suma/contador));
        s.close();
    }
}