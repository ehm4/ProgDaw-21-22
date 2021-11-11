
public class Ejercicio21{
    public static void main(String[]args){
      String palo1="";
      String posicion1="";
      for(int i=0;i<5;i++){
      int palo=(int)(Math.random()*8);
      int posicion=(int)(Math.random()*2);
      switch (palo){
        case 0:
        palo1="1 céntimo";
        break;
        case 1:
        palo1="2 céntimos";
        break;
        case 2:
        palo1="5 céntimos";
        break;
        case 3:
        palo1="10 céntimos";
        break;
        case 4:
        palo1="20 céntimos";
        break;
        case 5:
        palo1="50 céntimos";
        break;
        case 6:
        palo1="1 euro";
        break;
        case 7:
        palo1="2 euros";
        break;
      }
      switch(posicion){
        case 0:
        posicion1="cara";
        break;
        case 1:
        posicion1="cruz";
        break;
      }
      System.out.print(palo1+" - "+posicion1);
      System.out.println("");
    }
    }
  }