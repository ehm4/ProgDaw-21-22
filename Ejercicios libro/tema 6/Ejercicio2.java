import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int palo=(int)(Math.random()*4)+1;
        String palo2="";
        switch (palo){
            case 1:
            palo2="picas";
            break;
            case 2:
            palo2="diamantes";
            break;
            case 3:
            palo2="tréboles";
            break;
            case 4:
            palo2="corazones";
            break;
        }
        int n=(int)(Math.random()*13)+1;
        String n2="";
        switch(n){
            case 1:
            n2="A";
            break;
            case 11:
            n2="J";
            break;
            case 12:
            n2="Q";
            break;
            case 13:
            n2="K";
            break;
            default:
            n2=String.valueOf(n);
        }

        System.out.println("Ha salido "+n2+" de "+palo2);
    }
}
