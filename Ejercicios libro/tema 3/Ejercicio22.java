import java.util.Scanner;
public class Ejercicio22{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la cantidad de Kb= ");
    double kb= s.nextDouble();
    double mb= kb/1024;
    System.out.println("Son= "+mb+" Mb");
  }
}
