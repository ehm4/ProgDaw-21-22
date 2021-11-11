import java.util.Scanner;
public class Ejercicio22{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int n=s.nextInt();
    s.close();
    System.out.println("            @");
    int espacios=12;
    int gusano;
    for(int i=0;i<n-1;i++){
      gusano=(int)(Math.random()*3)-1;
      for(int j=0;j<espacios+gusano;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
    }
  }
}