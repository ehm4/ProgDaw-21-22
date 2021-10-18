import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n=0;
        int i=4;
        boolean acertado= false;
        do{
            System.out.println("Introduce una combinación de 4 números: ");
            n= s.nextInt();
        if (n==1701){
            acertado=true;
        }
        else{
            System.out.println("Lo siento, esa no es la combinación");
        }
        i--;
    }while ((i>0)&&(!acertado));
        if (acertado){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }
        else{
            System.out.println("Lo siento, ha agotado las 4 oportunidades");
        }
    }
    }
