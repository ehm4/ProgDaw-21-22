import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        for(int i=0;i<15;i++){
          for(int j=0;j<3;j++){
            int n=(int)(Math.random()*3);
            switch(n){
              case 0:
              System.out.print("X  ");
              break;
              case 1:
              System.out.print("1  ");
              break;
              case 2:
              System.out.print("2  ");
              break;
            }
          }
          System.out.println("");
        }
    }
  }
