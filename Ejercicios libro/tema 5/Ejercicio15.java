import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una base: ");
        double b= s.nextDouble();
        System.out.println("Introduce un exponente: ");
        int e= s.nextInt();
        double total=1;
        int e1=1;
        for(int i=1; i==e; i++ ){ 
            for(int j=0; j<e1; j++){
            total*=b;
            e=1;
            b++;
            }
            System.out.println(b+" ^ "+e+" : "+total);
            s.close();
        }
    }
}