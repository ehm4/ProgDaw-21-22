import java.util.Scanner;
public class Ejercicio3 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int [][] num=new int [5][6];
System.out.println("Introduzca un número y pulse INTRO");
for(int i=0;i<5;i++){
  for (int j=0;j<4;j++){
    num [j][i]=(int)(Math.random()*900)+100;
  }
}
for(int i=0;i<5;i++){
  for(int j=0;j<4;j++){
    num[4][i]+=num[j][i];
  }
}
for(int i=0;i<4;i++){
  for(int j=0;j<5;j++){
    num[i][5]+=num[i][j];
  }
}
for(int i=0;i<4;i++){
  num[4][5]+=num[i][5];
}
for(int i=0;i<5;i++){
  num[4][5]+=num[4][i];
}
for(int i=0;i<5;i++){
  for(int j=0;j<6;j++){
    System.out.printf("%6d", num[i][j]);
  }
  System.out.println("");
}
s.close();
}
}