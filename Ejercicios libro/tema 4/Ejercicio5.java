import java.util.Scanner;
public class Ejercicio5{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones tipo-> ax+b=0");
    System.out.println("Introduzca 'a'= ");
    double a =s.nextDouble();
    if (a!=0){
    System.out.println("Introduzca 'b'= ");
    double b =s.nextDouble();
    double x;
     x=(-b)/a;
      System.out.printf("El resultado es= %.2f\n", x);
    }
      else {
        System.out.println("Carácter 'a' inválido");
      }
    
  }
}
      
