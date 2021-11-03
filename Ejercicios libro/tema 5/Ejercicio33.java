import java.util.Scanner;
public class Ejercicio33{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la U: ");
        int h=s.nextInt();
        s.close();

        for(int i=1; i<h; i++){
            System.out.print("*");
            for(int j=0; j<(h-2);j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        System.out.print(" ");
        for(int i=0;i<(h-2);i++){
            System.out.print("*");
        }
        System.out.print(" ");
    }
}