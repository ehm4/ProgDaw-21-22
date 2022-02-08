package paquetes;
import java.util.Scanner;
public class GESTISIMAL {
  static int N=100;
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    Articulo[] art=new Articulo[N];
    for(int i=0;i<N;i++){
      art[i]=new Articulo();
    }
    int eleccion=0;
    String codigoIntroducido;
    String descripcionIntroducida;
    int preciocompraIntroducido;
    int precioventaIntroducido;
    int stockIntroducido;
    do{
      System.out.println("\n\nGESTISIMAL");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancia");
      System.out.println("6. Salida de mercancia");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      eleccion=Integer.parseInt(System.console().readLine());
      switch(eleccion){
        case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(int i=0;i<N;i++){
          if(!art[i].obtenerCodigo().equals("LIBRE")){
            System.out.println(art[i]);
          }
        }
        break;
        case 2:
        int primeralibre=-1;
        System.out.println("\nALTA");
        System.out.println("===========");
        do{
          primeralibre++;
        }while(!art[primeralibre].obtenerCodigo().equals("LIBRE"));
        System.out.println("Por favor, introduzca los datos del articulo.");
        System.out.print("Código: ");
        codigoIntroducido= System.console().readLine();
        art[primeralibre].ponerCodigo(codigoIntroducido);
        System.out.print("Precio de compra: ");
        preciocompraIntroducido= s.nextInt();
        art[primeralibre].ponerPreciocompra(preciocompraIntroducido);
        System.out.print("Precio de venta: ");
        precioventaIntroducido= s.nextInt();
        art[primeralibre].ponerPrecioventa(precioventaIntroducido);
        System.out.print("Descripción: ");
        descripcionIntroducida= System.console().readLine();
        art[primeralibre].ponerDescripcion(descripcionIntroducida);
        System.out.print("Stock: ");
        stockIntroducido= s.nextInt();
        art[primeralibre].ponerStock(stockIntroducido);
        break;
        case 3:
        System.out.println("\nBAJA");
        System.out.println("======");
        System.out.print("Por favor, introduzca el código del articulo que desea borrar: ");
        codigoIntroducido = System.console().readLine();
        int i=-1;
        do{
          i++;
        }while(!art[i].obtenerCodigo().equals(codigoIntroducido));
        art[i].ponerCodigo("LIBRE");
        System.out.println("Se ha dado de baja el articulo escogido");
        break;
        case 4:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        System.out.print("Por favor, introduzca el código del articulo cuyos datos desea cambiar:");
        codigoIntroducido = System.console().readLine();
        i = -1;
        do {
        i++;
        } while (!((art[i].obtenerCodigo()).equals(codigoIntroducido)));
        System.out.println("Introduzca los nuevos datos del artículo");
        System.out.print("Código: ");
        codigoIntroducido= System.console().readLine();
        art[i].ponerCodigo(codigoIntroducido);
        System.out.print("Precio de compra: ");
        preciocompraIntroducido= s.nextInt();
        art[i].ponerPreciocompra(preciocompraIntroducido);
        System.out.print("Precio de venta: ");
        precioventaIntroducido= s.nextInt();
        art[i].ponerPrecioventa(precioventaIntroducido);
        System.out.print("Descripción: ");
        descripcionIntroducida= System.console().readLine();
        art[i].ponerDescripcion(descripcionIntroducida);
        System.out.print("Stock: ");
        stockIntroducido= s.nextInt();
        art[i].ponerStock(stockIntroducido);
        break;
        case 5:
        System.out.println("Introduzca el codigo del articulo que ha recibido stock");
        System.out.print("Código: ");
        codigoIntroducido = System.console().readLine();
        i=-1;
        do{
          i++;
        }while(!art[i].obtenerCodigo().equals(codigoIntroducido));
        System.out.println("¿Cuánto stock ha llegado del artículo?");
        stockIntroducido= s.nextInt();
        art[i].ponerStock(art[i].obtenerStock()+stockIntroducido);
        break;
        case 6:
        System.out.println("Introduzca el codigo del articulo del que ha salido stock");
        System.out.print("Código: ");
        codigoIntroducido = System.console().readLine();
        i=-1;
        do{
          i++;
        }while(!art[i].obtenerCodigo().equals(codigoIntroducido));
        
        System.out.println("¿Cuánto stock ha salido del artículo?");
        stockIntroducido= s.nextInt()
        ;if(art[i].obtenerStock()<stockIntroducido){
        System.out.println("Lo siento, hay menos stock de lo que quiere sacar.");
        }
        else{
        art[i].ponerStock(art[i].obtenerStock()-stockIntroducido);
        }
        break;
      }
    }
    while(eleccion!=7);
    s.close();
  }
}
