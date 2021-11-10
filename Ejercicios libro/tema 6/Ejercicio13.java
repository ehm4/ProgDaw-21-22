import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int n1=(int)(Math.random()*6)+1;
        int n2=(int)(Math.random()*6)+1;
        if(n1==n2){
          System.out.println(n1+" y "+n2);
        }
        while(n1!=n2){
          n1=(int)(Math.random()*6)+1;
          n2=(int)(Math.random()*6)+1;
          System.out.println(n1+" y "+n2);
        }
      }
    }