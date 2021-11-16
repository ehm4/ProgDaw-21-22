import java.util.Scanner;
public class Ejercicio12{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] n=new int [10];
    int n1=0;
    int inicial;
    int ultima;

    for(int i=0;i<10;i++){
      System.out.println("Introduzca un numero entero: ");
      n[i]=s.nextInt();
    }
    s.close();

    System.out.println("ARRAY inicial");
    System.out.print("Índice  ");
    for(int i=0;i<10;i++){
      System.out.printf("%3d", n1);
      n1++;
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<10;i++){
      System.out.printf("%3d", n[i]);
    }
    do{
      System.out.println("Introduce el numero inicial: ");
      inicial=s.nextInt();
      System.out.println("Introduce el numero final: ");
      ultima=s.nextInt();
    }
    while(inicial>=ultima);

  }
}