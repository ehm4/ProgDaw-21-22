
package paquetes;

public class tirada {
  private dado[] dado;
  private int numcaras;
  private int numtiradas;
  public tirada(int n, int n2){
    dado=new dado[n];
    this.numcaras=n2;
    this.numtiradas=n;
  }
  @Override
  public String toString() {
    String string="";
    int repeticiones;
    do{
      repeticiones=0;
      for(int i=0;i<this.numtiradas;i++){
        this.dado[i]=new dado((int)(Math.random()*(this.numcaras)+1));
        string=string+this.dado[i]+" ";
      }
      string=string+"\n";
      for(int i=0;i<this.numtiradas-1;i++){
        if(this.dado[i].obtenerValor()==this.dado[i+1].obtenerValor()){
          repeticiones++;
        }
      }
    }while(repeticiones!=this.numtiradas-1);
    return string;
  }
}
