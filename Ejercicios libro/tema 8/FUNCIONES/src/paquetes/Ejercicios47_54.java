package paquetes;

public class Ejercicios47_54 {
  public static String convierteArrayEnString(int[] a){
    String resultado="";
    for(int i=0;i<a.length;i++){
      resultado=resultado+a[i];
    }
    return resultado;
  }
  public static int[] concatena(int[] a, int[] b){
    int arrayfinal[]=new int [a.length+b.length];
    int contador=0;
    for(int i=0;i<a.length;i++){
      arrayfinal[contador]=a[i];
      contador++;
    }
    for(int i=0;i<b.length;i++){
      arrayfinal[contador]=b[i];
      contador++;
    }
    return arrayfinal;
  }
}
