import java.util.Scanner;
public class Ejercicioxemita {
  
public static void main(String[] args) throws InterruptedException {
  Scanner s = new Scanner(System.in);

  int [][] orden= new int [10][2];

  for(int i=0;i<10;i++){
    orden[i][0]=i;
  }
  int num;
  do{
    System.out.println("Introduzca numeros del 0 al 9 y para parar introduzca un número negativo: ");
    num=s.nextInt();
    if(num>=0){
    orden[num][1]+=1;
    }
  }
  while(num>=0);

  for(int i=0;i<10;i++){

    System.out.println(i+"="+orden[i][1]);
  }
}
}