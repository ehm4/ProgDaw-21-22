import java.util.Scanner;
public class Ejercicioclase{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduczca un numero entero impar");
    int n=s.nextInt();
    int variable=(n/2)+1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if(i==1||j==1||j==n||i==n){
          System.out.print(variable+" ");
        }
        else if(i==2||j==2||j==n-2||i==n-2){
          System.out.print((variable-1)+" ");
        }
        else if(i==3||j==3||j==n-3||i==n-3){
          System.out.print((variable-2)+" ");
        }
        else if(i==4||j==4||j==n-4||i==n-4){
          System.out.print((variable-3)+" ");
        }
        else if(i==4||j==4||j==n-4||i==n-4){
          System.out.print((variable-4)+" ");
        }
      }
      System.out.println("");
    }
  }
}
