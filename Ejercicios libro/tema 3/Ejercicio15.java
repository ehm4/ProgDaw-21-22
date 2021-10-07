import java.util.Scanner;
public class Ejercicio15{
public static void main(String[]args){
   Scanner s = new Scanner(System.in);
      System.out.println("Introduzca cuántas pesetas quiere convertir: ");
      double euros;
      double pesetas= s.nextDouble();
      euros=pesetas/166.386;
      
      System.out.println("Son=  "+euros+" euros");
    }
  }
