// Ernesto Hernández Mangas

import java.util.Scanner;

public class Ex13ehm1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int filas;
    int columnas;

    int min;
    int max;

    System.out.println("Introduzca el nº de filas [1-20]: ");
    filas=s.nextInt();
    if(filas<1||filas>20){
    do{
      System.out.println("Introduzca el nº de filas [1-20]: ");
      filas=s.nextInt();
    }
    while(filas<1||filas>20);
    }
    System.out.println("Introduzca el nº de columnas [1-20]: ");
    columnas=s.nextInt();
    if(columnas<1||columnas>20){
    do{
      System.out.println("Introduzca el nº de columnas [1-20]: ");
      columnas=s.nextInt();
    }
    while(columnas<1||columnas>20);
    }

  System.out.println("Introduzca el extremo inferior del intervalo aleatorio: ");
  min=s.nextInt();
  System.out.println("Introduzca el extremo superior del intervalo aleatorio: ");
  max=s.nextInt();
  if(max-min<filas*columnas){
    do{
      System.out.println("Cantidad de datos insuficientes.");
      System.out.println("Introduzca el extremo inferior del intervalo aleatorio: ");
      min=s.nextInt();
      System.out.println("Introduzca el extremo superior del intervalo aleatorio: ");
      max=s.nextInt();
    }
    while(max-min<filas*columnas);
  }
  int [][] array = new int[filas][columnas];
    s.close();

    int longitud = 0;
    int mayornumero = max;

    while (mayornumero > 0){
      mayornumero /= 10;
      longitud++;
    }

    String espacio = "%" + String.valueOf(longitud) + "d│";

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++){
        boolean repeticion;
        int contador = 0;
        
        do {
          repeticion = false;
          
          array [i][j] = (int) (Math.random() * (max - min + 1)) + min;
          
          for (contador = 0; contador < columnas * i + j; contador++) {
            if (array [i][j] == array [contador / columnas][contador % columnas]) {
              repeticion = true;}
          }
          
        }while (repeticion);
      }
    }

    System.out.print("┌");
    for (int i = 0; i < columnas; i++) {
      for (int j = 0; j < longitud; j++) System.out.print("─");

      if (i == columnas - 1) System.out.println("┐");
      else System.out.print("┬");
    }

    for (int i = 0; i < filas; i++) {
      System.out.print("│");
      for (int j = 0; j < columnas; j++){
        System.out.printf(espacio, array[i][j]);
      }

      System.out.println();

      if (i == filas - 1){
        System.out.print("└");
        for (int k = 0; k < columnas; k++) {
          for (int j = 0; j < longitud; j++) System.out.print("─");
  
          if (k == columnas - 1) System.out.println("┘");
          else System.out.print("┴");
        }

      }else {.
        System.out.print("├");
        for (int k = 0; k < columnas; k++) {
          for (int j = 0; j < longitud; j++) System.out.print("─");
  
          if (k == columnas - 1) System.out.println("┤");
          else System.out.print("┼");
        }

      }

    }

  }
}