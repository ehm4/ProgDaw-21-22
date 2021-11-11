import java.util.Scanner;
public class Ejercicio27{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    String mano1=System.console().readLine();
    s.close();

    String mano2="";

    if(!mano1.equals("papel")&&!mano1.equals("tijera")&&!mano1.equals("piedra")){
      System.out.println("Usted ha introducido una palabra incorrecta");
    }

    int n=(int)(Math.random()*3);

    switch(n){
      case 0:
      mano2="piedra";
      break;
      case 1:
      mano2="tijera";
      break;
      case 2:
      mano2="papel";
      break;
    }
    System.out.println("");
    System.out.println("Turno del ordenador: "+mano2);

    if(mano2.equals(mano1)){
      System.out.println("Empate");
    }
    else if(mano1.equals("piedra")&&mano2.equals("tijera")){
      System.out.println("Gana el jugador");
    }
    else if(mano1.equals("piedra")&&mano2.equals("papel")){
      System.out.println("Gana el ordenador");
    }
    else if(mano1.equals("tijera")&&mano2.equals("papel")){
      System.out.println("Gana el jugador");
    }
    else if(mano1.equals("tijera")&&mano2.equals("piedra")){
      System.out.println("Gana el ordenador");
    }
    else if(mano1.equals("papel")&&mano2.equals("tijera")){
      System.out.println("Gana el ordenador");
    }
    else if(mano1.equals("papel")&&mano2.equals("piedra")){
      System.out.println("Gana el jugador");
    }
  }
}