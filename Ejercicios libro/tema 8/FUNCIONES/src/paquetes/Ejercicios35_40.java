package paquetes;

public class Ejercicios35_40 {
  public static String convierteEnPalotes(int n){
    String resultado="";
    int digito;
    while(n>0){
      digito=n%10;
      resultado="- "+resultado;
      if(digito==0){
        resultado="- "+resultado;
      }
      else{
      for(int i=0;i<digito;i++){
        resultado="| "+resultado;
      }
      }
      n/=10;
    }
    return resultado;
  }
  public static int[] filtraPrimos(int x[]){
    int arrayfinal[]=new int [x.length];
    int contador2=0;
    int contadorprimos=0;
    for(int i=0;i<x.length;i++){
      int contador=0;
      for(int j=1;j<=x[i];j++){
        if(x[i]%j==0){
          contador++;
        }
      }
      if(contador==2){
        arrayfinal[contador2]=x[i];
        contador2++;
        contadorprimos++;
      }
    }
    if(contadorprimos==0){
      arrayfinal[0]=-1;
    }

    return arrayfinal;
  }


  public static String convierteEnMorse(int n){

    String resultado="";
    while(n>0){
      int digito=n%10;
      if(digito<=5||digito>=1){
        for(int i=0;i<5-digito;i++){
          resultado="-"+resultado;
        }
        for(int i=0;i<digito;i++){
          resultado="."+resultado;
        }
      }
      if((digito>5&&digito<=9)||digito==0){
        if(digito!=0){
          digito=digito-5;
        }
        else if(digito==0){
          digito=5;
        }
        for(int i=0;i<5-digito;i++){
          resultado="."+resultado;
        }
        for(int i=0;i<digito;i++){
          resultado="-"+resultado;
        }
      }
      n/=10;
    }
    return resultado;

  }
  public static int[] filtraCapicuas(int[] x){
    int array[]=new int [x.length];
    int contador=0;
    int capicua=0;
    for(int i=0;i<x.length;i++){
      int aux=Ejercicios1_14.voltea(x[i]);
      if(aux==x[i]){
        array[contador]=x[i];
        contador++;
        capicua++;
      }
    }
    if(capicua==0){
      array[0]=-1;
    }
    return array;
  }

  public static String convierteEnPalabras(int n){
    String palabras="";
    int digitos=(int)Ejercicios1_14.digitos(n);
    n=Ejercicios1_14.voltea(n);
    for(int i=0;i<digitos;i++){
      int digito=n%10;
      switch(digito){
        case 0: palabras=palabras+"cero";
        break;
        case 1: palabras=palabras+"uno";
        break;
        case 2: palabras=palabras+"dos";
        break;
        case 3: palabras=palabras+"tres";
        break;
        case 4: palabras=palabras+"cuatro";
        break;
        case 5: palabras=palabras+"cinco";
        break;
        case 6: palabras=palabras+"seis";
        break;
        case 7: palabras=palabras+"siete";
        break;
        case 8: palabras=palabras+"ocho";
        break;
        case 9: palabras=palabras+"nueve";
        break;
      }
      if(i!=digitos-1){
      palabras=palabras+", ";
      }
      n/=10;
    }
    return palabras;
  }

  public static int[] filtraCon7(int x[]){
    int array[]=new int [x.length];
    int contador=0;
    for(int i=0;i<x.length;i++){
      while(x[i]>0){
        int digito=x[i]%10;

        if(digito==7){
          array[contador]=x[i];
          contador++;
        }

        x[i]/=10;
      }
    }
    if(contador==0){
      array[0]=-1;
    }
    return array;
  }

}
