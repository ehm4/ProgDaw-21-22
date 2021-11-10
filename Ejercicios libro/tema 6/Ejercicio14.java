import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int contador=5;
        int n;
        int max=100;
        int min=0;
        int n2;
        do{
          n=(int)(Math.random()*(max-min)+min);
          System.out.println("¿Es "+n+"?");
          System.out.println("El número que estás pensando es 1)mayor, 2)menor, 3)igual: ");
          n2=s.nextInt();
          contador--;
          if(n2==1&&contador>0){
            min=n+1;
          }
          if(n2==2&&contador>0){
            max=n-1;
          }
        }
        while(contador>0&&n2!=3);
        if(n2==3){
          System.out.println("Bien! He acertado!");
        }
        else if(contador==0){
          System.out.println("Se han agotado mis oportunidades");
        }
        s.close();
    }
  }
