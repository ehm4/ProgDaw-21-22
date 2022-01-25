import java.util.Scanner;
public class Ejercicio6 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  s.close();
  boolean repetido = false;
  int min=1000;
  int max=0;
  int[][]num=new int [6][10];
  for(int i=0;i<6;i++){
    for(int j=0;j<10;j++){
      int contador=0;
        do{
          repetido=false;
      num[i][j]=(int)(Math.random()*1001);
      for(contador=0;contador<10*i+j;contador++){
        if(num[i][j]==num[contador/10][contador%10]){
          repetido=true;
        }
      }
    }
      while(repetido);
      if(num[i][j]>max){
        max=num[i][j];
      }
      if(num[i][j]<min){
        min=num[i][j];
      }
    }
  }
  for(int i=0;i<6;i++){
    for(int j=0;j<10;j++){
      System.out.printf("%5d",num[i][j]);
      if(num[i][j]==max){
        System.out.println("La posición del número máximo es la "+(i+1)+" fila y la "+(j+1)+" columna");
      }
      if(num[i][j]==min){
        System.out.println("La posición del número mínimo es la "+(i+1)+" fila y la "+(j+1)+" columna");
      }
    }
  }

}
}