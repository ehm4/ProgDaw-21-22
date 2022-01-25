import java.util.Scanner;
public class Ejercicioexamen2v2 {
  
public static void main(String[] args) throws InterruptedException {
  Scanner s = new Scanner(System.in);
  s.close();
  char [][] nieve= new char [23][60];
  char[][] array= new char [23] [60];
  int n;
  for (int i=0;i<23;i++){
    for (int j=0;j<60;j++){
      nieve[i][j]=' ';
    }
  }
  for (int k=0;k<23;k++){
    for (int i=22;i>0;i--){
      for (int j=0;j<60;j++){
        nieve[i][j]=nieve[i-1][j];
      }
    }
    for (int i=0;i<60;i++){
      n=(int)(Math.random()*15);
      if(n==1) nieve [0][i]='*';
      else nieve[0][i]=' ';
    }

    for (int i=0;i<23;i++){
      for (int j=0;j<60;j++){
        array[i][j]=nieve[i][j];
      }
    }
    array [10][20] = 'F';
      array [10][21] = 'E';
      array [10][22] = 'L';
      array [10][23] = 'I';
      array [10][24] = 'C';
      array [10][25] = 'E';
      array [10][26] = 'S';
      array [10][27] = ' ';
      array [10][28] = 'F';
      array [10][29] = 'I';
      array [10][30] = 'E';
      array [10][31] = 'S';
      array [10][32] = 'T';
      array [10][33] = 'A';
      array [10][34] = 'S';

    for(int i=0;i<23;i++){
      for (int j=0;j<60;j++){
        System.out.print(""+array[i][j]);
      }
      System.out.println("");
    }
    System.out.println("-----------------------------");
    Thread.sleep(600);
    }
}
}