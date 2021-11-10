import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        s.close();
        String palo="";
        int contadorcorazon=0;
        int contadordiamante=0;
        int contadorherradura=0;
        int contadorcampana=0;
        int contadorlimon=0;
        for(int i=0;i<3;i++){
        int n=(int)(Math.random()*5);
        switch (n){
          case 0:
          palo="corazon";
          contadorcorazon++;
          break;
          case 1:
          palo="diamante";
          contadordiamante++;
          break;
          case 2:
          palo="herradura";
          contadorherradura++;
          break;
          case 3:
          palo="campana";
          contadorcampana++;
          break;
          case 4:
          palo="limon";
          contadorlimon++;
          break;
        }
        System.out.print(palo+" ");
      }
      System.out.println("");
      if(contadorcorazon==3||contadorherradura==3||contadorcampana==3||contadorlimon==3||contadordiamante==3){
        System.out.println("Enhorabuena, ha ganado 10 monedas");
      }
      else if(contadorcorazon==2||contadorherradura==2||contadorcampana==2||contadorlimon==2||contadordiamante==2){
        System.out.println("Bien, ha recuperado su moneda");
      }
      else{
        System.out.println("Lo siento, ha perdido");
      }
    }
  }