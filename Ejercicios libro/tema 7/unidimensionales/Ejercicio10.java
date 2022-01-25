import java.util.Scanner;
public class Ejercicio10{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    s.close();
    int [] n=new int [20];
    int [] impares=new int [20];
    int [] pares=new int [20];
    int contador=0;
    for(int i=0;i<20;i++){
      n[i]=(int)(Math.random()*101);
    }
    for(int i=0;i<20;i++){
      if(n[i]%2==0){
        pares[i]=n[i];
      }
      else{
        impares[i]=n[i];
      }
    }
    for(int i=0;i<20;i++){
      if(pares[i]!=0){
        n[contador]=pares[i];
        contador++;
      }
     }
      for(int i=0;i<20;i++){
        if(impares[i]!=0){
        n[contador]=impares[i];
        contador++;
      
      }
    }
    for(int i=0;i<20;i++){
      System.out.println(n[i]+" ");
    }
  }
}
