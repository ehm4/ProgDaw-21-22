import java.util.Scanner;
public class Control1_1_1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca el número de filas (1-20): ");
        int f=s.nextInt();
        if(f<1||f>20){
            do{
                System.out.println("Incorrecto. Introduzca el número de filas (1-20): ");
                f=s.nextInt(); 
            }
            while(f<1||f>20);
        }

        System.out.println("Introduzca el número de columnas (1-20):");
        int c=s.nextInt();
        if(c<1||c>20){
            do{
                System.out.println("Incorrecto. Introduzca el número de columnas (1-20): ");
                c=s.nextInt(); 
            }
            while(c<1||c>20);
        }

        for(int i=0; i<f;i++){
            for (int j=0; j<c;j++){
                if((i+j)%2==0){
                    System.out.print("██");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}