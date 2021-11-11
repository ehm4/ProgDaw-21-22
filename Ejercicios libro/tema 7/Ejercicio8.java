import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    double [] temp= new double[12];
    for(int i=0;i<12;i++){
      System.out.println("Introduce la temperatura del mes: ");
      temp[i]=s.nextDouble();
    }
    s.close();
    for(int i=0;i<12;i++){
      for(int x=0;x<2;x++){
      for(int j=0;j<temp[i];j++){
        System.out.print("*");
      }
      System.out.println("");
    }
      System.out.println("");
    }
  }
}