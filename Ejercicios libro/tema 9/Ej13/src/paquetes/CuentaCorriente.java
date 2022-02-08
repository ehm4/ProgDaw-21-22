package paquetes;

public class CuentaCorriente {
  private int saldo;
  private String num = "";
  public CuentaCorriente(int saldo) {
    for(int i=0;i<10;i++){
      int digito=(int)(Math.random()*10);
      this.num=this.num+digito;
    }
    this.saldo=saldo;
  }
  public CuentaCorriente(){
    this.saldo=0;
    for(int i=0;i<10;i++){
      int digito=(int)(Math.random()*10);
      this.num=this.num+digito;
    }
  }

  public void ingreso(int n){
    this.saldo+=n;
  }
  public void cargo(int n){
    this.saldo-=n;
  }
  public void transferencia(CuentaCorriente t, int n){
    this.saldo-=n;
    t.saldo+=n;
  }
  public String toString(){
    return "Número de cta: "+this.num+" Saldo: "+this.saldo+" euros";
  }
}
