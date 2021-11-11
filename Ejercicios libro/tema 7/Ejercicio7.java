import java.util.Scanner;
public class Ejercicio7{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] numeros= new int[100];
    for(int i=0;i<100;i++){
      numeros[i]=(int)(Math.random()*21);
      System.out.print(numeros[i]+" ");
    }
    System.out.println("");
    System.out.println("Introduzca un número: ");
    int num1=s.nextInt();
    System.out.println("Introduzca otro número: ");
    int num2=s.nextInt();
    s.close();
    for(int i=0;i<100;i++){
      if(numeros[i]==num1){
        numeros[i]=num2;
        System.out.print("'"+numeros[i]+"' ");
      }
      else{
        System.out.print(numeros[i]+" ");
      }
    }
  }
}