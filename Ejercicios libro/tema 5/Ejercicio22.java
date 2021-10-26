public class Ejercicio22{
    public static void main(String[]args){
        System.out.println("Este programa va a mostrar todos los números primos entre 2 y 100, ambos incluidos");
        int contador=1;
        int i=2;
        for(int n =2; n<=100; n++){
            
                if(n%i==0){
                contador++;
                i++;
                    if(contador==2){
                        System.out.println(""+n);
                }
            }
            }
            }
        }

