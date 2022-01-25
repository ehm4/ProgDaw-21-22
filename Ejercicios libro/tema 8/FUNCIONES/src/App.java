import paquetes.Ejercicios47_54;



public class App {
    public static void main(String[] args) throws Exception {
        int a[]=new int [9];
        for(int i=0;i<9;i++){
            a[i]=i;
        }
        int b[]=new int [9];
        for(int i=0;i<9;i++){
            b[i]=9-i;
        }
        int array[]=Ejercicios47_54.concatena(a, b);
        for(int i=0;i<Ejercicios47_54.concatena(a, b).length;i++){
            System.out.print(array[i]+" ");
        }
}
}

