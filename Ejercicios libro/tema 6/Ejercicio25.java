import java.util.Scanner;
public class Ejercicio25{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    s.close();
    int contador=0;
    for(int i=0;i<100;i++){
      contador=0;
      int n=(int)(Math.random()*191)+10;
      if(n%5==0){
        System.out.print("["+n+"] ");
      }
      else{
        for(int j=1;j<n+1;j++){
          if(n%j==0){
            contador++;
          }
        }
        if(contador==2){
          System.out.print("#"+n+"# ");
        }
        else{
          System.out.print(n+" ");
        }
      }
    }
  }
}