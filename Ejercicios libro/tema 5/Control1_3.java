import java.util.Scanner;
public class Control1_3{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa “da vueltas” a un número.");
        System.out.println("Introduzca un número: ");
        int n=s.nextInt();
        System.out.println("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
        String desplazamiento=System.console().readLine();
        System.out.println("Introduzca la cantidad de cifras que desea desplazar: ");
        int cifras=s.nextInt();
        int digitos=0;
        int aux=n;
        do{
        for(int i=0; i<n;i++){
            n/=10;
            digitos++;
        }
        for(int i=0;i<aux;i++){
            
        }
        System.out.println("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
        desplazamiento=System.console().readLine();
        System.out.println("Introduzca la cantidad de cifras que desea desplazar: ");
        cifras=s.nextInt();
        s.close();
        }
        while(desplazamiento!="salir");

    }
}