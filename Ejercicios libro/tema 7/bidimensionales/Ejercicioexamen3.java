import java.util.Scanner;
public class Ejercicioexamen3 {
public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Indique el nº de filas de la matriz (1-10): ");
  int filas=s.nextInt();
  int minimo;
  int maximo;
  if(filas<1||filas>10){
    do{
      System.out.println("Incorrecto. Indique el nº de filas de la matriz (1-10): ");
      filas=s.nextInt();
    }
    while(filas<1||filas>10);
  }
  System.out.println("Indique el nº de columnas de la matriz (1-15): ");
  int columnas=s.nextInt();
  if(columnas<1||columnas>15){
    do{
      System.out.println("Incorrecto. Indique el nº de columnas de la matriz (1-15): ");
      columnas=s.nextInt();
    }
    while(columnas<1||columnas>10);
  }
  System.out.println("Indique el valor mínimo del rango aleatorio (1-999): ");
  int min=s.nextInt();
  if(min<1||min>999){
    do{
      System.out.println("Incorrecto.Indique el valor mínimo del rango aleatorio (1-999): ");
      min=s.nextInt();
    }
    while(min<1||min>999);
}
  System.out.println("Indique el valor máximo del rango aleatorio (1-999): ");
  int max=s.nextInt();
  if(max<1||max>999||max<=min){
    do{
      System.out.println("Incorrecto.Indique el valor máximo del rango aleatorio (1-999): ");
      max=s.nextInt();
    }
    while(max<1||max>999||max<=min);
}
    s.close();
    int[][]arrayInicial=new int [filas][columnas];
    String [][] arrayFinal=new String [filas][columnas];
    for(int i=0;i<filas;i++){
      for (int j=0;j<columnas;j++){
        arrayInicial[i][j]=(int)(Math.random()*(max-min)+min);
      }
    }
    for(int i=0;i<filas;i++){
      for (int j=0;j<columnas;j++){
        System.out.printf("%4d", arrayInicial[i][j]);
      }
      System.out.println("");
    }
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) {
        maximo = min;
        minimo = max;
        for (int k = i - 1; k <= i + 1; k++) {
          for (int z = j - 1; z <= j + 1; z++) {
            if (k >= 0 && k < filas && z >= 0 && z < columnas && !(z == j && k == i)) {
              if (arrayInicial [k][z] > maximo) maximo = arrayInicial [k][z];
              if (arrayInicial [k][z] < minimo) minimo = arrayInicial [k][z];
            }
          }
        }
        if (minimo >= arrayInicial [i][j]) arrayFinal [i][j] = "v";
        else if (maximo <= arrayInicial[i][j]) arrayFinal [i][j] = "^";
        else arrayFinal [i][j] = " ";

      }
    }
    for (int i=0;i<filas;i++){
      for (int j=0;j<columnas;j++){
        System.out.printf("%4s",arrayFinal[i][j]);
      }
      System.out.println("");
    }


}
}