
package paquetes;

public class tirada {
  private dado[] dado;
  private int numcaras;
  private int dados;
  public tirada(int n, int n2){
    dado=new dado[n];
    this.numcaras=n2;
    this.dados=n;
  }
  @Override
  public String toString() {
    String string="";
    int repeticiones=0;
    do{
      repeticiones=0;
      for(int i=0;i<this.dados;i++){
        this.dado[i]=new dado((int)(Math.random()*(this.numcaras+1)+1));
        string+=this.dado[i]+" ";
      }
      string+="\n";
      for(int i=this.dados;i>this.dados;i--){
        if(this.dado[i]==this.dado[i-1]){
          repeticiones++;
        }
      }
    }while(repeticiones!=this.dados-1);
    return string;
  }
}
