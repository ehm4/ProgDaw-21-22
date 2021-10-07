import java.util.Scanner;
public class Ejercicio20{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduza el radio del cono (en metros)= ");
    double r=s.nextDouble();
    System.out.println("Introduza la altura del cono (en metros)= ");
    double h= s.nextDouble();
    double volumen=1.046666*(r*r)*h;
    System.out.println("El volumen del cono es= "+volumen+" metros cubicos");
  }
}
