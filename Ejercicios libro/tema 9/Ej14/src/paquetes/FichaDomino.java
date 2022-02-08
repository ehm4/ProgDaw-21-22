package paquetes;

public class FichaDomino {
  private int n1;
  private int n2;
  public FichaDomino(int n1,int n2){
    this.n1=n1;
    this.n2=n2;
  }

  public String voltea(){
    int aux=this.n1;
    this.n1=this.n2;
    this.n2=aux;
    String voltea="";
    if(this.n1==0){
      voltea="[ |"+this.n2+"]";
      }
      else if(this.n2==0){
      voltea="["+this.n1+"| ]";
      }
      else{
      voltea="["+this.n1+"|"+this.n2+"]";
      }
    return voltea;
  }

  public boolean encaja(FichaDomino t){
    boolean encaja=false;
    if(this.n1==t.n1||this.n1==t.n2||this.n2==t.n1||this.n2==t.n2){
      encaja=true;
    }
    return encaja;
  }
  public String toString(){
    if(this.n1==0){
    return "[ |"+this.n2+"]";
    }
    else if(this.n2==0){
    return "["+this.n1+"| ]";
    }
    else{
    return "["+this.n1+"|"+this.n2+"]";
    }
  }
}
