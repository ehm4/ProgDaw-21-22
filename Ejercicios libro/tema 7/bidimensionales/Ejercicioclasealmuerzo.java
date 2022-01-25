import java.util.Scanner;
public class Ejercicioclasealmuerzo {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  s.close();
  String [] almuerzo=new String[4];
  String [] almuerzofinal=new String[7];
  int n;
  almuerzo[0]="albondigas";
  almuerzo[1]="paella";
  almuerzo[2]="fideos";
  almuerzo[3]="chuleton";
    for(int i=1;i<7;i++){
      do{
        n=(int)(Math.random()*4);
      almuerzofinal[i]=almuerzo[n];
    }
    while(almuerzofinal[i].equals(almuerzofinal[i-1]));
  }
    do{
      n=(int)(Math.random()*4);
      almuerzofinal[0]=almuerzo[n];
    }
    while(almuerzofinal[0].equals(almuerzofinal[6])||almuerzofinal[0].equals(almuerzofinal[1]));
    for(int i=0;i<7;i++){
      System.out.println(" "+almuerzofinal[i]);
    }
}
}