import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int n=s.nextInt();
        System.out.println("Introduce un dígito de ese número: ");
        int d=s.nextInt();
        s.close();
        int contador=0;
        int c;
        int m=10;
        int digitos=0;
        int aux;
        aux=n;
        while(n>0){
            digitos++;
            n/=10;
        }
        System.out.print("La/s posición/es del dígito dentro de este número son: ");
        c=aux%10;
        if((aux%10)==d){
            System.out.print(""+(digitos)+" ");
        }
        do{
            c=0;
            c=((aux/m)%10);
            m*=10;
            contador++;
            if(c==d){
            System.out.print(""+(digitos-contador)+" ");
            }
        }
            while((m/aux)<1);
    }
}