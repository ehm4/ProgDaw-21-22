import java.util.Scanner;
public class Ejercicio6{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa va a calcular los segundos que tarda un objeto en caer dependiendo de su altura");
    System.out.println("Introduzca la altura en metros= ");
    double h= 2*s.nextDouble()/9.81;
    double t;
    if (h>0){
      t= Math.sqrt(h);
      System.out.printf("Tarda %.3f segundos en caer", t);
    }
    else {
      System.out.println("La altura no puede ser menor o igual a 0");
    }
  }
}
