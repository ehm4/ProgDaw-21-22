import java.util.Scanner;
public class Ejercicio34{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca un número: ");
        long n=s.nextInt();
        System.out.println("Introduzca otro número: ");
        long n2=s.nextInt();
        s.close();

        long reves=0;
        long reves2=0;
        long pares=0;
        long impares=0;
        long v1;
        long v2;
        long i1;
        long i2;

        while(n>0){
            v1=n%10;
            reves=reves*10+v1;
            n/=10;
        }
        while(n2>0){
            v2=n2%10;
            reves2=reves2*10+v2;
            n2/=10;
        }
        while((reves>0)&&(reves2>0)){
            i1=n%10;
            if(i1%2==0){
            pares=pares*10+i1;
            }
            else{
                impares=impares*10+i1;
            }
            i2=n%10;
            if(i2%2==0){
            pares=pares*10+i2;
            }
            else{
                impares=impares*10+i2;
            }
            reves2/=10;
            reves/=10;
        }
        System.out.println(""+pares);
        System.out.println(""+impares);
    }
}

