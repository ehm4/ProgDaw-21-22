import paquetes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Monton monton=new Monton(15);
        Ficha f1=new Ficha(2, 7);
        Ficha f2=new Ficha(1, 3);
        Ficha f3=new Ficha(2, 3);
        Ficha f4=new Ficha(6, 4);
        Ficha f5=new Ficha(6, 4);
        Ficha f6=new Ficha(6, 4);
        Ficha f7=new Ficha(6, 4);
        Ficha f8=new Ficha(6, 4);
        Ficha f9=new Ficha(6, 4);
        Ficha f10=new Ficha(6, 4);
        Ficha f11=new Ficha(6, 4);
        Ficha f12=new Ficha(6, 4);

        monton.aniadeFicha(f1);
        monton.aniadeFicha(f2);
        monton.aniadeFicha(f3);
        monton.aniadeFicha(f4);
        monton.aniadeFicha(f5);
        monton.aniadeFicha(f6);
        monton.aniadeFicha(f7);
        monton.aniadeFicha(f8);
        monton.aniadeFicha(f9);
        monton.aniadeFicha(f10);
        monton.aniadeFicha(f11);
        monton.aniadeFicha(f12);

        System.out.println(monton);
        System.out.println(monton.sacaFichaAlAzar());
    }
}
