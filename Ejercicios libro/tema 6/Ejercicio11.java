import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        String nota="";
        int contadorsuspenso=0;
        int contadorbien=0;
        int contadorsuficiente=0;
        int contadornotable=0;
        int contadorsobresaliente=0;
        for(int i=0;i<20;i++){
          int n=(int)(Math.random()*5);
          switch(n){
            case 0:
            nota="suspenso";
            contadorsuspenso++;
            System.out.print(nota+"  ");
            break;
            case 1:
            nota="sufieciente";
            contadorsuficiente++;
            System.out.print(nota+"  ");
            break;
            case 2:
            nota="bien";
            contadorbien++;
            System.out.print(nota+"  ");
            break;
            case 3:
            nota="notable";
            contadornotable++;
            System.out.print(nota+"  ");
            break;
            case 4:
            nota="sobresaliente";
            contadorsobresaliente++;
            System.out.print(nota+"  ");
            break;
          }
        }
        System.out.println("");
        System.out.println("Ha habido "+contadorsuspenso+" suspensos");
        System.out.println("Ha habido "+contadorsuficiente+" suficientes");
        System.out.println("Ha habido "+contadorbien+" bien");
        System.out.println("Ha habido "+contadornotable+" notables");
        System.out.println("Ha habido "+contadorsobresaliente+" sobresalientes");
      }
    }