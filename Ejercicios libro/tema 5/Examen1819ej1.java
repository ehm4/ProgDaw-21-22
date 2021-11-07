import java.util.Scanner;
public class Examen1819ej1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa va a traducir a binario el número entero positivo que usted intrduzca.");
        System.out.println("Introduzca un numero entero positivo entre 0 y 9999: ");
        int n=s.nextInt();

        String binario="";
        
        while(n>9999||n<0){
            System.out.println("Incorrecto. Introduzca un numero entero positivo entre 0 y 9999: ");
            n=s.nextInt();
        }
        s.close();
        while(n!=0){
            binario=(n%2)+binario;
            n/=2;
        }
        System.out.println("Su número entero positivo en binario es: "+binario);
    }
}