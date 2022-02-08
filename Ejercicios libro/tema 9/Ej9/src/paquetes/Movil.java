package paquetes;

public class Movil {
  private String numero;
  private String tarifa;
  private int segundos=0;
  private double euros=0;

  public Movil(String numero, String tarifa){
    this.numero=numero;
    this.tarifa=tarifa;
    this.segundos=0;
    this.euros=0;
  }
  public String obtenerNumero(){
    return numero;
  }
  public String obtenerTarifa(){
    return tarifa;
  }
  public int obtenerSegundos(){
    return segundos;
  }
  public double obtenerEuros(){
    return euros;
  }

  public void ponerNumero(String numero){
    this.numero=numero;
  }
  public void ponerTarifa(String tarifa){
    this.tarifa=tarifa;
  }
  public void ponerSegundos(int segundos){
    this.segundos=segundos;
  }
  public void ponerEuros(int euros){
    this.euros=euros;
  }

  public void llama(Movil m, int segundos){
    this.segundos+=segundos;
    m.segundos+=segundos;
    switch (this.tarifa){
      case "rata":
      this.euros=this.segundos*0.1;
      break;
      case "mono":
      this.euros=this.segundos*0.2;
      break;
      case "bisonte":
      this.euros=this.segundos*0.5;
      break;
    }
  }

  public String toString(){
    return "Nº "+this.numero+" - "+this.segundos+"s de conversacion - tarificados "+this.euros+" euros";
  }

}
