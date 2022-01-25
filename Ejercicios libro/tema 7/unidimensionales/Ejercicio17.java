import java.util.Scanner;
public class Ejercicio17{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] num=new int [10];
    int aux;
    int contador=0;
    for(int i=0;i<10;i++){
      num[i]=(int)(Math.random()*101);
      System.out.print(num[i]+" ");
    }
    System.out.println("");
    System.out.println("Deme un número entero: ");
    int entero=s.nextInt();
    for(int i=0;i<10;i++){
      if(num[i]==entero){
        contador++;
      }
    }
    while(contador==0){
      System.out.println("Incorrecto. Deme un número entero: ");
    entero=s.nextInt();
    for(int i=0;i<10;i++){
      if(num[i]==entero){
        contador++;
      }
    }
    }
    s.close();
    while(num[0]!=entero){
      aux=num[9];
      for(int i=9;i>=0;i--){
        if(i!=0){
        num[i]=num[i-1];
        }
      }
      num[0]=aux;
    }
    for(int i=0;i<10;i++){
      System.out.print(num[i]+" ");
    }
  }
}