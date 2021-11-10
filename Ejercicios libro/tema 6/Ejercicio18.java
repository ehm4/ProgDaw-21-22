import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();

        String color1="";
        String color2="";
        String color3="";
        
        int c1=0;
        int c2=0;
        int c3=0;

        do{
          c1=(int)(Math.random()*6);
          c2=(int)(Math.random()*6);
          c3=(int)(Math.random()*6);
          }
          while(c1==c2||c1==c3||c2==c3);
          
          switch (c1){
            case 0: 
            color1="rojo";
            break;
            case 1: 
            color1="azul";
            break;
            case 2: 
            color1="verde";
            break;
            case 3: 
            color1="amarillo";
            break;
            case 4: 
            color1="violeta";
            break;
            case 5: 
            color1="naranja";
            break;
          }
          switch (c2){
            case 0: 
            color2="rojo";
            break;
            case 1: 
            color2="azul";
            break;
            case 2: 
            color2="verde";
            break;
            case 3: 
            color2="amarillo";
            break;
            case 4: 
            color2="violeta";
            break;
            case 5: 
            color2="naranja";
            break;
          }
          switch (c3){
            case 0: 
            color3="rojo";
            break;
            case 1: 
            color3="azul";
            break;
            case 2: 
            color3="verde";
            break;
            case 3: 
            color3="amarillo";
            break;
            case 4: 
            color3="violeta";
            break;
            case 5: 
            color3="naranja";
            break;
          }
          System.out.print(color1+" "+color2+" "+color3);
        }
      }