import java.util.Scanner;
public class Ejercicio18{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int [] num=new int [10];
    int [] menores=new int [10];
    int [] mayores=new int [10];
    int cuentamenores=0;
    int cuentamayores=0;
    for(int i=0;i<10;i++){
      num[i]=(int)(Math.random()*201);
      if(num[i]<100){
        menores[cuentamenores]=num[i];
        cuentamenores++;
      }
      else{
        mayores[cuentamayores]=num[i];
        cuentamayores++;
      }
    }
    System.out.println("Array original:");
    System.out.print("Índice  ");
    for(int i=0;i<10;i++){
      System.out.printf("%4d", i);
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<10;i++){
      System.out.printf("%4d", num[i]);
    }
    
    
    int  [] resultado=new int [10];
    int mayorescolocados=0;
    int menorescolocados=0;
    int j=0;
    do{
    if(menorescolocados<cuentamenores){
      resultado[j++]=menores[menorescolocados++];
    }
    if(mayorescolocados<cuentamayores){
      resultado[j++]=mayores[mayorescolocados++];
    }
    }
    while(j<10);
    System.out.println("");
    System.out.println("Array final:");
    System.out.print("Índice  ");
    for(int i=0;i<10;i++){
      System.out.printf("%4d", i);
    }
    System.out.println("");
    System.out.print("Valor   ");
    for(int i=0;i<10;i++){
      System.out.printf("%4d", resultado[i]);
    }
    s.close();
  }
}