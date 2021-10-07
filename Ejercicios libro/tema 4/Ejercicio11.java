import java.util.Scanner;
public class Ejercicio11{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la hora separando hora y minutos por un espacio");
    int hora= s.nextInt();
    int minutos= s.nextInt();
    if((hora>=0)&&(hora<=23)&&(minutos>=0)&&(minutos<=59)){
      int suma=((hora*3600)+(minutos*60));
      int solucion=86400-suma;
      System.out.println("Quedan "+solucion+" segundos para la media noche");
    }
    else{
      System.out.println("Los datos introducidos no son correctos");
    }
  }
}
