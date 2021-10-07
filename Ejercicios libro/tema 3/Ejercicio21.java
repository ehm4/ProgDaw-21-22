import java.util.Scanner;
public class Ejercicio21{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la cantidad de Mb= ");
    double mb= s.nextDouble();
    double kb= mb*1024;
    System.out.println("Son= "+kb+" Kb");
  }
}
