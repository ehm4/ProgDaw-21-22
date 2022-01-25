// Ernesto Hernández Mangas

import java.util.Scanner;
public class Ex13ehm2 {
  
public static void main(String[] args){
  Scanner s = new Scanner(System.in);

  int [][] cuenta= new int [25][2];
  int letra;
  int caracter=0;
  for(int i=0;i<25;i++){
    cuenta[i][0]=i+1;
    cuenta[i][1]=0;
  }
  System.out.println("Introduzca una frase: ");
  String frase=s.nextLine();
  s.close();
  for(int j=0;j<frase.length();j++){
  letra= (int) frase.charAt(j);
  if(letra>=65&&letra<=90){
    caracter=letra+32-96;
    cuenta[caracter-1][1]=cuenta[caracter-1][1]+1;
  }
  else if(letra>=97&&letra<=122){
    caracter=letra-96;
    cuenta[caracter-1][1]=cuenta[caracter-1][1]+1;
  }
  }

  for(int i=0;i<25;i++){
    if(cuenta[i][1]!=0){
      System.out.printf("La letra '%c' aparece %2d veces",(char)(cuenta[i][0] + 96), cuenta[i][1]);
      System.out.println("");
    }
  }

}
}