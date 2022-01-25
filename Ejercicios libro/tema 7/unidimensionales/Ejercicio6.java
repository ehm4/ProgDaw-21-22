import java.util.Scanner;
public class Ejercicio6{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] numero=new int[15];
    int aux;
    for(int i=0;i<15;i++){
      System.out.println("Introduzca un numero: ");
      numero [i]=s.nextInt();
    }
    s.close();
    aux=numero[14];
    for(int i=14;i>0;i--){
      numero[i]=numero[i-1];
    }
      numero[0]=aux;
      for(int i=0;i<15;i++){
      System.out.println(""+numero[i]);
      }
  }
}