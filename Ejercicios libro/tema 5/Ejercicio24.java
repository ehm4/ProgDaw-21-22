import java.util.Scanner;
public class Ejercicio24{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n;
        int espacios=n-1;
        int asteriscos=1;
        System.out.println("Introduce la altura de la pirámide: ");
        n=s.nextInt();
        for(int i=0; i<n; i++){
            for(int j=espacios; j>0; j--){
                System.out.print(".");
            }
            for(int x=1; x<=asteriscos; x++){
                System.out.print(c);
            }
        }

