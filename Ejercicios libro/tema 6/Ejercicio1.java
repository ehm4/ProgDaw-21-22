import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int suma=0;
        for(int i=0;i<3;i++){
        int n=(int)(Math.random()*6)+1;
        suma=suma+n;
        System.out.println(""+n);
        }
        System.out.println("La suma es: "+suma);
    }
}