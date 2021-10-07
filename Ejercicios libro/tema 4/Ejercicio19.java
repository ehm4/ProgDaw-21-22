import java.util.Scanner;
public class Ejercicio19{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número (máximo 5 cifras)= ");
    int n=s.nextInt();
    if (n<10){
        System.out.println("El número de dígitos es= 1");
    
    }
    if ((n>=10)&&(n<100)){
        System.out.println("El número de dígitos es= 2");
    

    }
    if ((n>=100)&&(n<1000)){
        System.out.println("El número de dígitos es= 3");
    

    }
    if ((n>=1000)&&(n<10000)){
        System.out.println("El número de dígitos es= 4");
    

    }
    if ((n>=10000)&&(n<100000)){
        System.out.println("El número de dígitos es= 5");
    

    }
    else{
        System.out.println("Cáracter no válido");
    }
}
}