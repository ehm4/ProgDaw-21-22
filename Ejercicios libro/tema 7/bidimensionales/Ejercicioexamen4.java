import java.util.Scanner;
public class Ejercicioexamen4 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Introduzca la longitud total del puente (un número mayor que 6): ");
  int n=s.nextInt();
  int gente;
  int espacios1=1;
  int espacios2=n-4;
  if(n<=6){
    do{
      System.out.println("El dato introducido es incorrecto.");
      System.out.println("Introduzca la longitud total del puente (un número mayor que 6): ");
      n=s.nextInt();
    }
    while(n<=6);
    s.close();
  }
  System.out.print("  ");
  for(int i=0;i<n-4;i++){
    gente=(int)(Math.random()*3);
    if(gente==1){
      System.out.print("&");
    }
    else{
      System.out.print(" ");
    }
  }
  System.out.print("  ");
  System.out.println("");
  System.out.print("  ");
  for(int i=0;i<n-4;i++){
    System.out.print("*");
  }
  System.out.print("  ");
  System.out.println("");
  for(int i=0;i<2;i++){
    for(int j=0;j<espacios1;j++){
      System.out.print(" ");
    }
    System.out.print("*");
    for(int j=0;j<espacios2;j++){
      System.out.print(" ");
    }
    System.out.print("*");
    espacios1--;
    espacios2+=2;
    System.out.println("");
  }
}
}