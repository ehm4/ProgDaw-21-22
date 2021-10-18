import java.util.Scanner;
public class Ejercicio28{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera):");
        String j1= System.console().readLine();
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera):");
        String j2= System.console().readLine();
        if ((j1.equals("piedra"))&&(j2.equals("piedra"))){
            System.out.println("Empate");
        }
        else if ((j1.equals("papel"))&&(j2.equals("papel"))){
            System.out.println("Empate");
        }
        else if ((j1.equals("tijera"))&&(j2.equals("tijera"))){
            System.out.println("Empate");
        }
        else if ((j1.equals("tijera"))&&(j2.equals("piedra"))){
            System.out.println("Jugador 2 gana");
        }
        else if ((j1.equals("tijera"))&&(j2.equals("papel"))){
            System.out.println("Jugador 1 gana");
        }
        else if ((j1.equals("piedra"))&&(j2.equals("tijera"))){
            System.out.println("Jugador 1 gana");
        }
        else if ((j1.equals("piedra"))&&(j2.equals("papel"))){
            System.out.println("Jugador 2 gana");
        }
        else if ((j1.equals("papel"))&&(j2.equals("piedra"))){
            System.out.println("Jugador 1 gana");
        }
        else if ((j1.equals("papel"))&&(j2.equals("tijera"))){
            System.out.println("Jugador 2 gana");
        }
        else{
            System.out.println("Datos introducidos incorrectos");
        }
    }
}