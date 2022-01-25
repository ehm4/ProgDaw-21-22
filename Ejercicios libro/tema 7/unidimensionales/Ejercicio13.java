import java.util.Scanner;
public class Ejercicio13{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] n= new int [100];
    int min=500;
    int max=0;
    for(int i=0;i<100;i++){
      n[i]=(int)(Math.random()*501);
      System.out.print(n[i]+" ");
      if(n[i]<min){
        min=n[i];
      }
      else if(n[i]>max){
        max=n[i];
      }
    }
    System.out.println("");
    System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
    int num=s.nextInt();
    s.close();
    for(int i=0;i<100;i++){
      if(num==1&&n[i]==min){
      System.out.print("**"+min+"** ");
      }
      else if(num==2&&n[i]==max){
        System.out.print("**"+max+"** ");
        }
        else{
          System.out.print(n[i]+" ");
        }
    }
  }
}