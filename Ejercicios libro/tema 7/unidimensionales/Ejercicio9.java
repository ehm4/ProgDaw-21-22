import java.util.Scanner;
public class Ejercicio9{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] numero=new int [8];
    for(int i=0;i<8;i++){
      System.out.println("Introduzca un numero entero: ");
      numero[i]=s.nextInt();
    }
    s.close();
    for(int i=0;i<8;i++){
      if(numero[i]%2==0){
        System.out.println(numero[i]+" par.");
      }
      else{
        System.out.println(numero[i]+" impar.");
      }
    }
  }
}