import java.util.Scanner;
public class Ejercicio32_2{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la longitud del sendero en metros: ");
    int longitud=s.nextInt();
    s.close();
    int espacios=3;
    for(int i=0;i<longitud;i++){

      int variante=(int)(Math.random()*3)-1;
      int obstaculo=(int)(Math.random()*2);
      int sitioobstaculo=(int)(Math.random()*4);
      int rosa=(int)(Math.random()*2);
      espacios+=variante;

      for(int j=0;j<espacios;j++){
        System.out.print(" ");
      }

      System.out.print("|");

      for(int j=0;j<4;j++){
        if(obstaculo==1){
          if(rosa==1&&sitioobstaculo==j){
            System.out.print("*");
          }
          else if(rosa==0&&sitioobstaculo==j){
            System.out.print("O");
          }
          else{
            System.out.print(" ");
          }
        }
        else{
        System.out.print(" ");
        }

      }
      
      System.out.print("|");
      System.out.println("");
    }
  }
}