import paquetes.FichaDomino;

public class App {
    public static void main(String[] args) throws Exception {
        for(int i=0;i<8;i++){
            int n1=(int)(Math.random()*7);
            int n2=(int)(Math.random()*7);
            FichaDomino =new FichaDomino(n1, n2);
        }
        for(int i=0;i<8;i++){
            System.out.println(i);
        }
    }
}
