import java.util.Scanner;
public class Ejercicio12{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] n=new int [10];
    int n1=0;
    int inicial;
    int ultima;
    int numfinal;
    int numinicial;
    int num;

    for(int i=0;i<10;i++){
      System.out.println("Introduzca un numero entero: ");
      n[i]=s.nextInt();
    }

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
    System.out.println("");
    do{
      System.out.println("Introduce el numero inicial: ");
      inicial=s.nextInt();
      System.out.println("Introduce el numero final: ");
      ultima=s.nextInt();
    }
    while(inicial>ultima||inicial<0||inicial>9||ultima<0||ultima>9);
    numinicial=n[inicial];
    num=n[ultima];
    numfinal=n[9];
    for(int i=9;i>0;i--){
      if(i==ultima){
        n[i]=numinicial;
      }
      else if(i==inicial){
        n[i]=num;
      }
      else if(!(i>inicial&&i<ultima)){
        n[i]=n[i-1];
      }
    }
    n[0]=numfinal;
    n1=0;
    System.out.println("ARRAY final");
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
    s.close();
  }
}