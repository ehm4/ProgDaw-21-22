import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        String nota2="";
        int aux;
        int m=((int)(Math.random()*(16)+4)/4);
        int nota=(int)(Math.random()*7);
        System.out.print(" "+nota);
        aux=nota;
        for(int i=0;i<3;i++){
          nota=(int)(Math.random()*7);
            switch(nota){
              case 0:
              nota2="do";
              break;
              case 1:
              nota2="re";
              break;
              case 2:
              nota2="mi";
              break;
              case 3:
              nota2="fa";
              break;
              case 4:
              nota2="sol";
              break;
              case 5:
              nota2="la";
              break;
              case 6:
              nota2="si";
              break;
            }
            System.out.print(" "+nota2);
        }
        for(int i=0;i<m;i++){
          for(int j=0;j<4;j++){
            nota=(int)(Math.random()*7);
            switch(nota){
              case 0:
              nota2="do";
              break;
              case 1:
              nota2="re";
              break;
              case 2:
              nota2="mi";
              break;
              case 3:
              nota2="fa";
              break;
              case 4:
              nota2="sol";
              break;
              case 5:
              nota2="la";
              break;
              case 6:
              nota2="si";
              break;
            }
            System.out.print(" "+nota2);
          }
          System.out.print(" |");
        }
        for(int i=0;i<3;i++){
          nota=(int)(Math.random()*7);
            switch(nota){
              case 0:
              nota2="do";
              break;
              case 1:
              nota2="re";
              break;
              case 2:
              nota2="mi";
              break;
              case 3:
              nota2="fa";
              break;
              case 4:
              nota2="sol";
              break;
              case 5:
              nota2="la";
              break;
              case 6:
              nota2="si";
              break;
            }
            System.out.print(" "+nota2);
        }
        System.out.print(" "+aux);
        System.out.print("|");
      }
    }