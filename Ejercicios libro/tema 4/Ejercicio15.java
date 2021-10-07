    import java.util.Scanner;
    public class Ejercicio15{
        public static void main(String[]args){
            Scanner s = new Scanner(System.in);
            System.out.println("Este programa realizará una pirámide rellena por el caracter que usted introduzca y de la forma que usted quiera");
            System.out.println("Introduce un caracter= ");
            char c=s.next().charAt(0);
            System.out.println("Decide de qué forma quiere la pirámide= 1(punta hacia arriba), 2(punta hacia abajo, 3(punta hacia la izquierda), 4(punta hacia la derecha)");
            int n=s.nextInt();
            switch (n){
                case 1: 
                    System.out.println("  "+c);
                    System.out.println(" "+c+c+c);
                    System.out.println(""+c+c+c+c+c);
                    break;
                    case 2: 
                    System.out.println(""+c+c+c+c+c);
                    System.out.println(" "+c+c+c);
                    System.out.println("  "+c);
                    break;
                    case 3: 
                    System.out.println("  "+c);
                    System.out.println(" "+c+c);
                    System.out.println(""+c+c+c);
                    System.out.println(" "+c+c);
                    System.out.println("  "+c);
                    break;
                    case 4: 
                    System.out.println(""+c);
                    System.out.println(""+c+c);
                    System.out.println(""+c+c+c);
                    System.out.println(""+c+c);
                    System.out.println(""+c);
                    break;
            }
            s.close();
    }
}