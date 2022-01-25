import java.util.Scanner;
public class Ejercicio5 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  s.close();
  int min=1000;
  int max=0;
  int[][]num=new int [6][10];
  for(int i=0;i<6;i++){
    for(int j=0;j<10;j++){
      num[i][j]=(int)(Math.random()*1001);
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