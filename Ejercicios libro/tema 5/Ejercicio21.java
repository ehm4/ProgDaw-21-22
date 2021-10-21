import java.util.Scanner;
public class Ejercicio21{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce números positivos, si quiere para introduzca uno negativo.");
        int n=0;
        int pares=0;
        int impares=0;
        int contadorpares=0;
        int contadorimpares=0;
        double resto;
        int paresfinal=0;
        double imparesfinal=0;
        do{
        n=s.nextInt();
        if(n>=0){
        resto=n%2;
        if(resto==0){
            pares=n;
            contadorpares++;
            paresfinal+=pares;
        }
        else{
            impares=n;
            contadorimpares++;
            imparesfinal+=impares;
        }
        }
        }while(n>=0);
        System.out.println("La media de los números pares es: "+(paresfinal/contadorpares));
        System.out.printf("La media de los números impares es: %.2f\n",(imparesfinal/contadorimpares));
    }
}