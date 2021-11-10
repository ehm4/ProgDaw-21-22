// Ernesto Hernández Mangas 08/11/2021
import java.util.Scanner;
public class Examenernestoej2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide: ");
        int n=s.nextInt();
        System.out.println("Introduzca el carácter de relleno: ");
        char c=s.next().charAt(0);
        s.close();

        int espacios=n-1;
        int asteriscos=1;

        for(int i=0; i<n;i++){
            for(int j=0;j<espacios;j++){
                System.out.print(" ");
            }

            for(int j=0;j<asteriscos;j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(""+c);
                }
            }
            espacios--;
            asteriscos+=2;
            System.out.println();
        }
    }
}