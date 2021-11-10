import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int suma=0;
        int max=-100;
        int min=200;
        for(int i=0;i<50;i++){
          int n=(int)(Math.random()*301)-100;
          System.out.print(n+" ");
          suma+=n;
          if(n%2==0&&n>max){
            max=n;
          }
          else if(n%2!=0&&n<min){
            min=n;
          }
        }
        System.out.println("");
        System.out.println("El máximo de los números pares es: "+max);
        System.out.println("El mínimo de los números impares es: "+min);
        System.out.println("La media de todos los números es: "+(suma/50));
      }
    }