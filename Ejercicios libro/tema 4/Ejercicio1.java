import java.util.Scanner;
public class Ejercicio1{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un día de la semana para saber la asignatura que toca a primera ese día (sin caracteres especiales y en minúscula)= ");
    String dia= System.console().readLine();


    switch (dia) {
        case "lunes":
          System.out.println("Lenguaje de Marcas");
          break;
        case "martes":
          System.out.println("Entornos de Desarrollo");
          break;
        case "miercoles":
          System.out.println("Lenguaje de Marcas");
          break;
        case "jueves":
          System.out.println("Entornos de Desarrollo");
          break;
        case "viernes":
          System.out.println("Formación y Orientación Laboral");
          break;
        default:
          System.out.println("No existe ese día lectivo");
        }
      }
    }
