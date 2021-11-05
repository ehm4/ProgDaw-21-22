import java.util.Scanner;
public class Control1_1_4{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("FACTURA TIENDA");
        System.out.println("==============");
        String articulo;
        double total=0;
        do{
        System.out.print("Introduzca nombre del artículo ('fin' para salir): ");
        articulo=System.console().readLine();
        System.out.println();
        System.out.print("Precio por unidad para " +articulo+ " (IVA incluido): ");
        double precio=s.nextDouble();
        System.out.println();
        System.out.print("Cantidad de unidades de "+articulo+" : ");
        double cantidad=s.nextDouble();
        System.out.println();
        System.out.print("Tipo de IVA aplicado a " +articulo+ " (4,10,21):");
        double iva=s.nextDouble();
        System.out.println();
        total=total+(((iva/100)*precio)+precio)*cantidad;
        }
        while(!articulo.equals("fin"));
        s.close();
        System.out.println(""+total);
    }
}