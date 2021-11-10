// Ernesto Hernández Mangas 08/11/2021
import java.util.Scanner;
public class Examenernestoej1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el número de años: ");
        long años=s.nextLong();
        s.close();
        long vueltas;

        vueltas=años*365;
        System.out.println("En ese tiempo, la Tierra ha dado "+ vueltas+" vueltas sobre sí misma.");
    }
}