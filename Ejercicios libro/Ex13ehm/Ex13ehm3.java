// Ernesto Hernández Mangas

import java.util.Scanner;
public class Ex13ehm3 {
  
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  int n;
  int i=0;
  int n2;
  int contador;
  char caracter;
  boolean acierto=false;
  String palabramala="";
  String respuesta="";
  String [] palabra= new String [8];
  palabra[0]="desarrollo";
  palabra[1]="java";
  palabra[2]="sentencia";
  palabra[3]="bucle";
  palabra[4]="array";
  palabra[5]="virtualizador";
  palabra[6]="codigo";
  palabra[7]="programacion";
  n=(int)(Math.random()*8);
  contador=palabra[n].length();
  do{
    caracter=palabra[n].charAt(i);
    n2=(int)(Math.random()*2);
    if(n2==0){
      palabramala=palabramala+String.valueOf(caracter);
      contador--;
      i++;
    }
    else if(n2==1){
      palabramala=String.valueOf(caracter)+palabramala;
      contador--;
      i++;
    }
    }
    while(contador>0);

    for (int j = 5; j > 0 && acierto == false; j--) {
      System.out.println("Tiene "+j+" intentos. Diga palabra con las letras '"+palabramala+"':");
      respuesta = s.nextLine();

      if (respuesta.equals(palabra[n])) acierto = true;
    }

    s.close();

    if (acierto) {
      System.out.println("Felicidades. Ha acertado la palabra.");
    }
    else System.out.println("La palabra que tenia que acertar es: "+palabra[n]);
}
}