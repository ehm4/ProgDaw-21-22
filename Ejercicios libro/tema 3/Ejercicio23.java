import java.util.Scanner;
public class Ejercicio23{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen= ");
    double nota1= 0.4*s.nextDouble();
    System.out.println("Introduce la nota media que quieres sacar= ");
    double media= s.nextDouble();
    double nota2=(media-nota1)/0.6;
    System.out.println("La nota necesaria en el siguiente examen para sacar esa media es= "+nota2);
  }
}
