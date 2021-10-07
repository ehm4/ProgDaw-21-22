import java.util.Scanner;
public class Ejercicio7{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa hace la media de tres notas");
    System.out.println("Introduzca la primera nota");
    double n1= s.nextDouble();
    System.out.println("Introduzca la segunda nota");
    double n2= s.nextDouble();
    System.out.println("Introduzca la tercera nota");
    double n3= s.nextDouble();
    double media;
    if ((n1>0)&&(n2>0)&&(n3>0)){
      media= (n1+n2+n3)/3;
    System.out.println("La media de las notas es= "+media);
  }
  else{
    System.out.println("Las notas no pueden ser negativas");
  }
}
}
    
