import java.util.Scanner;
public class Ejercicio14{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    String [] introducido= new String[8];
    String [] color= new String[8];
    int contador=0;
    int n1=0;
    for(int i=0;i<8;i++){
      System.out.println("Introduzca una palabra: ");
      introducido[i]=System.console().readLine();
    }
    s.close();
    System.out.println("ARRAY original");
    System.out.print("Índice  ");
    for(int i=0;i<8;i++){
      System.out.printf("%13d", n1);
      n1++;
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<8;i++){
      System.out.printf("%13s", introducido[i]);
    }
    System.out.println("");
    for(int i=0;i<8;i++){
      switch(introducido[i]){
        case "azul":
        color[i]="azul";
        break;
        case "verde":
        color[i]="verde";
        break;
        case "rojo":
        color[i]="rojo";
        break;
        case "amarillo":
        color[i]="amarillo";
        break;
        case "naranja":
        color[i]="naranja";
        break;
        case "rosa":
        color[i]="rosa";
        break;
        case "negro":
        color[i]="negro";
        break;
        case "blanco":
        color[i]="blanco";
        break;
        case "morado":
        color[i]="morado";
        break;
        default:
        color[7-i]=introducido[i];
      }
    }
    for(String i: color){
      System.out.println(i+" ");
    }
    for(int i=0;i<8;i++){
      if(color[i]=="morado"||color[i]=="verde"||color[i]=="azul"||color[i]=="rosa"||color[i]=="amarillo"||color[i]=="naranja"||color[i]=="rojo"||color[i]=="negro"||color[i]=="blanco"){
        introducido[contador]=color[i];
        contador++;
      }
      else{
        introducido[contador]=color[i];
        contador++;
      }
    }
    n1=0;
    System.out.println("ARRAY resultado");
    System.out.print("Índice  ");
    for(int i=0;i<8;i++){
      System.out.printf("%13d", n1);
      n1++;
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<8;i++){
      System.out.printf("%13s", introducido[i]);
    }
    System.out.println("");
  }
}