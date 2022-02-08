package paquetes;
import java.text.DecimalFormat;


public class TarjetaRegalo {
  private double saldo;
  private String numero="";
  public TarjetaRegalo(double saldo){
    this.saldo=saldo;
    for(int i=0;i<5;i++){
      int digito=(int)(Math.random()*10);
      numero=numero+digito;
    }
  }

  public String obtenerNumero(){
    return this.numero;
  }
  public double obtenerSaldo(){
    return this.saldo;
  }
  public void ponerNumero(String numero){
  this.numero=numero;  
  }
  public void ponerSaldo(int saldo){
  this.saldo=saldo;  
  }

  public void gasta(double gasto){
    if(gasto>this.saldo){
      System.out.println("No tiene suficiente saldo para gastar "+gasto+" euros");
    }
    else{
      this.saldo-=gasto;
    }
  }
  public TarjetaRegalo fusionaCon(TarjetaRegalo t){
    double nuevoSaldo=this.saldo+t.saldo;
    this.ponerSaldo(0);
    t.ponerSaldo(0);
    return new TarjetaRegalo(nuevoSaldo);
  }
  public String toString(){
    DecimalFormat dosDecimales = new DecimalFormat("0.00");
    return "Tarjeta nº " + numero + " - Saldo " + dosDecimales.format(saldo) + " euros";
    
  }
}
