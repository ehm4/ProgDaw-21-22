import java.util.Scanner;
public class Ejercicio30{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int h=s.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
        int b=s.nextInt();
        s.close();
        int posicion=0;
        int ppez=0;
        int pcaballito=0;
        int pcaracola=0;
        do{
        ppez=(int)(Math.random()*(h-2)*(b-2));
        pcaballito=(int)(Math.random()*(h-2)*(b-2));
        pcaracola=(int)(Math.random()*(h-2)*(b-2));
        }
        while((ppez==pcaballito||ppez==pcaracola||pcaballito==pcaracola));
        for(int i=0;i<b;i++){
          System.out.print("*");
        }
        for(int j=0;j<h-2;j++){
        System.out.println("");
        System.out.print("*");
        for(int i=0;i<b-2;i++){
          if(posicion==pcaballito){
            System.out.print("$");
          }
          else if(posicion==ppez){
            System.out.print("&");
          }
          else if(posicion==pcaracola){
            System.out.print("@");
          }
          else{
            System.out.print(" ");
          }
          posicion++;
        }
        System.out.print("*");
      }
      System.out.println("");
      for(int i=0;i<b;i++){
        System.out.print("*");
      }
    }
  }
