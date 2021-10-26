import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce números positivos, si quiere parar introduzca uno negativo.");
        int n=0;
        int impares=0;
        int contadorimpares=0;
        double resto;
        int parfinal=0;
        int imparesfinal=0;
        double imparesmedia=0;
        do{
        n=s.nextInt();
        if(n>=0){
        resto=n%2;
        if(resto==0){
            if(n>parfinal){
                parfinal=n;
            }
        }
        else{
            impares=n;
            contadorimpares++;
        }
        imparesfinal+=impares;
        }
        }while(n>=0);
        imparesmedia=imparesfinal/contadorimpares;
        System.out.println("El máximo de los números pares es: "+parfinal);
        System.out.printf("La media de los números impares es: %.2f",imparesmedia);
    }
}