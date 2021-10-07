import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa hace la media de tres notas");
    System.out.println("Introduzca la primera nota");
    double n1= s.nextDouble();
    System.out.println("Introduzca la segunda nota");
    double n2= s.nextDouble();
    System.out.println("Introduzca la tercera nota");
    double n3= s.nextDouble();;
    double media=0;
    if (((n1>=0)&&(n2>=0)&&(n3>=0))&&((n1<=10)&&(n2<=10)&&(n3<=10))){
      double media= (n1+n2+n3)/3;
          System.out.printf("La media de las notas es= %.2f", media);
      }
      else{
      System.out.println("Las notas no pueden ser menores que '0' ni mayores que '10'");
    }
    double media=(n1+n2+n3)/3;
      if (media<=5){
        System.out.println("La media ha salido= insuficiente");
    }
        else if ((media<=5)||(media<=6)){
          System.out.println("La media ha salido= bien");
      }
          else if ((media>=7)||(media<9)){
            System.out.println("La media ha salido= notable");
      }
            else if ((media>=9)||(media<10)){
                System.out.println("La media ha salido= sobresaliente");
      }
  }
}

