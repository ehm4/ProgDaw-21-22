import java.util.Scanner;
public class Ejercicio4{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    s.close();
    int [] numero=new int[20];
    int [] cuadrado=new int[20];
    int [] cubo=new int[20];
    for(int i=0;i<20;i++){
      numero[i]=(int)(Math.random()*101);
      cuadrado[i]=numero[i]*numero[i];
      cubo[i]=numero[i]*numero[i]*numero[i];
      System.out.printf("%3d", numero[i]);
      System.out.print(" ");
      System.out.printf("%3d", cuadrado[i]);
      System.out.print(" ");
      System.out.printf("%3d", cubo[i]);
      System.out.println("");
    }
  }
}