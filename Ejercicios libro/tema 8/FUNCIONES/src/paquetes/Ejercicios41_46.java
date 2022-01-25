package paquetes;

public class Ejercicios41_46 {
    public static String Ej41(int altura){
      String resultado="";
      int caracteres=altura;
      for(int i=0;i<altura;i++){
        for(int j=0;j<caracteres;j++){
          resultado=resultado+"*";
        }
        resultado=resultado+"\n";
        caracteres--;
      }
      return resultado;
    }
    public static String Ej42(int altura){
      String resultado="";
      int espacios=altura-3;
      for(int i=0;i<altura;i++){
        resultado=resultado+"*";
      }
      resultado=resultado+"\n";
      for(int i=0;i<altura-2;i++){
        resultado=resultado+"*";
        for(int j=0;j<espacios;j++){
          resultado=resultado+" ";
        }
        espacios--;
        resultado=resultado+"*";
        resultado=resultado+"\n";
      }
      resultado=resultado+"*";
      return resultado;
    }
    public static String Ej43(int altura){
      String resultado="";
      int caracteres=altura;
      int espacios=0;
      for(int i=0;i<altura;i++){
        for(int j=0;j<espacios;j++){
          resultado=resultado+" ";
        }
        for(int j=0;j<caracteres;j++){
          resultado=resultado+"*";
        }
        caracteres--;
        espacios++;
        resultado=resultado+"\n";
      }
      return resultado;
    }
    public static String Ej44(int altura){
      String resultado="";
      int espacios1=1;
      int espacios2=altura-3;
      for(int i=0;i<altura;i++){
        resultado=resultado+"*";
      }
      resultado=resultado+"\n";
      for(int i=0;i<altura-2;i++){
        for(int j=0;j<espacios1;j++){
          resultado=resultado+" ";
        }
        resultado=resultado+"*";
        for(int j=0;j<espacios2;j++){
          resultado=resultado+" ";
        }
        resultado=resultado+"*";
        resultado=resultado+"\n";
        espacios1++;
        espacios2--;
      }
      for(int i=0;i<espacios1;i++){
        resultado=resultado+" ";
      }
      resultado=resultado+"*";
      return resultado;
    }
    public static String Ej45(int altura){
      String resultado="";
      int caracteres=1;
      int espacios=(altura+(altura-1))-2;
      for(int i=0;i<altura-1;i++){
        for(int j=0;j<caracteres;j++){
          resultado=resultado+"*";
        }
        for(int j=0;j<espacios;j++){
          resultado=resultado+" ";
        }
        for(int j=0;j<caracteres;j++){
          resultado=resultado+"*";
        }
        resultado=resultado+"\n";
        caracteres++;
        espacios-=2;
      }
      for(int i=0;i<(altura+(altura-1));i++){
        resultado=resultado+"*";
      }
      return resultado;
    }
    public static String Ej46(int altura){
      String resultado="";
      int espacios2=(altura+(altura-1))-4;
      int espacios1=0;
      resultado=resultado+"*";
      for(int i=0;i<(altura+(altura-1)-2);i++){
        resultado=resultado+" ";
      }
      resultado=resultado+"*";
      resultado=resultado+"\n";
      for(int i=0;i<altura-2;i++){
        resultado=resultado+"*";
        for(int j=0;j<espacios1;j++){
          resultado=resultado+" ";
        }
        resultado=resultado+"*";
        for(int j=0;j<espacios2;j++){
          resultado=resultado+" ";
        }
        resultado=resultado+"*";
        for(int j=0;j<espacios1;j++){
        resultado=resultado+" ";
        }
        resultado=resultado+"*";
        resultado=resultado+"\n";
        espacios2-=2;
        espacios1++;
      }
      for(int i=0;i<altura+(altura-1);i++){
        resultado=resultado+"*";
      }
      return resultado;
    }
}
