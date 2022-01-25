import java.util.Scanner;
public class Ejercicio16{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] num= new int [20];
    for(int i=0;i<20;i++){
      num[i]=(int)(Math.random()*401);
      System.out.print(num[i]+" ");
    }
    System.out.println("");
    System.out.println("¿Qué números quiere resaltar? (1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int resaltar=s.nextInt();
    s.close();
    for(int i=0;i<20;i++){
      if(resaltar==1){
        if(num[i]%5==0){
          System.out.print ("["+num[i]+"] ");
        }
        else{
          System.out.print(num[i]+" ");
        }
      }
      else if(resaltar==2){
        if(num[i]%7==0){
          System.out.print ("["+num[i]+"] ");
        }
        else{
          System.out.print(num[i]+" ");
        }
      }
    }
  }
}