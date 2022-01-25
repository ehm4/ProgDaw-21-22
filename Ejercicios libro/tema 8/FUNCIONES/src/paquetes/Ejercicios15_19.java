package paquetes;

public class Ejercicios15_19 {


  public static boolean Ej15(int x){
    boolean esPrimo=false;
    int contador=0;
    for(int i=1;i<=x;i++){
      if(x%i==0){
        contador++;
      }
    }
    if(contador==2){
      esPrimo=true;
    }
    return esPrimo;
  }

  public static boolean Ej16(int x){
    boolean esCapicua=false;
    if(Ejercicios1_14.voltea(x)==x){
      esCapicua=true;
    }
    else{
      esCapicua=false;
    }
    return esCapicua;
  }

  public static int Ej17(int x){
    int longitud=(int)Ejercicios1_14.digitos(x);
    int decimal=0;
    for(int i=0;i<longitud;i++){
      if(x%10==1){
        decimal+=Ejercicios1_14.potencia(2, i);
      }
      x/=10;
    }
    return decimal;
  }
  public static String Ej18(int x){
    int resto;
    String binario="";
    while(x>0){
      resto=x%2;
      x/=2;
      binario=resto+binario;
    }
    return binario;
  }
}
