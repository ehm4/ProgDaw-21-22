package paquetes;

public class dado {
  private int valor;
  public dado(int n){
    this.valor=n;
  }
  public int obtenerValor(){
    return this.valor;
  }
  public String toString(){
    return "["+this.valor+"] ";
  }
}
