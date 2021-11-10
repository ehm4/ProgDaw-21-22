import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n=(int)(Math.random()*101);
        System.out.println("Introduzca un número para ver si es el número secreto: ");
        int n2=s.nextInt();
        int contador=5;
        if(n2==n){
          System.out.println("Ha acertado");
        }
        else{
            while(n2!=n&&contador>0){
            System.out.println("Le quedan "+contador+" oportunidades.");
            if(n2<n){
              System.out.println("El numero introducido es menor que el numero secreto");
            }
            else{
              System.out.println("El numero introducido es mayor que el numero secreto");
            }
            System.out.println("Introduzca un número para ver si es el número secreto: ");
            n2=s.nextInt();
            contador--;
          }
          if(contador==0){
            System.out.println("Se ha quedado sin oportunidades");
          }
          if(n2==n){
            System.out.println("Usted ha acterdado el numero secreto: "+n);
          }
    }
    s.close();
  }
}