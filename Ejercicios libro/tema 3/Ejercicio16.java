
import java.util.Scanner;
public class Ejercicio16{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
  
      System.out.println("Introduce la base en metros= ");
      double b= s.nextDouble();
      System.out.println("Introduce la altura en metros= ");
      double h= s.nextDouble();
      double resultado=((b*h));
      System.out.println("El resultado del area del rectangulo es= "+resultado+" metros");
    }
  }
      
