import java.util.Scanner;
public class Control1_1_2{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número largo positivo: ");
        long n=s.nextLong();
            s.close();

            long reves=0;
            long ultima;
            long aux=n;
            long aux2=n;
            long pares=0;
            long impares=0;

            while(n>0){
                ultima=n%10;
                reves=reves*10+ultima;
                n/=10;
            }

            while(reves>0){
                ultima=reves%10;
                reves/=10;
                if(ultima%2==0){
                    pares=pares*10+ultima;
                }
            }
            System.out.println("Las cifras pares del número "+aux+"son: "+pares);

            while(aux>0){
                ultima=aux%10;
                aux/=10;
                if(ultima%2!=0){
                    impares=impares*10+ultima;
                }
            }
            System.out.println("Las cifras impares del número "+aux2+"son: "+impares);
        }
    }
