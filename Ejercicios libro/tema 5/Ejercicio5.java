import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int i=320;
        while (i>=160){
            System.out.println(""+i);
            i+=-20;
        }
    }
}