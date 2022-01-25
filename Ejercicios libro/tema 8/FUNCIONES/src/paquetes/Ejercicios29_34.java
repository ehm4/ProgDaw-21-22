package paquetes;

public class Ejercicios29_34 {
  public static int [][] generaArrayBilnt (int n, int m, int min, int max){

    int array[][]= new int[n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
      array[i][j]=(int)(Math.random()*(max-min)+min);
      }
    }
    return array;
  }

  public static int [] filaDeArrayBiInt(int [][]array, int fila){
    int arrayfinal[]=new int[array[0].length];
    for(int i=0;i<array[0].length;i++){
      arrayfinal[i]=array[fila-1][i];
    }
    return arrayfinal;
  }
  public static int [] columnaDeArrayBiInt(int [][]array, int columna){
    int arrayfinal[]=new int[array[0].length];
    for(int i=0;i<array[0].length;i++){
      arrayfinal[i]=array[i][columna-1];
    }
    return arrayfinal;
  }
  public static int [] coordenadasEnArrayBiInt(int [][]array, int num){
    int arrayfinal[]=new int [2];
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        if(array[i][j]==num){
          arrayfinal[0]=i+1;
          arrayfinal[1]=j+1;
          return arrayfinal;
        }
      }
    }
    arrayfinal[0]=-1;
    arrayfinal[1]=-1;
    return arrayfinal;
  }
  public static boolean esPuntoDeSilla(int [][]array, int num){
    boolean esPuntoDeSilla=false;
    boolean minimo=true;
    boolean maximo=true;
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array[0].length;j++){
        if(array[i][j]==num){
          int min=array[i][j];
          int max=array[i][j];
          for(int x=0;x<array.length;x++){
            if(array[i][x]<min){
              minimo=false;
            }
          }
          for(int x=0;x<array[0].length;x++){
            if(array[x][j]>max){
              maximo=false;
            }
          }
          if(minimo&&maximo){
            esPuntoDeSilla=true;
            return esPuntoDeSilla;
          }
          else{
            return esPuntoDeSilla;
          }


        }  
      }
    }
    return esPuntoDeSilla;
  }

  public static int [] diagonal(int[][]array, int fila, int columna, String direccion){


    int arrayfinal[]=new int [9];
    int auxfila=fila;
    int auxcolumna=columna;
    int contador=0;
    if(direccion.equals("nose")){
    while(fila<9&&columna<9){
      arrayfinal[contador]=array[fila][columna];
      fila++;
      columna++;
      contador++;
    }
    while(auxcolumna>=0&&auxfila>=0){
      arrayfinal[contador]=array[auxfila][auxcolumna];
      auxfila--;
      auxcolumna--;
      contador++;
    }
    return arrayfinal;
  }
  if(direccion.equals("neso")){
    while(fila<9&&columna>=0){
      arrayfinal[contador]=array[fila][columna];
      fila++;
      columna--;
      contador++;
    }
    while(auxcolumna<9&&auxfila>=0){
      arrayfinal[contador]=array[auxfila][auxcolumna];
      auxfila--;
      auxcolumna++;
      contador++;
    }
    return arrayfinal;
  }
  return arrayfinal;
  }

}
