import java.util.Scanner;
public class Ejercicio11{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] n=new int [10];
    int n1=0;
    int contador2=0;
    int[] primos=new int [10];
    int[] noprimos=new int [10];

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

    for(int i=0;i<10;i++){
      int contador=0;
      for(int j=1;j<=n[i];j++){
        if(n[i]%j==0){
        contador++;
        }
      }
      if(contador==2||contador==1){
        primos[i]=n[i];
      }
      else{
        noprimos[i]=n[i];
      }
    }
    for(int i=0;i<10;i++){
      if(primos[i]!=0){
        n[contador2]=primos[i];
        contador2++;
      }
    }
      for(int i=0;i<10;i++){
        if(noprimos[i]!=0){
          n[contador2]=noprimos[i];
          contador2++;
        }
      }
      n1=0;
      System.out.println("");
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
  }
}