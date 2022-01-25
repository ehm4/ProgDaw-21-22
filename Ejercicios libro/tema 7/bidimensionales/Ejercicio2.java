import java.util.Scanner;
public class Ejercicio2 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int [][] num=new int [4][5];
  int []sumafila=new int [4];
  int []sumacolumna=new int [5];
  int sumafinal=0;
  int fila;
  int columna;
  for(fila=0;fila<4;fila++){
    for(columna=0;columna<5;columna++){
      System.out.println("Introduce el numero que quiere colocar en "+fila+" fila y "+columna+" columna");
      num[fila][columna]=s.nextInt();
    }
  }
  for(fila=0;fila<=4;fila++){
    System.out.println("");
    if(fila!=4){
      for(columna=0;columna<=5;columna++){
        if(columna!=5){
          System.out.printf("%4d", num[fila][columna]);
        }
        else{
          for(int i=0;i<5;i++){
            sumafila[fila]+=num[fila][i];
          }
          System.out.printf("%4d", sumafila[fila]);
        }
      }
    }
    else{
      for(int i=0;i<6;i++){
        if(i!=6){
        for(int j=0;j<4;j++){
        sumacolumna[i]+=num[j][i];
        }
        System.out.printf("%4d", sumacolumna[i]);
        }
        else{
          for(fila=0;fila<4;fila++){
            sumafinal+=sumafila[fila];
          }
            for(columna=0;columna<5;columna++){
              sumafinal+=sumacolumna[columna];
            }
          System.out.printf("%4d", sumafinal);
        } 
      }
    }
  }
 }
}