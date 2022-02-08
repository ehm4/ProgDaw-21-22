import paquetes.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        Fraccion miPrimerFraccion=new Fraccion (4,8);
        Fraccion f1=new Fraccion(8,4);
        miPrimerFraccion.multiplica(f1);
        System.out.println(miPrimerFraccion);
    }
}
