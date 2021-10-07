import java.util.Scanner;
public class Ejercicio2{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la hora(minutos no)= ");
    int h = Integer.parseInt(System.console().readLine());
    if ((h>=6)&&(h<=12)){
      System.out.println("Buenos días");
    }
      else if((h>=13)&&(h<=20)){
        
          System.out.println("Buenas tardes");
        }
      else if((h>=21)||(h<=5)){
          System.out.println("Buenas noches");
        }
      }
    }
  
