import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        for(int j=0;j<10;j++){
          int c=(int)(Math.random()*6);
        String caracter="";
        switch(c){
          case 0:
          caracter="*";
          break;
          case 1:
          caracter="-";
          break;
          case 2:
          caracter="=";
          break;
          case 3:
          caracter=".";
          break;
          case 4:
          caracter="|";
          break;
          case 5:
          caracter="@";
          break;
        }
        int l=(int)(Math.random()*40)+1;
        for(int i=0;i<l;i++){
          System.out.print(""+caracter);
        }
        System.out.println("");
      }
    }
  }