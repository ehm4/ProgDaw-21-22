import java.util.Scanner;
public class Ejercicioexamen1 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  String posicion;
  int filaCaballo;
  int columnaCaballo;
  System.out.println("Introduzca la posición del caballo: ");
  posicion=s.nextLine();
  columnaCaballo=(int)posicion.charAt(0)-96;
  filaCaballo=Character.getNumericValue(posicion.charAt(2));
  s.close();

    for (int i = filaCaballo + 2; i >= filaCaballo - 2; i--) {
      for (int j = columnaCaballo - 2; j <= columnaCaballo + 2; j++) {
        if (Math.abs(j - columnaCaballo) == 2 && Math.abs(i - filaCaballo) == 1) System.out.printf("%c - %d\n", (char)(j + 96), i);
        else if (Math.abs(j - columnaCaballo) == 1 && Math.abs(i - filaCaballo) == 2) System.out.printf("%c - %d\n", (char)(j + 96), i);
      }
    }
}
}