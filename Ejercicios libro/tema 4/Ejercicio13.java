import java.util.Scanner;
public class Ejercicio13{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa va a ordenar números de menor a mayor");
    System.out.println("Introduzca tres números");
    int n1= s.nextInt();
    int n2= s.nextInt();
    int n3= s.nextInt();
    if ((n1<n2)&&(n1<n3)&&(n2<n3)){
      System.out.println(n1+" "+n2+" "+n3);
    }
      else if ((n1<n2)&&(n1<n3)&&(n2>n3)){
      System.out.println(n1+" "+n3+" "+n2);
    }
      else if ((n1>n2)&&(n1>n3)&&(n2<n3)){
      System.out.println(n2+" "+n3+" "+n1);
    }
    else if ((n1>n2)&&(n1<n3)&&(n2<n3)){
      System.out.println(n2+" "+n1+" "+n3);
    }
    else if ((n1<n2)&&(n1>n3)&&(n2>n3)){
      System.out.println(n3+" "+n1+" "+n2);
    }
    else if ((n1>n2)&&(n1>n3)&&(n2>n3)){
      System.out.println(n3+" "+n2+" "+n1);
    }
  }
}
