import java.util.Scanner;
public class Ejercicio26{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas= ");
        int n= s.nextInt();
        System.out.println("Día de la semana= ");
        String dia= System.console().readLine();
        System.out.println("¿Tiene tarjeta CineCampa? (s/n)");
        String t=System.console().readLine();
        int entradaspareja=0;
        double precio1=8;
        double precio2=11;
        double total=0;
        double descuento=0;
        double apagar=0;
        switch (dia){
            case "jueves":
            if(t.equals("s")){
            entradaspareja=n/2;
            n=n%2;
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            System.out.println("Entradas por pareja= "+entradaspareja);
            System.out.println("Entradas individuales= "+n);
            System.out.printf("Precio por entrada de pareja= %.2f€\n", precio2);
            System.out.printf("Precio por entrada individual= %.2f€\n", precio1);
            total=((n*precio1)+(entradaspareja*precio2));
            System.out.printf("Total= %.2f€\n", total);
            descuento=(total*0.1);
            System.out.printf("Descuento= %.2f€\n", descuento);
            apagar=total-descuento;
            System.out.printf("A pagar= %.2f€\n", apagar);
            }
            else if(t.equals("n")){
            entradaspareja=n/2;
            n=n%2;
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            System.out.println("Entradas por pareja= "+entradaspareja);
            System.out.println("Entradas individuales= "+n);
            System.out.printf("Precio por entrada de pareja= %.2f€\n", precio2);
            System.out.printf("Precio por entrada individual= %.2f€\n", precio1);
            total=((n*precio1)+(entradaspareja*precio2));
            System.out.printf("Total= %.2f€\n", total);
            descuento=0;
            System.out.printf("Descuento= %.2f€\n", descuento);
            apagar=total-descuento;
            System.out.printf("A pagar= %.2f€\n", apagar);
            }
            break;
            default:
            if(t.equals("s")){
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            System.out.println("Entradas individuales= "+n);
            total=n*8;
            System.out.printf("Precio por entrada individual= %.2f€\n", precio1);
            System.out.printf("Total= %.2f€\n", total);
            descuento=(total*0.1);
            System.out.printf("Descuento= %.2f€\n", descuento);
            apagar=total-descuento;
            System.out.printf("A pagar= %.2f€\n", apagar);
            }
            else if (t.equals("")){
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            System.out.println("Entradas individuales= "+n);
            total=n*8;
            System.out.printf("Precio por entrada individual= %.2f€\n", precio1);
            System.out.printf("Total= %.2f€\n", total);
            descuento=0;
            System.out.printf("Descuento= %.2f€\n", descuento);
            apagar=total-descuento;
            System.out.printf("A pagar= %.2f€\n", apagar);
            }

        }
    }
}

