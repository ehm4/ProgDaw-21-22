package paquetes;

public class Ejercicios1_14 {
  
  public static int voltea(int x){
    int volteado=0;
    int num;
    while(x>0){
      num=x%10;
      x=x/10;
      volteado=volteado*10+num;
    }
    return volteado;
  }

  public static boolean esCapicua(int x){
    boolean esCapicua=false;
    if(voltea(x)==x){
      esCapicua=true;
    }
    else{
      esCapicua=false;
    }
    return esCapicua;
  }

  public static boolean esPrimo(int x){
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

  public static int siguientePrimo(int x){
    int siguientePrimo;
    x+=1;
    while(!esPrimo(x)){
      x++;
    }
    siguientePrimo=x;
    return siguientePrimo;
  }

  public static double potencia(int b, int e){
    double potencia;
    potencia=Math.pow(b,e);
    return potencia;
  }

  public static long digitos(long x){
    long contador=0;
    while(x>0){
      x/=10;
      contador++;
    }
    return contador;
  }

  public static long digitoN(int num, int posicion2){
    long posicion=digitos(num)-posicion2;
    long digitoN;
    long dividir=(long)Math.pow(10, posicion);
    digitoN=(num/dividir)%10;
    return digitoN;
  }

  public static int posicionDeDigito(int num, int busca){
    int posicionDeDigito=-1;
    int digito;
    int dividir;
    int dividir2=(int)digitos(num);
    int aux=num;
    int contador=1;
    for(int i=0;i<(int)digitos(num);i++){
      num=aux;
      dividir2-=1;
      dividir=(int)Math.pow(10, dividir2);
      digito=num/dividir;
      if(digito==busca){
        posicionDeDigito=contador;
      }
      contador++;
    }
    return posicionDeDigito;
  }

  public static int quitaPorDetras(int num, int x){
    int quitaPorDetras;
    if(x==0){
    quitaPorDetras=num;
    }
    else{
    quitaPorDetras=num/((int)Math.pow(10,x));
    }
    return quitaPorDetras;
  }

  public static int quitaPorDelante(int num, int x){
    num=voltea(num);
    int quitaPorDelante=num/((int)Math.pow(10,x));
    quitaPorDelante=voltea(quitaPorDelante);
    return quitaPorDelante;
  }

  public static int pegaPorDetras(int num, int x){
    int pegaPorDetras=num*10+x;
    return pegaPorDetras;
  }

  public static int pegaPorDelante(int num, int x){
    num=voltea(num);
    int pegaPorDelante=num*10+x;
    pegaPorDelante=voltea(pegaPorDelante);
    return pegaPorDelante;
  }

  public static int trozoDeNumero(int num, int delante, int detras){
    int digitos=(int)digitos(num);
    int numfinal=quitaPorDelante(num, delante-1);
    numfinal=quitaPorDetras(numfinal, digitos-detras);
    return numfinal;
  }

  public static long juntaNumeros(long num1, long num2){
    long numfinal=num1;
    numfinal=numfinal*(long)Math.pow(10, digitos(num2));
    numfinal+=num2;
    return numfinal;
  }
}
