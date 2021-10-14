import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número para saber si es capicúa= ");
        int n1= s.nextInt();
        if ((n1<10)&&(n1>=0)){
            System.out.println("Su número es capicúa");
        }
        else if ((n1>=10)&&(n1<100)){
            if((n1/10)==(n1%10)){
                System.out.println("Su número es capicúa");
            }
            else{
                System.out.println("Su número no es capicúa");
            }
        }
        else if ((n1>=100)&&(n1<1000)){
            if((n1/100)==(n1%10)){
                System.out.println("Su número es capicúa");
            }
            else{
                System.out.println("Su número no es capicúa");
            }
        }
        else if ((n1>=1000)&&(n1<10000)){
            if(((n1/1000)==(n1%10))&&((((n1/100)%10))==((n1/10)%10))){
                System.out.println("Su número es capicúa");
            }
            else{
                System.out.println("Su número no es capicúa");
            }
        }
        else if ((n1>=10000)&&(n1<100000)){
            if(((n1/10000)==(n1%10))&&((((n1/1000)%10))==((n1/10)%10))){
                System.out.println("Su número es capicúa");
            }
            else{
                System.out.println("Su número no es capicúa");
            }
        }
        else{
            System.out.println("Caracteres no válidos");
        }
    }
}