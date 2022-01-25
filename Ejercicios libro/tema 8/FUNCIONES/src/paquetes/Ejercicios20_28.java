package paquetes;

public class Ejercicios20_28 {

  public static int [] generaArrayInt (int n, int min, int max){

    int array[]= new int[n];
    for(int i=0;i<n;i++){
      array[i]=(int)(Math.random()*(max-min)+min);
    }
    return array;
  }
  public static int minimoArrayInt(int[]array){
    int longitud=array.length;
    int min=array[0];
    for(int i=0;i<longitud;i++){
      if(array[i]<min){
        min=array[i];
      }
    }
    return min;
  }
  public static int maximoArrayInt(int[]array){
    int longitud=array.length;
    int max=array[0];
    for(int i=0;i<longitud;i++){
      if(array[i]>max){
        max=array[i];
      }
    }
    return max;
  }

  public static int mediaArrayInt(int[]array){
    int longitud=array.length;
    int suma=0;
    for(int i=0;i<longitud;i++){
      suma+=array[i];
    }
    int media=suma/longitud;
    return media;
  }

  public static boolean estaEnArrayInt(int[]array, int n){
    boolean estaEnArray=false;
    for(int i=0;i<array.length;i++){
      if(array[i]==n){
        estaEnArray=true;
      }
    }
    return estaEnArray;
  }
  public static int posicionEnArray(int[]array, int n){
    int posicion=0;
    for(int i=0;i<array.length;i++){
      if(array[i]==n){
        posicion=i;
      }
    }
    return posicion;
  }
  public static int [] volteaArrayInt(int[]array){
    int arrayvolteado[]=new int [array.length];
    for(int i=0;i<array.length;i++){
      arrayvolteado[array.length-i-1]=array[i];
    }
    return arrayvolteado;
  }

  public static int [] rotaDerechaArrayInt(int[]array, int n){
    int aux;
    for(int i=0;i<n;i++){
      aux=array[array.length-1];
      for(int j=array.length-1;j>=1;j--){
        array[j]=array[j-1];
      }
      array[0]=aux;
    }
    return array;
  }
  public static int [] rotaIzquierdaArrayInt(int []array, int n){
    int aux;
    for(int i=0;i<n;i++){
      aux=array[0];
      for(int j=0;j<array.length-1;j++){
        array[j]=array[j+1];
      }
      array[array.length-1]=aux;
    }
    return array;
  }
}
