import paquetes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario pepe=new Usuario("Pepe","pepe@yahoo.com", "555 123456");
        Usuario pablo=new Usuario("Pablo", "pablo@gmail.com", "555 112233");
        Empresa ofiMalaga=new Empresa("B123456", "Ofi Málaga", "555 654321");
        Vendedor juan=new Vendedor("Juan", "juan@hotmail.com", "jefe de ventas");
        Vendedor luis=new Vendedor("Luis", "luis@gmail.com","coordinador de ventas");
        pepe.compra(juan,new Articulos("Impresora Láser", 1));
        ofiMalaga.compra(juan, new Articulos("Impresora Láser", 2));
        pepe.compra(juan, new Articulos("Paquete de folios", 10));
        pablo.compra(luis, new Articulos("Clasificador anillas", 12));
        pepe.compra(luis, new Articulos("Paquete de folios", 50));
        pablo.compra(luis, new Articulos("Mesa escritorio", 6));
        pepe.compra(juan, new Articulos("Paquete de folios", 5));
        System.out.println(juan);
        System.out.println(luis);
    }
}
