import java.util.Scanner;
public class Ejercicio19{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de horas trabajadas esta semana= ");
    double horas= s.nextDouble();
    double salario= horas*12;
    System.out.println("El salario de esta semana es= "+salario+" euros");
  }
}
