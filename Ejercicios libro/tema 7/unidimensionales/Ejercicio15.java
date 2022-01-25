import java.util.Scanner;
public class Ejercicio15{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] ocupacion= new int [10];
    int n1=1;
    int cantidad;
    for(int i=0;i<10;i++){
      ocupacion[i]=(int)(Math.random()*5);
    }
    System.out.print("Mesa nº    ");
    for(int i=0;i<8;i++){
      System.out.printf("%4d", n1);
      n1++;
    }
    System.out.println("");
    System.out.print("Ocupación  ");
    for(int i=0;i<8;i++){
      System.out.printf("%4d", ocupacion[i]);
    }
    do{
      n1=1;
      System.out.println("");
    System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
    cantidad=s.nextInt();
    for(int i=0;i<8;i++){
      if(ocupacion[i]+cantidad<=4&&ocupacion[i]==0){
        System.out.println("Por favor, siéntense en la mesa número "+(i+1));
        ocupacion[i]+=cantidad;
        cantidad=5;
      }
      else if(ocupacion[i]+cantidad<=4&&ocupacion[i]!=0){
        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1));
        ocupacion[i]+=cantidad;
        cantidad=5;
      }
      else if({
        System.out.println("Lo siento, en estos momentos no queda sitio.");
      }
    }
    System.out.print("Mesa nº    ");
    for(int i=0;i<8;i++){
      System.out.printf("%4d", n1);
      n1++;
    }
    System.out.println("");
    System.out.print("Ocupación  ");
    for(int i=0;i<8;i++){
      System.out.printf("%4d", ocupacion[i]);
    }
    }
    while(cantidad!=-1);
    System.out.println("Gracias. Hasta pronto");
    s.close();
  }
}