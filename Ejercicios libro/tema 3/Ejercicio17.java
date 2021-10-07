import java.util.Scanner;
public class Ejercicio17{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
  
      System.out.println("Introduce la base en metros= ");
      double b= s.nextDouble();
      System.out.println("Introduce la altura en metros= ");
      double h= s.nextDouble();
      double resultado=((b*h)/2);
      System.out.println("El resultado del area del triangulo es= "+resultado+" metros");
    }
  }
      
