import paquetes.Complejo;

public class App {
    public static void main(String[] args) throws Exception {
        Complejo a=new Complejo(0, 0);
        Complejo b=new Complejo(-1,6);
        Complejo c =new Complejo(4.2f,-3.68f);
        Complejo d=new Complejo(-11.11f,-22.22f);
        Complejo e=new Complejo(30, 0);
        Complejo c1 = a.suma(b);
        Complejo c2=c.multiplica(d);
        System.out.println(c2);

    }
}
