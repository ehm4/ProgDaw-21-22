import java.util.Scanner;
public class Ejercicio32{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long n=s.nextLong();
        s.close();

        int digitos=0;
        long m=10;
        long suma=0;
        long c;
        long aux;
        aux=n;

        while (n>0){
            n/=10;
            digitos++;
        }   

        for(int j=1;j<(digitos-1);j++){
            m*=10;
        }

        System.out.print("Dígitos pares: ");
        while(m>0){
            c=(aux/m)%10;
            if(c%2==0){
                System.out.print(c+" ");
                suma+=c;
            }
            m/=10;
        }
        System.out.println("");
        System.out.println("Suma de los dígitos pares: "+suma);
        }
    }