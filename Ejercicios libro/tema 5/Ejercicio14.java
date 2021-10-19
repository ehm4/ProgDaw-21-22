import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una base: ");
        int b= s.nextInt();
        System.out.println("Introduce un exponente: ");
        int e=s.nextInt();
        double total=1;
        if(e>0){
        for(int i=0; i<e; i++){
            total*=b;
        }
    }
        else if(e<0){
            for(int i=0; i<-e; i++){
                total*=b;
            }
            total=1/total;
        }
        else if(e==0){
            total=1;
        }
        System.out.println(b+" ^ "+e+" : "+total);
    }
}