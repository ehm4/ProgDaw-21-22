import java.util.Scanner;
public class Ejercicio24{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca un número entero positivo: ");
    int n=s.nextInt();
    int contador=0;
    int aux=n;
    int cifra;
    s.close();
    while(aux>0){
      aux/=10;
      contador++;
    }
    int c=(int)(Math.random()*contador)+1;
    cifra=(n/(int)Math.pow(10,c))%10;
    System.out.println("La cifra sería: "+cifra);
  }
}