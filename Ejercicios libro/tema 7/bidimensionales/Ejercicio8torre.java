import java.util.Scanner;

public class Ejercicio8torre {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int filaAlfil;
    int columnaAlfil;
    int j;
    int i;
    int n;

    System.out.print("Introduce la columna en la que se encuentra el alfil en minuscula: ");
    columnaAlfil = (int) s.next().charAt(0) - 96; //De esta manera "a" equivale a 1, b a 2...

    System.out.print("Introduce la fila en la que se encuentra el alfil: ");
    filaAlfil = s.nextInt();

    s.close();

    System.out.println("El programa puede moverse a las siguientes posiciones: ");

    j= filaAlfil;
    n=columnaAlfil;
    i=1;
    for(int k=1;k<9;k++){
      i++;
      if(k!=n&&k>0&&k<9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (k + 96)), j);
    }
    n= filaAlfil;
    i=columnaAlfil;
    j=0;
    for(int k=1;k<9;k++){
      j++;
      if(k!=n&&k>0&&k<9) System.out.printf("Columna %s y fila %d \n", String.valueOf((char) (i + 96)), j);
    }
  }
}