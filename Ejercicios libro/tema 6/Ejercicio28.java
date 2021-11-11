import java.util.Scanner;
public class Ejercicio28{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el tamaño del array: ");
    int n=s.nextInt();
    s.close();
    int indice=0;
    System.out.println("Array original: ");
    System.out.print("Índice  ");
    for(int i=0;i<n;i++){
      System.out.printf("  %4d",indice);
      indice++;
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<n;i++){
      int aleatorio=(int)(Math.random()*201);
      System.out.printf("  %4d",aleatorio);
    }
  }
}