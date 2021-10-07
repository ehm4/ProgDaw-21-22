import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
      Scanner s = new Scanner(System.in);
      System.out.println("Introduzca cuántos euros quiere convertir: ");
      double pesetas;
      double euros= s.nextDouble();
      pesetas=euros*166.386;
      
      System.out.println("Son=  "+pesetas+" pesetas");
    }
  }
