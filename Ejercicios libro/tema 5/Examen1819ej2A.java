import java.util.Scanner;
public class Examen1819ej2A{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número entre 3 y 30 (los dos incluidos): ");
        int n=s.nextInt();
        while(n<3||n>30){
            System.out.println("Incorrecto. Introduzca un número entre 3 y 30 (los dos incluidos): ");
        n=s.nextInt();
        }
        s.close();
        int asteriscos=1;

        for(int j=0;j<n;j++){
            for(int i=0;i<asteriscos;i++){
                System.out.print("*");
            }
            asteriscos++;
            System.out.println("");
        }
        asteriscos=n-1;
        for(int j=0;j<(n-1);j++){
            for(int i=0;i<asteriscos;i++){
                System.out.print("*");
            }
            asteriscos--;
            System.out.println("");
            }
    }
}