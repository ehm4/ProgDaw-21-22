// Ernesto Hernández Mangas 08/11/2021
import java.util.Scanner;
public class Examenernestoej3{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int tope;
        System.out.println("Indique el mes (en minúscula): ");
        String mes=System.console().readLine();
        if(mes.equals("febrero")){
        System.out.println("¿Es un año bisiesto? (s/n)");
        String bisiesto=System.console().readLine();
        }
        System.out.println("Indique el día de la semana en el que empieza el mes (en minúscula): ");
        String dia=System.console().readLine();
        // if(mes.equals("enero")||mes.equals("marzo")||mes.equals("mayo")||mes.equals("julio")||mes.equals("agosto")||mes.equals("octubre")||mes.equals("diciembre"));{
        // tope=31;
        // }
        if(!mes.equals("abril")&&!mes.equals("junio")&&!mes.equals("septiembre")&&!mes.equals("noviembre")){
        tope=31;
        }
        else if(mes.equals("febrero")){
            // if(bisiesto.equals("s")){
                tope=28;
            }
            else{
            tope=30;
        }
        // if(bisiesto.equals("s")){
            // tope=29;
        // }
        int coddia=0;
        int num=1;
        switch (dia){
            case "lunes":
                coddia=1;
                break;
                case "martes":
                coddia=2;
                break;
                case "miercoles":
                coddia=3;
                break;
                case "jueves":
                coddia=4;
                break;
                case "viernes":
                coddia=5;
                break;
                case "sabado":
                coddia=6;
                break;
                case "domingo":
                coddia=7;
                break;
        }
                System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
                System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
                System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        if(!dia.equals("sabado")&&!dia.equals("domingo")){
        for(int i=0;i<9;i++){
            if(i%2!=0){
                System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
            }
            else{
                if(i!=9){
                if(i==0){
                for(int j=0;j<7;j++){
                    if(j<(coddia-1)&&j==0){
                        System.out.print("│   │");
                    }
                    else if(j<(coddia-1)&&j!=0){
                        System.out.print("   │");
                    }
                    else if(j==0&&j>=(coddia-1)){
                        System.out.print("│ "+num+" │");
                        num++;
                    }
                    else{
                        System.out.print(" "+num+" │");
                        num++;
                    }
                }
                System.out.println();
            }
            else if(i!=0&&i%2==0){
                for(int j=0;j<7;j++){
                    if(j==0&&num>9){
                        System.out.print("│"+num+" │");
                        num++;
                    }
                    else if(j==0&&num<=9){
                            System.out.print("│ "+num+" │");
                            num++;
                    }
                    else if(num<=9&&j!=0&&num<=tope){
                    System.out.print(" "+num+" │");
                        num++;
                    }
                    else if(num>9&&j!=0&&num<=tope){
                        System.out.print(num+" │");
                        num++;
                    }
                    else if(num>tope){
                        System.out.print("   │");
                    }
                }
                System.out.println();
            }
        }
        }
    }
}
        else{
            for(int i=0;i<11;i++){
                if(i%2!=0){
                    System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
                }
                else{
                    if(i!=10){
                    if(i==0){
                    for(int j=0;j<7;j++){
                        if(j<(coddia-1)&&j==0){
                            System.out.print("│   │");
                        }
                        else if(j<(coddia-1)&&j!=0){
                            System.out.print("   │");
                        }
                        else if(j==0&&j>=(coddia-1)){
                            System.out.print("│ "+num+" │");
                            num++;
                        }
                        else{
                            System.out.print(" "+num+" │");
                            num++;
                        }
                    }
                    System.out.println();
                }
                else if(i!=0&&i%2==0){
                    for(int j=0;j<7;j++){
                        if(j==0&&num>9){
                            System.out.print("│"+num+" │");
                            num++;
                        }
                        else if(j==0&&num<=9){
                                System.out.print("│ "+num+" │");
                                num++;
                        }
                        else if(num<=9&&j!=0&&num<=tope){
                        System.out.print(" "+num+" │");
                            num++;
                        }
                        else if(num>9&&j!=0&&num<=tope){
                            System.out.print(num+" │");
                            num++;
                        }
                        else if(num>tope){
                            System.out.print("   │");
                        }
                    }
                    System.out.println();
                }
            }
        }
        }

    }
    System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
        }
    }

