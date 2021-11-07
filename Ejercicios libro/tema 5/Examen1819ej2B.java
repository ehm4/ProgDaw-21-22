import java.util.Scanner;
public class Examen1819ej2B{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número entre 4 y 20 (los dos incluidos): ");
        int n=s.nextInt();
        while(n<4||n>20){
            System.out.println("Incorrecto. Introduzca un número entre 4 y 20 (los dos incluidos): ");
        n=s.nextInt();
        }
        s.close();
        int espacios=n-1;
        int asteriscos=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<espacios;j++){
                System.out.print(" ");
            }
            for(int j=0;j<asteriscos;j++){
                System.out.print("*");
            }
            espacios--;
            System.out.println();
        }
    }
}