import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un numero positivo y entero: ");
        int n=s.nextInt();
        int suma=0;
        int i;
        if(n<0){
            System.out.println("El número introducido no es postitivo.");
        }
        else{
            for(i=(n+1); i<(n+101); i++){
                suma+=i;
            }
            System.out.println("La suma de los siguientes 100 números al que has introducido es: "+suma);
        }
    }
}