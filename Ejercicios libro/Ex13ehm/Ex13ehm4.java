// Ernesto Hernández Mangas

import java.util.Scanner;
public class Ex13ehm4 {
  
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int ancho;
  int alto;
  int asteriscos=1;
  int espacios=3;
  System.out.println("Indique el ancho en rectangulos: ");
  ancho=s.nextInt();
  System.out.println("Indique el alto en rectangulos: ");
  alto=s.nextInt();
    s.close();
  for(int k=0;k<alto;k++){
    asteriscos=1;
        espacios=3;
    for(int q=0;q<4;q++){
      for(int z=0;z<ancho;z++){
      for(int i=0;i<asteriscos;i++){
          System.out.print("*");
          }
            for(int i=0;i<espacios;i++){
            System.out.print(" ");
          }
          System.out.print(" ");
        }
        asteriscos++;
        espacios--;
        System.out.println("");
      }
       System.out.println("");
    }
  }
}