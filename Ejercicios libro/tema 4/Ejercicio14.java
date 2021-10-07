import java.util.Scanner;
public class Ejercicio14{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
      System.out.println("Este programa va a decir si el número que usted introduzca es par y si es divisible por 5");
      System.out.println("Introduzca un número= ");
      int n= s.nextInt();
      int resto1= n%2;
      int resto2= n%5;
      if (n<0){
        System.out.println("El número introducido debe ser positivo");
      }
      else if ((resto1==0)&&(resto2==0)){
        System.out.println("Este número es par y divisible por 5");
      }
        else if((resto1!=0)&&(resto2==0)){
        System.out.println("Este numero no es par pero es divisible por 5");
      }
      else if((resto1==0)&&(resto2!=0)){
        System.out.println("Este numero es par pero no es divisible por 5");
      }
      else if((resto1!=0)&&(resto2!=0)){
        System.out.println("Este numero no es par ni es divisible por 5");
      }
    }
  }
      
