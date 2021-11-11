import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, indique la capacidad de la cuba en litros: ");
        int h=s.nextInt();
        int n=(int)(Math.random()*h)+1;
        s.close();
        for(int i=0;i<h;i++){
          System.out.print("*");
          if(i<(h-n)){
            for(int j=0;j<4;j++){
              System.out.print(" ");
            }
          }
          else{
            for(int j=0;j<4;j++){
            System.out.print("=");
          }
          }
          System.out.print("*");
          System.out.println("");
        }
        System.out.print("******");
        System.out.println("La cuba tiene una capacidad de "+h+" litros y contiene "+n+" litros de agua.");
    }
  }
