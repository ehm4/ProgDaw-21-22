import java.util.Scanner;
public class Control1_4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa codifica números en “letras similares”.");
        System.out.println("Introduzca un número entero (0 para salir): ");
        int n=s.nextInt();
        int ultima;
        int reves=0;
        if(n!=0){
            do{
                while(n>0){
                    ultima=n%10;
                    reves=reves*10+ultima;
                    n/=10;
                }
                while(reves>0){
                    ultima=reves%10;
                    switch(ultima){
                        case 0:
                        System.out.print("O");
                        break;
                        case 1:
                        System.out.print("l");
                        break;
                        case 2:
                        System.out.print("Z");
                        break;
                        case 3:
                        System.out.print("E");
                        break;
                        case 4:
                        System.out.print("A");
                        break;
                        case 5:
                        System.out.print("S");
                        break;
                        case 6:
                        System.out.print("b");
                        break;
                        case 7:
                        System.out.print("J");
                        break;
                        case 8:
                        System.out.print("B");
                        break;
                        case 9:
                        System.out.print("g");
                        break;
                    }
                    reves/=10;
                }
                    System.out.println();
                    System.out.println("Introduzca un número entero (0 para salir): ");
                    n=s.nextInt();
            }
            while(n!=0);
            s.close();
        }
    }
}