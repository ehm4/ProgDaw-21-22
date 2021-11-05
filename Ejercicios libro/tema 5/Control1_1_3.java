import java.util.Scanner;
public class Control1_1_3{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Intruduzca el número positivo a ser estirado: ");
        int n=s.nextInt();
        System.out.println("Intruduzca el estiramiento: ");
        int e=s.nextInt();
        int ultima;
        int reves=0;
        if(e<0){
            do{
                System.out.println("Ha introducido un valor negativo. Se considerará como positivo.");
            e=-e;
            }
            while(e<0);
        }
        else if(e==0){
            do{
                System.out.println("No acepto estiramientos negativos ni nulos. Intruduzca el estiramiento: ");
            e=s.nextInt();
            }
            while(e==0||e<0);
        }
        s.close();

        while(n>0){
            ultima=n%10;
            reves=reves*10+ultima;
            n/=10;
        }

        while(reves>0){
            ultima=reves%10;
            reves/=10;
            for(int i=0;i<e;i++){
                System.out.print(""+ultima);
            }
        }
    }
}

