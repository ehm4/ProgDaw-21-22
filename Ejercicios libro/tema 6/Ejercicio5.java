import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int max=100;
        int min=199;
        int suma=0;
        for(int i=0;i<50;i++){
          int n=(int)(Math.random()*100)+100;
          System.out.print(n+ " ");
          suma=suma+n;
          if(n>max){
            max=n;
          }
          else if(n<min){
            min=n;
          }
        }
        System.out.println("El máximo es "+max+" , el mínimo es "+min+" y la suma es "+suma);
    }
  }