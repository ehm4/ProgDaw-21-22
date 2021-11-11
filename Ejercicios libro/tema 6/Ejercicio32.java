import java.util.Scanner;
public class Ejercicio32{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la longitud del sendero en metros: ");
    int m=s.nextInt();
    s.close();
    int espacios=4;
    for(int i=0;i<m;i++){
      int posicion=1;
      int n=(int)(Math.random()*3)-1;
      espacios+=n;
      for(int j=0;j<espacios;j++){
        System.out.print(" ");
      }
      System.out.print("|");
      int obstaculo=(int)(Math.random());
      if(obstaculo==1){
        int obstaculositio=(int)(Math.random()*4)+1;
        int rosa=(int)(Math.random()*3)+1;
      for(int j=0;j<4;j++);{
          if(posicion==obstaculositio){
            if(rosa==1){
              System.out.print("*");
            }
            else if(rosa==2){
              System.out.print("O");
            }
          }
          else if(posicion!=obstaculositio){
            System.out.print(" ");
          }
          posicion++;
        }
      }
      else{
        for(int j=0;j<4;j++){
          System.out.print(" ");
        }
      }
      System.out.print("|");
      System.out.println("");
      
      }

    }
  }
