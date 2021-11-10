import java.util.Scanner;
public class Ejercicio50{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la altura (5 como mínimo): ");
        int h=s.nextInt();
        while(h<5){
            System.out.println("Incorrecto. Introduzca la altura (5 como mínimo): ");
        h=s.nextInt();
        }
        System.out.println("Introduzca el número de espacios entre los números (1 como mínimo): ");
        int e=s.nextInt();
        while(e<1){
            System.out.println("Incorrecto. Introduzca el número de espacios entre los números (1 como mínimo):");
        e=s.nextInt();
        }
        s.close();
        int espacios1=e;
        int espacios2=e;
        int asteriscos1=4;
        int asteriscos2=4;
        for(int i=0;i<h;i++){
            System.out.print("*");
            if(i==1){
                espacios2=e+3;
                asteriscos1=1;
                asteriscos2=1;
            }
            else if(i>2&&i!=h-1){
                espacios1=e+3;
                espacios2=e+3;
                asteriscos1=1;
                asteriscos2=1;
            }
            else{
                espacios1=e;
                espacios2=e;
                asteriscos1=4;
                asteriscos2=4;
            }
            for(int j=0;j<espacios1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<asteriscos1;j++){
                System.out.print("*");
            }
            for(int j=0;j<espacios2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<asteriscos2;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
