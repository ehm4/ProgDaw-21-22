import java.util.Scanner;
public class Ejercicioclase {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  s.close();
  boolean parar=true;
  int media=0;
  int [][] posicion2=new int [3][3];
  int contador=0;
  int [][] posicion=new int [10][10];
  for(int i=0;i<10;i++){
    for(int j=0;j<10;j++){
      posicion[i][j] = (int)(Math.random()*101);
      System.out.printf("%4d", posicion[i][j]);
    }
    System.out.println("");
  }
  while(parar){
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        for(int x=i-1; x<i+1;x++){ 
          for(int y=j-1; y<j+1;j++){
            media=(posicion2[x][y]-posicion[i][j])/contador;
            posicion[i][j]=media;
          }
        }
      }
    }
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        posicion[i][j] = (int)(Math.random()*101);
        System.out.printf("%4d", posicion[i][j]);
      }
      System.out.println("");
    }
    System.out.println("¿Quieres parar?  (si/no)");
    String caracter= s.nextLine();
    if(caracter.equals("si")){
      parar=false;
    }
}


}
}