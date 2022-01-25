import java.util.Scanner;
public class Ejercicio20{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el número total de nombres de reyes: ");
    int numeroreyes=s.nextInt();
    String [] reyes= new String[numeroreyes];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
    for(int i=0;i<numeroreyes;i++){
      reyes[i]=System.console().readLine();
    }
    s.close();
    System.out.println("");
    System.out.println("Los reyes introducidos son: ");
    for(int i=0;i<numeroreyes;i++){
      int orden=1;
      for(int j=0;j<i;j++){
        if(reyes[i].equals(reyes[j])){
          orden++;
        }
      }
      System.out.println(reyes[i]+""+orden+"º");
    }
  }
}