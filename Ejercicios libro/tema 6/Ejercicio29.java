import java.util.Scanner;
public class Ejercicio29{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.println("Seleccione la estación del año (1-4): ");
    int n=s.nextInt();
    s.close();

    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");

    int min=0;
    int max=0;
    int nublado;
    String soleado="";

    switch(n){
      case 1:
      do{
        min=(int)(Math.random()*16)+15;
        max=(int)(Math.random()*16)+15;
      }
      while(min>=max);
      nublado=(int)(Math.random()*5);
      switch(nublado){
        case 0:
        soleado="soleado";
        break;
        case 1:
        soleado="soleado";
        break;
        case 2:
        soleado="soleado";
        break;
        case 3:
        soleado="nublado";
        break;
        case 4:
        soleado="nublado";
        break;
      }

      break;
      case 2:
      do{
        min=(int)(Math.random()*26)+20;
        max=(int)(Math.random()*26)+20;
      }
      while(min>=max);
      nublado=(int)(Math.random()*5);
      switch(nublado){
        case 0:
        soleado="soleado";
        break;
        case 1:
        soleado="soleado";
        break;
        case 2:
        soleado="soleado";
        break;
        case 3:
        soleado="soleado";
        break;
        case 4:
        soleado="nublado";
        break;
      }
      break;
      case 3:
      do{
        min=(int)(Math.random()*21)+10;
        max=(int)(Math.random()*21)+10;
      }
      while(min>=max);
      nublado=(int)(Math.random()*5);
      switch(nublado){
        case 0:
        soleado="soleado";
        break;
        case 1:
        soleado="soleado";
        break;
        case 2:
        soleado="nublado";
        break;
        case 3:
        soleado="nublado";
        break;
        case 4:
        soleado="nublado";
        break;
      }
      break;
      case 4:
      do{
        min=(int)(Math.random()*26);
        max=(int)(Math.random()*26);
      }
      while(min>=max);
      nublado=(int)(Math.random()*5);
      switch(nublado){
        case 0:
        soleado="soleado";
        break;
        case 1:
        soleado="nublado";
        break;
        case 2:
        soleado="nublado";
        break;
        case 3:
        soleado="nublado";
        break;
        case 4:
        soleado="nublado";
        break;
      }
      break;
      default:
      System.out.println("La estación elegida no es correcta");
    }
    System.out.println("Temperatura mínima: "+min+"ºC");
    System.out.println("Temperatura máxima: "+max+"ºC");
    System.out.println(""+soleado);

  }
}