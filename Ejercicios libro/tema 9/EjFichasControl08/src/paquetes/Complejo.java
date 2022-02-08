package paquetes;

public class Complejo {
  private float izq;
  private float der;
  public Complejo(float izq, float der){
    this.izq = izq;
    this.der = der;
  }
  public String toString(){
    if(this.der<0){
      return izq+" - "+der*-1+"i"; 
    }
    else{
      return izq+" + "+der+"i"; 
    }
  }
  public Complejo suma(Complejo t){
    
    float izq=this.izq+t.izq;
    float der=this.der+t.der;
    return new Complejo(izq,der);
  }
  public Complejo multiplica(int n){
    float izq=this.izq*n;
    float der=this.der*n;
    return new Complejo(izq,der);
  }
  public Complejo multiplica(Complejo t){
    float izq=(this.izq*t.izq)-(this.der*t.der);
    float der=(this.izq*t.der)+(this.der*t.izq);
    return new Complejo(izq,der);
  }
}
