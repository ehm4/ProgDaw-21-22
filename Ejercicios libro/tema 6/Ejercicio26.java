import java.util.Scanner;
public class Ejercicio26{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la anchura de la tableta: ");
    int h=s.nextInt();
    System.out.println("Introduzca la altura de la tableta: ");
    int b=s.nextInt();
    int nh;
    int nb;
    do{
    nh=(int)(Math.random()*h+1)+1;
    nb=(int)(Math.random()*b+1)+1;
    }
    while((nh!=0&&nh!=h&&nb!=0&&nb!=b));
    for(int i=1;i<h+1;i++){
      for(int j=1;j<b+1;j++){
        if(nh==i&&nb==j){
          System.out.print(" ");
        }
        else{
        System.out.print("*");
        }
      }
      System.out.println("");
    }
    System.out.println(nh+" "+nb);
    s.close();
  }
}