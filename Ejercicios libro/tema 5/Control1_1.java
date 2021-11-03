import java.util.Scanner;
public class Control1_1{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa dibuja un gusano en la pantalla");
        System.out.println("Controles: j-abajo-izquierda // k-abajo // l-abajo-derecha (seguido de ENTER)");
        System.out.println("Para salir, pulse 's':");
        int ultimo=1;
        int espacios=0;
        char variable;
        do{
            for(int i=0;i<espacios;i++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.print("¿j, k, l, s?: ");
            variable=s.next().charAt(0);
            switch (variable){
                case 'j':
                    if(espacios>0){
                        espacios-=1;
                    }
                    break;
                case 'l':
                    if(espacios<9){
                        espacios+=1;
                    }
                    break;
                case 's':
                ultimo=2;
                case 'k':
                break;
            default:
            }
        }
        while (ultimo==1);
        s.close();
    
}
}