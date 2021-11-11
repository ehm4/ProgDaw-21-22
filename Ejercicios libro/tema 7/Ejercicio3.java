import java.util.Scanner;
public class Ejercicio3{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] enteros= new int[10];
    for(int i=0;i<10;i++){
      System.out.println("Introduzca un numero: ");
      enteros[i]=s.nextInt();
    }
    s.close();
    for(int i=0;i<10;i++){
      System.out.println(enteros[9-i]+" ");
    }
  }
}