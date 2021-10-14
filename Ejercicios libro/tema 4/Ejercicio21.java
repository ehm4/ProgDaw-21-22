import java.util.Scanner;
    public class Ejercicio21{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la nota del primer examen");
    double n1=s.nextDouble();
    System.out.println("Introduce la nota del segundo examen");
    double n2=s.nextDouble();
    double media= (n1+n2)/2;
    if((media>=5)&&(media<=10)){
    System.out.printf("Usted está aprobado y su media es= %.2d ", "media");
    
        if((media<5)&&(media>=0)){
        System.out.println("¿Examen de recuperación aprobado? (apto/no apto)");
        String a=s.next();
        if(a.equals("apto")){
            System.out.println("Usted está aprobado con un 5");
        }
        else if (a.equals("no apto")){
            System.out.println("Usted está suspenso");
        }
    }
    }
    else{
        System.out.println("Datos introducidos no válidos");
    }
    s.close();
    }

}

