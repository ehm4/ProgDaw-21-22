import java.util.Scanner;
public class Ejercicio9{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
      System.out.println("Este programa va a resolver una ecuación de segundo grado tipo ax²+bx+c=0");
      System.out.println("Introduce el término a= ");
      double a= s.nextDouble();
      System.out.println("Introduce el término b= ");
      double b= s.nextDouble();
      System.out.println("Introduce el término c= ");
      double c= s.nextDouble();
      if ((a==0)&&(b==0)&&(c==0)){
        System.out.println("Esta ecuación tiene infinitas soluciones");
        
      }
      if ((a==0)&&(b!=0)&&(c!=0)){
          double x= ((-c)/(b));
          System.out.println("La solución es= "+x);
      }
      if ((a==0)&&(b==0)&&(c!=0)){
        System.out.println("Esta ecuación no tiene solución");
      }
      if ((a!=0)&&(b!=0)&&(c==0)){
        System.out.println("Una solución es x= 0");
        double x= (-b/a);
        System.out.println("Otra solución es x= "+x);
      }
      if ((a!=0)&&(b!=0)&&(c!=0)){
          double discriminante= ((b*b)-(4*a*c));
          if (discriminante<0){
            System.out.println("Esta ecuación no tiene soluciones reales");
          }
          else if (discriminante==0){
            double x1=(((-b)-discriminante)/(2*a));
            System.out.println("La solución es= "+x1);
          }
          else{
            
            double x1= (((-b)-discriminante)/(2*a));
            double x2= (((-b)+discriminante)/(2*a));
            System.out.println("Una solución es= "+x1);
            System.out.println("Otra solución es= "+x2);
          }
       }
      }
    }
