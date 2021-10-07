import java.util.Scanner;
public class Ejercicio10{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca su día y mes de nacimiento separados por un espacio= ");
    int dia= s.nextInt();
    int mes= s.nextInt();
    if ((dia>0)&&(dia<=31)&&(mes>=1)&&(mes<=12)){
      switch (mes){
        case 1:
          if (dia<=21){
              System.out.println("Usted es capricornio");
          }
          else{
            System.out.println("Usted es acuario");
          }
        break;
        case 2:
          if (dia<=21){
            System.out.println("Usted es acuario");
          }
          else{
            System.out.println("Usted es piscis");
          }
        break;
        case 3:
        if (dia<=20){
            System.out.println("Usted es piscis");
          }
          else{
            System.out.println("Usted es aries");
          }
        break;
        case 4:
        if (dia<=20){
            System.out.println("Usted es aries");
          }
          else{
            System.out.println("Usted es tauro");
          }
        break;
        case 5:
        if (dia<=21){
            System.out.println("Usted es tauro");
          }
          else{
            System.out.println("Usted es géminis");
          }
        break;
        case 6:
        if (dia<=21){
            System.out.println("Usted es géminis");
          }
          else{
            System.out.println("Usted es cáncer");
          }
        break;
        case 7:
        if (dia<=22){
            System.out.println("Usted es cáncer");
          }
          else{
            System.out.println("Usted es leo");
          }
        break;
        case 8:
        if (dia<=22){
            System.out.println("Usted es leo");
          }
          else{
            System.out.println("Usted es virgo");
          }
        break;
        case 9:
        if (dia<=22){
            System.out.println("Usted es virgo");
          }
          else{
            System.out.println("Usted es libra");
          }
        break;
        case 10:
        if (dia<=20){
            System.out.println("Usted es libra");
          }
          else{
            System.out.println("Usted es escorpio");
          }
        
        break;
        case 11:
        if (dia<=22){
            System.out.println("Usted es escorpio");
          }
          else{
            System.out.println("Usted es sagitario");
          }
        break;
        case 12:
        if (dia<=21){
            System.out.println("Usted es sagitario");
          }
          else{
            System.out.println("Usted es capricornio");
          }
        break;
      }
      }
      else{
        System.out.println("No existe ese dia/mes");
      }
    }
  }
      
        
