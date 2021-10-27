import java.util.Scanner;
public class Ejercicio31{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura de la L: ");
        int n=s.nextInt();
        int planta;
        planta=(n/2)+1;
        s.close();

        for(int i=0; i<(n-1); i++){
            System.out.println("*");
        }
        
        for(int p=0; p<planta; p++){
            System.out.print("*");
        }
    }
}