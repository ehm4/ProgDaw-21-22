import java.util.Scanner;
public class Ejercicio18{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de euros a la que desea aplicar el IVA= ");
    double euros= s.nextDouble();
    double resultado= euros*1.21;
    System.out.println("El resultado es= "+resultado+" euros");
  }
}
