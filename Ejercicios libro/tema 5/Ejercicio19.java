import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int h;
        char c;
        int espacios;
        int asteriscos=1;

        System.out.println("Introduce la altura de la pirámide: ");
        h=s.nextInt();
        System.out.println("Introduce un caracter: ");
        c=s.next().charAt(0);

        s.close();

        espacios=h-1;
        for(int i=0;i<h; i++){
            for(int j=espacios; j>0; j--){
                System.out.print(" ");
            }
            for(int x=1; x<=asteriscos; x++){
                System.out.print(c);
            }
            espacios--;
            asteriscos+=2;
            System.out.println();
        }
    }
}