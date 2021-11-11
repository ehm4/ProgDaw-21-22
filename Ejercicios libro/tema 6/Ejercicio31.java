import java.util.Scanner;
public class Ejercicio31{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("¿Cuánto dinero quiere apostar?");
    int n=s.nextInt();
    int d1;
    int d2;
    int suma=0;
    boolean partida=false;
    d1=(int)(Math.random()*6)+1;
    d2=(int)(Math.random()*6)+1;
    System.out.println("Primer dado: "+d1);
    System.out.println("Segundo dado: "+d2);
    if(d1+d2==7||d1+d2==11){
      System.out.println("Usted ha duplicado su apuesta, su total es: "+n*2);
    }
    else if(d1+d2==2||d1+d2==3||d1+d2==12){
      System.out.println("Lo siento, ha perdido todo su dinero");
    }
    else{
      System.out.println("Empieza la segunda parte del juego.");
      suma=d1+d2;
      while(!partida){
        d1=(int)(Math.random()*7)+1;
        d2=(int)(Math.random()*7)+1;
        System.out.println("Primer dado: "+d1);
        System.out.println("Segundo dado: "+d2);
      if(suma==d1+d2){
        System.out.println("Usted ha duplicado su apuesta, su total es: "+n*2);
        partida=true;
      }
      else if(d1+d2==7){
        System.out.println("Lo siento, ha perdido todo su dinero");
        partida=true;
      }
      else{
        System.out.println("---------------------------------");

      }
  }
  s.close();
}
}
}