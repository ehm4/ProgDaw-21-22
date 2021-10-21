import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int h;
        char c;
        int espacios;
        int espacios2;
        int contador=1;

        System.out.println("Introduce la altura de la pirámide: ");
        h=s.nextInt();
        System.out.println("Introduce un caracter: ");
        c=s.next().charAt(0);
        int contador2=h;
        s.close();

        espacios=h-1;
        espacios2=-1;
        //for(int j=(h-1); j>0; j--){
        //    System.out.print(".");
        //}
        //System.out.println(c);
        //System.out.println();
            for(int i=0;i<(h-1); i++){
            
            for(int j=espacios; j>0; j--){
                System.out.print(" ");
            }
            for(int x=0; x<1; x++){
                System.out.print(c);
            }
            contador2-=1;
            if(contador2!=(h-1)){
            for(int x=1; x<=espacios2; x++){
                System.out.print(" ");
            }
            for(int x=0; x==0; x++){
                System.out.print(c);
            }
            }
            espacios--;
            contador+=2;
            espacios2+=2;
            System.out.println();
        }
        for(int q=0;q<((contador/2)+1);q++){
        System.out.print(c+" ");
        }
    }
}