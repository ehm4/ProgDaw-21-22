import java.util.Scanner;
public class Control1_2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int caracter1=1;
        int espacios;

        System.out.println("Este programa pinta pirámides");
        System.out.println("Introduzca una altura (1-10): ");
        int h=s.nextInt();
        if((h<1)||(h>10)){
        do{
        System.out.println("Incorrecto. Introduzca una altura (1-10): ");
        h=s.nextInt();
        }
        while ((h<1)||(h>10));
        }

        System.out.println("Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
        String orientacion= System.console().readLine();
        if ((orientacion.equals("izquierda"))||(orientacion.equals("derecha"))||(orientacion.equals("arriba"))||(orientacion.equals("abajo"))){
        }
        else{
            do{
                System.out.println("Incorrecto. Introduzca la orientación (izquierda, derecha, arriba, abajo): ");
        orientacion= System.console().readLine();
            }
            while((orientacion!="izquierda")&&(orientacion!="derecha")&&(orientacion!="arriba")&&(orientacion!="abajo"));
        }

        System.out.println("Introduzca el primer caracter: ");
        char c=s.next().charAt(0);
        System.out.println("Introduzca el segundo caracter: ");
        char c2=s.next().charAt(0);

        s.close();

        switch (orientacion){
        case "arriba":
        espacios=h-1;
            for(int i=0; i<h;i++){
                for(int j=0; j<espacios;j++){
                    System.out.print(" ");
                }
                for(int x=0; x<caracter1; x++){
                    if(x%2!=0){
                        System.out.print(""+c2);
                    }
                    else{
                        System.out.print(""+c);
                    }
                }
                System.out.println();
                espacios--;
                caracter1+=2;
            }
            break;
        case "abajo":
        espacios=0;
        caracter1=h+(h-1);
        for(int i=0; i<h;i++){
            for(int j=0; j<espacios;j++){
                System.out.print(" ");
            }
            for(int x=0; x<caracter1; x++){
                if(x%2!=0){
                    System.out.print(""+c2);
                }
                else{
                    System.out.print(""+c);
                }
            }
            System.out.println();
            espacios++;
            caracter1-=2;
        }
        break;
        case "derecha":
        caracter1=1;
                for(int i=0;i<(h+(h-1));i++){
                    if(i<=((h+(h-3))/2)){
                    for(int j=0; j<caracter1;j++){
                        if((j+i)%2==0){
                        System.out.print(""+c);
                        }
                        else{
                            System.out.print(""+c2);
                        }
                    }
                    caracter1++;
                    System.out.println();
                    }
                    else{
                        for(int j=0; j<caracter1;j++){
                            if((j+i)%2==0){
                                System.out.print(""+c);
                                }
                                else{
                                    System.out.print(""+c2);
                                }
                        }
                        caracter1--;
                    System.out.println();
                    }
            }
            break;
            case "izquierda":
        caracter1=1;
        espacios=h-1;
                for(int i=0;i<(h+(h-1));i++){
                    if(i<=((h+(h-3))/2)){
                        for(int j=0;j<espacios;j++){
                            System.out.print(" ");
                            }
                    for(int j=0; j<caracter1;j++){
                        if(j%2==0){
                        System.out.print(""+c);
                        }
                        else{
                            System.out.print(""+c2);
                        }
                    }
                    caracter1++;
                    espacios--;
                    System.out.println();
                    }
                    else{
                        for(int j=0;j<espacios;j++){
                            System.out.print(" ");
                            }
                        for(int j=0; j<caracter1;j++){
                            if(j%2==0){
                                System.out.print(""+c);
                                }
                                else{
                                    System.out.print(""+c2);
                                }
                        }
                        caracter1--;
                        espacios++;
                    System.out.println();
                    }
            }
        }
    }
    
}
