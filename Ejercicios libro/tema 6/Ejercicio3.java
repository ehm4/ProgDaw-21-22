import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        int palo=(int)(Math.random()*4)+1;
        String palo2="";
        switch (palo){
            case 1:
            palo2="bastos";
            break;
            case 2:
            palo2="oros";
            break;
            case 3:
            palo2="espadas";
            break;
            case 4:
            palo2="copas";
            break;
        }
        int n=(int)(Math.random()*10)+1;
        String n2="";
        switch(n){
            case 1:
            n2="As";
            break;
            case 8:
            n2="Sota";
            break;
            case 9:
            n2="Caballo";
            break;
            case 10:
            n2="Rey";
            break;
            default:
            n2=String.valueOf(n);
        }

        System.out.println("Ha salido "+n2+" de "+palo2);
    }
}