import java.util.Scanner;
public class Ejercicioexamen2 {
  
public static void main(String[] args) throws InterruptedException {
  Scanner s = new Scanner(System.in);
  s.close();
  String [][] nieve= new String[23][60];
  String [][] arrayfinal=new String [23][60];
  int n;
  for(int i=0;i<23;i++){
    for(int j=0;j<60;j++){
      nieve[i][j]=" ";
    }
  }
  for(int i=0;i<23;i++){
    for(int j=22;j>0;j--){
      for(int k=0;k<60;k++){
      nieve[j][k]=nieve[j-1][k];
      }
    }

    for(int j=0;j<60;j++){
      n=(int)(Math.random()*15);
      if(n==1) nieve[0][j]="*";
      else nieve[0][j]=" ";
    }
    
    for(int j=0;j<23;j++){
      for(int k=0;k<60;k++){
        arrayfinal[j][k]=nieve[j][k];
      }
    }
    arrayfinal [10][20] = "F";
      arrayfinal [10][21] = "E";
      arrayfinal [10][22] = "L";
      arrayfinal [10][23] = "I";
      arrayfinal [10][24] = "C";
      arrayfinal [10][25] = "E";
      arrayfinal [10][26] = "S";
      arrayfinal [10][27] = " ";
      arrayfinal [10][28] = "F";
      arrayfinal [10][29] = "I";
      arrayfinal [10][30] = "E";
      arrayfinal [10][31] = "S";
      arrayfinal [10][32] = "T";
      arrayfinal [10][33] = "A";
      arrayfinal [10][34] = "S";


      for(int j=0;j<23;j++){
        for (int k=0;k<60;k++){
          System.out.print(""+arrayfinal[j][k]);
        }
        System.out.println("");
      }
      System.out.println("---------------------------");
      Thread.sleep(600);
  }
}
}