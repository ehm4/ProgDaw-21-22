import java.util.Scanner;
public class Ejercicio5{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] numeros= new int [10];
    int min=1000000;
    int max=0;
    for(int i=0;i<10;i++){
      System.out.println("Introduzca un número: ");
      numeros[i]=s.nextInt();
    }
    s.close();
    for(int i=0;i<10;i++){
      if(numeros[i]<min){
        min=numeros[i];
      }
      else if(numeros[i]>max){
        max=numeros[i];
      }
    }
    for(int i=0;i<10;i++){
      if(numeros[i]==max){
        System.out.println(max+" máximo");
      }
      else if(numeros[i]==min){
        System.out.println(min+" mínimo");
      }
      else{
        System.out.println(""+numeros[i]);
      }
    }
  }
}