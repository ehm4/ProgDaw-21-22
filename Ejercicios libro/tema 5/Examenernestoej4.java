// Ernesto Hernández Mangas 08/11/2021
import java.util.Scanner;
public class Examenernestoej4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el PIN: ");
        long pin=s.nextLong();
        s.close();

        long alreves=0;
        long ultima;
        if(pin==0){
            System.out.println("cero");
        }
        else{
        while(pin>0){
            ultima=pin%10;
            alreves=(alreves)*10+ultima;
            pin/=10;
        }
        
        System.out.println(""+alreves);
        while(alreves>0){
            ultima=alreves%10;
            switch ((int)ultima){
                case 0:
                System.out.print("cero ");
                break;
                case 1:
                System.out.print("uno ");
                break;
                case 2:
                System.out.print("dos ");
                break;
                case 3:
                System.out.print("tres ");
                break;
                case 4:
                System.out.print("cuatro ");
                break;
                case 5:
                System.out.print("cinco ");
                break;
                case 6:
                System.out.print("seis ");
                break;
                case 7:
                System.out.print("siete ");
                break;
                case 8:
                System.out.print("ocho ");
                break;
                case 9:
                System.out.print("nueve ");
                break;
            }
            alreves/=10;
        }
    }
        
    }
}