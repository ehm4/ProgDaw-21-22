import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int n=(int)(Math.random()*101);
        int contador=0;
        while(n!=24){
          n=(int)(Math.random()*101);
          if(n%2==0){
            contador++;
            System.out.print(n+" ");
          }
        }
        System.out.println("");
        System.out.println("Se han generado "+contador+" numeros pares");
      }
    }