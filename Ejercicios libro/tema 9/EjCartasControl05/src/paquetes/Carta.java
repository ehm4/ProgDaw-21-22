package paquetes;

public class Carta {
  private char palo; 
  private String numero;
  public Carta(char palo, String num){
    this.palo = palo;
    this.numero = num;
  }
  @Override
  public String toString(){
    return "["+this.palo+","+this.numero+"]";
  }
  public String dameValor(){
    return this.numero;
  }
  public char damePalo(){
    return this.palo;
  }
}
