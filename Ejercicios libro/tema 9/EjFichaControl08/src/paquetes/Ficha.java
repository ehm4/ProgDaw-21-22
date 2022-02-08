package paquetes;

public class Ficha {
  private int der;
  private int izq;
  public Ficha(int n1, int n2){
    if(n1>6){
      n1=6;
    }
    if(n1<0){
      n1=0;
    }
    if(n2>6){
      n2=6;
    }
    if(n2<0){
      n2=0;
    }
    this.der=n2;
    this.izq=n1;
  }

  public int valorIzquierda(Ficha d){
    return d.izq;
  }
  public int valorDerecha(Ficha d){
    return d.der;
  }
  public void cambiarOrientacion(Ficha t){
    int aux=t.izq;
    t.izq=t.der;
    t.der=aux;
  }
  @Override
  public String toString(){
    if(this.izq==0){
    return "[ |"+this.der+"]";
    }
    else if(this.der==0){
      return "["+this.izq+"| ]";
    }
    else{
    return "["+this.izq+"|"+this.der+"]";
    }
  }
}