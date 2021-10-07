import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de horas trabajadas a la semana= ");
    int h = Integer.parseInt(System.console().readLine());
    int euros;
    int h2;
    if (h<=40){
        euros=h*12;
        System.out.println("El sueldo semanal que le pertenece es de= "+euros+"euros");
      }
        else if (h>40){
          h2=h-40;
          h2=h2*16;
          euros=(h2+480);
          System.out.println("El sueldo semanal que le pertenece es de= "+euros+"euros");
        }
      
      
    }
  }
