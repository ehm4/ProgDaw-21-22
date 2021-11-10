import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        for(int i=0;i<20;i++){
            int n=(int)(Math.random()*11);
            System.out.print(n+" ");
        }
    }
}