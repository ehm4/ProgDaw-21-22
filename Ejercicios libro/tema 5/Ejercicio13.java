import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int positivos=0;
        int negativos=0;
        int n;
        System.out.println("Introduce números de 1 en 1: ");
        for(int i=0; i<10; i++){
        n= s.nextInt();
        if(n<0){
            negativos++;
        }
        else{
            positivos++;
        }
    }
        System.out.println("Has introducido "+negativos+" numeros negativos y "+positivos+" numeros positivos");
    }
}