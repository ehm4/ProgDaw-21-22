public class EjercicioPruebaVariables{
  public static void main(String[]args){
    float a, b;
    float resultado;
    a= Integer.parseInt(System.console().readLine());
    b= Integer.parseInt(System.console().readLine());
    resultado= (float) a/ (float)b;
    System.out.println("El resultado de la división es= "+resultado);
  }
}
