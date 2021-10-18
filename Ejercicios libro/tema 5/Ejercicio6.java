import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int i=320;
        do{
            System.out.println(""+i);
            i+=-20;
        }
        while (i>=160);
    }
}