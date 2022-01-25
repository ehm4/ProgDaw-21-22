import java.util.Scanner;
public class Ejercicio21{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    s.close();
    int [] num=new int [15];
    for(int i=0;i<15;i++){
      num[i]=(int)(Math.random()*501);
    }
    System.out.println("Array original: ");
    for(int i=0;i<15;i++){
      System.out.print(num[i]+" ");
    }
    for(int i=0;i<15;i++){
      if(num[i]%5!=0){
        do{
          num[i]++;
        }
        while(num[i]%5!=0);
      }
    }
    System.out.println("");
    System.out.println("Array cincuerizado: ");
    for(int i=0;i<15;i++){
      System.out.print(num[i]+" ");
    }
  }
}