import java.util.Scanner;
public class Ejercicio19{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] num=new int [12];
    for(int i=0;i<12;i++){
      num[i]=(int)(Math.random()*201);
    }
    System.out.println("Array original:");
    System.out.print("Índice  ");
    for(int i=0;i<12;i++){
      System.out.printf("%4d", i);
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<12;i++){
      System.out.printf("%4d", num[i]);
    }
    System.out.println("");
    System.out.println("Introduzca el número que quiere insertar: ");
    int n1=s.nextInt();
    System.out.println("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion=s.nextInt();
    for(int i=11;i>=posicion;i--){
      if(i==posicion){
        num[i]=n1;
      }
      else{
        num[i]=num[i-1];
      }
    }
    System.out.println("");
    System.out.println("Array resultado:");
    System.out.print("Índice  ");
    for(int i=0;i<12;i++){
      System.out.printf("%4d", i);
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<12;i++){
      System.out.printf("%4d", num[i]);
    }
    s.close();
  }
}