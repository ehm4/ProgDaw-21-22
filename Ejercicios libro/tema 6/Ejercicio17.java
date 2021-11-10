import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int h=s.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
        int b=s.nextInt();
        s.close();
        int nh=(int)(Math.random()*(h-4)+2);
        int nb=(int)(Math.random()*(b-4)+1);
        System.out.println(nh+" "+nb);
        for(int i=0;i<h;i++){
          System.out.print("*");
          for(int j=0;j<b-2;j++){
            if(i==0||i==(h-1)){
            System.out.print("*");
            }
            else{
              if(i!=nh&&j!=nb);{
              System.out.print(" ");
              }
              if(i==nh&&j==nb){
                System.out.print("&");
                j++;
              }
            }
          }
          System.out.print("*");
          System.out.println("");
        }
      }
    }